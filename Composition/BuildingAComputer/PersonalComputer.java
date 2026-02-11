package Composition.BuildingAComputer;

public class PersonalComputer extends Product {
    private Case caseComponent;
    private Monitor monitor;
    private Motherboard motherboard;
    public PersonalComputer(String model, String manufacturer, Case caseComponent, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.caseComponent = caseComponent;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
   public void drawLogo()
   {
    monitor.drawPixelAt(1200, 800, "red");
    System.out.println("Drawing logo on the monitor...");
   }

   public void loadProgram(String programName)
   {
    motherboard.loadProgram(programName);
    System.out.println("Loading " + programName + " on the computer...");
   }
    
   public void pressPowerButton()
   {
    System.out.println("Power button pressed. Booting up the computer...");
    caseComponent.pressPowerButton();
   }

}
