class TV extends Product {
    public TV(String name, double price) {
        super(name, price);
    }
    public TV(TV other){
        super(other);
    }

    @Override
    public Product clone() {
        return new TV(this);
    }

    @Override
    public String warranty() {
        return "Screen and remote control warranty.";
    }

    @Override
    public String toString() {
        return "TV: " + super.toString();
    }
}
