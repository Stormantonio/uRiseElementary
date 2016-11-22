package com.company.Lesson16;

import java.util.ArrayList;

/**
 * Created by Anton on 22.11.2016.
 * Сгенерируйте колоду карт
 */
public class Cards {
    public static void main(String[] args) {
        final int CARDSSIZE = 36;
        ArrayList<String> cards = new ArrayList<>();
        String newCard;
        for (; ; ) {
            if (cards.size() == CARDSSIZE)
                break;
            int mastCard = (int) (Math.random() * 4) + 1;
            if (mastCard == 1) {
                newCard = "P";
            } else if (mastCard == 2) {
                newCard = "B";
            } else if (mastCard == 3) {
                newCard = "C";
            } else {
                newCard = "X";
            }
            int nameCard = (int) (Math.random() * 9) + 6;
            if (nameCard == 11) {
                newCard += "V";
            } else if (nameCard == 12) {
                newCard += "D";
            } else if (nameCard == 13) {
                newCard += "K";
            } else if (nameCard == 14) {
                newCard += "T";
            } else {
                newCard += nameCard;
            }
            if (cards.contains(newCard)) {
                continue;
            } else {
                cards.add(newCard);
            }
        }
        System.out.println("Колода карт сгенерирована!\n" + cards);
    }
}
