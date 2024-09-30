import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numLog) {
        return IntStream.range(1, numLog.length).mapToObj(i -> numLog[i] - numLog[i - 1] == 1 ? "w" : numLog[i] - numLog[i - 1] == -1 ? "s" : numLog[i] - numLog[i - 1] == 10 ? "d" : "a").collect(Collectors.joining());
    }
}