package chessEngine.pieces;

import chessEngine.Board;
import chessEngine.Box;

/**
 * @author Hammad: 26-Feb-2022
 */
public abstract class Piece {
	private boolean killed = false;
	private boolean white = false;

	public Piece(boolean white) {
		this.setWhite(white);
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}

	public boolean isKilled() {
		return killed;
	}

	public void setKilled(boolean killed) {
		this.killed = killed;
	}

	public abstract boolean canMove(Board board, Box start, Box end);
}
