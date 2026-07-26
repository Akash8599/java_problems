import java.util.HashSet;

public class Candies
{
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        int maxCandies=0;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            int count = 0;

            for (int j =i; j < arr.length; j++) {
                if (hashSet.contains(arr[j])){
                    break;
                }
                hashSet.add(arr[j]);
                count++;

            }

            maxCandies = Math.max(count, maxCandies);
            hashSet.clear();

        }
        System.out.println(maxCandies);

    }
}
