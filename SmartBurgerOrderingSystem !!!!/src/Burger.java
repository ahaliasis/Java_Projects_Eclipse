public class Burger {
    private String type;
    private double price;

    public Burger(String type, double price){
        this.type = type;
        if(type.equals("Smoky Mountain Burger")){
            this.price = 7.50;
        }
        if(type.equals("Fire Grill Inferno Burger")){
            this.price = 8.70;
        }
        if(type.equals("Green Garden Vegie Stack")){
            this.price = 10.20;
        }
        if(type.equals("Double Bacon Crunch")){
            this.price = 9.20;
        }
        if(type.equals("Mushroom Truffle Deluxe")){
            this.price = 12.40;
        }
    }

    public double getPrice() {
        return price;
    }


}
