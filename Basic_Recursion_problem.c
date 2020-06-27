
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
