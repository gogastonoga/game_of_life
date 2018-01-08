package com.capgemini.gameoflife;

public class Evolution {

	private static Board newGenerationBoard;
	private static int[][] neighboursBoard;

	public static Board nextGeneration(Board newBoard) {
		NeighboursCounter counter = new NeighboursCounter(newBoard);
		neighboursBoard = counter.countNeighbours(newBoard);

		newGenerationBoard = new Board(newBoard.getRow(), newBoard.getColumn());
		for (int i = 0; i < neighboursBoard[0].length - 1; i++) {
			for (int j = 0; j < neighboursBoard.length - 1; j++) {
				if (newBoard.getBoard()[i][j] == true && neighboursBoard[i][j] < 2) {
					newGenerationBoard.getBoard()[i][j] = false;
				}
				if (newBoard.getBoard()[i][j] == true && (neighboursBoard[i][j] == 2 || neighboursBoard[i][j] == 3)) {
					newGenerationBoard.getBoard()[i][j] = true;
				}
				if (newBoard.getBoard()[i][j] == true && neighboursBoard[i][j] > 3) {
					newGenerationBoard.getBoard()[i][j] = false;
				}
				if (newBoard.getBoard()[i][j] == false && neighboursBoard[i][j] == 3) {
					newGenerationBoard.getBoard()[i][j] = true;
				}
			}
		}
		return newGenerationBoard;
	}
}