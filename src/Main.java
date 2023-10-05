import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Troll t1 = new Troll(200, "Gilberto il nano");

        do {
            System.out.println("Inserisci la spada che vuoi utilizzare tra 1 (20 di danno) e 2 (50 di danno)");
            int s = input.nextInt();
            System.out.println("Il troll ti ha tolto " + t1.attacco(s) + " di vita!");
            System.out.println(t1.toString());
            System.out.println(t1.e.toString());
        } while (t1.hp > 0 && t1.e.hp > 0);
        if (t1.hp > 0) {
            System.out.println("PIPPA!!!!!!!");

        } else {
            System.out.println("Hai sconfitto il troll! :) \uD83E\uDD73");
        }
    }

}