import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        return myString.chars().mapToObj(c -> c == 'A' ? 'B' : 'A').map(String::valueOf).collect(Collectors.joining()).contains(pat) ? 1 : 0;
    }
}