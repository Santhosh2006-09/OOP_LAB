import java.time.*;
import java.time.format.*; 
import java.util.*;      
import java.text.*;      
public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
        System.out.println("Current DateTime: " + now.format(formatter));
        
        LocalDate birthday = LocalDate.of(1990, Month.JUNE, 15);
        System.out.println("Birthday: " + birthday.format(DateTimeFormatter.ISO_DATE));
        
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);
        Duration duration = Duration.between(start, end);
        
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        System.out.println("Work hours: " + nf.format(duration.toHours()) + " hours");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your birth year: ");
        int year = scanner.nextInt();
        
        Period age = Period.between(LocalDate.of(year, Month.JANUARY, 1), LocalDate.now());
        System.out.println("You're approximately " + age.getYears() + " years old");
        
        Random random = new Random();
        int randomDay = random.nextInt(28) + 1;  
        LocalDate randomDate = LocalDate.of(2023, Month.of(random.nextInt(12) + 1), randomDay);
        System.out.println("Random date this year: " + randomDate);
        
        scanner.close();
    }
}