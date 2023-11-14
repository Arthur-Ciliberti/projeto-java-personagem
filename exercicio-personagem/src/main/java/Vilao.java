public class Vilao extends Personagem{

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        double forcaTotal = 0.0;

        for (SuperPoder poder : superPoders) {
            forcaTotal += poder.categoria;
        }

        return forcaTotal;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                """, super.toString());
    }
}
