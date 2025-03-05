// Write a java program to print the following sequence:  0,2,1,4,1,8,2,16,3,32,5,64,8,... up to a given limit.

import java.io.*;
import java.util.*;
class seq{
    void even(int n){
        int n1=0, n2=1, n3, i;
        System.out.print("Even and Fibonacci Series: ");
        for(i=1;i<=n;i++){
            
                System.out.print(n1+", "+(int)Math.pow(2,i)+", ");
                
                n3=n1+n2;
                n1=n2;
                n2=n3;
                
        }
    }
}
class Q4{
    public static void main(String[] args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to print Fibonacci and Even number: ");
        num=sc.nextInt();
        
        seq obj= new seq();
        obj.even(num);
    }
}