import java.util.Random;

public class Troll {
    int hp;
    String nome;
    int dannoSpada1;
    int dannoSpada2;
    int dannoTroll;
    Eroe e = new Eroe("Giud Belinga", 150);


    public Troll (int hp, String nome){
        this.hp = hp;
        this.nome = nome;
        this.dannoSpada1 = 20;
        this.dannoSpada2 = 50;

    }

    public double attacco (int spada){
        double doubleRandomNumber = Math.random() * 35;
        if(getRandomBoolean()){
            if (spada==1){
                hp-=dannoSpada1;
            }
            else{
                hp-=dannoSpada2;
            }
        }
        if(getRandomBoolean()){
            e.setHp(doubleRandomNumber);
            return doubleRandomNumber;
            }
        else{
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Troll{" +
                "hp=" + hp +
                "nome=" + nome +
                '}';
    }

    private boolean getRandomBoolean() { //l'attacco andrà a buon fine o no?
        Random random = new Random();
        return random.nextBoolean();
    }
}
