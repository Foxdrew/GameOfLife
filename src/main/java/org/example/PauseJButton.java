package org.example;

import javax.swing.*;
public class PauseJButton extends JButton {
    Settings settings;

    public PauseJButton(Game game, Settings settings) {
        this.settings = settings;
        setText("Pause");
        addActionListener(e -> {
            game.pauseSwitch();
        });
    }


}
