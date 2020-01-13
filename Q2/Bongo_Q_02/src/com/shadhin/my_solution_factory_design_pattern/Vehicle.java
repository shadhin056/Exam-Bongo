package com.shadhin.my_solution_factory_design_pattern;

//Supper Class
/*
   b)	Factory design pattern : Design patterns are often used to simplify big chunks of code or even to hide
specific implementations from the application flow. There are lots of design patters in java,
the perfect example for these kind of problems is the factory design pattern and it is very easy to understand.
It proposes using a super class and multiple sub-classes,
which inherit from the super class. During execution only the super class is used and
its value varies depending on the factory class. In order to use this pattern,
we need to implement a factory class,
which will return the correct sub-class for a given input.
The java classes bellow specify one super class (Vehicle.java) and
two sub-classes (Car.java and Plane.java).
 */
public class Vehicle {

    public int set_num_of_passengers() {
        return 100;
    }

   public boolean has_gas() {
        return true;
    }

    public  int set_num_of_wheels() {
        return 4;
    }
}
