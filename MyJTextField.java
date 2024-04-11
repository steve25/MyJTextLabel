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
            String newChar;



            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                oldText = MyJTextField.super.getText();

                switch (e.getKeyCode()) {
                    case 49:
                        newChar = "1";
                        break;
                    case 50:
                        newChar = "2";
                        break;
                    case 51:
                        newChar = "3";
                        break;
                    case 52:
                        newChar = "4";
                        break;
                    case 53:
                        newChar = "5";
                        break;
                    case 54:
                        newChar = "6";
                        break;
                    case 55:
                        newChar = "7";
                        break;
                    case 56:
                        newChar = "8";
                        break;
                    case 57:
                        newChar = "9";
                        break;
                    case 48:
                        newChar = "0";
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!newChar.isEmpty())
                    MyJTextField.super.setText(oldText.concat(newChar));
                newChar = "";
            }
        });
    }
}
