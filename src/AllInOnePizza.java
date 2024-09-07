public class AllInOnePizza extends Pizza{
    public AllInOnePizza(PIZZA_TYPE type){
        super(type);
        super.addExtraCheese();
        super.addExtraTopings();

    }


    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraTopings() {
    }
}
