import java.util.HashSet;

public class DifferenceK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        findPairsWithSet(arr, k);
    }

    public static void findPairsWithSet(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num + k)) {
                System.out.println("(" + num + ", " + (num + k) + ")");
            }
            if (set.contains(num - k)) {
                System.out.println("(" + (num - k) + ", " + num + ")");
            }
            set.add(num);
        }
    }
}
