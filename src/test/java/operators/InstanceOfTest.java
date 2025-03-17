package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InstanceOfTest {
    @Test
    void TestisVehicle(){
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        Apple apple=new Apple();
        assertTrue(InstanceOf.isVehicle(vehicle));
        assertTrue(InstanceOf.isVehicle(car));
        assertFalse(InstanceOf.isVehicle(apple));
    }

    @Test
    void TestisCar(){
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        Apple apple=new Apple();
        assertTrue(InstanceOf.isCar(car));
        assertFalse(InstanceOf.isCar(vehicle));
        assertFalse(InstanceOf.isCar(apple));
    }


    @Test
    void TestisApple(){
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        Apple apple=new Apple();
        assertFalse(InstanceOf.isApple(vehicle));
        assertFalse(InstanceOf.isApple(car));
        assertTrue(InstanceOf.isApple(apple));

    }

}
