public class MountainArray {
    public static void main(String[] args) {


    }

            public int findInMountainArray(int target, int [] mountainArr) {
            int peek = findPeek(mountainArr);
            int firstTry = orderAgnastocsBS(mountainArr, target, 0, peek);
            if (firstTry != -1){
                return firstTry;
            }

            return orderAgnastocsBS(mountainArr, target, peek+1, mountainArr.length-1);
        }

        int orderAgnastocsBS(int[] arr, int target, int start, int end){

            boolean isAsc = arr[start] < arr[end];

            while(start<=end){
                int mid = start + (end-start)/2;

                if(arr[mid] ==  target){
                    return mid;
                }

                if(isAsc){
                    if(target<arr[mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                else{
                    if(target> arr[mid]){
                        end = end-1;
                    }
                    else{
                        start =  mid+1;
                    }
                }
            }
            return -1;
        }

        int findPeek(int[] mountainArray){
            int start = 0;
            int end = mountainArray.length-1;

            while(start<end){
                int mid = start + (end-start)/2;
                if(mountainArray[mid] > mountainArray[mid+1]){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
            }
            return start;
        }
    }

