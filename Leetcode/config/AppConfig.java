package Leetcode.config;

import java.util.HashMap;
import java.util.Map;

import Leetcode.entity.Level;

public class AppConfig {
    private static Map<Level, Integer> levelScoreConstant = new HashMap<>();

    static {
        levelScoreConstant.put(Level.LOW, 50);
        levelScoreConstant.put(Level.MEDIUM, 30);
        levelScoreConstant.put(Level.HARD, 0);
    }

    public static int getContestLevelConstant(Level level) {
        return levelScoreConstant.get(level);
    }
}
