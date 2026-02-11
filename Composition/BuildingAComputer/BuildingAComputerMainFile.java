package Composition.BuildingAComputer;

public class BuildingAComputerMainFile {
    public static void main(String[] args)
    {
        Monitor monitor=new Monitor("27 inch 4K", "Dell", 27, 2160);
        Motherboard motherboard=new Motherboard("ASUS ROG STRIX B550-F", "ASUS", 4, 2, "BIOS v1.0");
        Case caseComponent=new Case("NZXT H510", "NZXT", "650W PSU");
        PersonalComputer pc=new PersonalComputer("Gaming PC", "Custom Build", caseComponent, monitor, motherboard);
        pc.pressPowerButton();
        pc.drawLogo();
        pc.loadProgram("Minecraft");
    }

}
