import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[][] arr2D = {
            {0, 0, 10, 0, -1},
            {0, -1, 0, 0, -1},
            {-1, 0, -1, 0, 0},
            {0, -1, 7, 0, -1},
            {0, -1, 0, -1, 0}
        };

        Scanner sc = new Scanner(System.in);

        int row = arr2D.length;
        int column = arr2D[0].length;

        int playerRow = 3, playerCol = 2;

        System.out.println("Initial Map");
        printArray(arr2D);

        for (int i = 0; i < 6; i++) {
            String input = sc.nextLine();

            int prevRow = playerRow;
            int prevCol = playerCol;

            if (input.equals("RIGHT")) {
                playerCol++;
            } else if (input.equals("LEFT")) {
                playerCol--;
            } else if (input.equals("UP")) {
                playerRow--;
            } else if (input.equals("DOWN")) {
                playerRow++;
            } else {
                System.out.println("Invalid move");
                continue;
            }

            if (playerRow < 0 || playerRow >= row || playerCol < 0 || playerCol >= column) {
                System.out.println("Player fell outside the playing area. Game over!");
                return;
            }

            if (arr2D[playerRow][playerCol] == -1) {
                System.out.println("Player stepped on a mine. Game Over!");
                return;
            }

            if (arr2D[playerRow][playerCol] == 10) {
                System.out.println("Treasure found. You win!");
                return;
            }

            arr2D[prevRow][prevCol] = 0;

            arr2D[playerRow][playerCol] = 7;

            System.out.println("Current state:");
            printArray(arr2D);
        }

        System.out.println("Out of moves. You lose!");
        sc.close();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
      
        
    
    
    
    
      
      
