import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta palun täisarv ühest kümneni ja saad sobiva komplimendi!");
        double number = input.nextDouble();
        if(10 == number){
            System.out.println("Valisid suurima võimaliku numbri jah? Oled maksimalist!");
        } else if (9 == number){
            System.out.println("Sa vajutad mu nuppe väga enesekindlalt ja julgustavalt!");
        } else if (8 == number){
            System.out.println("Number kaheksa on külili olles lõpmatus. Oled lõpmata vinge olend!");
        } else if (7 == number){
            System.out.println("Oled naljakas!");
        } else if (6 == number){
            System.out.println("Oled seltsiv!");
        } else if (5 == number){
            System.out.println("Sinusugune inimene pole kunagi viies ratas vankri all, oled alati teemas!");
        } else if (4 == number){
            System.out.println("Oled erline!");
        } else if (3 == number){
            System.out.println("Oled lahe!");
        } else if (2 == number){
            System.out.println("Ei usu, et number kahte koolis väga nägid. Oled väga tark ja nutikas, vähemalt inimese kohta!");
        } else if (1 == number){
            System.out.println("Nagu Su sisetatud numbergi, oled ka Sina number 1, vähemalt mulle!");
        } else {
            System.out.println("Sa ei allu reeglitele, see on rebel, aga palun sisesta siiski täisarv ühest kümneni!");
        }
    }
}
