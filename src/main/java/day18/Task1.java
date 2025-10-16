package day18;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(recursionSum(numbers,0));

    }

    public static int recursionSum(int[] arr, int index){
//        int[] array2=new int[array1.length-1];
//
//        if (array2.length==0)
//            return array1[0];
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i]=array1[i];
//        }
//        return array1[array1.length-1]+recursionSum(array2);
        if (index==arr.length)
            return 0;
        return arr[index]+recursionSum(arr,index+1);
    }
}
