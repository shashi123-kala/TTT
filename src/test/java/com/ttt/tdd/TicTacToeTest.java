package com.ttt.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.ttt.exception.TicTacToeException;

public class TicTacToeTest {

	TicTacToe tictactoe ;
	//= new TicTacToe();
	public static final Character FIRST_PLAYER = 'X';
	public static final Character SECOND_PLAYER = 'O';
	@Rule
    public ExpectedException exception = ExpectedException.none();

	
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
		//Character actual = tictactoe.play(1, 1,'X');
		//assertEquals(FIRST_PLAYER, actual);
		 assertEquals('X', tictactoe.nextPlayer());
	}
	
	

	
	@Test
	public void playWithSecondPlayer() {
//		Character actual = tictactoe.play(1, 2,'O');
//		assertEquals(SECOND_PLAYER, actual);
		tictactoe.play(1,1);
		assertEquals('O', tictactoe.nextPlayer());

	}

//	@Test
//	public void RunTimeExceptionFoundWhenXOutsideOfBoard() {
//		exception.expect(TicTacToeException.class);
//		tictactoe.play(5, 2,'X');
//	}

	@Test
    public void whenOccupiedThenRuntimeException() {
        exception.expect(TicTacToeException.class);
        tictactoe.play(2, 1);
    }
	
//	@Test
//	public void RunTimeExceptionFoundWhenXOutsideOfBoard() {
//		exception.expect(TicTacToeException.class);
//		tictactoe.play(6, 5);
//	}

}
