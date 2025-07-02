public class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
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