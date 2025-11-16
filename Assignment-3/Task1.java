import java.util.*;

class BMI {
    double weight, height;
    BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        double bmi = weight / Math.pow(height, 2);
        String results;
        
        if (bmi < 18.5) {
            results = "Underweight";
        } else if(bmi >= 18.5 && bmi < 25) {
            results = "Normal weight";
        } else if (bmi >= 25 && bmi <29.9) {
            results = "Overweight";
        } else {
            results = "Obesity";
        }
        System.out.println(results);
    }

}

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (meter): ");
        double height =  input.nextDouble();

        BMI bmi = new BMI(weight, height);
        bmi.calculateBMI();
    }
}