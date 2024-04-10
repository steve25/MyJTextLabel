import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("special JTextField");
        JPanel inputPanel = new JPanel();
        JLabel inputLabel = new JLabel("Input text: ");
        MyJTextField textField = new MyJTextField();

        JPanel outputPanel = new JPanel();
        JLabel outputLabel = new JLabel();

        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(inputLabel);
        inputPanel.add(textField);

        outputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.X_AXIS));
        outputPanel.add(outputLabel);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER && !textField.getText().isEmpty()) {
                    outputLabel.setText(
                            "<html>" + outputLabel.getText()
                                    .replaceAll("<html>", "")
                                    .replaceAll("</html>", "") + "<br>" + textField.getText() +
                                    "</html>");
                    textField.setText("");
                }
            }

        });

        System.out.println(outputLabel.getText().replaceAll("<html>", "").replaceAll("</html>", ""));

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, BorderLayout.SOUTH);

        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}