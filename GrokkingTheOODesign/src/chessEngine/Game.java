package chessEngine;

import java.util.List;

import chessEngine.enumsAndConstants.GameStatus;
import chessEngine.pieces.King;
import chessEngine.pieces.Piece;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Game {
	private Player[] players;
	private Board board;
	private Player currentTurn;
	private GameStatus status;
	private List<Move> movesPlayed;

	private void initialize(Player p1, Player p2) {
		players[0] = p1;
		players[1] = p2;

		board.resetBoard();

		if (p1.isWhiteSide()) {
			this.currentTurn = p1;
		} else {
			this.currentTurn = p2;
		}

		movesPlayed.clear();
	}

	public boolean isEnd() {
		return this.status != GameStatus.ACTIVE;
	}

	public GameStatus getStatus() {
		return status;
	}

	public void setStatus(GameStatus status) {
		this.status = status;
	}

	public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
		Box startBox = null;
		Box endBox = null;
		try {
			startBox = board.getBox(startX, startY);
			endBox = board.getBox(endX, endY);
		} catch (Exception e) {
			System.out.println("Caught Index Out Of Bounds Exception");
			e.printStackTrace();
		}
		Move move = new Move(player, startBox, endBox);
		return this.makeMove(move, player);
	}

	private boolean makeMove(Move move, Player player) {
		Piece sourcePiece = move.getStart().getPiece();
		if (sourcePiece == null) {
			return false;
		}

		// valid player
		if (player != currentTurn) {
			return false;
		}

		if (sourcePiece.isWhite() != player.isWhiteSide()) {
			return false;
		}

		// valid move
		if (!sourcePiece.canMove(board, move.getStart(), move.getEnd())) {
			return false;
		}

		// kill?
		Piece destPiece = move.getStart().getPiece();
		if (destPiece != null) {
			destPiece.setKilled(true);
			move.setPieceKilled(destPiece);
		}

		// castling
		if (sourcePiece != null && sourcePiece instanceof King
				&& ((King) sourcePiece).isCastlingMove(move.getStart(), move.getEnd())) {
			move.setCastlingMove(true);
		}

		// store the move
		movesPlayed.add(move);

		// move piece from start box to end box
		move.getEnd().setPiece(move.getStart().getPiece());
		move.getStart().setPiece(null);

		if (destPiece != null && destPiece instanceof King) {
			if (player.isWhiteSide()) {
				this.setStatus(GameStatus.WHITE_WIN);
			} else {
				this.setStatus(GameStatus.BLACK_WIN);
			}
		}

		// set the current turn to other player
		if (this.currentTurn == players[0]) {
			this.currentTurn = players[1];
		} else {
			this.currentTurn = players[0];
		}
		return true;
	}
}
