import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    private final JMenuItem menu2Item;
    private final JMenuItem exitItem;
    private final JMenuItem menu3Item;
    public Menu()
    {
        setSize(400,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu menu1 = new JMenu("Menu1 Options");
        JMenuItem textItem = new JMenuItem("Text Item");
        menu1.add(textItem);
        menu1.addSeparator();

        JMenuItem imageItem = new JMenuItem("Icon Text");
        ImageIcon ic=new ImageIcon(new ImageIcon("face.JPG").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        imageItem.setIcon(ic);
        menu1.add(imageItem);
        menu1.addSeparator();

        JMenu subMenu = new JMenu("SubMenu Options");
        JMenuItem submenuItem = new JMenuItem("Option1");
        subMenu.add(submenuItem);
        menu1.add(subMenu);
        menu1.addSeparator();

        exitItem=new JMenuItem("Exit");
        menu1.add(exitItem);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu1);

        JMenu menu2 = new JMenu("Menu2 Options");
        menu2Item=new JMenuItem("Show the second Form");
        menu2.add(menu2Item);
        menuBar.add(menu2);
        menu2.addSeparator();

        JMenu menu3 = new JMenu("My Name");
        menu3Item = new JMenuItem("See My name");
        menu3.add(menu3Item);
        menu3.addSeparator();
        menuBar.add(menu3);

        add(menuBar);

        menu3Item.addActionListener(this);
        menu2Item.addActionListener(this);
        exitItem.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exitItem)
        {
            this.dispose();
        }
        if(e.getSource() == menu3Item) {
            if (JOptionPane.showConfirmDialog(null, "Are You Sure you want to see my name?", "Important Question",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "My Name is Prince Emmanuel");
            else
                return;
        }
        if (e.getSource() == menu2Item)
        {
            new form2();
            this.dispose();
        }
    }
}
