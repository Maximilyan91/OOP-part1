public class Main {
    public static void main(String[] args) {

        Automobile ladaGranta = new Automobile(null, "Granta",0,"Yellow",2015,"Russia");
        ladaGranta.printAutomobile();

        System.out.println();

        Automobile audiA8 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0,"Black", 2020, "Germany");
        audiA8.printAutomobile();

        System.out.println();

        Automobile bmwZ8 = new Automobile("BMW","Z8",3.0,"Black",2021,"Germany");
        bmwZ8.printAutomobile();

        System.out.println();

        Automobile kiaSportage = new Automobile("Kia", "Spotrage QL",2.4,"Red",2018,"South Korea");
        kiaSportage.printAutomobile();

        System.out.println();

        Automobile hyundaiAvante = new Automobile("Hyundai","Avante",1.6, "Orange", 2016, "South Korea" );
        hyundaiAvante.printAutomobile();
    }
}