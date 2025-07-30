#include <iostream>
using namespace std;

class Vehicle {
protected:
    string brand;
    string model;
    int year;

public:
    Vehicle(string b, string m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    virtual void displayDetails() {
        cout << "Brand := " << brand << endl;
        cout << "Model := " << model << endl;
        cout << "Year := " << year << endl;
    }
};

class Car : public Vehicle {
private:
    int numberOfDoors;
    string fuelType;

public:
    Car(string b, string m, int y, int doors, string fuel)
        : Vehicle(b, m, y) {
        numberOfDoors = doors;
        fuelType = fuel;
    }

    void displayDetails() override {
        Vehicle::displayDetails();
        cout << "Number of Doors :- " << numberOfDoors << endl;
        cout << "Fuel Type := " << fuelType << endl;
    }
};


class Bike : public Vehicle {
private:
    bool hasGear;
    string bikeType;

public:
    Bike(string b, string m, int y, bool gear, string type)
        : Vehicle(b, m, y) {
        hasGear = gear;
        bikeType = type;
    }

    void displayDetails() override {
        Vehicle::displayDetails();
        cout << "Has Gear := " << (hasGear ? "Yes" : "No") << endl;
        cout << "Bike Type ;= " << bikeType << endl;
    }
};

int main() {
    Car myCar("Mahindra", "XUV700", 2025, 4, "Petrol");

    Bike myBike("Yamaha", "R15", 2021, true, "Sports");

    cout << "Car Details := " << endl;
    myCar.displayDetails();

    cout << "Bike Details := " << endl;
    myBike.displayDetails();

    return 0;
}
