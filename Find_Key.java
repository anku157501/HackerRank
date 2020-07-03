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




import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[3];
	    int m,n,s=0,w=0,input1=sc.nextInt(),input2=sc.nextInt(),input3=sc.nextInt(),i=0;
	    while(input3!=0){
	        a[0]=input3%10;
	        input3=input3/10;
	        a[1]=input2%10;
	        input2=input2/10;
	        a[2]=input1%10;
	        input1=input1/10;
	    m=a[0];n=a[0];
	    for(int j=0;j<3;j++){
	        if(m<a[j])
	            m=a[j];
	       if(n>a[j])
	       n=a[j];
	    }
	    s=s*10+m-n;
	    }
	    while(s!=0){
	        w=w*10+s%10;
	        s=s/10;
	    }
		System.out.println(w);
	}
}



//1000<<input1<<9999
//1000<<input2<<99991000 and1000 <<input3<<9999 You are expected to find the Key using the below formula
//Key=[Largetst of all the thousands places digits of all 3 numbers-Smallest of all the thousands places digits of all 3 numbers][Largetst of all the hundred places digits of all 3 numbers-Smallest of all the hundred places digits of all 3 numbers][Largetst of all the tenth places digits of all 3 numbers-Smallest of all the tenth places digits of all 3 numbers][Largetst of all the ones places digits of all 3 numbers-Smallest of all the ones places digits of all 3 numbers] e.g input1 3621. input2-2452, input3-1352. then Key is [3-1][5-3][5-2][2-1]=2231



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m,n,s=0,w=0,input1=sc.nextInt(),input2=sc.nextInt(),input3=sc.nextInt(),i=0;
	    int[] gh=find(input1);
	    s=s+gh[3];
	    w=w+gh[0];
	    gh=find(input2);
	    s=s+gh[3];
	    w=w+gh[0];
	    gh=find(input3);
	    s=s+gh[3];
	    w=w+gh[0];
	    System.out.println(s-w);
	}
	    public static int[] find(int n){
	         int a[]=new int[4];
	         int m,i=0;
	         while(n!=0){
	             a[i++]=n%10;
	             n/=10;
	         }
	         for(int k=0;k<4;k++){
	             for(int j=0;j<4-k-1;j++){
	                 if(a[j]>a[j+1]){
	                     m=a[j];
	                     a[j]=a[j+1];
	                     a[j+1]=m;
	                 }
	             }
	         }
	         return a;
	    }
}



//1000<<input1<<9999
//1000<<input2<<99991000 and1000 <<input3<<9999 You are expected to find the Key using the below formula
//Key=sum of the largest digits of all 3-sum of the smallest digits of all 3 e.g input1 3621. input2-2452, input3-1352. then Key is (5+5+5)-(1+2+1)=11


                                                                                                                   
