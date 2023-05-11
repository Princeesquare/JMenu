import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame implements ActionListener {
   public JButton back;
    public form2(){
        setSize(400,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back = new JButton("Go Back");
        add(back);

        back.addActionListener(this);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back)
        {
            new Menu();
            this.dispose();
        }
            }

}
