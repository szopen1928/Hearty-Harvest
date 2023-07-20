#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

// define constants
const double PRICE_PER_POUND = 5.50;
const double TAX_RATE = .0825;

// define struct
struct Harvest {
    string fruit; 
    double mass;
    double price;
};

// function prototypes
Harvest harvestInput();
double calculatePrice(Harvest);
void printResult(Harvest);

int main()
{
    cout << "Welcome to Hearty Harvest!" << endl << endl;
    
    Harvest harvest;
    harvest = harvestInput();
    harvest.price = calculatePrice(harvest);
    printResult(harvest);
    
    cout << "Thank you for your business!" << endl;

    return 0;
}

// function definitions
Harvest harvestInput() 
{
    Harvest result;
    cout << "What type of produce would you like to purchase? ";
    cin >> result.fruit;
    cout << "What is the mass of the produce (in pounds)? ";
    cin >> result.mass;

    return result;
}

double calculatePrice(Harvest harvest)
{
    double result;
    result = harvest.mass * PRICE_PER_POUND * (1 + TAX_RATE);
    return result;
}

void printResult(Harvest harvest)
{
    cout << endl << "Your purchase of " << harvest.mass << " pounds of " << harvest.fruit 
         << " will cost $" << setprecision(2) << fixed << harvest.price << endl;
}