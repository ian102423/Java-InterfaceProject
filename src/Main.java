
public class Main {
    public static void main(String[] args) {
        Marine marine = new Marine();
        FrenchSoldier frenchSoldier = new FrenchSoldier();

        System.out.println(
                marine.whoAmI() + " " +
                        marine.sleep() + " " +
                        marine.eat() + " " +
                        marine.walk() + " " +
                        marine.speak() + " " +
                        marine.punch() + " " +
                        marine.fightStyle() + " " +
                        marine.runStyle() + "\n");
        // Old Version
        marine.version();
        marine.notAllowed();

        System.out.println(
                frenchSoldier.whoAmI() + " " +
                        frenchSoldier.sleep() + " " +
                        frenchSoldier.eat() + " " +
                        frenchSoldier.walk() + " " +
                        frenchSoldier.speak() + " " +
                        frenchSoldier.punch() + " " +
                        frenchSoldier.fightStyle() + " " +
                        frenchSoldier.runStyle() + "\n");
        // Old Version
        frenchSoldier.version();
        frenchSoldier.notAllowed();

        ClonedSoldier clonedSoldier = new ClonedSoldier();
        System.out.println(
                clonedSoldier.whoAmI() + " " +
                        clonedSoldier.speak() + " " +
                        clonedSoldier.punch() + " " +
                        clonedSoldier + "\n");

        // Version 3.0
        clonedSoldier.version();
        clonedSoldier.notAllowed();


    }
}

class ClonedSoldier extends Soldier implements Bomb, WhoAmI, NOTALLOWED {

    @Override
    public String whoAmI() {
        return "I am Clond Soldier, Serial #74\n";
    }

    @Override
    public String speak() {
        return "I am born to KILL";
    }

    @Override
    public String punch() {
        return "I one punch, you dead";
    }

    // Implements Bomb
    @Override
    public String toString() {
        return fightStyle() + " " + runStyle();
    }

    @Override
    public String fightStyle() {
        return "ZZINGGG~ ZZINGGG~";
    }

    @Override
    public String runStyle() {
        return "I NEVER RUN";
    }

    // Not Allowed
    @Override
    public void notAllowed() {
        System.out.println("NOT ALLOWED!!!\n");
    }

}

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

// Soldiers

class Marine extends Soldier implements Fight, Run, Bomb, WhoAmI, NOTALLOWED {
    @Override
    public String whoAmI() {
        return "I'm PROUD MARINE!!!\n";
    }

    @Override
    public String speak() {
        return "OOHRAH~~~!!!";
    }

    @Override
    public String punch() {
        return "OUCH";
    }

    @Override
    public String fightStyle() {
        return "TANG KANG BANG";
    }

    @Override
    public String runStyle() {
        return "BAMF! BAMF! BAMF!";
    }

    // Override Version
    @Override
    public void version() {
        System.out.println("VERSION: 2.9");
    }

    // Not Allowed
    @Override
    public void notAllowed() {
        System.out.println("ALLOWED!!!\n");
    }
}

class FrenchSoldier extends Soldier implements Fight, Run, Bomb, WhoAmI, NOTALLOWED {
    @Override
    public String whoAmI() {
        return "Am I even a soldier...!?\n";
    }

    @Override
    public String speak() {
        return "I Surrender, plz don't shoot me...";
    }

    @Override
    public String punch() {
        return "OH HOHO";
    }

    @Override
    public String fightStyle() {
        return "BOOM! BOM! MOM!";
    }

    @Override
    public String runStyle() {
        return "BATATATATATA";
    }

    // Override Version
    @Override
    public void version() {
        System.out.println("VERSION: 2.9");
    }

    // Not Allowed
    @Override
    public void notAllowed() {
        System.out.println("ALLOWED!!!\n");
    }
}

// Fight Styles

interface Fight {
    public String fightStyle();
}

interface Run {
    public String runStyle();
}

// Who Am I && Not Allowed

interface WhoAmI {
    public String whoAmI();
}

interface NOTALLOWED {
    public void notAllowed();
}

// BOMB

interface Bomb extends Fight, Run {
    public String toString();

    public default void version() {
        System.out.println("VERSION: 3.0");
    }
}