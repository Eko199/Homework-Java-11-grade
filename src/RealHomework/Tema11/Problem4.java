package RealHomework.Tema11;

public class Problem4 {
    static boolean isSudokuSolution(int[][] table) {
        if (table.length != 9) return false;
        for (int i = 0; i < 9; i++){
            if (table[i].length != 9) return false;
            for (int j = 0; j < 9; j++) {
                if (table[i][j] < 1 || table[i][j] > 9) return false;
                for (int k = j+1; k < 9; k++) {
                    if (table[i][j] == table[i][k]) return false;
                }
                for (int k = i+1; k < 9; k++) {
                    if (table[i][j] == table[k][j]) return false;
                }
                if (i%3 == 0) {
                    if (j%3 == 0 && (table[i][j] == table[i+1][j+1] || table[i][j] == table[i+1][j+2] || table[i][j] == table[i+2][j+1] || table[i][j] == table[i+2][j+2]))
                        return false;
                    else if (j%3 == 1 && (table[i][j] == table[i+1][j+1] || table[i][j] == table[i+2][j+1] || table[i][j] == table[i+1][j-1] || table[i][j] == table[i+2][j-1]))
                        return false;
                    else if (j%3 == 2 && (table[i][j] == table[i+1][j-1] || table[i][j] == table[i+1][j-2] || table[i][j] == table[i+2][j-1] || table[i][j] == table[i+2][j-2]))
                        return false;
                } else if (i%3 == 1) {
                    if (j%3 == 0 && (table[i][j] == table[i+1][j+1] || table[i][j] == table[i+1][j+2]))
                        return false;
                    else if (j%3 == 1 && (table[i][j] == table[i+1][j+1] || table[i][j] == table[i+1][j-1]))
                        return false;
                    else if (j%3 == 2 && (table[i][j] == table[i+1][j-1] || table[i][j] == table[i+1][j-2]))
                        return false;
                }
            }
        }
        return true;
    }

    static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[][] table1 = {{8,3,5,4,1,6,9,2,7},
                {2,9,6,8,5,7,4,3,1},
                {4,1,7,2,9,3,6,5,8},
                {5,6,9,1,3,4,2,8,2},
                {1,2,3,6,7,8,5,4,9},
                {7,4,8,4,2,9,1,6,3},
                {6,5,2,7,8,1,3,9,4},
                {9,8,1,3,4,5,2,7,6},
                {3,7,4,9,6,2,8,1,5}};
        printTable(table1); //incorrect
        if (isSudokuSolution(table1))
            System.out.println("This table is a valid Sudoku solution. \n");
        else
            System.out.println("This table isn't a valid Sudoku solution. \n");
        int[][] table2 = {{8,3,5,4,1,6,9,2,7},
                {2,9,6,8,5,7,4,3,1},
                {4,1,7,2,9,3,6,5,8},
                {5,6,9,1,3,4,7,8,2,1},
                {1,2,3,6,7,8,5,4,9},
                {7,4,8,5,2,9,1,6,3},
                {6,5,2,7,8,1,3,9,4},
                {9,8,1,3,4,5,2,7,6},
                {3,7,4,9,6,2,8,1,5}};
        printTable(table2); //too large
        if (isSudokuSolution(table2))
            System.out.println("This table is a valid Sudoku solution. \n");
        else
            System.out.println("This table isn't a valid Sudoku solution. \n");
        int[][] table3 = {{8,3,5,4,1,6,9,2,7},
                {2,9,6,8,5,7,4,3,1},
                {4,1,7,2,9,3,6,5,8},
                {5,6,9,1,3,4,7,8,2},
                {1,2,3,6,7,8,5,4,9},
                {7,4,8,5,2,9,1,6,3},
                {6,5,2,7,8,1,3,9,4},
                {9,8,1,3,4,5,2,7,6},
                {3,7,4,9,6,2,8,1,5}};
        printTable(table3); //correct
        if (isSudokuSolution(table3))
            System.out.println("This table is a valid Sudoku solution. \n");
        else
            System.out.println("This table isn't a valid Sudoku solution. \n");
    }
}
