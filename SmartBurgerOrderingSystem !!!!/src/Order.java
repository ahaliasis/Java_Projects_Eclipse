public class Order {

    private Topping topping;
    private Burger burger;
    private SideItem sideItem;
    private Drink drink;
    private DeluxeBurger deluxeBurger;


    public Order (){
        topping = null;
        burger = null;
        sideItem = null;
        drink = null;
        deluxeBurger = null;

    }

    public void chooseBurger(Burger b){
        this.burger = b;
    }

    public void chooseTopping(Topping t){
        this.topping = t;

    }
    public void chooseSideItem(SideItem s){
        this.sideItem = s;
    }
    public void chooseDrink(Drink d){
        this.drink = d;
    }
    public void chooseDeluxeBurger(DeluxeBurger db){
        this.deluxeBurger = db;
    }

    public double calculateTotal(){
        double total = 0;
        if(burger != null){
            total += burger.getPrice();
        }
        if(topping != null){
            total += topping.getPrice();
        }
        if(sideItem != null){
            total += sideItem.getPrice();
        }
        if(drink != null){
           total += drink.getPrice();
        }
        if(deluxeBurger != null){
            total += deluxeBurger.getPrice();
        }
        return total;

    }

    public Burger getBurger() {
        return burger;
    }
}








