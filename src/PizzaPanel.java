import javax.swing.*;
import java.awt.*;

/**
 * Ask the user for pizza size
 */
public class PizzaPanel extends JPanel {

    private JLabel pizzaLabel;
    private JTextField pizzaNum;
    private JRadioButton smallPizza, mediumPizza, largePizza;
    private ButtonGroup buttonGroup;

    /**
     constructor
     */
    public PizzaPanel() {
        //create gridlayout manager with 5 rows and 1 column
        setLayout(new GridLayout(5,1));
        pizzaLabel = new JLabel("How many Pizza");
        pizzaNum = new JTextField(5);
        smallPizza = new JRadioButton("Small");
        mediumPizza = new JRadioButton("Medium");
        largePizza = new JRadioButton("Large");
        //group the radio buttons
        buttonGroup = new ButtonGroup();
        buttonGroup.add(smallPizza);
        buttonGroup.add(mediumPizza);
        buttonGroup.add(largePizza);
        //border around the panel
        setBorder(BorderFactory.createTitledBorder("Pizza"));
        //add to the panel
        add(pizzaLabel);
        add(pizzaNum);
        add(smallPizza);
        add(mediumPizza);
        add(largePizza);

    }
}
