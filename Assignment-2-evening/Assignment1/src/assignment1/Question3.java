/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


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
