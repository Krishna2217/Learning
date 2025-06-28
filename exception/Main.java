package exception;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
class underAgeException extends Exception{
    public underAgeException(String msg){
        super(msg);
    }
}

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();

        try {
            int result = x / y;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The line after exception");
        System.out.println("Enter the age");
        int age = sc.nextInt();
        try{
            canVote(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("After the second exception");

        try {
            int[] arr = new int[3];
            arr[5] = 10; // ArrayIndexOutOfBoundsException
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println("After the third exception");

    }

    private static void canVote(int age) throws underAgeException {
        if(age < 18){
            throw new underAgeException("The voter age cannot be under 18");
        }
        System.out.println("The candidate can vote");
    }

}
