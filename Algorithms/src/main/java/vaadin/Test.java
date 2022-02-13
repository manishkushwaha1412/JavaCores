package vaadin;

import java.util.*;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        Test t = new Test();
        t.m1();

    }

    private Result mapResult(Car car, Map<Long, Owner> ownersById){
        System.out.println("");
        Result result = new Result(car, ownersById.get(car.getOwnerId()));
        return result;
    }

    private void m1(){
        Car car1 = new Car(480D, 120D, 1L, "City");
        Car car2 = new Car(482D, 120D, 2L, "City");
        Car car3 = new Car(300D, 80D, 3L, "Alto");
        Owner owner1 = new Owner(1L, "Manish", "35");
        Owner owner2 = new Owner(2L, "Kumar", "32");
        Owner owner3 = new Owner(3L, "Kushwaha", "30");
        Owner owner4 = new Owner(4L, "KK", "45");
        List<Car> cars = new ArrayList<>();cars.add(car1);cars.add(car2);cars.add(car3);
        List<Owner> owners = new ArrayList<>();owners.add(owner1);
        owners.add(owner2);owners.add(owner3);owners.add(owner4);

        final Map<Long, Owner> ownersById = owners.stream()
                .collect(Collectors.toMap(k -> k.getId(), k -> k));
        final List<Result> results = cars.stream()
                .map(car-> this.mapResult(car, ownersById))
                .collect(Collectors.toList());
        results.forEach(System.out::println);
    }

}
