package com.javalesson.innerclassesNr2;

public class Display2 {

    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIGHT = 1280;
    private int x = 0;


    public Display2() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }

    private class Pixel {
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {

            if (0 <= x && x <= DISPLAY_WIGHT && 0 <= y && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating " + color + " pixel at (" + x + " , " + y + ")");
            } else {
                throw new IllegalArgumentException("Coordinates X and why should be between 0 - " + DISPLAY_WIGHT + " and 0 - " + DISPLAY_HEIGHT);
            }
        }
    }


    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }
}
