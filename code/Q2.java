import java.util.*;
class PRIME{
    void prime(int range){
        for(int i=2;i<=range;i++){
            int count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
class Q2
{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int x=sc.nextInt();
        // System.out.print("Enter the Ending Point: ");
        // int y=sc.nextInt();
        PRIME p=new PRIME();
        p.prime(x);
    }
}

