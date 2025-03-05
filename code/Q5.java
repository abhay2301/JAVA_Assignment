//Write a java program to print the following sequence:  0,-1,1,-4,1,-7,2,-10,3,-13,5,-16,8,... up to a given limit.

// Q5.


import java.io.*;
import java.util.*;

class prSequence
{

    void fibo(int n){
        int n1=0, n2=1, n3, i,a=-1, d=-3;
        System.out.print("Sequence of Series: ");
        for(i=1;i<=n;i++){
            
            
            System.out.print(n1+", "+a+", ");
            a+=d;
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}

class Q5{
    public static void main(String a[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to print: ");
        num=sc.nextInt();
        prSequence obj=new prSequence();
        obj.fibo(num);
    }
}
