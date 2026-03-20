public class Arena {
    public static void main(String[] args) {
        Pokemon P1 = new Pokemon();
        P1.name = "Pikachu";
        P1.level = 23;
        P1.attack();

        Pokemon P2 = new Pokemon();
        P2.name = "Charmender";
        P2.level = 48;
        P2.attack();
    }
}