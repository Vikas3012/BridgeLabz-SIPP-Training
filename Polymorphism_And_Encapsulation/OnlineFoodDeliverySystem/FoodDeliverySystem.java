public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[3];

        order[0] = new VegItem("Paneer Butter Masala", 200, 2);
        order[1] = new NonVegItem("Chicken Biryani", 250, 1);
        order[2] = new NonVegItem("Mutton Curry", 300, 2);

        for (FoodItem item : order) {
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10);
            }

            System.out.println(item.getItemDetails());
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }

            System.out.println("---------------------------");
        }
    }
}