import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {
    TextField tf;
    Button btn;
    Label lbl;

    AWTExample() {
        setLayout(new FlowLayout());
        lbl = new Label("Enter your name:");
        tf = new TextField(20);
        btn = new Button("Click Me");
        add(lbl);
        add(tf);
        add(btn);
        btn.addActionListener(this);
        setTitle("AWT Example");
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        new AWTExample();
    }
}
