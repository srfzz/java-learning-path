package Encapsulation;

public class EnhancedPlayer {
    private int health;
    private String name;
    private String weapon;
    public EnhancedPlayer(String name) {
        this(name, 100, "Sword"); 
    }
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health < 0 || health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

}
