package car;

public class MagicMain {

    public static void main(String[] args) {
        CarStorage carStorage = new CarStorage();
        carStorage.fillGarage();
        carStorage.carsByBrands(Brands.AUDI);
        carStorage.carsByModelAndYear(Brands.TOYTA.getModel2(), 3);
        carStorage.carsByYearAndPrice(1985, 10000);
    }
}
