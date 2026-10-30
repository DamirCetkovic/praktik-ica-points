package se.ica.praktik;

public class CustomerPointsService {

    public int calculatePoints(double purchaseAmount) {

        if (purchaseAmount <= 0) {
            return 0;
        }

        int points = (int) purchaseAmount;

        if (purchaseAmount >= 500) {
            points += 500;
        }

        if (purchaseAmount >= 1000) {
            points += 100;
        }

        return points;
    }
}
