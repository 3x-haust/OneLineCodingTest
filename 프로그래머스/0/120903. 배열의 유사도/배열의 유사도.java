import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).filter(x -> Arrays.asList(s2).contains(x)).count();
    }
}