import java.util.Arrays;

public class Remove_Element {

    public static void main(String args[]){
        int[] arr =  new int[]{3,2,2,3};
        int val = 3;
        int values = Remove_Element.Remove_Element(arr,val);
        int values2 =  Remove_Element.Remove_Element_2(arr,val);

        for(int i=0;i<values2;i++){
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------");
        for(int i=0;i<values;i++){
            System.out.println(arr[i]);
        }
    }


    //Initial Process : nlogn
    /* Under this scenario we have first iterate over all the reccords int the array and then
     * mached one condition that if the value requested to remove is same as the value at i th position of the array
     * then just set the value as Integer.MAX_VALUE; and increase the value of count to 1;
     * After Iterating over all the records sort the array and return the new count of records where total count of value without removable element is.
      */
    public static int Remove_Element(int[] arr, int val){
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == val){
                arr[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(arr);

        return arr.length - count;
    }

    //Fastest Solution: n
    /* Under this solution we have created 2 variables 1 for totalcount(which also will be incremented when the value asked for replace is found)  and 2nd is for iterating over all the array records
     * Then created a for loop to iterate over all the records and set a condition to check that if the arr[j](second valriable)  is not equal to value to be replaced then the array at the point where the totalCount would be indexing
     * or pointing the the value of arr at jth posistion shsould be repplaced to the same.
     * Then increase the counter to 1;
     * and returnt he totalCount.
    */
    public static int Remove_Element_2(int[] arr, int val){
        int totalCount = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != val){
                arr[totalCount] = arr[j];
                totalCount++;
            }
        }
        return totalCount;
    }
    
}
