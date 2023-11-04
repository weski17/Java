import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MaxTeilumme3 {

    private boolean fileRead = false;
    private int[] numbers;
    private int counter;


    public MaxTeilumme3() {
        // nothing here for now
    }

    public void maxTeilsumme3() {
        getFileContent();
        counter = 0;
        long timeTaken = System.currentTimeMillis();

        if (fileRead) {
            int maxsumme = Integer.MIN_VALUE;
            int von = 0;
            int bis = 0;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i; j < numbers.length; j++) {
                    int summe = 0;

                    for (int k = i; k < j; k++) {
                        summe += numbers[k];
                        counter++;
                    }

                    if (summe > maxsumme) {
                        maxsumme = summe;
                        von = i;
                        bis = j;
                    }
                }
            }

            timeTaken = (System.currentTimeMillis() - timeTaken) / 1000;


            System.out.println("max. Teilsumme: " + maxsumme);
            System.out.println("erster Index: " + von);
            System.out.println("letzer Index: " + bis);
            System.out.println("Zeit: " + timeTaken + " seconds");
            System.out.println("Additionen: " + counter);
        }
        else {
            System.out.println("NO FILE GIVEN!");
        }
    }

    public void maxTeilsumme3(int amount) {
        counter = 0;
        long timeTaken = System.currentTimeMillis();
        int[] randomNumbers = getRandomNumbers(amount);

        int maxsumme = Integer.MIN_VALUE;
        int von = 0;
        int bis = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = i; j < randomNumbers.length; j++) {
                int summe = 0;

                for (int k = i; k < j; k++) {
                    summe += randomNumbers[k];
                    counter++;
                }

                if (summe > maxsumme) {
                    maxsumme = summe;
                    von = i;
                    bis = j;
                }
            }
        }

        timeTaken = (System.currentTimeMillis() - timeTaken) / 1000;

        System.out.println("max. Teilsumme: " + maxsumme);
        System.out.println("erster Index: " + von);
        System.out.println("letzer Index: " + bis);
        System.out.println("Zeit: " + timeTaken + " seconds");
        System.out.println("Additionen: " + counter);
    }

    private int[] getRandomNumbers(int amount) {
        int[] temp = new int[amount];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (int)(Math.random() * 1000000);
        }

        return temp;
    }

    private void getFileContent() {
        Scanner sc = new Scanner(System.in);
        String fileContent = "";

        System.out.println("Please enter the fileName containing the integers:");
        String fileName = sc.nextLine();

        try {
            fileContent = Files.readString(Path.of(fileName));
            fileRead = true;
        }
        catch (IOException e) {
            System.out.println("Couldn't read file!");
            e.printStackTrace();
        }

        if (fileRead) {
            numbers = new int[fileContent.split(",").length];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(fileContent.split(",")[i]);
            }
        }
    }
}
