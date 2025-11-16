import java.util.*;

class Vote {
    int age;
    String nationality;

    Vote(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void eligiblity() {
        if (age >= 18 && nationality.equals("Rwandan")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your nationality: ");
        String nationality = input.nextLine();

        Vote vote = new Vote(age, nationality);
        // vote.eligiblity();
    }
}
