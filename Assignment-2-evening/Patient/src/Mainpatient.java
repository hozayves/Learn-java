class Patient {
    
    private String name;
    private int age;
    private String bloodType;

  
    public Patient(String name, int age, String bloodType) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
    }

    public void displayInfo() {
        System.out.println("=== Patient Information ===");
        System.out.println("Full Name   : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Blood Type  : " + bloodType);
    }
}

public class Mainpatient {
    public static void main(String[] args) {

        Patient p1 = new Patient("bashir", 29, "O");
        p1.displayInfo();
    }
}

