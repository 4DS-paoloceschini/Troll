public class Eroe {
    String nome;
    int hp;

    public Eroe (String nome, int hp){
        this.nome=nome;
        this.hp=hp;
    }

    public void setHp(int hp) {
        this.hp -= hp;
    }

}
