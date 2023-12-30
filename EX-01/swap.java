
package ex-1

import java.util.Scanner;

public class swap
{
    public static void main(final String[] args) {
        final Scanner o = new Scanner(System.in);
        System.out.println("Enter your a,b value");
        int a = o.nextInt();
        int b = o.nextInt();
        System.out.println("Before swapping values are");
        System.out.println("a=" + a + "\tb=" + b);
        final int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping values are a=" + a + "\tb=" + b);
    }
}