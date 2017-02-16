package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;



/**
 * Created by Bulik on 21.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(0.134);
        System.out.println("Weight of apple = "+ apple.getWeight());

        Car car = new Car();
        car.setWeight(4000.2);
        System.out.println("Weight of car =" + car.getWeight());
    }
}
