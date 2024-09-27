import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        return Arrays.stream(array)
            .mapToObj(e -> new int[]{e, Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)).indexOf(e)}).max((a, b) -> Integer.compare(a[0], b[0])).orElse(new int[]{});
    }
}
