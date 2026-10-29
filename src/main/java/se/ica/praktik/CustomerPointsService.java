package se.ica.praktik;

public class CustomerPointsService {

    public int calculatePoints(double purchaseAmount) {

        if (purchaseAmount <= 0) {
            return 0;
        }

        int points = (int) purchaseAmount;

        if (purchaseAmount >= 500) {
            points += 50;
        }

        return points;
    }
}
