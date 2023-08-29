package com.LLD.tictactoe.factories;

import com.LLD.tictactoe.models.BotDifficultyLevel;
import com.LLD.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.LLD.tictactoe.strategies.botplayingstrategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        return new RandomBotPlayingStrategy();
    }
}
