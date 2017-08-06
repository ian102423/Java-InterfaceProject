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
    public void noNoNo() {
        System.out.println("NOT ALLOWED!!!\n");
    }

}