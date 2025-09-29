public abstract class Item {
    
    protected String name;
    protected double damageMod, fireMod;

    public Item(double damageMod, double fireMod, String name) {
        this.damageMod = damageMod;
        this.fireMod = fireMod;
        this.name = name;
    }

    public double getDamageMod() {
        return damageMod;
    }

    public double getFireMod() {
        return fireMod;
    }

    
}
