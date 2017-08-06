abstract class Soldier {

    private String name;
    private String rank;
    private String serialNumber;

    // Added Identity
    abstract public String whoAmI();

    public String sleep() {
        return "zZZ zZZ zZZ";
    }

    public String eat() {
        return "chew~ chew! chew?";

    }

    public String walk() {
        return "trudge! trudge! trudge!";
    }

    abstract public String speak();

    abstract public String punch();
}