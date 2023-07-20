package com.ttt.tdd;

public class TicTacToe {
	
	private Character[][] board = { { '\0', '\0', '\0' }, { '\0', '\0', '\0' }, { '\0', '\0', '\0' } };

	public Character play(int row, int column) {
       return  board[column - 1][row - 1] = 'X';
	}

}
