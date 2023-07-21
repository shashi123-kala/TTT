package com.ttt.tdd;

import com.ttt.exception.TicTacToeException;

public class TicTacToe {

	private Character[][] board = { { '\0', '\0', '\0' }, { '\0', '\0', '\0' }, { '\0', '\0', '\0' } };
	private char lastPlayer = '\0';


	public void play(int row, int column/* , Character player */) {
		if (board[column - 1][row - 1] != '\0') {
            throw new RuntimeException("Field is occupied!");
        } else {
            board[column - 1][row - 1] = 'X';
        }
		
//		if (column < 3) {
//            throw new RuntimeException("Field is occupied!");
//        }
		lastPlayer = nextPlayer();
	}

	public char nextPlayer() {
		if (lastPlayer == 'X') {
            return 'O';
        }
        return 'X';
	}

}
