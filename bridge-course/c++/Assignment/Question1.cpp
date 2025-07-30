#include <iostream>
using namespace std;

class AreaCalculator {
public:
    float area(int side) {
        return side * side;
    }

    float area(int length, int breadth) {
        return length * breadth;
    }

    float area(double radius) {
        return 3.14 * radius * radius;
    }
};

int main() {
    AreaCalculator calc;

    int side, length, breadth;
    double radius;

    cout << "Enter side of square = ";
    cin >> side;

    cout << "Enter length and breadth of rectangle = ";
    cin >> length >> breadth;

    cout << "Enter radius of circle = ";
    cin >> radius;

    cout << "Area of Square := " << calc.area(side) << endl;
    cout << "Area of Rectangle := " << calc.area(length, breadth) << endl;
    cout << "Area of Circle := " << calc.area(radius) << endl;

    return 0;
}
