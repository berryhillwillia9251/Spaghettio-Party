//credit to DigitalJedi on StackOverflow

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventClass extends JFrame implements KeyListener {

public KeyEventClass(){
    this.setLayout(new BorderLayout());
    JTextField field = new JTextField();
    field.addKeyListener(this);
    this.add(field, BorderLayout.CENTER);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(0, 0);
    this.setVisible(true);
}

public void keyTyped(KeyEvent e) {
    //System.out.println("KeyTyped: ");
    if(e.getKeyChar() == KeyEvent.CHAR_UNDEFINED){
        //System.out.println("No Unicode-Character typed!");
    }else{
        //System.out.println(e.getKeyChar() + " typed!");
    }
    //System.out.println("---");
}
public void keyPressed(KeyEvent e) {
    //System.out.println("Key: " + e.getKeyChar() + ", Code: " + e.getKeyCode());
    //System.out.println("Key-Location: " + e.getKeyLocation());
    //System.out.println("---");
    LetterHunt.keyPress = e.getKeyChar();
}

public void keyReleased(KeyEvent e) {
    //System.out.println("KeyReleased: ");
    if(e.getKeyCode() == LetterHunt.keyPress){
        //LetterHunt.keyPress = '0';
        //System.out.println("ABORT!");
        //System.exit(0);
    }    
    //System.out.println("Key: " + e.getKeyChar() + ", Code: " + e.getKeyCode());
    //System.out.println("---");
}

//public static void main(String[] args) {
    //new KeyEventClass();
//}
}