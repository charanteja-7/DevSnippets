#include <stdio.h>
#include <stdlib.h>

int fibonacci(int n){
    if(n==0){
        return 0;
    }
     if(n==1 || n==2){
        return 1;
    }else{
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int n;
    scanf("%d",&n);
    printf("%d",fibonacci(n));
    return 0;
}
