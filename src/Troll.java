import java.util.Random;

public class Troll {
    int hp;
    String nome;
    int dannoSpada1;
    int dannoSpada2;
    int dannoTroll;
    Eroe e;


    public Troll (int hp, String nome, String nome2, int hp2){
        this.hp = hp;
        this.nome = nome;
        this.dannoSpada1 = 20;
        this.dannoSpada2 = 50;
        Eroe e = new Eroe(nome2, hp2);
    }

    public void attacco (int spada){
        boolean finePartita = false;
        if(getRandomBoolean()){
            if (spada==1){
                hp-=dannoSpada1;
            }
            else{
                hp-=dannoSpada2;
            }
        }
        if(getRandomBoolean()){
            double doubleRandomNumber = Math.random() * 35;
            e.setHp(doubleRandomNumber);
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
