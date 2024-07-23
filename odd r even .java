import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner u=new Scanner(System.in);
        int num1=u.nextInt();
        int num2=u.nextInt();
        int sum1=0;
        int sum2=0;
        if(num1>1&&num2<100)
        {
            for(int i=num1;i<=num2;i++)
            {
                if(i%2==0)
                {
                    sum1+=i;
                }
                
                else 
                {
                    sum2+=i;
                }
                
            }
            System.out.printf("The Even Sum value is %.2f\n",(float)sum1);
            System.out.printf("The Odd Sum value is %.2f\n",(float)sum2);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
