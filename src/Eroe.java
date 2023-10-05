public class Eroe {
    String nome;
    int hp;

    public Eroe (String nome, int hp){
        this.nome=nome;
        this.hp=hp;
    }

    public void setHp(double hp) {
        this.hp -= hp;
    }

    @Override
    public String toString() {
        return "Eroe{" +
                "nome='" + nome + '\'' +
                ", hp=" + hp +
                '}';
    }
}
