import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        SpaceReplace();
        ArrayRevers();
    }

    public static void ArrayRevers() {
        int[] array = {2, 4, 5, 6, 7};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("");
        Arrays.stream(array).forEach(System.out::print);
        System.out.println("");

        //через Стрим
        int[] arr = {5, 2, 6, 7};
        int[] revers = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - i - 1])
                .toArray();
        System.out.println(Arrays.toString(revers));
    }

    public static void SpaceReplace() {
        String test = "qwe qwewq qwew qewqw";
        test = test.replace(" ", "");
        System.out.println(test);
    }
}
