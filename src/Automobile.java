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

}
