package org.example;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {
    Game game;
    public SettingsWindow(Game game, Settings settings) {
        this.game = game;
        setSize(300, 400);
        setTitle("Settings");
        setLayout(new GridLayout(2,1));
        add(new PauseJButton(game, settings));
        add(new ReloadJButton(game));
    }

    public void showFrame() {
        setVisible(true);
    }

    public void hideFrame() {
        setVisible(false);
    }
}
