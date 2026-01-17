public class Topping {

        private String name;
        private double price;

        public Topping(String name, double price) {
            this.name = name;

            if(name.equals("Chedar sauce")){
                this.price = 0.80;
            }
            if(name.equals("Barbeque sauce")){
                this.price = 1.20;
            }
            if(name.equals("Mayonese")){
                this.price = 0.50;
            }
        }

        public double getPrice() {
            return price;
        }
    }

