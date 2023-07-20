package com.ttt.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TicTacToeTest {

	TicTacToe tictactoe = new TicTacToe();

	@Test
	public void initializeNewTicTacToeGame() {
		assertNotNull(tictactoe);
	}

	@Test
	public void playWithFIrstPlayer() {
		Character actual = tictactoe.play(1, 1);
		assertEquals('X', actual);
	}

}
