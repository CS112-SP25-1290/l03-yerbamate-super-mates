class YerbaMate extends Tea {
    private int numPasses;

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public int getNumPasses() {
        return numPasses;
    }
        
    public void passMate() {
        numPasses++;
        System.out.println("Mate was passed. " + numPasses + "passes so far.");
    }

    public void refill(int ouncesAdded) {
        setOunces(getOunces() + ouncesAdded);
    }

    @Override
    public String toString() {
        return "Yerba Mate: " +getName() + ", " + getOunces() + " ounces, brewed @ " + getBrewTemp() + "°C, $" + String.format("%.2f", getPrice()) + ", " + numPasses + " passses so far";
    }
}
