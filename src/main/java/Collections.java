import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        return binarySearchInner(list, key, 0, list.size() - 1);
    }

    private static <T extends Comparable<? super T>> int binarySearchInner(List<T> list, T key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        T midVal = list.get(mid);
        int cmp = midVal.compareTo(key);

        if (cmp < 0) {
            return binarySearchInner(list, key, mid + 1, high);
        } else if (cmp > 0) {
            return binarySearchInner(list, key, low, mid - 1);
        } else {
            return mid;
        }
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> comparator) {
        if (comparator == null) {
            throw new NullPointerException("Comparator не должен быть null");
        }
        return binarySearchInner(list, key, comparator, 0, list.size() - 1);
    }

    private static <T> int binarySearchInner(List<T> list, T key, Comparator<? super T> comparator, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        T midVal = list.get(mid);
        int cmp = comparator.compare(midVal, key);

        if (cmp < 0) {
            return binarySearchInner(list, key, comparator, mid + 1, high);
        } else if (cmp > 0) {
            return binarySearchInner(list, key, comparator, low, mid - 1);
        } else {
            return mid;
        }
    }
}