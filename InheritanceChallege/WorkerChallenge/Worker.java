
package InheritanceChallege.WorkerChallenge;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Worker {
 private  String name;
 private   String birthDate;
 protected  String endDate;
    public Worker()
    {

    }
    public Worker(String name, String birthDate) {
    this.name = name;
    this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
//    public int getAge() {
//     String[] patterns = {"d/M/yyyy", "d-M-yyyy", "yyyy-MM-dd"};
//     for (String pattern : patterns) {
//         try {
//             DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
//             return 2026 - LocalDate.parse(birthDate, formatter).getYear();
//         } catch (DateTimeParseException e) {
            
//         }
//     }
//     throw new IllegalArgumentException("Invalid date format: " + birthDate);
//     }
  public int getAge() {
    String[] patterns = {"d/M/yyyy", "d-M-yyyy", "yyyy-MM-dd"};
    int currentYear = LocalDate.now().getYear();
    for (String pattern : patterns) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return currentYear - LocalDate.parse(birthDate, formatter).getYear();
        } catch (DateTimeParseException e) {
            continue; 
        }
    }
    throw new IllegalArgumentException("Invalid date format: " + birthDate);
}




 public double collectPay()
    {
        return 0.0;
    }
    public void terminate(String endDate)
    {
        this.endDate=endDate;

    }
    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
    }
    
    
    
    

}
