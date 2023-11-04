import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class sort {
    private static final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int string_lentgh = 5;
    private static final int maxNubmer = 100;
    String[] array;
    private static int laufCounter = 1;

    private static boolean loggingEnabled = true;
    private static FileWriter logFile;
    public sort(String[] eArray){
        this.array= eArray;
    }

    public void doExprement() throws IOException {
      String[]  array1 =  generate100Strings();
        long startTime_insert = System.currentTimeMillis();
        loggingEnabled = false;
        for (int i = 0 ; i< array1.length;i++) {
            System.out.println(array1[i]);
        }
       insertSort(array);
        long endTime_insert = System.currentTimeMillis();
        long executionTime_insert = endTime_insert - startTime_insert;
        System.out.println(executionTime_insert +"sekunden");

    }
    public void doExprementwithSelecion() throws IOException {
        String[]  array2 =  generate100Strings();
        array = array2;
        long startTime_insert = System.currentTimeMillis();
        loggingEnabled = false;

        selectionSort();
        long endTime_insert = System.currentTimeMillis();
        long executionTime_insert = endTime_insert - startTime_insert;
        System.out.println(executionTime_insert +"sekunden");

    }

    private static String[] generate100Strings() {
        String[] strings = new String[maxNubmer];
        Random random = new Random();
        for (int i = 0; i < strings.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < string_lentgh; j++) {
                int randomIndex = random.nextInt(characters.length());
                char randomcharakter = characters.charAt(randomIndex);
                stringBuilder.append(randomcharakter);
            }
            strings[i] = stringBuilder.toString();
        }
        return strings;
    }

    public void setLoggingEnabled(boolean enabled) {
        loggingEnabled = enabled;
    }
    public void sortieren(){
        if (array.length <= 10){
            isnsertWithFile(array);
        }
    }
    private void isnsertWithFile(String[] arr) {
        try {
            logFile = new FileWriter("logfile.txt");
            insertSort(arr);
            logFile.close();
            laufCounter = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void selectionWithFile() {
        try {
            logFile = new FileWriter("logfile.txt");
            selectionSort();
            logFile.close();
            laufCounter = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  void selectionSort() throws IOException {
        for (int i = 0 ; i < array.length;i++){
            int min = i;
            for (int j = i+1; j < array.length;j++){
                if ( array[j].compareTo(array[min])< 0){
                    min = j;
                }
            }
            String temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            if (loggingEnabled){
                log(array);
                laufCounter++;
            }
        }
    }


    private static void insertSort(String[] array) throws IOException {
        for(int i = 1 ; i < array.length; i++){
            String currentValue = array[i];
            int j = i -1;
            while (j >= 0 && array[j].compareTo(currentValue) > 0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentValue;
            if (loggingEnabled){
                log(array);
            laufCounter++;
            }
        }
    }
    private static void log(String[] arr) throws IOException {
        logFile.write("Array: " + Arrays.toString(arr) + "\n");
        logFile.write("Lauf "+laufCounter+" : "+ "\n");
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
               logFile.write(arr[i]);
            }
            else {
                logFile.write(arr[i]+", ");
            }
        }
        logFile.write("\n\n");
    }
    public void print(){
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i]+" ");
            }
        }
    }

    @Override
    public String toString() {
        return "Unsorted array : " + Arrays.toString(array);
    }

    public void menu(){
        System.out.println("s = SelectionSort");
        System.out.println("i = InsertSort");
        System.out.println("q = QuickSort");
        System.out.println("p = Print");
        System.out.println("e = experiment with 100 Strings => Insert");
        System.out.println("k = experiment with 100 Strings => Selection");
        System.out.println("b = Quit");
    }
    public void beenden(){
        System.err.println("Programm Finished");
    }
    public void detailsCheak(){
        System.out.println("1 = With details");
        System.out.println("2 = Without details");
    }


}
