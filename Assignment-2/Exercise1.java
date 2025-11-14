import java.util.*;

class Employee {
  String name, employeeId;

  Employee(String name, String employeeId) {
    this.name = name;
    this.employeeId = employeeId;
  }
  void displayDetails() {
    System.out.println("Employee ID: "+ employeeId);
    System.out.println("Employee Name: "+ name);
  }
}
class Doctor extends Employee {
  String specialized, basicSalary;

  Doctor(String specialized, String basicSalary, String name, String employeeId) {
    super(name, employeeId);
    this.specialized = specialized;
    this.basicSalary = basicSalary;
  }
  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Employee Specialization: "+ specialized);
    System.out.println("Employee Basic Salary: "+ basicSalary);
  }
}
class ChiefDoctor extends Doctor {
  String leaderShipAllowance;

  ChiefDoctor(String leaderShipAllowance, String name, String employeeId, String specialized, String basicSalary) {
    super(specialized, basicSalary, name, employeeId);
    this.leaderShipAllowance = leaderShipAllowance;
  }
  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Employee Leadership Allowance: "+ leaderShipAllowance);
  }

  public double totalEarnings() {
    return Double.parseDouble(leaderShipAllowance) + Double.parseDouble(basicSalary);
  }
}
public class Exercise1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Employee ID: ");
    String id = input.nextLine();

    System.out.print("Enter Employee Name: ");
    String name = input.nextLine();

    System.out.print("Enter Specialized: ");
    String specialized = input.nextLine();

    System.out.print("Enter Basic Salary: ");
    String basicSalary = input.nextLine();

    System.out.print("Enter LeaderShip Allowance: ");
    String allowance = input.nextLine();



    ChiefDoctor emp;
    emp = new ChiefDoctor(allowance, name, id, specialized, basicSalary);

    System.out.println("\n====== Employee Full Details ======\n");
    emp.displayDetails();
    System.out.println("\nTotal Earning: "+ emp.totalEarnings());
    System.out.println("\n========================================");

  }
}