package com.ttt.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {

	TicTacToe tictactoe ;
	//= new TicTacToe();
	public static final Character FIRST_PLAYER = 'X';
	public static final Character SECOND_PLAYER = 'O';
	
	 @BeforeEach
	    public final void before() {
	        tictactoe = new TicTacToe();
	    }

	@Test
	public void initializeNewTicTacToeGame() {
		assertNotNull(tictactoe);
	}

	@Test
	public void playWithFIrstPlayer() {
		Character actual = tictactoe.play(1, 1,'X');
		assertEquals(FIRST_PLAYER, actual);
	}
	
	@Test
	public void playWithSecondPlayer() {
		Character actual = tictactoe.play(1, 2,'O');
		assertEquals(SECOND_PLAYER, actual);
	}

}
