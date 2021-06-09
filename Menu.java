
import java.util.ArrayList;
import java.util.Scanner;



class Item {

    String name;
    int calorie;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Menu {

    static ArrayList<Item> desserts = new ArrayList<>();
    static ArrayList<Item> drinks = new ArrayList<>();
    static ArrayList<Item> sides = new ArrayList<>();
    static ArrayList<Item> appetizers = new ArrayList<>();
    static ArrayList<Item> entress = new ArrayList<>();

    static ArrayList<Item> orderList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void setItems() {

        Item sprite = new Item();
        Item coke = new Item();
        Item tea = new Item();
        Item coffee = new Item();
        Item water = new Item();

        sprite.setName("Sprite");
        sprite.setCalorie(200);
        sprite.setPrice(20);

        coke.setName("Coke");
        coke.setCalorie(300);
        coke.setPrice(25);

        tea.setName("Tea");
        tea.setCalorie(100);
        tea.setPrice(15);

        coffee.setName("Coffee");
        coffee.setCalorie(80);
        coffee.setPrice(18);

        water.setName("Water");
        water.setCalorie(10);
        water.setPrice(5);

        drinks.add(sprite);
        drinks.add(coke);
        drinks.add(tea);
        drinks.add(coffee);
        drinks.add(water);

        Item chessCakes = new Item();
        Item applePie = new Item();
        Item cannoli = new Item();

        chessCakes.setName("Cheese Cakes");
        chessCakes.setCalorie(240);
        chessCakes.setPrice(40);

        applePie.setName("Apple Pie");
        applePie.setCalorie(300);
        applePie.setPrice(50);

        cannoli.setName("Cannoli");
        cannoli.setCalorie(200);
        cannoli.setPrice(35);

        desserts.add(chessCakes);
        desserts.add(applePie);
        desserts.add(cannoli);

        Item charcuterieMeats = new Item();
        Item cheeseBites = new Item();
        Item macAndCheeseBalls = new Item();

        charcuterieMeats.setName("Charcuterie Meats");
        charcuterieMeats.setCalorie(300);
        charcuterieMeats.setPrice(60);

        cheeseBites.setName("Cheese Bites");
        cheeseBites.setCalorie(380);
        cheeseBites.setPrice(34);

        macAndCheeseBalls.setName("Mac and Cheese Balls");
        macAndCheeseBalls.setCalorie(200);
        macAndCheeseBalls.setPrice(28);

        appetizers.add(charcuterieMeats);
        appetizers.add(cheeseBites);
        appetizers.add(macAndCheeseBalls);

        Item chicken = new Item();
        Item salmon = new Item();
        Item steak = new Item();

        chicken.setName("Chicken");
        chicken.setCalorie(200);
        chicken.setPrice(23);

        salmon.setName("Salmon");
        salmon.setCalorie(150);
        salmon.setPrice(20);

        steak.setName("Steak");
        steak.setCalorie(100);
        steak.setPrice(28);

        entress.add(chicken);
        entress.add(salmon);
        entress.add(steak);

        Item iceCream = new Item();
        iceCream.setName("Ice Cream");
        iceCream.setPrice(20);
        iceCream.setCalorie(400);

        Item burger = new Item();
        burger.setName("Burger");
        burger.setCalorie(300);
        burger.setPrice(25);

        Item fries = new Item();
        fries.setName("Fires");
        fries.setCalorie(500);
        fries.setPrice(20);

        sides.add(iceCream);
        sides.add(burger);
        sides.add(fries);
    }

    public static boolean checkEntrees() {
        System.out.println("Would Like to Order Entree: Enter 1 to Order. 0 for Next Item");
        try {
            int input = sc.nextInt();
            if (input == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("You Have Entered Wrong Input");
            System.exit(1);
        }
        return false;
    }

    public static boolean checkSides() {
        System.out.println("Would Like to Order Sides: Enter 1 to Order. 0 for Next Item");
        try {
            int input = sc.nextInt();
            if (input == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("You Have Entered Wrong Input");
            System.exit(1);
        }
        return false;
    }


    public static boolean checkDrinks() {
        System.out.println("Would Like to Order Drinks: Enter 1 to Order. 0 for Next Item");
        try {
            int input = sc.nextInt();
            if (input == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("You Have Entered Wrong Input");
            System.exit(1);
        }
        return false;
    }
    public static boolean checkDessert() {
        System.out.println("Would Like to Order Dessert: Enter 1 to Order. 0 for Next Item");
        try {
            int input = sc.nextInt();
            if (input == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("You Have Entered Wrong Input");
            System.exit(1);
        }
        return false;
    }
    public static void orderEntrees() {
        for (Item i : entress) {
            System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice()));
            System.out.println();
        }
        System.out.println("Please Enter which one you want to enter: Enter 1 for first, 2 for second and so on..");
        int enteeNumber = sc.nextInt();
        try {
            Item ent = entress.get(enteeNumber-1);
            System.out.println(ent.getName()+" is Ordered. Calorie is: "+ent.getCalorie()+" Price is: "+ent.getPrice());
            orderList.add(ent);
        } catch(Exception e) {
            System.out.println("You Have Enter Invalid Input");
            System.exit(1);
        }
    }

    public static void orderSides() {
        for (Item i : sides) {
            System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice()));
            System.out.println();
        }
        System.out.println("Please Enter which one you want to enter: Enter 1 for first, 2 for second and so on..");
        int enteeNumber = sc.nextInt();
        try {
            Item ent = sides.get(enteeNumber-1);
            System.out.println(ent.getName()+" is Ordered. Calorie is: "+ent.getCalorie()+" Price is: "+ent.getPrice());
            orderList.add(ent);
        } catch(Exception e) {
            System.out.println("You Have Enter Invalid Input");
            System.exit(1);
        }
    }

    public static void orderDrinks() {
        for (Item i : drinks) {
            System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice()));
            System.out.println();
        }
        System.out.println("Please Enter which one you want to enter: Enter 1 for first, 2 for second and so on..");
        int enteeNumber = sc.nextInt();
        try {
            Item ent = drinks.get(enteeNumber-1);
            System.out.println(ent.getName()+" is Ordered. Calorie is: "+ent.getCalorie()+" Price is: "+ent.getPrice());
            orderList.add(ent);
        } catch(Exception e) {
            System.out.println("You Have Enter Invalid Input");
            System.exit(1);
        }
    }

    public static void orderDesserts() {
        for (Item i : desserts) {
            System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice()));
            System.out.println();
        }
        System.out.println("Please Enter which one you want to enter: Enter 1 for first, 2 for second and so on..");
        int enteeNumber = sc.nextInt();
        try {
            Item ent = desserts.get(enteeNumber-1);
            System.out.println(ent.getName()+" is Ordered. Calorie is: "+ent.getCalorie()+" Price is: "+ent.getPrice());
            orderList.add(ent);
        } catch(Exception e) {
            System.out.println("You Have Enter Invalid Input");
            System.exit(1);
        }
    }



    public static void displayResult() {

        System.out.println("You Have Ordered Below Items");
        int cal=0, bill=0;
        for (Item i : orderList) {
            System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice()));
            System.out.println();
            cal = cal + i.getCalorie();
            bill = bill + i.getPrice();
        }
        System.out.println("Your Total Calories is: "+cal);
        System.out.println("Your Total Bill is: "+bill);
    }


    public static void main(String args[]) {

        setItems();

        System.out.println("Welcome to the Restaurant . This is Our Daily Special for Today");
        int ran = (int)(Math.random() * 3) + 1;
        if (ran == 1) {
            System.out.println("Today Special Meal is Drinks having below Items");
            for (Item i : drinks) {
                System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice() - 2));
                System.out.println();
            }
        }
        else if (ran == 2) {
            System.out.println("Today Special Meal is Appetizers having below Items");
            for (Item i : appetizers) {
                System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice() - 2));
                System.out.println();
            }
        }
        else {
            System.out.println("Today Special Meal is Desserts having below Items");
            for (Item i : desserts) {
                System.out.print("Item: "+i.getName() + " | Calories: " + i.getCalorie() + " | Price: " + (i.getPrice() - 2));
                System.out.println();
            }
        }
        System.out.println("Please Enter 1 for Special Meal else enter 0");
        int input = sc.nextInt();

        if (input ==1) {
            int bil =0 ,cal =0;
            if (ran == 1) {
                for (Item i : drinks) {
                    bil = bil + i.getPrice()-2;
                    cal = cal + i.getCalorie();
                    orderList.add(i);
                }
            }
            else if (ran == 2) {
                for (Item i : appetizers) {
                    bil = bil + i.getPrice()-2;
                    cal = cal + i.getCalorie();
                    orderList.add(i);
                }
            }
            else {
                for (Item i : desserts) {
                    bil = bil + i.getPrice()-2;
                    cal = cal + i.getCalorie();
                    orderList.add(i);
                }
            }
            System.out.println("Your Daily Special Meal is Processed\nTotal Calories is:"+cal+"\nTotal Bill is:"+bil);
        } else {
            if(checkEntrees()) {
                orderEntrees();
                if (checkSides()) {
                    orderSides();
                    if(checkSides()) {
                        orderSides();
                        if(checkSides()) {
                            orderSides();
                        } else {
                            if(checkDrinks()) {
                                orderDrinks();
                                if(checkDessert()) {
                                    orderDesserts();
                                }
                            }
                        }
                    } else {
                        if (checkDrinks()) {
                            orderDrinks();
                            if(checkDessert()) {
                                orderDesserts();
                            }
                        }
                    }
                } else {
                    if (checkDrinks()) {
                        orderDrinks();
                        if(checkDessert()) {
                            orderDesserts();
                        }
                    }
                }
            } else {
                if (checkSides()) {
                    orderSides();
                    if(checkSides()) {
                        orderSides();
                        if(checkSides()) {
                            orderSides();
                        } else {
                            if(checkDrinks()) {
                                orderDrinks();
                                if(checkDessert()) {
                                    orderDesserts();
                                }
                            }
                        }
                    } else {
                        if (checkDrinks()) {
                            orderDrinks();
                            if(checkDessert()) {
                                orderDesserts();
                            }
                        }
                    }
                } else {
                    if (checkDrinks()) {
                        orderDrinks();
                        if(checkDessert()) {
                            orderDesserts();
                        }
                    }
                }
            }
            displayResult();
        }

    }
}
