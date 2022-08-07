package org.example;

import javax.swing.*;

public class SettingsWindow extends JFrame {
    Game game;
    public SettingsWindow(Game game, Settings settings) {
        this.game = game;
        setSize(300, 400);
        setTitle("Settings");
        add(new PauseJButton(game, settings));
    }

    public void showFrame() {
        setVisible(true);
    }

    public void hideFrame() {
        setVisible(false);
    }
}
