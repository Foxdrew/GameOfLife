package org.example;

public class Settings {
    private int width;
    private int height;
    private int cellSize;
    private int speed;
    private volatile boolean isPaused;

    public static Settings Small() {
        return new Settings(100, 50, 4, 1, true);
    }

    public static Settings Medium() {
        return new Settings(300, 150, 4, 1, true);
    }

    public static Settings Big() {
        return new Settings(400, 200, 4, 1, true);
    }

    public Settings(int width, int height, int cellSize, int speed, boolean isPaused) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        this.speed = speed;
        this.isPaused = isPaused;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPause(boolean value) {
        this.isPaused = value;
    }

}
