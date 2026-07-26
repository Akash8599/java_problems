package wissenTech;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] num = {1,1,1,2,2,3};
        removeDup(num);
        int [] num1 = {1,1,1,2,2,3};
        removeDupForTwoAtMost(num1);

    }



    private static void removeDupForTwoAtMost(int [] num){
        int uniqueIndex = 2;

        for (int i = 2;  i<num.length; i++){
            if(num[i] != num[uniqueIndex-2]){

                num[uniqueIndex] = num[i];
                uniqueIndex++;
            }
        }
        System.out.println(uniqueIndex);
    }
    private static void removeDup(int [] num){

        int uniqueIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[uniqueIndex]) {
                uniqueIndex++;
                num[uniqueIndex] = num[i];

            }
        }
        System.out.println(uniqueIndex + 1);
    }
}
