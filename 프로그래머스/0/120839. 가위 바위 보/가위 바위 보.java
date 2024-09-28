class Solution {
    public String solution(String rsp) {
        return rsp.chars().mapToObj(c -> c == '2' ? '0' : c == '0' ? '5' : '2').collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}
