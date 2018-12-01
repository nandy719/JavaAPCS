import java.io.*;
import java.util.*;
public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		Board board = new Board();
		board.displayBoard();
		System.out.println();
		board.initBoard();
		board.displayBoard();
		Board blank = new Board();
		Scanner input = new Scanner(System.in);
		while(!board.equals(blank)) {
			System.out.println("Enter row: ");
			int r = input.nextInt();
			System.out.println("Enter column: ");
			int c = input.nextInt();
			board.erase(r-1, c-1);
			board.displayBoard();
					
		}
	}
}
