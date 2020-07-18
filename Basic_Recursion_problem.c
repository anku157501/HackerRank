//To find the no of digits in a given number


#include <stdio.h>
int no_of_digits(int);
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",no_of_digits(n));
    return 0;
}
int no_of_digits(int n){
    if(n==0)
    return 0;
    return no_of_digits(n/10)+1;
}

//Accurate method
#include <stdio.h>
#include <math.h>
void main(){
    int n;
    scanf("%d",&n);
    printf("%d",(int)floor(log10(n)+1));
}


//To find the sum of digits of given no


int sum_of_digits(int);
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",sum_of_digits(n));

    return 0;
}
int sum_of_digits(int n){
    if(n==0)
    return 0;
    return sum_of_digits(n/10)+n%10;
}


//To find the given nuumber is armstrong


#include <stdio.h>
#include <math.h>
int digits(int);
int main()
{
    int n;
    scanf("%d",&n);
    int a=digits(n);
    if(a==n)
    printf("Armstrong");
    else
    printf("Not an Armstrong");
    return 0;
}
int digits(int n){
    if(n==0)
    return 0;
    return digits(n/10)+pow(n%10,3);
}

////To find the given nuumber is Pallindrom


#include <stdio.h>
int digits(int,int);
int main()
{
    int n,s=0;
    scanf("%d",&n);
    int a=digits(n,s);
    if(a==n)
    printf("Palindrom");
    else
    printf("Not a Palindrom");
    return 0;
}
int digits(int n,int s){
    if(n==0)
    return ;
    else{
    s=s*10+n%10;
    return digits(n/10,s);
    }
    return s;
}

///To find the reverse of given number 

#include <stdio.h>
int digits(int,int);
int main()
{
    int n,s=0;
    scanf("%d",&n);
    printf("%d",digits(n,s));
    return 0;
}
int digits(int n,int s){
    if(n==0)
    return;
    else{
    s=s*10+n%10;
    return digits(n/10,s);
    }
   return s;
}
//
