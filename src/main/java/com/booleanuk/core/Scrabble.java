package com.booleanuk.core;

import java.util.Map;

public class Scrabble {
    Map<Character, Integer> letterScores;
    Alphabet alphabet;

    public Scrabble(Alphabet alphabet) {
        this.alphabet = alphabet;
        this.letterScores = alphabet.getLetterScores();
    }

    public int score(String word) {
        int total = 0;

        for (char ch : word.toCharArray()) {
            if (this.letterScores.containsKey(ch)) {
                int score = this.letterScores.get(ch);
                total += score;
            }
        }

        return total;
    }
}
