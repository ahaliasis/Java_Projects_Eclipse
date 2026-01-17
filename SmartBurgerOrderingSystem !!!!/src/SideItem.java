public class SideItem {
    private String type;
    private double price;

    public SideItem(String type, double price){
        this.type = type;
        if(type.equals("Extra fries")){
            this.price = 2.40;
    }
        if(type.equals("salad")){
            this.price = 1.20;
        }
        if(type.equals("Baby potatoes")){
            this.price = 2.40;
        }


    }

    public double getPrice(){

        return price;
    }
}
