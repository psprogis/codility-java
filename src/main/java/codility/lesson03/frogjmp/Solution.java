package codility.lesson03.frogjmp;

/*
* https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
*
* A small frog wants to get to the other side of the road. The frog is currently located at position X and wants
* to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
* Count the minimal number of jumps that the small frog must perform to reach its target.
*
* X, Y and D are integers within the range [1..1,000,000,000];
* X ≤ Y.
*/
public class Solution {

    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jump = D;
        int count = distance / jump;

        if ((distance % jump) != 0) {
            ++count;
        }

        return count;
    }

    public int solutionWrong(int X, int Y, int D) {
        int count = 0;

        while (X < Y) {
            X += D;
            ++count;
        }

        return count;
    }
}
