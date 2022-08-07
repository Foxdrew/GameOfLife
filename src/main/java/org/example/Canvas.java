package org.example;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    Field field;

    public Canvas(Field field) {
        this.field = field;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        int startX = 0;
        int startY = 0;
        int size = 4;

        for (int y = 0; y < field.getHeight(); y++) {
            for (int x = 0; x < field.getWidth(); x++) {
                if (field.getValue(x, y)) {
                    graphics2D.setColor(Color.darkGray);
                } else {
                    graphics2D.setColor(Color.white);
                }

                graphics2D.fillRect(
                        startX + (x * size),
                        startY + (y * size),
                        size,
                        size);
            }
        }
    }
}
