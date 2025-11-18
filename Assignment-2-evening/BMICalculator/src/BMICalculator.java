import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

       
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

       
        if (bmi < 18.5) {
            System.out.println("Underweight for BMI<18.5");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight for 18.5<=BMI<24.9");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight for 25<=BMI<29.9");
        } else if (bmi >= 30) {
            System.out.println("Obesity for BMI>=30");
        } else {
            System.out.println("Invalid BMI value.");
        }

        
    }
}
