public class Console {
    //bord tekenen in terminal
//input spelers
// kan later gui worden
    public static void main(String[] args) {
        char [][] bord = new char[3][3];
        for (int i = 0; i < bord.length; i += 1) {
            for (int j = 0; j < bord[i].length; j += 1) {
                bord[i][j] = '_';
            }
        }
        bord[1][1] = 'X';
        bord[0][0] = 'O';
        printBord(bord);
    }
    public static void printBord(char[][] bord) {
        for (int i = 0; i < bord.length; i += 1) {
            for (int j = 0; j < bord[i].length; j += 1) {
                System.out.print(bord[i][j] + "");
            }
            System.out.println();
        }
    }
}


