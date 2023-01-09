public class Main {
    public static void main(String[] args) {

        Automobile ladaGranta = new Automobile();
        ladaGranta.brand = "LADA";
        ladaGranta.model = "Granta";
        ladaGranta.productionYear = 2015;
        ladaGranta.productionCountry = "Russia";
        ladaGranta.color = "Yellow";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.printAutomobile();

        System.out.println();

        Automobile audiA8 = new Automobile();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Germany";
        audiA8.color = "Black";
        audiA8.engineVolume = 3.0;
        audiA8.printAutomobile();

        System.out.println();

        Automobile bmwZ8 = new Automobile();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Germany";
        bmwZ8.color = "Black";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.printAutomobile();

        System.out.println();

        Automobile kiaSportage = new Automobile();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Spotrage QL";         // QL - обозначение кузова автомобиля (в задании надо указать Kia Sportage 4-го поколения)
        kiaSportage.productionYear = 2018;
        kiaSportage.productionCountry = "South Korea";
        kiaSportage.color = "Red";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.printAutomobile();

        System.out.println();

        Automobile hyundaiAvante = new Automobile();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "South Korea";
        hyundaiAvante.color = "Orange";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.printAutomobile();
    }
}