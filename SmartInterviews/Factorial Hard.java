#include <stdio.h>
#include <stdlib.h>
// int fact(int n){
//     if(n==1){
//         return 1;
//     }else{
//         return n*fact(n-1);
//     }
// }
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n;
    long long sum=1;
    const long long m = 1000000007;
    scanf("%d",&n);
    // printf("%d",fact(n));  
    for(int  i=1;i<=n;i++){
        sum = (sum*i)%m;
    }  
    printf("%lld",sum);
    return 0;
}
