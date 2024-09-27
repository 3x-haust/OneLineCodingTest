import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return Arrays.stream(array).filter(i -> i == n).toArray().length;
    }
}