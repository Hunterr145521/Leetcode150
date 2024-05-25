import java.util.Arrays;

public class remove_Duplicates {
    public static void main(String args[]){
        int[] abc = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] abc1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        
        int abc_value = removeDuplicate(abc);
        int abc1_value = removeDuplicate1(abc1);

        for(int i =0 ;i<abc_value;i++){
            System.out.print(abc[i]);
        }

        for(int i =0 ;i<abc1_value;i++){
            System.out.print(abc1[i]);
        }

    }

    //init process - nlogn
    /* Under this processwe are creating 2 intger type variable 1 for setting the initial value of duplicate number it Integer.MAX_Value and econd for counter
     * The intered over all the records in the array
     * and checked the conditon if the numers in array are equal to the duplicate number \
     * if yes then set the value as Interger.MAX_VALUE at the same position and if no then set the value of uplicate numner to the index value at which the no condtion hit. also added a counter to count the duplicate value.
     * Then we sort the Array and return the array back to the total counter.
     */
    public static int removeDuplicate(int[] num){
        int duplicate = Integer.MAX_VALUE;
        int counter = 0;
        for(int i =0; i< num.length; i++){
            if(num[i] == duplicate){
                num[i] = Integer.MAX_VALUE;
                counter++;
            }else{
                duplicate = num[i];
            }
        }

        Arrays.sort(num);
        return counter;
    }

    /*Fastest way  - n
    Unde this scenario we have created one head node which will only move forward when the indexHead value in array is not equal to indexIterator value in array
    then we will iterrate over all the records in the array and then 
    check the condtion that if array value at indexHead is not equal to array value at indexIterator then increase the value of indexHead and then set the value in array at indexHead position of the value of IndexIterator in the array */ 
    public static int removeDuplicate1(int[] num){
        int indexHead = 0;
        for(int indexIterate = 0; indexIterate < num.length; indexIterate++){
            if(num[indexHead] != num[indexIterate]){
                num[++indexHead] = num[indexIterate];
            }
        }

        return indexHead+1;
    }
    
}
