public class Pizza {
    enum PIZZA_TYPE {
        VEG,
        NON_VEG
    }

    private int price;
    private PIZZA_TYPE type;

    private final int toppingsPrice = 80;
    private Boolean extraToppingsAdded = false;

    private final int cheesePrice = 130;
    private Boolean extraCheeseAdded = false;


    private int basePizzaPrice;
    private final int backPackPrice = 20;
    private Boolean isOptedForTakeAway = false;

    public Pizza(PIZZA_TYPE type) {
        this.type = type;

        if (this.type == PIZZA_TYPE.VEG) {
            this.price = 250;
        } else if (this.type == PIZZA_TYPE.NON_VEG) {
            this.price = 400;
        }

        this.basePizzaPrice = price;

    }

    public void addExtraTopings() {
        extraToppingsAdded = true;
        this.price += toppingsPrice;
    }

    public void addExtraCheese() {
        extraCheeseAdded = true;
        this.price += cheesePrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";

        System.out.println("Pizza: " + basePizzaPrice);
        if (extraToppingsAdded) {
            bill += "Extra toppings charges: " + toppingsPrice + "\n";
        }

        if (extraCheeseAdded) {
            bill += "Extra cheese charges: " + cheesePrice + "\n";
        }

        if (isOptedForTakeAway) {
            bill += "Take away backpack charges: " + backPackPrice + "\n";
        }

        bill += "Bill: "+this.price + "\n";
        System.out.println(bill);
    }

}
