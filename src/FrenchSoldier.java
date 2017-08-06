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
    public void noNoNo() {
        System.out.println("ALLOWED!!!\n");
    }
}