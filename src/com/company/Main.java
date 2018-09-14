package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner methodReader = new Scanner(System.in);
        System.out.println("What method will you be using?");
        String method = methodReader.nextLine();
        System.out.println("User chooses: " + method);

        Scanner firstInp = new Scanner(System.in);
        System.out.println("Please enter the first input:");
        double firstInput = firstInp.nextDouble();

        Scanner secondInp = new Scanner(System.in);
        System.out.println("Please enter the second input:");
        double secondInput = secondInp.nextDouble();

        if (method.equalsIgnoreCase("add")) {

            String wordChoice = "sum";
            double firstAns = firstInput + secondInput;
            double finalAnswer = Math.abs(firstAns);

            Scanner satisfiedOrNaw = new Scanner(System.in);
            System.out.println("The " + wordChoice + "of " + firstInput + "and " + secondInput + "is " + finalAnswer + ". Are you satisfied?");
            String yeeOrNaw = satisfiedOrNaw.nextLine();

            if (yeeOrNaw.equalsIgnoreCase("No")){

                Scanner canYouIdentify = new Scanner(System.in);
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String mathGuess = canYouIdentify.nextLine();

                if (mathGuess.equalsIgnoreCase("abs")){
                    System.out.println("Great! Good job and goodbye!");
                } else {
                    System.out.println("Sorry, that is incorrect:( try again later!");
                }

            } else if(yeeOrNaw.equalsIgnoreCase("yes")){

                System.out.println("Great! Have a great day!");

            }

        } else if (method.equalsIgnoreCase("subtract")) {

            String wordChoice = "difference";
            double firstAns = firstInput - secondInput;
            double finalAnswer = Math.abs(firstAns);

            Scanner satisfiedOrNaw = new Scanner(System.in);
            System.out.println("The " + wordChoice + "of " + firstInput + "and " + secondInput + "is " + finalAnswer + ". Are you satisfied?");
            String yeeOrNaw = satisfiedOrNaw.nextLine();

            if (yeeOrNaw.equalsIgnoreCase("No")){

                Scanner canYouIdentify = new Scanner(System.in);
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String mathGuess = canYouIdentify.nextLine();

                if (mathGuess.equalsIgnoreCase("abs")){
                    System.out.println("Great! Good job and goodbye!");
                } else {
                    System.out.println("Sorry, that is incorrect:( try again later!");
                }

            } else if(yeeOrNaw.equalsIgnoreCase("yes")){

                System.out.println("Great! Have a great day!");

            }

        } else if (method.equalsIgnoreCase("multiply")) {

            String wordChoice = "product";
            double firstAns = firstInput * secondInput;
            double finalAnswer = Math.abs(firstAns);

            Scanner satisfiedOrNaw = new Scanner(System.in);
            System.out.println("The " + wordChoice + "of " + firstInput + "and " + secondInput + "is " + finalAnswer + ". Are you satisfied?");
            String yeeOrNaw = satisfiedOrNaw.nextLine();

            if (yeeOrNaw.equalsIgnoreCase("No")){

                Scanner canYouIdentify = new Scanner(System.in);
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String mathGuess = canYouIdentify.nextLine();

                if (mathGuess.equalsIgnoreCase("abs")){
                    System.out.println("Great! Good job and goodbye!");
                } else {
                    System.out.println("Sorry, that is incorrect:( try again later!");
                }

            } else if(yeeOrNaw.equalsIgnoreCase("yes")){

                System.out.println("Great! Have a great day!");

            }

        } else if (method.equalsIgnoreCase("divide")) {

            String wordChoice = "quotient";
            double firstAns = firstInput / secondInput;
            double finalAnswer = Math.abs(firstAns);

            Scanner satisfiedOrNaw = new Scanner(System.in);
            System.out.println("The " + wordChoice + "of " + firstInput + "and " + secondInput + "is " + finalAnswer + ". Are you satisfied?");
            String yeeOrNaw = satisfiedOrNaw.nextLine();

            if (yeeOrNaw.equalsIgnoreCase("No")){

                Scanner canYouIdentify = new Scanner(System.in);
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String mathGuess = canYouIdentify.nextLine();

                if (mathGuess.equalsIgnoreCase("abs")){
                    System.out.println("Great! Good job and goodbye!");
                } else {
                    System.out.println("Sorry, that is incorrect:( try again later!");
                }

            } else if(yeeOrNaw.equalsIgnoreCase("yes")){

                System.out.println("Great! Have a great day!");

            }

        }

    }
}
