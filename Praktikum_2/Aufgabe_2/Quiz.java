
public class Quiz {
    //Operanden und Operator erstellt und als ganzzahlige Zahlen definiert
    private int operand1;
    private int operand2;
    private int operator;

    private int plusresult;
    private int minusresult;
    private int malresult;

    // getExercise Methode erstellt
    public void getExercise() {
        boolean control = true;
        // While-Schleife damit die Aufgaben mehrmals erzeugt werden
        while (control) {
            operand1 = (int) (Math.random() * 21); // Randomnzahl 0 zwischen 20
            operand2 = (int) (Math.random() * 21);
            operator = (int) (Math.random() * 4);  // Randomnzahl 0 bis 3 und als Operator definiert

            plusresult = operand1 + operand2; //Additionsergebnis zwischen den Operanden
            minusresult = operand1 - operand2;//Subtraktionsergebnis zwischen den Operanden
            malresult = operand1 * operand2;//Multiplikationsergebnis zwischen den Operanden

            // Fallunterscheidung

            // Operator Zahl ist 0 und das Ergebnis gr oesser gleich 0
            if (operator == 0 && 0 <= plusresult) {
                System.out.println(operand1 + " + " + operand2 + " = ?");
                control = false; // Stoppt
            }
            // Operator Zahl ist 1 und das Ergebnis groesser gleich 0
            else if (operator == 1 && 0 <= minusresult) {
                System.out.println(operand1 + " - " + operand2 + " = ?");
                control = false;
            }
            // Operator Zahl ist 2 und das Ergebnis groesser gleich 0
            else if (operator == 2 && 0 <= malresult) {
                System.out.println(operand1 + " * " + operand2 + " = ?");
                control = false;
            }
        }
    }

    // Eine int Methode getResult
    public int getResult() {
        // Fallunterscheidung zwischen den Operatoren
        if (operator == 0) {
            return plusresult; // wenn es sich um Addition handelt, Ergebnis aufrufen
        } else if (operator == 1) {
            //wenn es sich um Subtraktion handelt, Ergebnis aufrufen
            return minusresult;
        } else {
            //wenn es sich um Multiplikation handelt, Ergebnis aufrufen
            return malresult;
        }

    }
    //main Methode
    }
