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
    public void noNoNo() {
        System.out.println("ALLOWED!!!\n");
    }
}
