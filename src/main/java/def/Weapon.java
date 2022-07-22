package def;

public class Weapon {
    private int damage;
    private int range;

    public Weapon (int damage, int range) {
        this.damage = damage;
        this.range = range;
    }

    public Weapon () {};

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }
}
