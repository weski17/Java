import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Aufgabe_4_java {
    public static void main(String[] args) {

        int [] a = dateiAuslesen();
        int links = 0;
        int rechts = a.length-1;
        int summe;
        long startTime =  System.currentTimeMillis();
        summe = maxTeilsummerek(a, links,rechts);
        long endTime =  System.currentTimeMillis();
        double laufzeit = endTime - startTime;

        System.out.println("maxTeilsummerek ist: "+summe+".");
        System.out.println("Die Bearbeitungszeit dauert "+String.format("%.6f",laufzeit)+" msec.");


    }



    public static int maxTeilsummerek(int[] arr, int links, int rechts){
        if (arr.length <1 ){
            System.err.println("Ungueltige Eingabe");
            System.exit(0);
        }


        if(links == rechts){
            return arr[rechts];
        }
        int m = (links+rechts)/2;
        int maxrl = rechtesRandmax(arr,links,m);
        int maxlr = linkesRandmax(arr, m+1,rechts);

        return Math.max(Math.max(maxTeilsummerek(arr, links,m),maxTeilsummerek(arr, m+1,rechts)),(maxlr+maxrl));
    }

    public static int rechtesRandmax (int[]a,int li,int re){
        int zwischensumme = 0;
        int max = 0;

        for (int i = re; i > li-1; i--) {
            zwischensumme += a[i];
            max = Math.max(max, zwischensumme);

        }
        return max;
    }

    public static int linkesRandmax (int[]a,int li,int re){
        int zwischensumme = 0;
        int max = 0;

        for (int i = li; i <re+1; i++) {
            zwischensumme += a[i];
            max = Math.max(max, zwischensumme);

        }
        return max;
    }
    public static int[] dateiAuslesen(){
        ArrayList<Integer> a = new ArrayList<>();
        int [] array = new int[0];
        String zeile;
        Scanner sc1 = new Scanner(System.in);
        BufferedReader datei;
        System.out.println("Bitte gib den Datei Namen an!");

        String dateiName = sc1.next()+".txt";

        try {

            datei = new BufferedReader(new FileReader(dateiName));

            while ((zeile = datei.readLine()) != null) {
                a.add(Integer.valueOf(zeile));
            }

            array = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                array[i] = a.get(i);

            }
            datei.close();

        } catch (IOException e) {
            System.out.println("Datei kann nicht geladen werden");
            System.exit(0);
        }
        return array;
    }



}