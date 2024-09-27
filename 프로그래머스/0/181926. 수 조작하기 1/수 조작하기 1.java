class Solution {
    public int solution(int n, String control) {
        return control.chars().map(c -> c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10).reduce(n, Integer::sum);
    }
}