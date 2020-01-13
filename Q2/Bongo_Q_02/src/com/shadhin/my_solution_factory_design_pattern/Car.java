package com.shadhin.my_solution_factory_design_pattern;
//Sub Class
public class Car extends Vehicle{

    public Car() {
    }

    @Override
    public int set_num_of_passengers() {
        return 4;
    }

    @Override
    public boolean has_gas() {
        return true;
    }
}
