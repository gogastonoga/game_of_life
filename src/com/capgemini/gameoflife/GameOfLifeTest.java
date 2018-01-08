package com.capgemini.gameoflife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void firstTest() {

		Board newBoard = new Board(3, 3);
		newBoard.getBoard()[0][0] = true;
		newBoard.getBoard()[2][2] = true;
		newBoard.getBoard()[0][1] = true;

		Board newGenerationBoard = new Board(newBoard.getRow(), newBoard.getColumn());
		newGenerationBoard = Evolution.nextGeneration(newBoard);

		boolean[][] expectedBoard = { { false, false, false }, { false, true, false }, { false, false, false } };

		assertArrayEquals(expectedBoard, newGenerationBoard.getBoard());

	}

	@Test
	public void secondTest() {

		Board newBoard = new Board(4, 4);
		newBoard.getBoard()[0][1] = true;
		newBoard.getBoard()[1][0] = true;
		newBoard.getBoard()[1][2] = true;
		newBoard.getBoard()[3][1] = true;

		Board newGenerationBoard = new Board(newBoard.getRow(), newBoard.getColumn());
		newGenerationBoard = Evolution.nextGeneration(newBoard);

		boolean[][] expectedBoard = { { false, true, false, false }, { false, true, false, false },
				{ false, true, false, false }, { false, false, false, false } };

		assertArrayEquals(expectedBoard, newGenerationBoard.getBoard());

	}

}
