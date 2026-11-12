import java.util.Scanner;

class Workout {
    String type;
    int duration;

    public void showWorkout () {
        System.out.println("Workout: " + type);
        System.out.println("Duration: "+ duration);
    }
}
class RunningWorkout extends Workout {
    double distance;

    public void showDetails() {
        showWorkout();

        System.out.println("Distance: "+ distance);

        double calories = distance * 60;
        System.out.println("Calories Burned: "+calories);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Workout Type: ");
        String type = input.nextLine();
        System.out.println("Enter Duration (minutes); ");
        int duration  = input.nextInt();
        System.out.println("Enter Distance (mlies): ");
        double distance = input.nextDouble();

        RunningWorkout workout = new RunningWorkout();

        workout.type = type;
        workout.duration = duration;
        workout.distance = distance;

        System.out.println("Workout Summary");

        workout.showDetails();
        input.close();


    }
}