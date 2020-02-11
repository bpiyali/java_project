package safari.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarScratch {
    private static <E> void showAll(List<E> lc) {
        for (E c : lc) {
            System.out.println(c);
        }
        System.out.println("-------------------------------------");
    }

    private static List<Car> getColoredCars(Iterable<Car> lc, String color) {
        List<Car> outputCar = new ArrayList<Car>();
        for (Car c : lc)
            if (c.getColor().equals(color))
                outputCar.add(c);
        return outputCar;
    }

    private static Optional<List<Car>> getCarsByCriterionOptional(Iterable<Car> lc, CarCriterion carCriterion) {
        List<Car> outputCar = new ArrayList<Car>();
        for (Car c : lc)
            if (carCriterion.test(c))
                outputCar.add(c);
        return Optional.ofNullable(outputCar);
    }
    private static List<Car> getCarsByCriterion(Iterable<Car> lc, CarCriterion carCriterion) {
        List<Car> outputCar = new ArrayList<Car>();
        for (Car c : lc)
            if (carCriterion.test(c))
                outputCar.add(c);
        return outputCar;
    }

    private static List<Car> getGasLevelCars(Iterable<Car> lc, int gasLevel) {
        List<Car> outputCar = new ArrayList<Car>();
        for (Car c : lc)
            if (c.getGasLevel() >= gasLevel)
                outputCar.add(c);
        return outputCar;
    }

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                Car.withGasColorPassengers(6, "Red", "Fred", "Jim", "Sheila"),
                Car.withGasColorPassengers(3, "Octarine", "Rincewind", "Ridcully"),
                Car.withGasColorPassengers(9, "Black", "Weatherwax", "Magrat"),
                Car.withGasColorPassengers(7, "Green", "Valentine", "Gillian", "Anne", "Dr. Mahmoud"),
                Car.withGasColorPassengers(6, "Red", "Ender", "Hyrum", "Locke", "Bonzo")
        );
        showAll(cars);
        System.out.println("********* RED CARS ************");
        //showAll(getColoredCars(cars, "Red"));
//        showAll(cars.stream()
//                .filter(c-> c.getColor().equals("Red"))
//                .collect(Collectors.toList()));

        //showAll(getCarsByCriterion(cars, new RedCarCriterion()));
        System.out.println((getCarsByCriterionOptional(cars, new RedCarCriterion())).map(c -> c.toString()).orElse("not found"));


        System.out.println("********* Gas Level CARS ************");
//        showAll(getGasLevelCars(cars, 6));
        //showAll(getCarsByCriterion(cars, new GasLevelCarCriterion(7)));
    }
}
