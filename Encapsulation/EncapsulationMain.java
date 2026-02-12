package Encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("John", 120, "Bow");
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Health: " + player.getHealth());
        System.out.println("Player Weapon: " + player.getWeapon());
    }

}
