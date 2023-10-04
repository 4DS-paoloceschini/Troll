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

    public boolean attacco (int spada){
        boolean finePartita = false;
        if(getRandomBoolean()){
            if (spada==1){
                hp-=dannoSpada1;
            }
            else{
                hp-=dannoSpada2;
            }
        }
        if(hp<=0){
            finePartita=true;
        }
        return finePartita;
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
