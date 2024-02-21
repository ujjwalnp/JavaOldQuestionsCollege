// importing required functions : Nabin Dhakal
import java.util.Scanner;
import java.lang.String;

public class NDProjectOne {

    // Function of BMI calculator : Nabin Dhakal
    static double claculateBMI (float age, float bl, float weight, String gender) {

        // calculate gender factor : Nabin Dhakal
        float gf = 1;
        if (gender.equals("R")) {
            gf = 8.46f;
        } else if (gender.equals("S")) {
            gf = 4.23f;
        } else if (gender.equals("T")){
            gf = 6.35f;
        } else {
            // error message : Nabin Dhakal
            System.out.println("Invalid Gender");
        }

        // Calculate BMI and return : Nabin Dhakal
        double BMI =( 2.56 * age +( (bl*467) / (weight*gf) ));
        return BMI;
    }

    // Output generating function (Output Screen) : Nabin Dhakal
    static void output (float age, float bl, float weight, String gender) {

        // calulating the value of BMI using the function calculateBMI(); : Nabin Dhakal
        double BMI = claculateBMI(age, bl, weight, gender);

        String treatment = "";
        String condition = "";
        String recomendedTreatment = "";

        // checking the values of BMI : Nabin Dhakal
        if (BMI<80){
            condition = "Mild case";
            treatment = "no treatment required";
        } else if (BMI>80 && BMI<120){
            condition = "Serious case";
            treatment = "Medication treatment";
        } else if (BMI>120 && BMI<200){
            condition = "Acute case";
            treatment = "Ultraviolet treatment";
        } else if (BMI>200 && BMI<360){
            condition = "Severe case";
            treatment = "Replacement therapy";
        } else if (BMI>360){
            condition = "Extreme case";
            treatment = "Hospitalization";
        } else {
            System.out.println("Calculated is invalid!");
        }

        // The output screen : Nabin Dhakal
        recomendedTreatment = condition+", "+treatment;

        System.out.printf("\nFor a citizen of gender type %s, who is %.0f cycles old and weighs %.0f kilograms with a reported Biximent Level of %.2f, the Biximent Metabolic Index is %.2f, their condition is %s and %s is recommended.\n", gender, age, weight, bl, BMI, condition, treatment);

        System.out.println("\nBiximent Metabolic Index Report");
        System.out.println("Gender : "+ gender);
        System.out.printf("Age : %.0f cycles\n", age);
        System.out.printf("Weight : %.0f kilograms\n", weight);
        System.out.printf("Biximent Level : %.2f\n", bl);
        System.out.printf("BMI : %.2f\n", BMI);

        System.out.println("Recomended Treatment : "+ recomendedTreatment);

        if (BMI>200){
            System.out.println("Inhabitant is Highly Contagious.");
        }
    }

    public static void main(String[] args) {

        // Scanner object : Nabin Dhakal
        Scanner myObj = new Scanner(System.in);

        while (true){

            // Weight of user : Nabin Dhakal
            System.out.print("\nEnter your weight in kilogram : ");
            float weight = myObj.nextFloat();

            // Age of the user : Nabin Dhakal
            System.out.print("Enter your age in solar cycle : ");
            float age = myObj.nextFloat();

            // Genter of user : Nabin Dhakal
            System.out.print("Enter your gender (R, S, or T) : ");
            String gender = myObj.next();
            gender = gender.toUpperCase();

            // Biximent level of user : Nabin Dhakal
            System.out.print("Enter your biximent level : ");
            float bl = myObj.nextFloat();

            // check the value of age, biximent level, weight is non-negative or not : Nabin Dhakal
            if ( weight >= 0 || age >= 0 || bl >= 0 ){
                output(age, bl, weight, gender);
            }
            else {
                // error message : Nabin Dhakal
                System.out.println("Your age, bl, weight must be positive!");
            }
        }
    }
}
