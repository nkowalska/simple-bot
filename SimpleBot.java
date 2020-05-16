import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");

        System.out.println("To write a character we use:");
        System.out.println("1. single quotes");
        System.out.println("2. brackets");
        System.out.println("3. double quotes");
        System.out.println("4. double brackets");
        int answer1 = scanner.nextInt();
        if (answer1 != 1) {
            while (answer1 != 1) {
                System.out.println("Please, try again.");
                answer1 = scanner.nextInt();
                if (answer1 == 1){
                    System.out.println("Great job! Time for the next question.");
                }else{
                    continue;
                }
            }
        }else{
            System.out.println("Great job! Time for the next question.");
        }

        System.out.println("Variable names:");
        System.out.println("1. can’t incude ‘$’");
        System.out.println("2. can start with a digit");
        System.out.println("3. can’t include letters");
        System.out.println("4. are case-sensitive");
        int answer2 = scanner.nextInt();

        if (answer2 != 4) {
            while (answer2 != 4) {
                System.out.println("Please, try again.");
                answer2 = scanner.nextInt();
                if (answer2 == 4){
                    System.out.println("Great job! Time for the next question.");
                }else{
                    continue;
                }
            }
        }else{
            System.out.println("Great job! Time for the next question.");
        }

        System.out.println("Choose example of a lower camel case, a naming convention used in Java:");
        System.out.println("1. CamelCase");
        System.out.println("2. camelCase");
        System.out.println("3. cAmElCaSe");
        System.out.println("4. camel_case");
        int answer3 = scanner.nextInt();
        if (answer3 != 2) {
            while (answer3 != 2) {
                System.out.println("Please, try again.");
                answer3 = scanner.nextInt();
                if (answer3 == 2){
                    System.out.println("Great job! Time for the next question.");
                }else{
                    continue;
                }
            }
        }else{
            System.out.println("Great job! Time for the next question.");
        }

        System.out.println("Choose true:");
        System.out.println("1. ++n decreases the value of a variable before it is used");
        System.out.println("2. ++n increases the value of a variable after it is used");
        System.out.println("3. ++n increases the value of a variable before it is used");
        System.out.println("4. ++n decreases the value of a variable after it is used ");
        int answer4 = scanner.nextInt();
        if (answer4 != 3) {
            while (answer4 != 3) {
                System.out.println("Please, try again.");
                answer4 = scanner.nextInt();
                if (answer4 == 3){
                    System.out.println("Great job! Time for the next question.");
                }else{
                    continue;
                }
            }
        }else{
            System.out.println("Great job! Time for the next question.");
        }

        System.out.println("What does the Strings method trim() do?");
        System.out.println("1. returns a character by its index");
        System.out.println("2. returns a new string obtained by replacing all occurrences of old with new that can be chars or strings");
        System.out.println("3. returns a copy of the string obtained by omitting the leading and trailing whitespace");
        System.out.println("4. returns true if the string contains the given string or character");
        int answer5 = scanner.nextInt();
        if (answer5 != 3) {
            while (answer5 != 3) {
                System.out.println("Please, try again.");
                answer5 = scanner.nextInt();
                if (answer5 == 3){
                    System.out.println("Great job! Time for the next question.");
                }else{
                    continue;
                }
            }
        }else{
            System.out.println("Great job! This is the end of the test.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
