package com.capgemini.gameoflife;

public class Board {

	private int row;
	private int column;
	private boolean[][] board;

	public Board(int row, int column) {
		this.row = row;
		this.column = column;
		this.board = new boolean[row][column];
	}

	public void showBoard() {

		for (int i = 0; i < getRow(); i++) {
			for (int j = 0; j < getColumn(); j++) {
				System.out.print("Komorka" + "[" + i + "]" + "[" + j + "]" + ":" + board[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

	public boolean[][] getBoard() {
		return board;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setBoard(boolean[][] board) {
		this.board = board;
	}

}