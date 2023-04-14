public class PhoneTest {

    enum Phone {
        IPHONE(16000, "Black"),
        SAMSUNG(15000, "White") {
            public String toString() {
                return "Sorry, out of stock";
            }
        },
        NOKIA(5000, "Blue");

        private final int price;
        private final String color;

        private Phone(int price, String color) {
            this.price = price;
            this.color = color;
        }

        public int getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        for (Phone phone : Phone.values()) {
            System.out.println("Name: " + phone.name());
            if (phone != Phone.SAMSUNG) {
                System.out.println("Price: R" + phone.getPrice());
                System.out.println("Color: " + phone.getColor());
            } else {
                System.out.println(phone.toString());
            }
            System.out.println();
        }
    }
}
