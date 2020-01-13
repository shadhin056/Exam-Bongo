package com.shadhin.unitest;

import com.shadhin.my_solution_factory_design_pattern.Plane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PlaneTest {
    Plane SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new Plane();
    }

    @org.junit.Test
    public void checkPlan_gasNeed_falseReturn() {
        boolean result = SUT.has_gas();
        Assert.assertThat(result, is(false));
    }

    @org.junit.Test
    public void checkPlanPassenger_trueReturn() {
        int result = SUT.set_num_of_passengers();
        Assert.assertTrue(result > 99);
    }

    @org.junit.Test
    public void checkPlanwheels4_trueReturn() {
        int result = SUT.set_num_of_wheels();
        Assert.assertEquals(4, result);
    }

    @After
    public void tearDown() throws Exception {
    }
}