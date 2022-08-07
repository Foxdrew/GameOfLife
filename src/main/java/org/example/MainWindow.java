package org.example;

import javax.swing.*;

public class MainWindow extends JFrame {
    Canvas canvas;
    public MainWindow(Settings settings, Field field) {
        canvas = new Canvas(field);
        add(canvas);

        setTitle("Conway's Game of Life (Alego22 edition)");
        setSize(
                settings.getWidth() * settings.getCellSize() + 15,
                settings.getHeight() * settings.getCellSize() + 39) ;
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void update() {
        canvas.repaint();
    }
}
