import java.util.Scanner;

public class Train {

    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(String inputDestinationName, int inputTrainNumber, String inputDepartureTime) {
        destinationName = inputDestinationName;
        trainNumber = inputTrainNumber;
        departureTime = inputDepartureTime;
    }
    public boolean isTrainNumb(int inputTrainNumber) {
        return inputTrainNumber == trainNumber;

    }
    public static void selectTrainNumber(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train number: ");
        int inputNumber = scanner.nextInt();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].isTrainNumb(inputNumber)) {
                trains[i].printTrain();
            }
        }
    }

    public static void sortTrainNumber(Train[] trains) {
        int count = 0;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 1 + count; j < trains.length; j++)
            if (trains[i].trainNumber > trains[j].trainNumber) {
                Train swap = trains[i];
                trains[i] = trains[j];
                trains[j] = swap;
            }
            count++;
            trains[i].printTrain();
        }
    }

    public void printTrain() {
        System.out.println("Train number = " + trainNumber + " Destination name: " + destinationName +
                ". Departure Time: " + departureTime);
    }
}