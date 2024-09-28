import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + (arr.length % 2 == 0 && i % 2 == 1 ? n : (arr.length % 2 == 1 && i % 2 == 0 ? n : 0))).toArray();
    }
}
