import java.util.ArrayList;

public class BottleDispenser {

    private int bottles;
    private double money;
    private ArrayList<bottle> bottle_list;
    private static BottleDispenser bottledispenser = null ;


    public static BottleDispenser getInstance(){
        if (bottledispenser == null){
            bottledispenser = new BottleDispenser();
        }
        return bottledispenser;
    }

    private BottleDispenser() {

        bottles = 5;
        money = 0;

        bottle_list = new ArrayList();
        bottle_list.add(new bottle("Pepsi Max", "Pepsi", 1.0, 0.5, 1.8));
        bottle_list.add(new bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        bottle_list.add(new bottle("Coca-Cola Zero", "Coca-Cola", 1.0, 0.5, 2.0));
        bottle_list.add(new bottle("Coca-Cola Zero", "Coca-Cola", 1.0, 1.5, 2.5));
        bottle_list.add(new bottle("Fanta Zero", "Coca-Cola", 1.0, 0.5, 1.95));
    }


    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }

    public void buyBottle(int sel) {
        bottle bot = bottle_list.get(sel-1);
        if (money >= bot.getPrice()) {
            money -= bot.getPrice();
            System.out.print("KACHUNK! ");
            System.out.print(bot.getName());
            System.out.println(" came out of the dispenser!");
            bottles -= 1;
            bottle_list.remove(sel-1);
        } else 
            System.out.println("Add money first!");
    }

    public void returnMoney() {
        System.out.printf("Klink klink. Money came out! You got %.2f€ back%n", money);
        money = 0;
    }

    public void listBottles() {
        for (int i=0; i<bottles; i++) {
            bottle bot = bottle_list.get(i);
            System.out.print(i+1 + ". Name: ");
            System.out.println(bot.getName());
            System.out.print("\tSize: ");
            System.out.print(bot.getSize());
            System.out.print("\tPrice: ");
            System.out.println(bot.getPrice());
        }
    }
}