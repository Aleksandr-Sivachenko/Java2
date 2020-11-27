import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyChat extends JFrame implements ActionListener{

    JTextArea text = new JTextArea();
    JTextField field = new JTextField();
    JScrollPane jsp = new JScrollPane(text);

    public MyChat() throws IOException {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(300, 300, 400, 400);

        text.setEditable(false);
        text.setLineWrap(true);

        field.addActionListener(this);

        add(text, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
        add(jsp);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

}
