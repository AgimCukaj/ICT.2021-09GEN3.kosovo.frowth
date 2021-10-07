package ict.kosovo.growth.basic;
import java.util.Scanner;
public class UshtrimeBazike {
    public static void main(String[] args) {
        //ushtrime me operatore
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Shtyp numrin e pare per te fituar rezultatin te plotepjestueshem me 10: ");
//        int a = sc.nextInt();
//        System.out.println("Shtyp numrin e dyte per te fituar rezultatin te plotepjestueshem me 10: ");
//        double b = sc.nextDouble();
//
//        System.out.println("Mbetja e pjestimit 47 me 10 eshte: " + (a % 10));
//        System.out.println("Mbetja e pjestimit 47.48 me 10 eshte: " + (b % 10));

        //Ligji i dyte i Njutonit
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ligji i dyte i Njutonit");
//
//        System.out.println("Shkruani masen e trupit");
//        double masa = sc.nextDouble();
//
//        System.out.println("Shkruani nxitimin e trupit");
//        double nxitimi = sc.nextDouble();
//
//        double forca = masa * nxitimi;
//        System.out.println("Forca eshte: " + forca);

        //rezultati perfudimtare

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ekipi vendas ");
//        String ekipiVendas = sc.nextLine();
//        System.out.println("Ekipi mysafir ");
//        String ekipiMysafir = sc.nextLine();
//        System.out.println("Nr i tifozeve ");
//        int nrTifozeve = sc.nextInt();
//        System.out.println("Fusha ");
//        sc.nextLine();
//        String fusha = sc.nextLine();
//        System.out.print("Sa gola ka shenuar " + ekipiVendas + ":");
//        int golaVendas = sc.nextInt();
//        System.out.print("Sa gola ka shenuar " + ekipiMysafir);
//        int golaMysafir = sc.nextInt();
//
//        System.out.println("--------------------------------------------");
//        System.out.println("Rezultati perfundimtar");
//        System.out.printf("%s - %s : %d - %d %n", ekipiVendas, ekipiMysafir, golaVendas,golaMysafir);
//        System.out.printf("Stadiumi %s gjithsej me %d tifoze prezent. %n", fusha, nrTifozeve);
//        System.out.println("--------------------------------------------");

        //Te zgjidhet username
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zgjidhni username: ");
//        String username = sc.nextLine();
//
//        System.out.println("username i juaji eshte: " + username);

        //Convert string to other datatype

//        String number = "25";
//        byte b = Byte.parseByte(number);
//        int i = Integer.parseInt(number);
//        long l = Long.parseLong(number);
//        double d = Double.parseDouble(number);
//        float f = Float.parseFloat(number);
//
//        System.out.println(b);

        //Math test

//        int x = 2, y = 10;
//        System.out.println(Math.pow(x,y));
//        System.out.println(Math.sqrt(y));
//        System.out.println(Math.max(3,10));
//        System.out.println(Math.abs(-10.50));
//        System.out.println(Math.floor(7.55));
//        System.out.println(Math.ceil(7.55));
//        System.out.println(Math.PI);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Shkruaj nje numer dhe pastaj une ja qelloj se cfare eshte: ");
//
//        int numri = sc.nextInt();
//
//        if (numri > 0){
//            System.out.println("Numbri eshte pozitiv");
//        }else if (numri < 0){
//            System.out.println("Numbri eshte negativ");
//        }else
//            System.out.println("Numbri eshte 0");
//
//        System.out.println("-------------------------------------------------------");


        //random int


//        int nr = 100;
//
//        double rnd = Math.random();
//        int numri = (int)(nr * rnd);
//        System.out.println(numri);

        //Testimi i konvertimeve

//        byte b;
//        int i = 174;
//        double d = 105.142;
//
//        System.out.println("Konvertimi nga int ne byte");
//        b = (byte) i;
//        System.out.println("b: " + b);
//        System.out.println("i: " + i);
//        System.out.println("Konvertimi nga double ne int");
//        i = (int) d;
//        System.out.println("i: " + i);
//        System.out.println("d: " + d);
//        System.out.println("Konvertimi nga byte ne double");
//        d = (double) b;
//        System.out.println("b: " + b);
//        System.out.println("d: " + d);


        //Alfabeti me while
//        char shkronja = 'A';
//        while (shkronja <= 'Z'){
//            System.out.println(shkronja ++);
//        }
//        char shkronjaPare = 'A';
//        char shkronjaDyte = 'a';
//        if (shkronjaPare < shkronjaDyte){
//            System.out.println("po");
//        }else
//            System.out.println("jo");

//        Scanner sc = new Scanner(System.in);
//
//        int numriPozitiv;
//        do {
//            System.out.println("Shkruaj nje numer pozitiv per me dal prej konsolle");
//            numriPozitiv = sc.nextInt();
//            if (numriPozitiv <= 0)
//                System.out.println("Duhet te perserisesh prap");
//        }while (numriPozitiv <=0);

        //Ternary operator
//        int numri = 10;
//        System.out.println(
//                numri > 0 ? "pozitiv" : "negativ"
//        );
//        int vleraAbsoluteENumrit = numri < 0 ? -numri : numri;
//        System.out.println("Vlera absolute e numrit eshte: " +vleraAbsoluteENumrit);

        //Ushtrime me string

        String teksti = "ICT for Kosovos growth";

        System.out.println(teksti.toLowerCase());
        System.out.println(teksti.toUpperCase());
        System.out.println(teksti.replace("Kosovos", "Albania"));
        System.out.println(teksti.repeat(5));
        System.out.println(teksti.trim());


















    }
}










