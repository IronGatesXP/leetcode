#include<stdio.h>
#include<string.h>
#define MAXSIZE 50

char str[MAXSIZE];
char res[MAXSIZE];

//从后向前找，后面的总是小于等于前面的才能保证字典序最大
//最后一个字符肯定包含在内

int main()
{
    int i;
    while(scanf("%s",str)!=0)
    {
        int len = strlen(str);
        int max = 0;
        int id = MAXSIZE;
        for(i=len-1;i>=0;i--)
        {
            if(str[i]>=max)
            {
               printf("%c",str[i]);
               printf("\n");
              res[--id] = str[i];
              max = str[i];
            }
        }

        for(i=id;i<MAXSIZE;i++)
        {
            printf("%c",res[i]);
        }
        printf("\n");

    }
}
