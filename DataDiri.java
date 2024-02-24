import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your gender (P for female, L for male): ");
        String gender = scanner.nextLine();
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate now = LocalDate.now();
        Period age = Period.between(dob, now);

        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender.equalsIgnoreCase("P") ? "Female" : "Male"));
        System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");
    }
}