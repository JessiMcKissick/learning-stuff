#include <iostream>
#include <cmath>
#include <iomanip>
#include "paint_project.h"

using namespace std;
using namespace painters;
void painting(){
    paint_project current_project;
    double height;
    double width;

    cout << "Enter wall height in feet: ";
    cin >> height;

    cout << "Enter wall width in feet: ";
    cin >> width;

    current_project.set_height(height);
    current_project.set_width(width);
    current_project.calculate_area();
    current_project.calculate_gallons_needed();
    current_project.calculate_cans_needed();

    cout << "Paint needed: " + to_string(current_project.get_gallons_needed()) + " gallons.";

    // TODO: Learn this logic better.
    cout << "You will need " << fixed << setprecision(0) << current_project.get_cans_needed()
         << " can(s) of paint.\n";
}


int main(){
    while (true)
    {
        cout << "---------------------------------------------------------------------\n\n";
        string input;
        cout << "What would you like to do? options[1: paint calculator, q: quit]: ";
        cin >> input;
        if(input == "q" || input == "exit"){
            break;
        } else if (input == "1"){
            painting();
        } else {
            cout << "Invalid input, please try again.\n";
        };
    };
    

    return 0;
}

