import java.util.*;

class AddTwo {
  Scanner input = new Scanner(System.in);
  private int x;
  private int y;
  int size = 5;
  private String[] friends = new String[size];

  public void addNumbers() {
    System.out.print("\nEnter number 1: ");
    x = input.nextInt();
    System.out.print("Enter number 2: ");
    y = input.nextInt();
    System.out.println("\n============ Thanks for your input (" + x + "&" + y + ")============");
  }

  public void addFriends() {
    input.nextLine();
    for (int i = 0; i < size; i++) {
      System.out.print("Enter friend (" + (i + 1) + "): ");
      friends[i] = input.nextLine();
    }
  }

  public void displayFriends() {
    boolean hasFriends = false;
    
    for(String friend : friends) {
      if(friend != null && !friend.isEmpty()) {
        hasFriends = true;
        break;
      }
    }
    if (hasFriends) {
      System.out.println("\n=========== Here is my lovely friends=============");
      for (String friend : friends) {
        System.out.println(friend);
      }
      System.out.println("=========================================");
    } else {
      System.out.println("\n==================================================\n No list of friends available now. Try again later\n====================================================");
    }
  }
}

public class Question5 {
  public static void main(String[] args) {
    AddTwo app = new AddTwo();
    while (true) {

      System.out.print("\n" +
          "1. Add two numbers" +
          "\n2. Create array of 5 friends" +
          "\n3. Display data from array" +
          "\nType 'exit' to leave" + "\n\nChoose an option: ");
      Scanner input = new Scanner(System.in);
      String choice = input.nextLine();

      switch (choice) {
        case "1":
          app.addNumbers();
          break;
        case "2":
          app.addFriends();
          break;
        case "3":
          app.displayFriends();
          break;
        case "exit":
          System.exit(0);
          break;
        default:
          System.out.println("\n=================================================\nChoose correct choice please and try again later\n=================================================");
      }
    }
  }
}