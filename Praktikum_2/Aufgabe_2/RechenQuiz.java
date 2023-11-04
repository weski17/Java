public class RechenQuis {
        public static void main (String[] args){
            // Object quiz von RechenQuis Klasse erzeugt und damit getExercise Method aufrufen
            Quiz quiz = new Quiz();
            quiz.getExercise();
            // gerResult Methode aufrufen und in result speichern
            int result = quiz.getResult();
            System.out.println("Result: " + result);
        }
    }

