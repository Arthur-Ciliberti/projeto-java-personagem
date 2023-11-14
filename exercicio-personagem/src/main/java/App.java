public class App {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Miranha", "Clark Kent");
        heroi1.adicionarPoder("Soltar Teias", 4);
        heroi1.adicionarPoder("Sentido Aranha", 6);

        Heroi heroi2 = new Heroi("Morcegão", "Bruce Wayne");
        heroi2.adicionarPoder("Inteligência", 10);
        heroi2.adicionarPoder("Din Din", 9);

        Vilao vilao1 = new Vilao("Duende Verde", "Norman Osbourne");
        vilao1.adicionarPoder("Força", 6);
        vilao1.adicionarPoder("Explosivos", 3);

        Vilao vilao2 = new Vilao("Coringa", "Arthur Fleck?");
        vilao2.adicionarPoder("Gás do Riso", 8);

        Confronto lutar1 = new Confronto();
        Confronto lutar2 = new Confronto();

        System.out.println("Miranha contra o Duende verde:\n" +
                "Quem será que ganha???\n\n" +
                heroi1.nome + " Ataca " + vilao1.nome + "\n\n" +
                "Heroi ou vilão??");
        lutar1.lutar(heroi1, vilao1);

        System.out.println("\n!!!!Round 2!!!!\n\n" +
                "Batman contra Coringa:\n" +
                "Quem será que ganha???\n\n" +
                heroi2.nome + " Ataca " + vilao2.nome + "\n\n" +
                "Heroi ou vilão??");
        lutar2.lutar(heroi2, vilao2);

    }
}


