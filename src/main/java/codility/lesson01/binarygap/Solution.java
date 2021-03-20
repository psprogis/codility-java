package codility.lesson01.binarygap;

/*
* https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
*
* A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones
* at both ends in the binary representation of N.
*
* For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
* The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
* The number 20 has binary representation 10100 and contains one binary gap of length 1.
* The number 15 has binary representation 1111 and has no binary gaps.
* The number 32 has binary representation 100000 and has no binary gaps.
*/
public class Solution {
    public int solution(int N) {
        String stringNumber = Integer.toBinaryString(N);

        int maxGap = 0;
        int currentGap = 0;
        boolean foundStart = false;

        for (int i = 0; i < stringNumber.length(); ++i) {

            if (stringNumber.charAt(i) == '1') {
                if (foundStart) {
                    if (currentGap > maxGap) {
                        maxGap = currentGap;
                    }
                } else {
                    foundStart = true;
                }

                currentGap = 0;
            } else {
                if (foundStart) {
                    currentGap++;
                }
            }
        }

        return maxGap;
    }
}
