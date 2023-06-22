public class PhysicalBook extends Book {
    private double weight;

    PhysicalBook(String title, String author, double price, int quantity, double weight){
            super(title, author, price, quantity);
            this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double calculateShippingCost(){
        double initialWeight = 500;
        double additionalWeight = weight - initialWeight;
        double extraChange = (additionalWeight/250) * 1.00;
        return 4.50 + extraChange;
    }
    public double getWeightInPounds(){
        return weight / 453.59237; // 1 gram = 0.00220462 pounds
    }
}
