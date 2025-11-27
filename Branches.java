import java.util.Scanner;

public class Branches{
    
    public static void main(String args[])
    {
        Scanner meinScanner = new Scanner(System.in);
        int Alter = meinScanner.nextInt();
        int bier = 0;
        if(Alter >= 16){
            bier++;
        System.out.println("Bier ausschenken");;
        }
        else{
            System.out.println("Kein Alkohol unter 16");
        }
        System.out.println("Es wurden :"+ bier + " Bier ausgeschenkt.");
    }
}
