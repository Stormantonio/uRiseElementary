package com.company.Lesson09;

/**
 * Created by Anton on 22.11.2016.
 * Выведите количество слов в англоязычном абзаце.
 */
public class WordsCount {
    public static void main(String[] args) {
        String[] words;
        int count = 0;

        String paragraph = "The Roman Empire had a huge task in front of them while it was first starting out and while it was becoming " +
                "a dominant dynasty in the early civilizations. The main problem\n" +
                " that the book «Discovering the Global Past» points out is how the Roman Empire found itself growing a little too quickly." +
                " The Roman Empire started out very small on\n" +
                " the Tiber River and grew abruptly without warning. Before they knew it, they were not a small power but now one with " +
                "a great number of people with a great number of cultures\n" +
                " intertwined within the Roman Empire. They were now spread over an immense portion of land with much power coming with it. " +
                "The question now is how they are going to be able\n" +
                " to handle all of this power and continue to dominate the world without any blueprints to help them out from previous " +
                "dynasties because it had never been done before. \n" +
                "We now have some evidence to help understand this and to show how it did happen. So courtesy of the «Discovering the Global" +
                " Past» they have seven pieces of evidence\n" +
                " that will help prove that the Roman Empire could handle the " +
                "challenge of taking on the mastery of world power.";

        System.out.println(paragraph);
        System.out.println();
        words = paragraph.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + " : " + words[i]);
            count++;
        }
        System.out.println();
        System.out.println("Количество слов в абзаце: " + count);
    }
}
