package com.kata.tennisgame;

public enum Score {
    LOVE(1, "Love"),
    FIFTEEN(2, "Fifteen"),
    THIRTY(3, "Thirty"),
    FORTY(4, "Forty");

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

    public static String forWinning(int point) {
        String score = new String();
        Score[] values = Score.values();
        for (Score s : values) {
            if (s.point() == point)
                score = s.score();
        }
        return score;
    }
}
