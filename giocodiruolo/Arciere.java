public class Arciere extends Giocatore {

    private Arma arma;

    public Arciere(String nome, int hp, int mana, int peso, Razza razza, Arma arma) {
        super(nome, hp, mana, peso, razza);
        this.arma = arma;
    }

    @Override
    public boolean attacca(Giocatore bersaglio) {
        if (arma != null && arma.isRanged()) {
            int danno = arma.getDanno();
            System.out.println(getNome() + " attacca con " + arma.getNome() + " infliggendo " + danno + " danni.");
            bersaglio.subisciDanno(danno);
            return true;
        }
        System.out.println(getNome() + " non può attaccare: arma non a distanza!");
        return false;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }
}