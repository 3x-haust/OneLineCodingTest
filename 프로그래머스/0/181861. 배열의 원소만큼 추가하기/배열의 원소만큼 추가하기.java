import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).flatMap(a -> IntStream.range(0, a).map(i -> a)).toArray();       
    }
}