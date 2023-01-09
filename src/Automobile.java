public class Automobile {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Automobile(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        if (this.brand == null || this.brand == "") {
            this.brand = "default";
        }
        this.model = model;
        if(this.model == null || this.model == "") {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (this.color == null || this.color == "") {
            this.color = "White";
        }
        this.productionYear = productionYear;
        if (this.productionYear <= 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (this.productionCountry == null || this.productionCountry == "") {
            this.productionCountry = "default";
        }

    }


    void printAutomobile() {
        System.out.println("Автомобиль - " + brand);
        System.out.println("Модель - " + model);
        System.out.println("Страна производства - " + productionCountry);
        System.out.println("Год производства - " + productionYear);
        System.out.println("Цвет - " + color);
        System.out.println("Объем двигателя - " + engineVolume +" литра(ов)");

    }


}
