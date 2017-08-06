interface Bomb extends Fight, Run {
    public String toString();

    public default void version() {
        System.out.println("VERSION: 3.0");
    }
}