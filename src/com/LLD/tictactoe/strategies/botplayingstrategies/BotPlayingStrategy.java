package com.LLD.tictactoe.strategies.botplayingstrategies;

import com.LLD.tictactoe.models.Board;
import com.LLD.tictactoe.models.Move;
import com.LLD.tictactoe.models.Player;

public interface BotPlayingStrategy {

    Move decideMove(Player player, Board board);
}
