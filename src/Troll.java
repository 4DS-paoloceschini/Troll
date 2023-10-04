import java.util.Random;

public class Troll {
    int hp;
    String nome;
    int dannoSpada1;
    int dannoSpada2;

    public Troll (int hp, String nome){
        this.hp = hp;
        this.nome = nome;
        this.dannoSpada1 = 20;
        this.dannoSpada2 = 50;
    }

    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
