package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(757586978));

    }

    public static int count7(int number){
        if (number==0)
            return 0;
        int count=0;

        String s = Integer.toString(number);
        char sNumber=s.charAt(s.length()-1);
        int asdsadds=Character.getNumericValue(sNumber);

        if (asdsadds==7)
            count++;
        return count+count7(number/10);

    }
}
