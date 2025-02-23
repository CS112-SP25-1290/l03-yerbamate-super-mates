public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = Math.max(brewTemp, 0);
    }

    public int getBrewTemp() {
        return brewTemp;
    }

    public void setBrewTemp(int brewTemp) {
        this.brewTemp = Math.max(brewTemp, 0);
    }
    @Override
    public String toString() {
        return
    }
}
