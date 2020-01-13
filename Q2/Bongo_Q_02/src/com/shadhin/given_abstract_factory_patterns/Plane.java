package com.shadhin.given_abstract_factory_patterns;

public class Plane implements Vehicle{

    public static void main(String[] args) {
	// write your code here
    }

    @Override
    public int set_num_of_wheels() {
        return 4;
    }

    @Override
    public int set_num_of_passengers() {
        return 100;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
