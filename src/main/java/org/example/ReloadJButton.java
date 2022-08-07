package org.example;

import javax.swing.*;

public class ReloadJButton extends JButton {
    public ReloadJButton(Game game) {

        setText("Reload");
        addActionListener(e -> {
            game.reload();
        });
    }
}
