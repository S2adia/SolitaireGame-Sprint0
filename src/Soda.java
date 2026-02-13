import javax.swing.*;
import java.awt.*;

/**
 * ask the user for soda choice
 */
public class Soda extends JPanel {
    private JRadioButton coke, sprite, water, drPepper;
    private JLabel soda;
    private JTextField sodaNum;
    private ButtonGroup btnGroup;
    public Soda(){
        //create gridlayout manager with 6 rows and 1 column
        setLayout(new GridLayout(6,1));
        soda = new JLabel("How many soda?");
        sodaNum = new JTextField(5);
        coke = new JRadioButton("Coke");
        sprite = new JRadioButton("Sprite");
        water = new JRadioButton("Water");
        drPepper = new JRadioButton("DrPepper");
        //group the radio buttons
        btnGroup = new ButtonGroup();
        btnGroup.add(coke);
        btnGroup.add(sprite);
        btnGroup.add(water);
        btnGroup.add(drPepper);
        //create border around the panel
        setBorder(BorderFactory.createTitledBorder("Soda"));
        //add to the panel
        add(soda);
        add(sodaNum);
        add(coke);
        add(sprite);
        add(water);
        add(drPepper);


    }
}
