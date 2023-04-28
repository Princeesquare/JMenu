import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu1,subMenu,menu2, menu3;
    private JMenuItem menu2Item,textItem,imageItem,submenuItem,exitItem, menu3Item;
    public Menu()
    {
        setSize(400,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu1=new JMenu("Menu1 Options");
        textItem=new JMenuItem("Text Item");
        menu1.add(textItem);
        menu1.addSeparator();

        imageItem=new JMenuItem("Icon Text");
        ImageIcon ic=new ImageIcon(new ImageIcon("face.JPG").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        imageItem.setIcon(ic);
        menu1.add(imageItem);
        menu1.addSeparator();

        subMenu=new JMenu("SubMenu Options");
        submenuItem=new JMenuItem("Option1");
        subMenu.add(submenuItem);
        menu1.add(subMenu);
        menu1.addSeparator();

        exitItem=new JMenuItem("Exit");
        menu1.add(exitItem);
        menuBar.add(menu1);

        menu2=new JMenu("Menu2 Options");
        menu2Item=new JMenuItem("Show the second Form");
        menu2.add(menu2Item);
        menuBar.add(menu2);
        menu2.addSeparator();

        menu3 = new JMenu("My Own Menu");
        menu3Item = new JMenuItem("See My name");
        menu3.add(menu3Item);
        menu3.addSeparator();
        menuBar.add(menu3);

        add(menuBar);

        menu3Item.addActionListener(this);
        exitItem.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exitItem)
        {
            dispose();
        }
        if(e.getSource() == menu3Item)
            JOptionPane.showMessageDialog(null, "My Name is Prince Emmanuel");
    }
}
