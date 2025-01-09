class PC extends Computer {
    public PC(String name, double price) {
        super(name, price);
    }
    public PC(PC other){
        super(other);
    }

    @Override
    public Product clone() {
        return new PC(this);
    }

    @Override
    public String warranty() {
        return "Hardware and peripherals warranty.";
    }

    @Override
    public String toString() {
        return "PC: " + super.toString();
    }
}

