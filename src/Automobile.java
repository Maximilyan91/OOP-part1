public class Automobile {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void printAutomobile() {
        System.out.println("Автомобиль - " + brand + " " + model);
        System.out.println("Страна производства - " + productionCountry);
        System.out.println("Год производства - " + productionYear);
        System.out.println("Цвет - " + color);
        System.out.println("Объем двигателя - " + engineVolume +" литра(ов)");

    }

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
}
