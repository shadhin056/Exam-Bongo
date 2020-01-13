package com.shadhin.given_abstract_factory_patterns;

public interface Vehicle {
    /*
   2)This design pattern is called Abstract factory design pattern.
   a)This Abstract factory is created using interfaces.
The same can be done by simply replacing the interface with an abstract class and
instead of implementing the interface,
the sub-classes will extend the abstract class and
the methods declared in the abstract class must be implemented in each of the sub-classes.
The factory and the main method stay the same in both cases.
Here I will implements the Vehicle interface in Car and Plane Class and
the methods declared in the interface Vehicle must be implemented in each of the classes (Car and Plane).
Example :
    */
    int set_num_of_wheels();

    int set_num_of_passengers();

    boolean has_gas();
}
