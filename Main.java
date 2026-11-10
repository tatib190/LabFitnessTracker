//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

// Parent Class
class Workout {
    String type;
    int duration;

     void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Child Class
class RunningWorkout extends Workout {
    double distance;

    public void showDetails() {
        // Call parent class method
        showWorkout();

        System.out.println("Distance: " + distance + " km");

        // Calculate calories burned
        double calories = distance * 60;

        System.out.println("Calories burned: " + calories);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter workout type: ");
        String workoutType = input.nextLine();

        System.out.print("Enter duration (minutes): ");
        int workoutDuration = input.nextInt();

        System.out.print("Enter distance (km): ");
        double workoutDistance = input.nextDouble();

        // Create Running Workout object
        RunningWorkout workout = new RunningWorkout();

        // Assign values
        workout.type = workoutType;
        workout.duration = workoutDuration;
        workout.distance = workoutDistance;

        // Display workout details
        System.out.println("--- Workout Summary ---");
        workout.showDetails();

        input.close();
    }
}