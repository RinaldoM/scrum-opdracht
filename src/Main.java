import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "**************\n" +
                        "CalcuRocco\n" +
                        "**************\n" +
                        "1) Calculate average\n" +
                        "2) Calculate addition\n" +
                        "3) Calculate subtraction\n" +
                        "4)...");
        int chosenOption = scanner.nextInt();

        switch (chosenOption){

            case 1:
                Double inputtedValue=0.0;
                List<Double> inputtedValues = new ArrayList<>();
                System.out.println("Input the numbers from which you want to calculate the average. End the sequence with 0 \n");
                inputtedValue = scanner.nextDouble();
                calcAverage average = new calcAverage();
                while (inputtedValue!=0){
                    inputtedValues.add(inputtedValue);
                    inputtedValue = scanner.nextDouble();
                }
                System.out.println("The average value is: "+average.calculate(inputtedValues));
                inputtedValues.clear();
                break;
            case 2:
                System.out.println("Input the numbers from which you want to add them up. End the sequence with 0\n");
                inputtedValues=new ArrayList<>();
                inputtedValue = scanner.nextDouble();
                calcAddition sum = new calcAddition();
                while (inputtedValue!=0){
                    inputtedValues.add(inputtedValue);
                    inputtedValue=scanner.nextDouble();
                }
                System.out.println("The total sum is: "+sum.calculate(inputtedValues));
                inputtedValues.clear();
                break;
            case 3:
                System.out.println("Input the numbers from which you want to do a subtraction. End the sequence with 0\n");
                inputtedValues=new ArrayList<>();
                inputtedValue = scanner.nextDouble();
                calcSubtraction subtraction = new calcSubtraction();
                while (inputtedValue!=0){
                    inputtedValues.add(inputtedValue);
                    inputtedValue=scanner.nextDouble();
                }
                System.out.println("The total subtraction is: "+subtraction.calculate(inputtedValues));
                inputtedValues.clear();
                break;
            case 4:


        }

    }
}
