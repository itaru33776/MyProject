#include <stdio.h>

int mystery(int a, int b);

int main(void)
{
    printf("%s%d\n", "The result is ", mystery(5,6));
}

int mystery(int a, int b)
{
    
    printf("這一層是a=%d,b=%d\n",a,b);
    return b < 0 ? ++a : a + mystery(a+=2,b-=4);
}