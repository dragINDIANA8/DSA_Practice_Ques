public class BS_ceiling_of_num {
    /*  ceiling of a no. is the smallest element
        in array which is greater than or equal to 
        the target element    */
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;  /* if the target element is 4 then ceiling index would be equal to the 
                            smallest element in an array which is greater than or equal to the target element */
       
            int li = 0;
            int hi = arr.length-1;
            int mid = li+(hi-li)/2;
            while(li<=hi){
               
                if (arr[mid]==target) {
                    System.out.println("ceiling idex is : " + mid);
                    break;
                }
                else if (arr[mid]<target) {
                    li = mid+1;
                    
                }
                else{
                    hi = mid-1;
                }
                mid=li+(hi-li)/2;
            }
            if (li>hi) {
                System.out.println("ceiling index is : "+ li);;
            }
            
        }
    }
    
