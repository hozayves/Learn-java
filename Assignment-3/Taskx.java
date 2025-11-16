import java.util.*;

class Applicant {
    String name, address, guardian;

    Applicant(String name, String address, String guardian) {
        this.name = name;
        this.address = address;
        this.guardian = guardian;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\nAddress: " + address + "\nGuardian: " + guardian);
    }
}

public class Taskx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Applicant> friends = new ArrayList<>();
        
        while(true) {
            System.out.println("\n1. Add new applicant\nType 'Done' to leave");
            System.out.print("Enter your choice here: ");
            String choice = input.nextLine();

            // Default to option 1 if nothing is entered
            if (choice.trim().isEmpty()) {
                choice = "1";
            }

            switch (choice) {
                case "1":
                    System.out.print("\nEnter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter an Address: ");
                    String address = input.nextLine();

                    System.out.print("Enter a guardian: ");
                    String guardian = input.nextLine();

                    friends.add(new Applicant(name, address, guardian));
                    break;

                case "Done":
                    int count = 1;
                    for(Applicant friend : friends) {
                        System.out.println("\nApplicant #" + count);
                        System.out.println("--------------------------------------");
                        System.out.println(friend);
                        System.out.println("--------------------------------------");
                        count++;
                    }
                    System.out.println("Applicant size: " + friends.size());
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your choice is wrong. Try again.");
            }
        }
    }
}
