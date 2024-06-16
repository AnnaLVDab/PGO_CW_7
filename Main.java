import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(); 
        cars.add(new Car("Model1", 2004));
        cars.add(new Car("Model2", 2006));
        cars.add(new Car("Model3", 2005));
        cars.add(new Car("Model4", 2010));
        cars.add(new Car("Model5", 2003));
        cars.add(new Car("Model6", 2001));
        cars.add(new Car("Model7", 2009));
        cars.add(new Car("Model8", 2002));
        cars.add(new Car("Model9", 2007));
        cars.add(new Car("Model10", 2008));

            for(Car car: cars) {
                System.out.println(car.prodYear);
            }

            System.out.println(".");

        Collections.sort(cars);
        for(Car car: cars) {
            System.out.println(car.prodYear);


            /*for(Car car: cars) {
                System.out.println(car.model);
            }

            System.out.println(".");

            Collections.sort(cars);
            for(Car car: cars) {
                System.out.println(car.model);*/



        }
    }
}
