public class BS_asc_and_dsc {
    public static void main(String[] args) {
        int[]arr={8,7,6,5,4,3,2,1};      // descending order array
        // int[]arr = (1,2,3,4,5,6,7,8);   // ascending order array
        int target = 3;
        int li = 0;
        int hi = arr.length - 1;
        int mi = li + (hi - li) / 2;
        boolean isASC = arr[li]<arr[hi];

        while (li <= hi) {

            if (arr[mi] == target) {
                System.out.println("element is present at index: " + mi);
                break;
            }
            if (isASC) {
                if (arr[mi] < target) {
                    li = mi + 1;
                } else {
                    hi = mi - 1;
                }
            }else {
                if(arr[mi]>target){
                    li = mi + 1;
                } else {
                    hi = mi - 1;
                }
                }
            mi = li + (hi - li) / 2;
        }
        if (li > hi) {
            System.out.println("element is not found");
        }

        }
    }

