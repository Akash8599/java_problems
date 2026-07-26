import java.util.*;

public class Delloite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Compute A1
        int[] A1 = findNextGreater(A, N);

        // Compute A2 using A1 values
        int[] A2 = findPreviousSmaller(A, A1, N);

        // Print A1
        for (int num : A1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print A2
        for (int num : A2) {
            System.out.print(num + " ");
        }
    }

    // Function to find the next greater element to the right
    private static int[] findNextGreater(int[] A, int N) {
        int[] A1 = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }
            A1[i] = stack.isEmpty() ? -1 : stack.peek(); // If no greater element, set -1
            stack.push(A[i]);
        }
        return A1;
    }

    // Function to find the first smaller element to the left for A1 in A
    private static int[] findPreviousSmaller(int[] A, int[] A1, int N) {
        int[] A2 = new int[N];

        for (int i = 0; i < N; i++) {
            int smaller = 0; // Default value if no smaller element found
            for (int j = 0; j < N; j++) {
                if (A[j] == A1[i]) { // Find index of A1[i] in A
                    for (int k = j - 1; k >= 0; k--) { // Look for smaller element to the left
                        if (A[k] < A1[i]) {
                            smaller = A[k];
                            break;
                        }
                    }
                    break;
                }
            }
            A2[i] = smaller;
        }
        return A2;
    }
}
