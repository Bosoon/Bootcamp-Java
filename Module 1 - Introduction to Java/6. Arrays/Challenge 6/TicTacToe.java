import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            int[] temp = new int[2];
            System.out.println("\nLet's play tic tac toe");

            char[][] board = new char[3][3];
            for(int i = 0 ; i < board.length ; i++){
              for (int j = 0 ; j < board[i].length ; j++){
                board[i][j] = '_';
              }
            }

            printBoard(board);
            
            for(int i = 0 ; i < 9 ; i++){
              if ( (i % 2) == 0 ){
                System.out.println("Turn: X");
                temp = askUser(board);
                board[temp[0]][temp[1]] = 'X';
                printBoard(board);
              } else {
                System.out.println("Turn: O");
                temp = askUser(board);
                board[temp[0]][temp[1]] = 'O';
                printBoard(board);
              }
              if (checkWin(board) == 3){
                System.out.println("X turn win!");
                break;
              } else if (checkWin(board) == -3){
                System.out.println("O turn win");
                break;
              }
            }

            scan.close();
        }
      
        public static void printBoard(char[][] board){
          System.out.println();
          for (int i = 0 ; i < board.length ; i++){
            System.out.print("\t");
            for (int j = 0 ; j < board.length ; j++){
              System.out.print(board[i][j] + " ");
            }
            System.out.println("\n\n");
          }
        }

        public static int[] askUser(char[][] board){
          while(true){
            System.out.print("\tpick a row and column number: ");
            int row = scan.nextInt();
            int column = scan.nextInt();
            if (board[row][column] =='_'){
              return new int[]{row, column};
            }
          }
        }
    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
        public static int checkWin(char[][] board){

          int count = 0;
          for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[i].length; j++){
              if (board[i][j] == 'X'){
                count++;
              }else if (board[i][j] == 'O'){
                count--;
              }              
            }
            if (count == 3 || count == -3) {
              return count;
            }
            count = 0;
          }

          count = 0;
          for(int i = 0; i < board.length ; i++){
            for(int j = 0; j < board[i].length; j++){
              if (board[j][i] == 'X'){
                count++;
              } else if(board[j][i] == 'O'){
                count--;
              }
            }
            if (count == 3 || count == -3){
              return count;
            }
            count = 0;
          }

          count = 0;
          for(int i = 0 ; i < board.length ; i ++){
              if (board[i][i] == 'X'){
                count++;
              } else if (board[i][i] == 'O') {
                count--;
              }
          }
          if (count == 3 || count == -3){
            return count;
          }
          count = 0;
          
          for(int i = 0 ; i < board.length ; i++){
            if (board[i][2-i] == 'X'){
              count++;
            } else if (board[i][2-i] == 'O') {
              count--;
            }
          }

          return count;
        }

}
