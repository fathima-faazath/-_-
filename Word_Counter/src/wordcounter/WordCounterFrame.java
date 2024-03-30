package wordcounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterFrame extends JFrame {

    private JTextArea textArea;
    private JLabel wordCountLabel;

    public WordCounterFrame() {
        setTitle("Word Counter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        wordCountLabel = new JLabel("Word count: 0");

        JButton countButton = new JButton("Count Words");
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countWords();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(countButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(wordCountLabel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.NORTH);
    }

    private void countWords() {
        String text = textArea.getText();
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        wordCountLabel.setText("Word count: " + wordCount);
    }
}
