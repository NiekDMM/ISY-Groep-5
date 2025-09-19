import java.util.Scanner;
public class Console {
    //bord tekenen in terminal
//input spelers
// kan later gui worden
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //voor input in terminal
        char [][] bord = new char[3][3]; // maakt het bord 3 bij3

        // vult brod
        for (int i = 0; i < bord.length; i += 1) {
            for (int j = 0; j < bord[i].length; j += 1) {
                bord[i][j] = '_';
            }
        }
       //setten 9 in termilan want dan is bord vol
        for(int keer = 0; keer < 9; keer +=1) {
            System.out.println("spelen\t"+((keer % 2 == 0) ? 'x': '0'));
            // % is om te weten welke speler speelt ? geeft true en fale mee dus even true is x oneven fale is o
            // \t is voor spatie tussen speler en x/o

            int rij = in.nextInt();
            int kolom = in.nextInt();

            // chek of daar als staat in bord
            if (bord[rij][kolom] == '_'){
                bord[rij][kolom] = (keer % 2 ==0) ? 'x' : '0';
            } else {
                System.out.println("dat kan niet die plek is vol");
                keer -=1;
                continue;
            }
            printBord(bord);
        }
    }
    // print het bord na elke set in termiale
    public static void printBord(char[][] bord) {
        for (int i = 0; i < bord.length; i += 1) {
            for (int j = 0; j < bord[i].length; j += 1) {
                System.out.print(bord[i][j] + "");
            }
            System.out.println();
        }
    }
}


