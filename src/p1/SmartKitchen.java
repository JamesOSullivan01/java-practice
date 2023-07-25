package src.p1;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;

    private DishWasher dishwasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {

        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishwasher.setHasWorkToDo(dishWasherFlag);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishwasher.doDishes();
    }

}
