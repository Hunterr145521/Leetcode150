import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String args[]){
        int[] num1 = new int[]{1,2,3,5,4,3};

        int[] num2 = new int[]{2,5,6};
        int n = 3;
        int m = 3;
        Merge_Sorted_Array.merge2(num1, m, num2, n);
        
        
    }

    //Init Solution!
    //Over this solution we first created with 1 variable which will itearate over the records in the second arrayList
    //Second we will run an for or while loop till all the elements form second array is covered
    //and set all the values of second array into first array at the place where the first array main value ends, which is after m elements
    // after adding all the values we will call Arrays.sort function and sort the array and print the same.
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while(i < nums2.length){
            nums1[nums1.length -1-i] = nums2[i];
            i++;
        }

        Arrays.sort(nums1);
        for(int is : nums1){
            System.out.print(is);
        }
    }


    //Fastest Solution
    //Over this solution we created 2 variables which stores the actual length of values present in both of the arrays(num1valueLength, num2valueLength) (for both array)
    // then created 1 more variable to store the total lenth of longest array(totalvalLength)
    //then starting iterating over the all the elements available in array 2 till the value of actuall lenth of that array >= 0
    // then added a check condition to check that the array1(longest one) actual value lenth is also >= 0 
    // also added 1 more condtion by adding an and statement where array1[num1valueLength] > array2[num2valueLength]
    // if the above condition is true then add the value to the last index of array1 and reduce the value of actualvallength of array 1(num1valueLength)  and total lenth of longest array(totalvalLength) by 1
    // else set the value to the last index of array1 for array2[num2valueLength] and reduce the value of totalvalLegth and the num2valueLength by 1
    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        int num1valLength = m -1;
        int num2valLength = n -1;
        int totalvalLength = m + n -1;

        while(num2valLength >= 0){
            if(num1valLength >= 0 && nums1[num1valLength] > nums2[num2valLength]){
                nums1[totalvalLength--] = nums1[num1valLength--];
            }else{
                nums1[totalvalLength--] = nums2[num2valLength--];
            }
        }

        for(int is : nums1){
            System.out.print(is);
        }
    }




}
