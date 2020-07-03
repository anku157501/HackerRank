import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[5];
	    int m,input1=sc.nextInt(),input2=sc.nextInt(),input3=sc.nextInt(),i=0;
	    while(input3!=0){
	        a[i++]=input3%10;
	        input3=input3/10;
	    }
	    m=a[0];
	    for(int j=0;j<4;j++){
	        if(m<a[j])
	            m=a[j];
	    }
	    input1=input1/100;
	    input2=input2/10;
		System.out.println((input1%10)*(input2%10)*m);
	}
}


//1000<<input1<<9999
//1000<<input2<<99991000 and1000 <<input3<<9999 You are expected to find the Key using the below formula
//Key=(Hundreds digit of input1 x Tens digit of input2) x (Largest digit of input3) e.g input1 3621. input2-2452, input3-1352. then Key is (5X5)X5=125
