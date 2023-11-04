public class MatheAnwendung {
    public static void main(String[] args) {
        Arithmetik arthmetik = new Arithmetik();

        System.out.println("Addition ");

        arthmetik.bestimmeRechenweg(new RechenwegPlus());
        System.out.println(arthmetik.berechne(5.1,3.1) + "\n");

        System.out.println("Subtraktion ");

        arthmetik.bestimmeRechenweg(new RechenwegMinus());
        System.out.println(arthmetik.berechne(5,3)+"\n");

        System.out.println("Multiplikation ");

        arthmetik.bestimmeRechenweg(new RechenwegMal());
        System.out.println(arthmetik.berechne(5,3)+"\n");

        System.out.println("_______Generic-----");

        System.out.println("Addition");
        ArithmetikGenerisch <RechenwegPlus> gen = new ArithmetikGenerisch<RechenwegPlus>(new RechenwegPlus());
        System.out.println(gen.berechne(2.1,2.2) + "\n");

        System.out.println("Subtraktion ");
        ArithmetikGenerisch<RechenwegMinus> gen1 = new ArithmetikGenerisch<>(new RechenwegMinus());
        System.out.println(gen1.berechne(2.2,1)+ "\n");

        System.out.println("Multiplikation ");
        ArithmetikGenerisch<RechenwegMal> gen2 = new ArithmetikGenerisch<RechenwegMal>(new RechenwegMal());
        System.out.println(gen2.berechne(2.2,3));
    }
}
