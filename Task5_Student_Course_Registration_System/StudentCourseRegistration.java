import java.util.ArrayList;
import java.util.Scanner;

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> availableCourses = new ArrayList<>();
        ArrayList<String> registeredCourses = new ArrayList<>();

        availableCourses.add("Java Programming");
        availableCourses.add("Python Programming");
        availableCourses.add("Data Structures");
        availableCourses.add("Database Management");
        availableCourses.add("Web Development");

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println(" STUDENT COURSE REGISTRATION SYSTEM");
            System.out.println("========================================");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Courses:");
                    for (int i = 0; i < availableCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + availableCourses.get(i));
                    }
                    break;

                case 2:
                    System.out.println("\nAvailable Courses:");
                    for (int i = 0; i < availableCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + availableCourses.get(i));
                    }

                    System.out.print("Enter course number to register: ");
                    int register = sc.nextInt();

                    if (register >= 1 && register <= availableCourses.size()) {

                        String course = availableCourses.get(register - 1);

                        if (!registeredCourses.contains(course)) {
                            registeredCourses.add(course);
                            System.out.println("Course Registered Successfully!");
                        } else {
                            System.out.println("You have already registered for this course.");
                        }

                    } else {
                        System.out.println("Invalid Course Number.");
                    }

                    break;

                case 3:

                    if (registeredCourses.isEmpty()) {
                        System.out.println("No registered courses to drop.");
                        break;
                    }

                    System.out.println("\nRegistered Courses:");

                    for (int i = 0; i < registeredCourses.size(); i++) {
                        System.out.println((i + 1) + ". " + registeredCourses.get(i));
                    }

                    System.out.print("Enter course number to drop: ");
                    int drop = sc.nextInt();

                    if (drop >= 1 && drop <= registeredCourses.size()) {

                        registeredCourses.remove(drop - 1);
                        System.out.println("Course Dropped Successfully!");

                    } else {
                        System.out.println("Invalid Course Number.");
                    }

                    break;

                case 4:

                    if (registeredCourses.isEmpty()) {
                        System.out.println("No Courses Registered.");
                    } else {

                        System.out.println("\nRegistered Courses:");

                        for (String course : registeredCourses) {
                            System.out.println("- " + course);
                        }
                    }

                    break;

                case 5:
                    System.out.println("\nThank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
