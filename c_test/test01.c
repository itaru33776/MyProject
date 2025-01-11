#include <stdio.h>
#include <math.h>

double recursion(int t); //提前宣告欲使用的函式

int main()
{
    int numTerms = 0; //要計算pi的項數
    printf("請輸入要計算pi的項數：\n");
    scanf("%d",&numTerms);
    printf("結果：%15lf\n",4*recursion(numTerms));

    return 0;
}

//我想到的解法，用-1的次方判斷正負
//因為調用pow函數且指數運算效率較差，下面的解法比較好。
double recursion(int t)
{
    //c代表傳遞的值，t代表第幾項次

    if (t == 1)
    {
        return 1.0;
    }
    double count = -1/((2*t-1)*pow(-1, t));
    return count+recursion(t-1);
}

//Chatgpt的更優解，使用三元運算子判斷正負
double recursion02(int t)
{
    // 遞迴結束條件
    if (t == 1)
    {
        return 1.0;
    }

    // 第 t 項的計算
    double term = (t % 2 == 1 ? 1.0 : -1.0) / (2.0 * t - 1.0);

    // 返回當前項加上前面的項
    return term + recursion(t - 1);
}