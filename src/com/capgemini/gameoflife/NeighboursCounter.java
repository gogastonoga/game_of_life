package com.capgemini.gameoflife;

public class NeighboursCounter {

	private int neighbors;
	private int[][] neighborsBoard;

	public NeighboursCounter(Board board) {
		neighbors = 0;
		neighborsBoard = new int[board.getRow()][board.getColumn()];
		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				neighborsBoard[i][j] = 0;
			}
		}
	}

	public int[][] countNeighbours(Board board) {

		boolean variableOutReach = false;
		boolean variableOutReach2 = false;

		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				for (int k = i - 1; k <= i + 1; k++) {
					if (k < 0 || k > board.getRow() - 1) {
						variableOutReach = true;
					} else {
						variableOutReach = false;
					}

					for (int l = j - 1; l <= j + 1; l++) {
						if (l < 0 || l > board.getColumn() - 1 || (k == i && l == j)) {
							variableOutReach2 = true;
						} else {
							variableOutReach2 = false;
						}

						if (variableOutReach == false && variableOutReach2 == false) {
							if (board.getBoard()[k][l]) {
								neighbors++;
							}
						}
					}
				}

				neighborsBoard[i][j] = neighbors;
				neighbors = 0;

			}
		}
		return neighborsBoard;
	}

	public int getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(int neighbors) {
		this.neighbors = neighbors;
	}

	public int[][] getNeighborsBoard() {
		return neighborsBoard;
	}

	public void setNeighborsBoard(int[][] neighborsBoard) {
		this.neighborsBoard = neighborsBoard;
	}

}
