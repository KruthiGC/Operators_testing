package operators;
class Vehicle{}
class Car extends Vehicle{}
class Apple{}
public class InstanceOf {
    public static boolean isVehicle(Object obj){
        return obj instanceof Vehicle;
    }

    public static boolean isCar(Object obj){
        return obj instanceof Car;
    }

    public static boolean isApple(Object obj){
        return obj instanceof Apple;
    }

}
