package bridgeittest;

import java.util.Random;

public class Test {
	public int winner;
	public static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int[][] board=new int[3][3];
		System.out.print("|");
		System.out.print(board[0][0]);
		System.out.print("|");
		System.out.print(board[0][1]);
		System.out.print("|");
		System.out.print(board[0][2]);
		System.out.println("|");
		System.out.println("-------");
		System.out.print("|");
		System.out.print(board[1][0]);
		System.out.print("|");
		System.out.print(board[1][1]);
		System.out.print("|");
		System.out.print(board[1][2]);
		System.out.println("|");
		System.out.println("-------");
		System.out.print("|");
		System.out.print(board[2][0]);
		System.out.print("|");
		System.out.print(board[2][1]);
		System.out.print("|");
		System.out.print(board[2][2]);
		System.out.print("|");
		
		
	}
	public static int checkwinner(int[][] board){
		if((board[0][0]==board[0][1])&&(board[0][1]==board[0][2]))
			return board[0][0];
		if((board[1][0]==board[1][1])&&(board[1][1])==(board[1][2]))
			return board[1][0];
		if((board[2][0]==board[2][1])&&(board[2][1]==board[2][2]))
			return board[2][0];
		if((board[0][0]==board[1][0])&&(board[1][0]==board[2][0]))
			return board[0][0];
		if((board[0][1]==board[1][1])&&(board[1][1]==board[2][1]))
			return board[0][1];
		if((board[0][2]==board[1][2])&&(board[1][2]==board[2][2]))
			return board[0][2];
		if((board[0][0]==board[1][1])&&(board[1][1]==board[2][2]))
			return board[0][0];
		if((board[0][2]==board[1][1])&&(board[1][1]==board[2][0]))
			return board[0][2];
		return result;
		
	}

}
