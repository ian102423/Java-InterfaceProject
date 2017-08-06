
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
        marine.noNoNo();

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
        frenchSoldier.noNoNo();

        ClonedSoldier clonedSoldier = new ClonedSoldier();
        System.out.println(
                clonedSoldier.whoAmI() + " " +
                        clonedSoldier.speak() + " " +
                        clonedSoldier.punch() + " " +
                        clonedSoldier + "\n");

        // Version 3.0
        clonedSoldier.version();
        clonedSoldier.noNoNo();


    }
}

