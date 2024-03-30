package wordcounter;

import javax.swing.*;

public class WordCounterApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WordCounterFrame frame = new WordCounterFrame();
            frame.setVisible(true);
        });
    }
}
