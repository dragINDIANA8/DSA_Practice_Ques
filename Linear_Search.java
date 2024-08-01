public class Linear_Search {
    public static void main(String[] args) {
        // linear search algorithm
        /*
        int[] arr = {1,2,3,4,5,6,10};
        int num = 56;
        boolean isInArray = false;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==num){
                isInArray = true;
            }
        }
        if (isInArray){
            System.out.println("the element is present in the array") ;

        }
        else {
            System.out.println("the element is not present in the array");
        }

         */

        // linear search algorithm of string
        String []arr = {"shubh","rohit","abhishek","ashish"};
        String name = "ajay";
        boolean isInArray = false;
        for (int i =0; i<arr.length; i++){
            if (arr[i].equals(name)){
                isInArray=true;
            }
        }
        if (isInArray){
            System.out.println("The element is present in the array");
        }
        else{
            System.out.println("the element is not present in the array");
        }
    }
}
