import java.io.*;
import java.util.Scanner;

public class Board {
	private char[][] grid;
	public Board() {
		grid = new char[20][20];
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[r].length; c++) {
				grid[r][c] = '-';
			}
		}
	}
	public void initBoard() throws FileNotFoundException {
		File file = new File("digital.txt");
		Scanner sc = new Scanner(file);
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			this.set(r-1, c-1, 'X');
		}
		sc.close();
	}
	public char get(int r, int c) throws ArrayIndexOutOfBoundsException {
		return grid[r][c];
	}
	public void set(int r, int c, char val) throws ArrayIndexOutOfBoundsException{
		grid[r][c] = val;
	}
	public void displayBoard() {
		System.out.printf("%-4s", "");
		for (int i = 0; i < grid[0].length; i++) {
		    System.out.printf("%-4d", i+1);
		}
		System.out.println();
		for (int r = 0; r < grid.length; r++) {
		    System.out.printf("%-4d", r+1);
		    for (int c = 0; c < grid[0].length; c++) {
		        System.out.printf("%-4c", grid[r][c]);
		    }
		    System.out.println();
		}
	}
	public void erase(int r, int c) throws  ArrayIndexOutOfBoundsException{
		if(grid[r][c] == '-') return;
		set(r,c, '-');
		if(r == 19){
			erase(r, c+1);
			erase(r, c-1);
			erase(r-1, c);
			erase(r-1, c+1);
			erase(r-1, c-1);
		}
		else if(c == 19) {
			erase(r, c-1);
			erase(r+1, c);
			erase(r-1, c);
			erase(r+1, c-1);
			erase(r-1, c-1);
		}
		else if(r == 19 && c == 19) {
			erase(r, c-1);
			erase(r-1, c);
			erase(r-1, c-1);
		}
		else {
			erase(r, c+1);
			erase(r, c-1);
			erase(r+1, c);
			erase(r-1, c);
			erase(r-1, c+1);
			erase(r+1, c+1);
			erase(r+1, c-1);
			erase(r-1, c-1);
		}
	}
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof Board)) return false;
		Board other = (Board) obj;
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[r].length; c++) {
				if(grid[r][c] != other.grid[r][c]) return false;
			}
		}
		return true;
		
	}
}
