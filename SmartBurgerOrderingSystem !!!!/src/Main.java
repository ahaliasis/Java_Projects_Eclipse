import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        int choice = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;
        int choice5 = 0;
        int choice6 = 0;


        boolean valid = false;
        boolean valid2 = false;
        boolean valid3 = false;
        boolean valid4 = false;
        boolean valid5 = false;
        boolean valid6 = false;


        boolean isRunning = true;

        while(isRunning){
            System.out.println("Welcome to EastBurger");
            System.out.println("1-Choose Burger");
            System.out.println("2-Add topping");
            System.out.println("3-Add Side item");
            System.out.println("4-Add drink");
            System.out.println("5-Buy a deluxe burger");
            System.out.println("6-Total");
            System.out.println("7-Exit");

            do{
                try{
                    System.out.print("Enter a choice: ");
                    choice = scanner.nextInt();
                    valid = true;
                }catch (InputMismatchException e){
                    System.out.println("Only numbers");
                    scanner.nextLine();
                    valid = false;
                }
            }while (!valid);

            switch (choice){
                case 1:

                    System.out.println("------Burgers-----");
                    System.out.println("1-Smoky Mountain Burger");
                    System.out.println("2-FireGrill Inferno Burger");
                    System.out.println("3-Green Garden Veggie Stack");
                    System.out.println("4-Double Bacon Crunch");
                    System.out.println("5-Mushroom Truffle Deluxe");

                    do{
                        try{
                            System.out.print("Enter a burger choice: ");
                            choice2 = scanner.nextInt();
                            valid2 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid2 = false;
                        }
                    }while (!valid2);

                    switch (choice2){
                        case 1:
                            order.chooseBurger(new Burger("Smoky Mountain Burger", 7.50));
                            break;
                        case 2:
                            order.chooseBurger(new Burger("FireGrill Inferno Burger", 8.70));
                            break;

                        case 3:
                            order.chooseBurger(new Burger("Green Garden",10.20));
                            break;

                        case 4:
                            order.chooseBurger(new Burger("Double Bacon Crunch",9.20));
                            break;

                        case 5:
                            order.chooseBurger(new Burger("Mushroom Truffle Deluxe", 12.40));
                            break;

                        default:
                            System.out.println("Enter a valid choice");
                            break;
                    }


                case 2:
                    if (order.getBurger() == null) {
                        System.out.println("You must choose a burger before adding a topping!");
                        break;
                    }

                    System.out.println("-------Toppings--------");
                    System.out.println("1-Chedar Sauce");
                    System.out.println("2-Barbeque Sauce");
                    System.out.println("3-Mayonese");

                    do{
                        try{
                            System.out.print("Enter a topping choice: ");
                            choice3 = scanner.nextInt();
                            valid3 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid3 = false;
                        }
                    }while (!valid3);

                    switch (choice3){
                        case 1:
                            order.chooseTopping(new Topping("Chedar Sauce",0.80));
                            break;

                        case 2:
                            order.chooseTopping(new Topping("Barbeque Sauce",1.20));
                            break;

                        case 3:
                            order.chooseTopping(new Topping("Mayonese",0.50));
                            break;

                        default:
                            System.out.println("Enter a valid choice");
                            break;
                    }

                case 3:
                    if (order.getBurger() == null) {
                        System.out.println("You must choose a burger before adding a side item!");
                        break;
                    }


                    System.out.println("------Side Item------");
                    System.out.println("1-Extra Fries");
                    System.out.println("2-Salad");
                    System.out.println("3-Baby potatoes");

                    do{
                        try{
                            System.out.print("Enter a side Item choice: ");
                            choice4 = scanner.nextInt();
                            valid4 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid4 = false;
                        }
                    }while (!valid4);

                    switch (choice4){

                        case 1:
                            order.chooseSideItem(new SideItem("Extra fires", 2.40));
                            break;

                        case 2:
                            order.chooseSideItem(new SideItem("Salad",1.20));
                            break;

                        case 3:
                            order.chooseSideItem(new SideItem("Baby potatoes", 2.40));
                            break;

                        default:
                            System.out.println("Enter a valid choice");
                            break;
                    }
                case 4:
                    System.out.println("------Drinks-----");
                    System.out.println("1-Coca Cola");
                    System.out.println("2-Orange juice");
                    System.out.println("3-Red bull");

                    do{
                        try{
                            System.out.print("Enter Drink choice: ");
                            choice5 = scanner.nextInt();
                            valid5 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid5 = false;
                        }
                    }while (!valid5);

                    System.out.println("Choose a size");
                    System.out.println("1-small");
                    System.out.println("2-medium");
                    System.out.println("3-large");

                    do{
                        try{
                            System.out.print("Enter Drink size choice: ");
                            choice6 = scanner.nextInt();
                            valid6 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid6 = false;
                        }
                    }while (!valid6);
                    switch(choice5) {

                        case 1:
                            switch(choice6) {
                                case 1:
                                    order.chooseDrink(new Drink("Coca Cola", "small", 2.40));
                                    break;
                                case 2:
                                    order.chooseDrink(new Drink("Coca Cola", "medium", 3.00));
                                    break;
                                case 3:
                                    order.chooseDrink(new Drink("Coca Cola", "large", 3.60));
                                    break;
                            }
                            break;

                        case 2:
                            switch(choice6) {
                                case 1:
                                    order.chooseDrink(new Drink("Orange Juice", "small", 2.40));
                                    break;
                                case 2:
                                    order.chooseDrink(new Drink("Orange Juice", "medium", 3.00));
                                    break;
                                case 3:
                                    order.chooseDrink(new Drink("Orange Juice", "large", 3.60));
                                    break;
                            }
                            break;

                        case 3:
                            switch(choice6) {
                                case 1:
                                    order.chooseDrink(new Drink("Red Bull", "small", 2.40));
                                    break;
                                case 2:
                                    order.chooseDrink(new Drink("Red Bull", "medium", 3.00));
                                    break;
                                case 3:
                                    order.chooseDrink(new Drink("Red Bull", "large", 3.60));
                                    break;
                            }
                            break;
                    }
                case 5:
                    System.out.println("-----Deluxe Burger----");

                    order.chooseDeluxeBurger(new DeluxeBurger(14.40));

                    break;

                case 6:
                    System.out.println("----Total---");
                    System.out.println("Your order is: " + order.calculateTotal() + "$");
                    break;

                case 7:
                    isRunning = false;
                    System.out.println("Exiting.....");
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("enter a valid choice");
                    break;






                    }











            }





        }



    }

