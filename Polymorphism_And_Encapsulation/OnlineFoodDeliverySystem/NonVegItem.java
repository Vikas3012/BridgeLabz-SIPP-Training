public class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        double extraCharge = total * 0.1;
        total += extraCharge;
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.discount = percentage;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }
}