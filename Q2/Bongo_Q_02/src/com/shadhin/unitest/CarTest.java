package com.shadhin.unitest;

import com.shadhin.my_solution_factory_design_pattern.Car;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {
    Car SUT;

    @org.junit.Before
    public void setUp() throws Exception {
        SUT = new Car();
    }

    @org.junit.Test
    public void checkCar_gasNeed_trueReturn() {
        boolean result = SUT.has_gas();
        Assert.assertThat(result, is(true));
    }

    @org.junit.Test
    public void checkCarPassenger_trueReturn() {
        int result = SUT.set_num_of_passengers();
        Assert.assertTrue(100 > result);
    }

    @org.junit.Test
    public void checkCarwheels4_trueReturn() {
        int result = SUT.set_num_of_wheels();
        Assert.assertEquals(4, result);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
}