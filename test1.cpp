#include "stdlib.h"
#include "stdio.h"
void main(){
int i,j;
for(i=1;i<5999;i++){
    for(int j=1;j<5999;j++){
        array1[i+1][j]=array1[i][j]+array2[i][j];
    }
}
}


#include "stdlib.h"
#include "stdio.h"


#define block 100
void main(){
int i,j;
for(i = 1;i < 4000;i ++ ){
    for(j = 1;j <4000;j ++ ){
        for(k = 1;k < 5000;k ++ )
            A[i+2][j+1][k]= A[i][j][k]+ B[i][j][k];
    }
}
}

#include "stdlib.h"
#include "stdio.h"
#define block 100
void main(){
    int i,j,m,n;
    for(i = 0;i < 100;i ++ )
        A[i]= B[i]+ m;
    for(i = 0;i < 100;i ++ )
        D[i]=A[i]+ n;
}