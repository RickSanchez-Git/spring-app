package def;

import java.util.ArrayList;
import java.util.List;

public class WeaponHolder {
    private List<Weapon> weaponList = new ArrayList<Weapon>();
    private int size;

    public WeaponHolder (Weapon weapon) {
        this.weaponList.add(weapon);
    }
    public WeaponHolder () {};

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public void addWeapon (Weapon weapon) {
        this.weaponList.add(weapon);
    }

    public List<Weapon> getWeaponList () {
        return weaponList;
    }
}
