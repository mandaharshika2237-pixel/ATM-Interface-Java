import java.util.*;

public class QuizApplication {

    static Scanner sc = new Scanner(System.in);
    static int score = 0;
    static int correct = 0;
    static int wrong = 0;

    static String[] questions = {
        "Which language is used for Android Development?",
        "Which keyword is used to inherit a class in Java?",
        "Which method is the starting point of a Java program?",
        "Which company developed Java?",
        "Which collection does not allow duplicate values?"
    };

    static String[][] options = {
        {"A. Java", "B. Python", "C. C", "D. HTML"},
        {"A. implements", "B. extends", "C. inherit", "D. super"},
        {"A. start()", "B. main()", "C. run()", "D. init()"},
        {"A. Microsoft", "B. Google", "C. Sun Microsystems", "D. Apple"},
        {"A. List", "B. ArrayList", "C. Set", "D. Vector"}
    };

    static char[] answers = {'A', 'B', 'B', 'C', 'C'};

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("=================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("You have 10 seconds to answer!");

            String userAnswer = getAnswerWithTimer();

            if (userAnswer != null &&
                userAnswer.equalsIgnoreCase(String.valueOf(answers[i]))) {

                System.out.println("Correct Answer!");
                score++;
                correct++;

            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Option: " + answers[i]);
                wrong++;
            }
        }

        displayResult();
    }


    static String getAnswerWithTimer() {

        long startTime = System.currentTimeMillis();

        System.out.print("Enter your answer: ");

        String answer = sc.nextLine();

        long endTime = System.currentTimeMillis();

        long timeTaken = (endTime - startTime) / 1000;

        if (timeTaken > 10) {
            System.out.println("\nTime Over!");
            return null;
        }

        return answer;
    }


    static void displayResult() {

        System.out.println("\n=================================");
        System.out.println("          QUIZ COMPLETED");
        System.out.println("=================================");

        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + correct);
        System.out.println("Wrong Answers   : " + wrong);
        System.out.println("Final Score     : " + score + "/" + questions.length);

        System.out.println("=================================");
    }
}
