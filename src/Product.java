package src;

public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int heigth;
    private int depth;

    public Product(String model, String manufactuerer) {
        this.model = model;
        this.manufacturer = manufactuerer;
    }
}

class Monitor extends Product {
    public Monitor(String model, String manufactuerer) {
        super(model, manufactuerer);
    }
}

class Motherboard extends Product{
    public Motherboard(String model, String manufactuerer) {
        super(model, manufactuerer);
    }
}

class ComputerCase extends Product {
    public ComputerCase(String model, String manufactuerer) {
        super(model, manufactuerer);
    }
}

