#include <stdio.h>

int main() {
    char customerName[50];
    int units;
    float totalBill = 0;

    printf("Enter Customer Name: ");
    scanf("%s", customerName);

    printf("Enter Units Consumed: ");
    scanf("%d", &units);

    if (units <= 100) {
        totalBill = units * 2.5;
    } else if (units <= 300) {
        totalBill = (100 * 2.5) + ((units - 100) * 3.5);
    } else {
        totalBill = (100 * 2.5) + (200 * 3.5) + ((units - 300) * 4.0);
    }

    printf("\nCustomer\t: %s\n", customerName);
    printf("Unit Consumed\t: %d\n", units);
    printf("Total Bill\t: Rs. %.2f\n", totalBill);

    return 0;
}
