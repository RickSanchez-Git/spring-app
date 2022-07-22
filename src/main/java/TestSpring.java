import annotation.Horse;
import annotation.autowired.Cup;
import def.Chestplate;
import def.Weapon;
import def.WeaponHolder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Basic / dependencies
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        WeaponHolder weaponHolder = context.getBean("MainHolder", WeaponHolder.class);
        weaponHolder.addWeapon(context.getBean("Sword", Weapon.class));

        for (Weapon weapon : weaponHolder.getWeaponList()) {
            System.out.println("Damage: " + weapon.getDamage());
            System.out.println("Range: " + weapon.getRange());
            System.out.println("-----------------------------");
        }

        Weapon longSword = context.getBean("LongSword", Weapon.class);
        System.out.println("Longsword range: " + longSword.getRange());

        Weapon shortSword = context.getBean("ShortSword", Weapon.class);
        System.out.println("ShortSword range: " + shortSword.getRange());
        System.out.println("-----------------------------");

        WeaponHolder secondHolder = context.getBean("SecondHolder", WeaponHolder.class);
        for (Weapon weapon : secondHolder.getWeaponList()) {
            System.out.println("Damage: " + weapon.getDamage());
            System.out.println("Range: " + weapon.getRange());
            System.out.println("-----------------------------");
        }

        //Singleton
        Chestplate chestplate1 = context.getBean("IronChest", Chestplate.class);
        Chestplate chestplate2 = context.getBean("IronChest", Chestplate.class);
        System.out.println("Durability: " + chestplate1.getDurability());
        System.out.println("Reduction: " + chestplate1.getReduction());
        System.out.println("-----------------------------");
        System.out.println("Durability: " + chestplate2.getDurability());
        System.out.println("Reduction: " + chestplate2.getReduction());

        chestplate1.setDurability(120);
        System.out.println("Durability: " + chestplate2.getDurability());
        System.out.println(chestplate1 == chestplate2); //true

        //Prototype
        System.out.println("-----------------------------");
        Chestplate bronzeChest1 = context.getBean("BronzeChest", Chestplate.class);
        Chestplate bronzeChest2 = context.getBean("BronzeChest", Chestplate.class);
        System.out.println(bronzeChest2 == bronzeChest1);
        bronzeChest1.setDurability(200);
        System.out.println("Durability: " + bronzeChest1.getDurability());
        System.out.println("Durability: " + bronzeChest2.getDurability());
        System.out.println("-----------------------------");

        //Init, destroy, factory methods
        Chestplate factoryChest = context.getBean("FactoryChest", Chestplate.class);
        System.out.println("Durability: " + factoryChest.getDurability());

        Chestplate initChest = context.getBean("InitChest", Chestplate.class);

        //Declaring with annotation
        Horse whiteHorse = context.getBean("WhiteHorse", Horse.class);
        whiteHorse.setColor("White");
        System.out.println(whiteHorse.getColor());
        System.out.println(whiteHorse.getSpeed());

        //Declaring with annotation, private constructor
        System.out.println("-----------------------------");
        Cup cup = context.getBean("cup", Cup.class);
        System.out.println(cup.getDrink());
        cup.getDrink().drinkUp();

        context.close(); // is necessary to destroy
    }
}
