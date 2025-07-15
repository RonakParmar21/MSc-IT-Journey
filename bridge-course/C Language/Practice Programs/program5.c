#include <stdio.h>

int main() {
    char name[50];
    int sales, commission, netSalary;
    
    printf("Enter the name of the salesman: ");
    scanf("%s", name);

    printf("Enter the sales amount: ");
    scanf("%d", &sales);

    if (sales < 25000)
        commission = (sales / 1000) * 20;
    else if (sales >= 25000 && sales < 50000)
        commission = (sales / 1000) * 15;
    else if (sales >= 50000 && sales < 100000)
        commission = (sales / 1000) * 10;
    else
        commission = (sales / 1000) * 5;

    netSalary = sales + commission;

    printf("\nName: %s", name);
    printf("\nSales: %d", sales);
    printf("\n+Commission: %d", commission);
    printf("\nNet Salary: %d\n", netSalary);

    return 0;
}
