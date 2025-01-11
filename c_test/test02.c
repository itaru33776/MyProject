#include <stdio.h>
#include <math.h>
#include <time.h> // 用於測量執行時間

double useTernary(int iterations)
{
    double result = 0.0;
    for (int i = 1; i <= iterations; i++)
    {
        result += (i % 2 == 1 ? 1.0 : -1.0) / (2.0 * i - 1.0);
    }
    return result;
}

double usePow(int iterations)
{
    double result = 0.0;
    for (int i = 1; i <= iterations; i++)
    {
        result += pow(-1, i - 1) / (2.0 * i - 1.0);
    }
    return result;
}

int main()
{
    const int iterations = 1000; // 測試的迭代次數

    // 測試三元運算子
    clock_t start = clock();
    double ternaryResult = useTernary(iterations);
    clock_t end = clock();
    printf("三元運算子結果：%.15f，用時：%lf 秒\n", ternaryResult, (double)(end - start) / CLOCKS_PER_SEC);

    // 測試指數計算
    start = clock();
    double powResult = usePow(iterations);
    end = clock();
    printf("指數計算結果：%.15f，用時：%lf 秒\n", powResult, (double)(end - start) / CLOCKS_PER_SEC);

    return 0;
}