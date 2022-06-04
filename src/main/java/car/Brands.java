package car;

public enum Brands {
    MERSEDES("S600", "Maybach"),
    BMV("M3", "X6"),
    AUDI("Allroad", "A8"),
    OPEL("Omega", "Meriva"),
    TOYTA("Camry", "Rav4");

    private String model1;
    private  String model2;


    Brands(String model1, String model2) {
        this.model1 = model1;
        this.model2 = model2;
    }

    public String getModel1() {
        return model1;
    }

    public String getModel2() {
        return model2;
    }

    @Override
    public String toString() {
        return "Brands{" +
                "model1='" + model1 + '\'' +
                ", model2='" + model2 + '\'' +
                '}';
    }
}
