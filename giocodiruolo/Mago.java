
public class Mago extends Giocatore {

    private final int MANA_ATT = 20;

    public Mago(String nome, int hp, int mana, int peso, Razza razza) {
        super(nome, hp, mana, peso, razza);  
    }

    @Override
    public void attacca(Giocatore target, int danno) {
 
        int armature = 0;
        for (Equip e : target.getInventario()) {
            
            if (e.getTipo() == TipoEquip.Armatura)
                armature++;
        }

        if (mana - MANA_ATT >= 0) {
            mana -= MANA_ATT;

            int multi = 1;
            if (target instanceof Guerriero || target instanceof Arciere)
                multi = 2;

            int dannoFinale = multi * danno / (armature + 1);
            target.setHp(target.getHp() - dannoFinale); 

            if (target.isMorto()) {
                ricaricaMana();
            }

            // Optionally, you can handle the result here if needed
            return;
        }

        return;
    }

    public void ricaricaMana() {

        mana = MANA_MAX;
    }

    @Override
    protected void setHp(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHp'");
    }

    @Override
    protected boolean isMorto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMorto'");
    }

    @Override
    protected Equip[] getInventario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInventario'");
    }
}
