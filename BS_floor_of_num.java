public class BS_floor_of_num {
     /*  The Ceiling of a no. is the greatest element
        in array which is smaller than or equal to 
        the target element  */
        public static void main(String[] args) {
            int [] arr = {2,3,5,9,14,16,18};
            int target = 15;  /* if the target element is 4 then floor index would be equal to the 
                                greatest element in an array which is smaller than or equal to target element*/
           
                int li = 0;
                int hi = arr.length-1;
                int mid = li+(hi-li)/2;
                while(li<=hi){
                   
                    if (arr[mid]==target) {
                        System.out.println("floor idex is : " + mid);
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
                    System.out.println("ceiling index is : "+ hi);;
                }
                
            }
        }
       
    
