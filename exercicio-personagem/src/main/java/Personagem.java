import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    protected String codinome;
    protected String nome;

    List<SuperPoder> superPoders;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.superPoders = new ArrayList<>();
    }

    public abstract Double getForcaTotal();

    public void adicionarPoder(String nome, Integer categoria){
        SuperPoder novoPoder = new SuperPoder(nome, categoria);
        superPoders.add(novoPoder);
    }


    public String getCodinome() {
        return codinome;
    }

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<SuperPoder> getSuperPoders() {
        return superPoders;
    }

    public void setSuperPoders(List<SuperPoder> superPoders) {
        this.superPoders = superPoders;
    }


    @Override
    public String toString() {
        return "Personagem{" +
                "codinome='" + codinome + '\'' +
                ", nome='" + nome + '\'' +
                ", superPoders=" + superPoders +
                '}';
    }
}
