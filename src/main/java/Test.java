import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 9};
        int answer = Arrays.binarySearch(array, 10);
        System.out.println(answer);

        List<Integer> list = List.of(1, 2, 3, 4, 5, 7, 9);
        answer = Collections.binarySearch(list, 10);
        System.out.println(answer);
    }
}
