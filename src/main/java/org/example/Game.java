package org.example;

public class Game extends Thread {
    private MainWindow mainWindow;
    private SettingsWindow settingsWindow;
    private Field field;
    private volatile Settings settings;

    public Game() {
        this.settings = Settings.Big();
        this.field = new Field(this.settings);
        this.settingsWindow = new SettingsWindow(this, this.settings);
        this.mainWindow = new MainWindow(this.settings, this.field);
        this.settingsWindow.showFrame();
    }

    public void reload() {
        this.field.clear();
        field.initRandomDots(5000);
    }
    public void pause() {
        settings.setPause(true);
    }

    public void unpause() {
        settings.setPause(false);
    }

    public void pauseSwitch() {
        if (settings.isPaused()) unpause();
        else pause();
    }

    @Override
    public void start() {
        field.initRandomDots(5000);
        gameLoop();
    }

    public void gameLoop() {
        try {
            do {
                gameLogic();
                mainWindow.update();
                sleep(settings.getSpeed() * 100L);
            } while (true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void gameLogic() {
        if (settings.isPaused()) return;
        field.update();
    }
}
