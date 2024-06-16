public class Car implements Comparable<Car>{
    public String model;
    public int prodYear;

    public Car(String model, int prodYear) {
        this.model = model;
        this.prodYear = prodYear;
    }

    @Override
    public int compareTo(Car o) {
        //return model.compareTo(o.model);
        return Integer.compare(prodYear, o.prodYear);
    }
}
