package com.LLD.tictactoe.strategies.winningstrategies;

import com.LLD.tictactoe.models.Board;
import com.LLD.tictactoe.models.Cell;
import com.LLD.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board,
                        Player lastMovePlayer,
                        Cell moveCell);
}
