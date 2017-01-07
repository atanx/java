import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Peter on 2017/1/7.
 */
public class hello {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;

    public static  void  main( String[] args) {
        JFrame frame = new JFrame("hello");
        frame.setContentPane(new hello().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

        public hello() {
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textArea1.setText("hello world.");
            }
        });
    }
}
