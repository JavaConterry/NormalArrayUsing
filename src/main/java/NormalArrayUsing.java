import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NormalArrayUsing {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Iterator<Integer> arrayIterator = Arrays.stream(array).iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
