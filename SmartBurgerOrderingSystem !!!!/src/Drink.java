public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size, double price){
        this.type = type;
        this.size = size;
        if(type.equals("coca-cola") && size.equals("small")){
            this.price = 2.40;
        }
        if(type.equals("coca-cola") && size.equals("medium")){
            this.price = 3.40;
        }
        if(type.equals("coca-cola") && size.equals("large")){
            this.price = 2.40;
        }
        if(type.equals("orange-juice") && size.equals("small")){
            this.price = 1.40;
        }
        if(type.equals("orange-juice") && size.equals("medium")){
            this.price = 2.40;
        }
        if(type.equals("orange-juice") && size.equals("large")){
            this.price = 3.40;
        }
        if(type.equals("red bull") && size.equals("small")){
            this.price = 3.40;
        }
        if(type.equals("red bull") && size.equals("medium")){
            this.price = 4.40;
        }



    }


    public double getPrice() {
        return price;
    }
}
