import java.util.Random;

public class Randomiser {
    public static void main(String[] args) {
        if(args.length < 4) {
            System.out.println("Provide four integers as arguments.");
            return;
        }
        try {
            int min = Integer.parseInt(args[0]);
            int max = Integer.parseInt(args[1]);
            int rows = Integer.parseInt(args[2]);
            int values = Integer.parseInt(args[3]);

            Random rand = new Random();
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < values; j++) {
                    int randomNum = rand.nextInt((max - min) + 1) + min;
                    System.out.print(randomNum + " ");
                }
                System.out.println();
            }

        }
        catch(NumberFormatException e) {
            System.out.println("Both arguments must be integers.");
        }
    }
}
