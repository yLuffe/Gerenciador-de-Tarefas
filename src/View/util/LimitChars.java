package View.util;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitChars extends PlainDocument {

    public enum InputType {
    }

    private int CharsNum;

    public LimitChars(int CharsNum) {
        this.CharsNum = CharsNum;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        try {
            if (str == null || getLength() == CharsNum) {
                return;
            }

            int totalChars = getLength() + str.length();

            if (totalChars <= CharsNum) {
                super.insertString(offs, str, a);
            } else {
                String newStr = str.substring(0, CharsNum);
                super.insertString(offs, newStr, a);
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Limite máximo de caracteres excedido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }
}
