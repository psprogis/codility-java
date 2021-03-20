package general.traiding;

import static java.util.stream.Collectors.toList;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FilterTrades {
    public static void main(String[] args) {

    }

    public static List<Trade> filterTrades(List<Trade> trades, Instant timestampFrom, Instant timestampTo) {
        if (timestampFrom == null
            || timestampTo == null
            || timestampFrom.getEpochSecond() >= timestampTo.getEpochSecond()) {
            return Collections.singletonList(new Trade(Instant.ofEpochSecond(0)));
        }

        long from = timestampFrom.getEpochSecond();
        long to = timestampTo.getEpochSecond();

        return trades.stream()
            .filter(trade -> {
                if (trade == null || trade.getTimestamp() == null) {
                    return false;
                }

                long tradeSeconds = trade.getTimestamp().getEpochSecond();

                return tradeSeconds >= from && tradeSeconds <= to;
            }).collect(toList());
    }

    public static List<Trade> filterTrades2(List<Trade> trades, Instant timestampFrom, Instant timestampTo) {
        if (timestampFrom == null
                || timestampTo == null
                || timestampFrom.compareTo(timestampTo) > 0) {
            return Collections.singletonList(new Trade(Instant.ofEpochSecond(0)));
        }

        return trades.stream()
                .filter(Predicate.not(FilterTrades::isEmptyTrade))
                .filter(trade -> isBetween(trade, timestampFrom, timestampTo))
                .collect(toList());
    }

    private static boolean isValidTrade(Trade trade) {
        return (trade != null) && (trade.getTimestamp() != null);
    }

    private static boolean isEmptyTrade(Trade trade) {
        return (trade == null) || (trade.getTimestamp() == null);
    }

    private static boolean isBetween(Trade trade, Instant timestampFrom, Instant timestampTo) {
        long from = timestampFrom.getEpochSecond();
        long to = timestampTo.getEpochSecond();

        long tradeSeconds = trade.getTimestamp().getEpochSecond();

        return tradeSeconds >= from && tradeSeconds <= to;
    }

    private static Trade parseTrade(String input) {
        if (input.equals("null")){
            return null;
        }
        return new Trade(parseInstant(input));
    }

    private static Instant parseInstant(String input) {
        if (input.equals("null")){
            return null;
        }
        return Instant.ofEpochSecond(Long.parseLong(input));
    }

    private static class Trade {
        private Instant timestamp;

        Trade(Instant timestamp){
            this.timestamp = timestamp;
        }

        public Instant getTimestamp() {
            return timestamp;
        }
    }
}

