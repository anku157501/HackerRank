import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt(),a=0,b=1,c;
        for(long i=0;i<n;i++){
            for(long j=0;j<n;j++){
                if((i+j)>=n-1)
                {c=a+b;
                    a=b;
                    b=c;
                    System.out.print(c+" ");
                 }
                else
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
