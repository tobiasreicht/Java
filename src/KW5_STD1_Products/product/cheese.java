package KW5_STD1_Products.product;

public class cheese implements product {
        private String name;
        private double price;
        private String milkType;

        public cheese(String name, double price, String milkType) {
            this.name = name;
            this.price = price;
            this.milkType = milkType;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public double getPrice() {
            return price;
        }

    }
