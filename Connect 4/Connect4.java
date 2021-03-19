import java.util.*;
public class Connect4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setBoard();
        
        
        
        for (int i = 0; i < 42; i++) {
            System.out.println("");
            pboard();
            System.out.println("");
            int input;
            
            if (color % 2 == 0) {
                System.out.println("Drop red disk in col (0-6): ");
            }
            else {
                System.out.println("Drop yellow disk in col (0-6): ");
            }
          
               while (sc.hasNextInt() == false) {
                
                System.out.println("Invalid input, enter again: ");
                sc.next();
                
            }   
          
          input = sc.nextInt();
            
            while (input < 0 || input > 6 || board[0][input] != ' ') {
                System.out.println("invalid input, enter again: ");
                input = sc.nextInt();
                
            }

            turn(input);
            color++;
            
            if (checkwin_R() == true) {
                System.out.println("Red wins the game!");
                System.out.println("");
                pboard();
                break;
            }
            else if (checkwin_Y() == true) {
                System.out.println("Yellow wins the game!");
                System.out.println("");
                pboard();
                break;
            }
            
            
        }//for loop
        
        if (checkwin_R() == false && checkwin_Y() == false) {
            System.out.println("Game is a draw!");
        }
        
        
        
    }//main
    
    public static int color = 2;
   
    public static char[][] board = new char[6][7];
    
    public static void pboard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("{ " + board[i][j] + " }");
            }
            System.out.println("\n");
        }
    }
    
    public static void turn(int j) {
        int i = 5;
        
        
        while (board[i][j] != ' ') {
            i--;
        }
        
        if (color % 2 == 0) {
        board[i][j] = 'R';
        }
        else {
            board[i][j] = 'Y';
        }
    }
    
    public static void setBoard() {
        for(int i = 0; i < 6; i++) {
            Arrays.fill(board[i], ' ');
        }
    }
    
    public static boolean checkwin_R() {
        boolean r = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 'R' && board[i][j+1] == 'R' && board[i][j+2] == 'R' && board[i][j+3] == 'R') {
                    r = true;
                }
            }
        }
        
        for (int j = 0; j < 7; j++){
            for (int i = 0; i < 3; i++){
                if (board[i][j] == 'R' && board[i+1][j] == 'R' && board[i+2][j] == 'R' && board[i+3][j] == 'R') {
                    r = true;
                }
            }
        }
        
      
        
        for(int i = 3; i < 6; i++){
            for(int j = 0; j < 4; j++){
		if (board[i][j] == 'R' && board[i-1][j+1] == 'R' && board[i-2][j+2] == 'R' && board[i-3][j+3] == 'R'){
		    r = true;
		}
            }
	}
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
		if (board[i][j] == 'R' && board[i+1][j+1] == 'R' && board[i+2][j+2] == 'R' && board[i+3][j+3] == 'R'){
                    r = true;
		}
            }
	}
        
        return r;
    }
    
    public static boolean checkwin_Y() {
        boolean y = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 'Y' && board[i][j+1] == 'Y' && board[i][j+2] == 'Y' && board[i][j+3] == 'Y') {
                    y = true;
                }
            }
        }
        
         for (int j = 0; j < 7; j++){
            for (int i = 0; i < 3; i++){
                if (board[i][j] == 'Y' && board[i+1][j] == 'Y' && board[i+2][j] == 'Y' && board[i+3][j] == 'Y') {
                    y = true;
                }
            }
        }
        
        for(int i = 3; i < 6; i++){
            for(int j = 0; j < 4; j++){
		if (board[i][j] == 'Y' && board[i-1][j+1] == 'Y' && board[i-2][j+2] == 'Y' && board[i-3][j+3] == 'Y'){
		    y = true;
		}
            }
	}
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
		if (board[i][j] == 'Y' && board[i+1][j+1] == 'Y' && board[i+2][j+2] == 'Y' && board[i+3][j+3] == 'Y'){
                    y = true;
		}
            }
	}
        
        return y;
    }
    
    
}//class
