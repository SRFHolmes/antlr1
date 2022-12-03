#include "stdlib.h"
#include "stdio.h"
#define block 100
void main(){
    int i,j;
    for( i =1;i<6000;i++){
        a[i] =c[i]+15;
        c[i-1] =a[i-1]+20;
        for (j =1 ;j<6000;j++){
            b[i][j]=d[i][j] +40;
        }

    }
}
