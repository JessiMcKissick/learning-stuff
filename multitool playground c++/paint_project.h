#include <cmath>

using namespace std;

namespace painters{
    class paint_project
    {
    public:
        const double squareFeetPerGallon = 350.0;
        const double gallonsPerCan = 1.0;
        // Mutators
        void set_width(double input)
        {
            this->width = input;
        };
        void set_height(double input)
        {
            this->height = input;
        };
        void calculate_area()
        {
            this->area = this->height * this->width;
        };
        void calculate_gallons_needed()
        {
            this->gallons_needed = this->area / squareFeetPerGallon;
        };
        void calculate_cans_needed()
        {
            this->cans_needed = ceil(this->gallons_needed / this->gallonsPerCan);
        };

        // Getters
        double get_width()
        {
            return this->width;
        };
        double get_height()
        {
            return this->height;
        };
        double get_area()
        {
            return this->area;
        };
        double get_gallons_needed()
        {
            return this->gallons_needed;
        };
        double get_cans_needed()
        {
            return this->cans_needed;
        };

    private:
        double width;
        double height;
        double area;
        double gallons_needed;
        double cans_needed;
    };
}