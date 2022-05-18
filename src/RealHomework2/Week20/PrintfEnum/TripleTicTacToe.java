package RealHomework2.Week20.PrintfEnum;

import java.util.Scanner;

public class TripleTicTacToe {
    public static Scanner sc = new Scanner(System.in);

    public static void result(char[][][][] t) {
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%11d", i);
            System.out.printf("%6c", ' ');
        }

        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%3c", ' ');
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%4d", j);
            }
            System.out.printf("%2c", ' ');
        }
        System.out.println();

        for (int bRow=0; bRow<3; bRow++) {
            for (int sRow=0; sRow<3; sRow++) {
                System.out.println("    -------------    -------------    -------------");
                if (sRow == 1)
                    System.out.print(bRow+1);
                else
                    System.out.print(" ");

                System.out.printf(" %d ", sRow+1);
                for (int bCol=0; bCol<3; bCol++) {
                    for (int sCol=0; sCol<3; sCol++)
                        System.out.printf("| %c ", t[bCol][bRow][sCol][sRow]);
                    System.out.print("|    ");
                }

                System.out.println();
            }
            System.out.println("    -------------    -------------    -------------\n");
        }
    }

    public static boolean isTableFull(char[][] table, char emptySym) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == emptySym)
                    return false;
            }
        }
        return true;
    }

    public static int[] inputCoordinates() {
        int x = sc.nextInt();
        while(x < 1 || x > 3) {
            System.out.print("Invalid input for x (1 to 3). Please try again: ");
            x = sc.nextInt();
        }

        int y = sc.nextInt();
        while(y < 1 || y > 3) {
            System.out.print("Invalid input for y (1 to 3). Please try again: ");
            y = sc.nextInt();
        }

        return new int[] {x, y};
    }

    public static void swin(int x, int y, char[] sym, char[][][][] table, char[][] btable) {
        char won = sym[0];
        for (int i=0; i<3; i++) {
            if (won == sym[0]) {
                if (table[x][y][i][0] == table[x][y][i][1] && table[x][y][i][1] == table[x][y][i][2] && table[x][y][i][1] != sym[0])
                    won = table[x][y][i][0];
                else if (table[x][y][0][i] == table[x][y][1][i] && table[x][y][1][i] == table[x][y][2][i] && table[x][y][1][i] != sym[0])
                    won = table[x][y][0][i];
            }
        }
        if (won == sym[0] && table[x][y][1][1] != sym[0] && ((table[x][y][0][0] == table[x][y][1][1] && table[x][y][1][1] == table[x][y][2][2])
                || (table[x][y][2][0] == table[x][y][1][1] && table[x][y][1][1] == table[x][y][0][2])))
            won = table[x][y][1][1];
        if (won != sym[0]) {
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++)
                    table[x][y][i][j] = won;
            }
            btable[x][y] = won;
        }
    }

    public static int bwin(char[] sym, char[][] btable) {
        char won = sym[0];
        for (int i=0; i<3; i++) {
            if (won == sym[0]) {
                if (btable[i][0] == btable[i][1] && btable[i][1] == btable[i][2] && btable[i][1] != sym[0])
                    won = btable[i][0];
                else if (btable[0][i] == btable[1][i] && btable[1][i] == btable[2][i] && btable[1][i] != sym[0])
                    won = btable[0][i];
            }
        }
        if (won == sym[0] && btable[1][1] != sym[0] && ((btable[0][0] == btable[1][1] && btable[1][1] == btable[2][2])
                || (btable[2][0] == btable[1][1] && btable[1][1] == btable[0][2])))
            won = btable[1][1];
        return won;
    }

    public static void main(String[] args) {
        char[][][][] table = new char[3][3][3][3];
        char[] sym = new char[] {' ', 'O', 'X'};
        char[][] btable = new char[3][3];

        int pl = 1, x1 = -1, y1 = -1, x2, y2, winner = 0, turns = 0;
        int[] coord;

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                btable[i][j] = sym[0];
                for (int k=0; k<3; k++) {
                    for (int l=0; l<3; l++)
                        table[i][j][k][l] = sym[0];
                }
            }
        }
        result(table);

        while(winner == 0) {
            System.out.printf("Player %c's turn! \n", sym[pl]);
            if (x1 == -1 || y1 == -1) {
                System.out.print("You can play anywhere! Type x and y from the big table: ");
                coord = inputCoordinates();
                x1 = coord[0];
                y1 = coord[1];

                if (isTableFull(table[x1-1][y1-1], sym[0])) {
                    System.out.printf("Big table %d %d is full. Please try again: ", x1, y1);
                    coord = inputCoordinates();
                    x1 = coord[0];
                    y1 = coord[1];
                }
            }

            System.out.printf("Type x and y from table %d %d: ", x1, y1);
            coord = inputCoordinates();
            x2 = coord[0];
            y2 = coord[1];
            while(table[x1-1][y1-1][x2-1][y2-1] != sym[0]) {
                System.out.print("This place is already taken. Please try again: ");
                coord = inputCoordinates();
                x2 = coord[0];
                y2 = coord[1];
            }

            table[x1-1][y1-1][x2-1][y2-1] = sym[pl];
            swin(x1-1, y1-1, sym, table, btable);
            for (int i=0; i<3;i++) {
                if (bwin(sym, btable) == sym[i])
                    winner = i;
            }

            result(table);

            turns++;
            if (turns == 81)
                break;

            if (pl == 1)
                pl = 2;
            else
                pl = 1;
            x1 = x2;
            y1 = y2;

            if (isTableFull(table[x1-1][y1-1], sym[0])) {
                x1 = -1;
                y1 = -1;
            }
        }

        if (winner != 0)
            System.out.printf("Player %c wins!", sym[winner]);
        else
            System.out.println("Draw!");
    }
}
