import java.util.ArrayList;

public class Player {
    
    private int hp;
    private final int HP_MAX;   

    private double damage, fireRate, finalDamage, finalFireRate;

    private Active active;
    private Trinket trinket;
    private ArrayList<Passive> passiveList;
    private ArrayList<Collectible> collectList;

    public Player(int hp, double damage, double fireRate) {
        this.hp = this.HP_MAX = hp;
        this.finalDamage = damage;
        this.finalFireRate = fireRate;
        passiveList = new ArrayList<>();
        collectList = new ArrayList<>();
    }

    public void updateStats() {
        finalDamage = damage;
        finalFireRate = fireRate;
        for (Passive p : passiveList) {
            finalDamage += p.getDamageMod();
            finalFireRate += p.getFireMod();
        }
        if (trinket != null) {
            finalDamage += trinket.getDamageMod();
            finalFireRate += trinket.getFireMod();
        }
        if (active != null) {
            finalDamage += active.getDamageMod();
            finalFireRate += active.getFireMod();
        }
    }

    public double getFinalDamage() {
        return finalDamage;
    }

    public double getFinalFireRate() {
        return finalFireRate;
    }

    

    
}
