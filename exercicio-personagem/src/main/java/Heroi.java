public class Heroi extends Personagem {

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }


    @Override
    public Double getForcaTotal() {
        double forcaTotal = 0.0;

        for (SuperPoder poder : getSuperPoders()) {
            forcaTotal += poder.getCategoria();
        }

        forcaTotal *= 1.15;

        return forcaTotal;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                """, super.toString());
    }
}
