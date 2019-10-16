package com.kata.tennisgame;

public enum Score {
    LOVE(1, "Love"),
    FIFTEEN(2, "Fifteen"),
    THIRTY(3, "Thirty"),
    FORTY(4, "Forty"),
    ADVANTAGE(5, "Advantage");

    private int point;
    private String score;

    Score(int point, String score) {
        this.point = point;
        this.score = score;
    }

    private int point() {
        return point;
    }

    private String score() {
        return score;
    }

    public static String forWinning(int point, String name) {
        StringBuilder score = new StringBuilder();
        Score[] values = Score.values();
        for (Score s : values) {
            if (s.point() == point)
                score.append(s.score());
        }
        score.append(name(point, name));
        return score.toString();
    }

    private static String name(int point, String name) {
        return point == 5 ? " " + name : "";
    }
}
