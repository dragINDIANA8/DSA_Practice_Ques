public class binary_search {
        public static void main(String[] args) {
            int []arr = {1,2,3,4,5,6,7,8,9,10};
            int num = 5;
            int li=0;
            int hi = arr.length;
            int mi = (li+hi)/2;
    
            while(li<=hi){
                if(arr[mi]==num){
                    System.out.println("element is present at index " + mi);
                    break;
                } else if (arr[mi]<num) {
                    li=mi+1;
    
                }
                else {
                    hi = mi-1;
                }
                mi = (li+hi)/2;
            }
            if(li>hi){
                System.out.println("element is not found");
            }
        }
    }
    

