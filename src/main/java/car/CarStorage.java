package car;

import java.util.*;

public class CarStorage {

    private List<Car> garage;
    Random random = new Random();

    public CarStorage() {
        garage = new ArrayList<>();
    }

    public List<Car> fillGarage() {
        System.out.println("Наполняем гараж автомобидями известных марок");
        Arrays.asList(Brands.values()).forEach(brand -> {garage.add(new Car(brand.toString(),
                brand.getModel1(),
                random.nextInt(2020 - 1980) + 1980,
                random.nextInt(50000 - 5000) + 5000));
            garage.add(new Car(brand.toString(),
                    brand.getModel2(),
                    random.nextInt(2020 - 1980) + 1980,
                    random.nextInt(50000 - 5000) + 5000));
        });
        return garage;
    }

    public void carsByBrands(Brands brand) {
        System.out.println("Cписок автомобилей заданной марки " + brand.toString());
        garage.stream().filter(car -> car.getBrand().equals(brand.toString())).forEach(System.out::println);
    }

    public void carsByModelAndYear(String model, int year) {
        System.out.printf("Cписок автомобилей заданной модели %s, которые эксплуатируются больше %s лет", model, year);
        garage.stream().filter(car -> car.getModel().equals(model))
                .filter(car -> Calendar.getInstance().get(Calendar.YEAR) - car.getYear() > year)
                .forEach(System.out::println);
    }

    public void carsByYearAndPrice(int year, int price){
        System.out.printf("Cписок автомобилей заданного года выпуска %s, цена которых больше указанной %s", year, price);
        garage.stream().filter(car -> car.getYear() > year)
                .filter(car -> car.getPrice()> price)
                .forEach(System.out::println);
    }

}

