package se.ica.praktik;

public class Main {

    public static void main(String[] args) {

        Customer customer1 =
                new Customer("Damir");

        Customer customer2 =
                new Customer("Anna");

        CustomerPointsService service =
                new CustomerPointsService();

        customer1.setPoints(
                service.calculatePoints(250));

        customer2.setPoints(
                service.calculatePoints(500));

        System.out.println(
                customer1.getName()
                        + " has "
                        + customer1.getPoints()
                        + " points");

        System.out.println(
                customer2.getName()
                        + " has "
                        + customer2.getPoints()
                        + " points");

        System.out.println(
                service.calculatePoints(499));

        System.out.println(
                service.calculatePoints(500));

        System.out.println(
                service.calculatePoints(501));
    }
}
