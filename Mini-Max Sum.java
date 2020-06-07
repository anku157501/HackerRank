import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int k=0;
        long s=0;
        long [] b=new long [6];
        for (int i = 0; i < 5; i++){
            s=0;
            for (int j = 0; j < 5; j++){
                if(i!=j){
                    s=s+(long)arr[j];
                }}
                b[k++]=s;
               // System.out.print(b[k]+" "+s);
        
            
        }
        long t=0;
        for (int i = 0; i < 5; i++){
            
            for (int j = 0; j < 5-i-1; j++){
                if(b[j]>b[j+1]){
                t=b[j];
                b[j]=b[j+1];
                b[j+1]=t;
                }}
        }
        System.out.print(b[0]+" "+b[4]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
