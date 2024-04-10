import javax.swing.*;
import javax.swing.text.Keymap;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.im.InputContext;

public class MyJTextField extends JTextField {
    public MyJTextField() {

        this.addKeyListener(new KeyListener() {

            String oldText;


            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                oldText = MyJTextField.super.getText();

                switch (e.getKeyCode()) {
                    case 49:
                        MyJTextField.super.setText(oldText.concat("1").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 50:
                        MyJTextField.super.setText(oldText.concat("2").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 51:
                        MyJTextField.super.setText(oldText.concat("3").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 52:
                        MyJTextField.super.setText(oldText.concat("4").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 53:
                        MyJTextField.super.setText(oldText.concat("5").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 54:
                        MyJTextField.super.setText(oldText.concat("6").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 55:
                        MyJTextField.super.setText(oldText.concat("7").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 56:
                        MyJTextField.super.setText(oldText.concat("8").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 57:
                        MyJTextField.super.setText(oldText.concat("9").replaceAll("(.)(.)$", "$1"));
                        break;
                    case 48:
                        MyJTextField.super.setText(oldText.concat("0").replaceAll("(.)(.)$", "$1"));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
