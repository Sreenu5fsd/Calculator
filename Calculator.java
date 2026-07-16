import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a, b);
        System.out.println("Sum of " + a + " and " + b + " is " + sum);

        sc.close();
    }
    public static int addition(int a , int b){
        return a  + b;
    }
}