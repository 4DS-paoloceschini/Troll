import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Troll t1 = new Troll(200, "Gilberto il nano", "Giud Belinga", 150);

        do{
            System.out.println("Inserisci la spada che vuoi utilizzare tra 1 (20 di danno) e 2 (50 di danno)");
            int s = input.nextInt();
            t1.attacco(s);
            System.out.println(t1.toString());
            System.out.println(t1.e.toString());
        }while(t1.hp>0);
        System.out.println("Hai sconfitto il troll! :) \uD83E\uDD73");
    }

}