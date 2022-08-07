package org.example;

import java.util.Random;

public class Field {
    private boolean[][] field;
    private int width;
    private int height;

    public Field(Settings settings) {
        this.width = settings.getWidth();
        this.height = settings.getHeight();
        this.field = new boolean[this.height][this.width];
    }

    private void initField() {
        this.field = new boolean[height][width];
    }

    public void clear() {
        this.field = new boolean[this.height][this.width];
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean getValue(int x, int y) {
        return field[y][x];
    }

    public void update() {
        boolean[][] newField = new boolean[height][width];

        int neighbourCount;

        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                neighbourCount = getNeighbourCount(x,y);

                if (field[y][x]) newField[y][x] = neighbourCount >= 2 && neighbourCount <= 3;
                else newField[y][x] = neighbourCount == 3;

            }
        }

        field = newField;
    }

    public void initRandomDots(int amount) {
        Random random = new Random();
        int count = amount;

        int x;
        int y;

        while (count > 0) {
            x = random.nextInt(width - 1);
            y = random.nextInt(height - 1);
            if (!field[y][x]) {
                field[y][x] = true;
                --count;
            }
        }
    }
    private int getNeighbourCount(int x, int y) {
        int count = 0;
        int startX = x - 1;
        int startY = y - 1;

        for (int yy = 0; yy < 3; yy++) {
            for (int xx = 0; xx < 3; xx++) {
                int targetX = startX + xx;
                int targetY = startY + yy;

                if (targetX < 0 || targetX >= width) continue;
                if (targetY < 0 || targetY >= height) continue;
                if (targetX == x && targetY == y) continue;
                if (field[targetY][targetX]) ++count;
            }
        }

        return count;
    }
}
