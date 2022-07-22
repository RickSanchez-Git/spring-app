package def;

public class Chestplate {
    private int reduction;
    private int durability;

    private Chestplate (int reduction, int durability) {
        this.durability = durability;
        this.reduction = reduction;
    }

    private Chestplate () {};

    public static Chestplate getInstance() {
        return new Chestplate();
    }
    public static Chestplate getInstance(int reduction, int durability) {
        return new Chestplate(reduction, durability);
    }

    public void init (){
        System.out.println("\u001B[32m" + "Initialized" + "\u001B[0m");
    }

    public void destroy () {
        System.out.println("\u001B[31m" + "Destroyed" + "\u001B[0m");
    }

    public int getReduction() {
        return reduction;
    }

    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
