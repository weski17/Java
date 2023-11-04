import java.io.IOException;
import java.util.Scanner;

public class Wuppie {
    public static void main(String[] args) throws IOException {

        String[] names = {"WAEL","PHILIP","MINDEN","FLUPPIE","WUPPIE"};
        sort obj = new sort(names);
        Scanner scanner = new Scanner(System.in);
        boolean control = true;

        while (control){
            obj.menu();
            String input = scanner.nextLine();

            switch (input){
                case "s":
                         obj.detailsCheak();
                         int cheak = scanner.nextInt();
                         if (cheak == 1){
                             obj.setLoggingEnabled(true);
                         }
                         else {
                             obj.setLoggingEnabled(false);
                         }
                         long startTime_selectionSort = System.currentTimeMillis();
                         obj.selectionWithFile();
                         System.out.println(obj);
                         obj.print();
                         long endTime_Selection = System.currentTimeMillis();
                         long executionTime_Selection = endTime_Selection - startTime_selectionSort;
                         System.out.println("\n Die Ausführungszeit von Selection betrug : " + executionTime_Selection + " Millisekunden"+"\n");

                         break;
               /***  case "q":
                        int cheak = scanner.nextInt();
                        if (cheak == 1){
                        obj.setLoggingEnabled(true);
                        }
                        else {
                          obj.setLoggingEnabled(false);
                        }
                         ""QuickSort""     <----------------
                    break;
                **/
                case "i" :
                          if (names.length <=10) {
                              obj.detailsCheak();
                              int number = scanner.nextInt();
                              if (number == 1) {
                                  obj.setLoggingEnabled(true);
                              } else {
                                  obj.setLoggingEnabled(false);
                              }
                              long startTime_insert = System.currentTimeMillis();
                              obj.sortieren();
                              System.out.println(obj.toString());
                              obj.print();
                              long endTime_insert = System.currentTimeMillis();
                              long executionTime_insert = endTime_insert - startTime_insert;
                              System.out.println("\n Die Ausführungszeit von InsertSort betrug : " + executionTime_insert + " Millisekunden\n");
                          }
                          else {
                              System.out.println("Array is bigger than 10");
                          }
                        break;
                case "b":
                         control = false;
                         break;

                case "e":
                         obj.doExprement();
                         break;

                case "k":
                         obj.doExprementwithSelecion();
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
