package se.ica.praktik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerPointsServiceTest {

    @Test
    void shouldReturn499PointsForPurchase499() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(499);

        assertEquals(499, result);
    }

    @Test
    void shouldReturn550PointsForPurchase500() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(500);

        assertEquals(550, result);
    }

    @Test
    void shouldReturn551PointsForPurchase501() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(501);

        assertEquals(551, result);
    }

    @Test
    void shouldReturnZeroPointsForPurchaseZero() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(0);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroPointsForNegativePurchase() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(-10);

        assertEquals(0, result);
    }

    @Test
    void shouldReturn1150PointsForPurchase1000() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(1000);

        assertEquals(1150, result);
    }

    @Test
    void shouldReturn1350PointsForPurchase1200() {

        CustomerPointsService service =
                new CustomerPointsService();

        int result =
                service.calculatePoints(1200);

        assertEquals(1350, result);
    }
}
