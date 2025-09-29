public class Trinket extends Item implements Collectible {
    
    public Trinket(String name, double damageMod, double fireMod) {
        super(damageMod, fireMod, name);
    }

    @Override
    public boolean canDropped() {
        return true;
    }
    
}
