package com.framgia.toeic.screen.base;

public class RatingCaculator {

    public @RatingResult int rating(int score, int maxScore) {
        float numberRating = (float) score / maxScore;
        if (numberRating < 0.2) {
            return RatingResult.VERY_BAD;
        }

        if (numberRating < 0.4) {
            return RatingResult.BAD;
        }

        if (numberRating < 0.6) {
            return RatingResult.NORMAL;
        }

        if (numberRating < 0.8) {
            return RatingResult.GOOD;
        }

        if (numberRating <= 1) {
            return RatingResult.VERY_GOOD;
        }
        return RatingResult.NORMAL;
    }
}
