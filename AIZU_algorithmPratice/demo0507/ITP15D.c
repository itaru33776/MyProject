# include <stdio.h>

void call(int n);

int main()
{
    int n;
    scanf("%d", &n);
    call(n);
    return 0;
}

void call(int n) {
    for (int i = 1; i <= n; i++) {
        int flag = 0;
        
        // 判斷是否為 3 的倍數
        if (i % 3 == 0){
            flag = 1;
        }
        
        // 判斷數字內是否包含 3
        int x = i;
        while (x) {
            if (x % 10 == 3){
                flag = 1;
                break;
            }
            x /= 10;
        }
        
        if (flag){
            printf(" %d", i);
        }
    }
    //這題最後要換行還不提醒，基掰勒
    printf("\n");
}