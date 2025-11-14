
class Team{
  private String team;
  Team(String team) {
    System.out.println("Constuctor called:");
    this.team = team;
  }
  public void display() {
    System.out.println("This is normal method (function) "+ team);
  }
}

public class Question3 {
  public static void main(String[] args) {
    Team newTeam = new Team("Gasogi United");
    newTeam.display();
  }
}