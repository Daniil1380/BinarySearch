import java.util.Comparator;

/**
 * Да, наверное, можно было сделать еще более полиморфично через какую-нить одну реализацию метода бинарного поиска,
 * но решил сделать как в задании указано
 */
public class Arrays {

    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (Double.compare(a[mid], key) == 0) {
            return mid;
        }
        if (Double.compare(a[mid], key) > 0) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (Float.compare(a[mid], key) == 0) {
            return mid;
        }
        if (Float.compare(a[mid], key) > 0) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(a, fromIndex, mid, key);
        } else {
            return binarySearch(a, mid + 1, toIndex, key);
        }
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        if (fromIndex >= toIndex) {
            return -1;
        }
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        int compare = c.compare(a[mid], key);
        if (compare == 0) {
            return mid;
        }
        if (compare > 0) {
            return binarySearch(a, fromIndex, mid, key, c);
        } else {
            return binarySearch(a, mid + 1, toIndex, key, c);
        }
    }
}