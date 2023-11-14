public class Confronto {
    public void lutar(Heroi heroi, Vilao vilao) {
        double forcaHeroi = heroi.getForcaTotal();
        double forcaVilao = vilao.getForcaTotal();

        if (forcaHeroi > forcaVilao) {
            System.out.println("O herói venceu o confronto!");
        } else if (forcaVilao > forcaHeroi) {
            System.out.println("O vilão venceu o confronto!");
        } else {
            System.out.println("O confronto terminou em empate!");
        }
    }
}
