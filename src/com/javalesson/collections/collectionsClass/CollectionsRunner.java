package com.javalesson.collections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {
    public static void main(String[] args) {
//        List<String> colors = new ArrayList<>();
//
//        colors.add("Yellow");
//        colors.add("Green");
//        colors.add("Blue");
//        colors.add("Black");
//        colors.add("Red");
//
//        System.out.println("List before sorting" + colors);
//        Collections.sort(colors);
//        System.out.println("List after sorting" + colors);
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }
//        System.out.println("Original deck of cards");
//        for (int i = 0; i < deckOfCards.size(); i++) {
//            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
//        }
        Collections.shuffle(deckOfCards);
        Collections.sort(deckOfCards);

        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards, card);
        if (i >= 0) {
            System.out.println("Card was found at position " + i);
        } else {
            System.out.println("Card was not found");
        }

        List<Card> cardList = new ArrayList<>(deckOfCards);
        Collections.fill(cardList, card);
        Collections.addAll(cardList, card, card, card);
        Collections.copy(cardList, deckOfCards);
        int frequency = Collections.frequency(cardList, card);
        System.out.println("Frequency of " + card + " is " + frequency);


        System.out.println("MIN : " + Collections.min(cardList));
        System.out.println("MAX : " + Collections.max(cardList));
  //      printOutput(cardList);
//        System.out.println("\n\nCards after shuffle");
//        printOutput(deckOfCards);
//        Collections.sort(deckOfCards, new CardComparator());
//        System.out.println("\nCards after sorting");
        //     printOutput(deckOfCards);
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}
