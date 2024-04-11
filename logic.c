#include<stdio.h>
int main()
{
 int i,j,sum=0,avg=0,n;
 printf("Enter the n ");
 scanf("%d",&n);
 for(i=n;i>0;i--)
 {
   printf("\t%d",i);
   if(i==1)
   {
       for(j=1;j<=n;j++)
       {
           if(j%2==0)
           {
                printf("\n%d",j);
                sum+=j;
           }
       }
   }
 }
 printf("\n sum :%d ",sum);
 avg=sum/(0.5*n);
 printf("\n average: %d  ",avg);
}
