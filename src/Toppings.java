import javax.swing.*;
import java.awt.*;

/**
 * ask the user for pizza toppings
 */

public class Toppings extends JPanel {
    private JCheckBox cheese, meat, veggie;

    /**
     * constructor
     */

    public Toppings() {
        //create gridlayout manager with 4 rows and 1 column
        setLayout(new GridLayout(4,1));
        //checkboxes
        cheese = new JCheckBox("Cheese");
        meat = new JCheckBox("Meat");
        veggie = new JCheckBox("Veggie");
        //border around the panel
        setBorder(BorderFactory.createTitledBorder("Toppings"));
        //add to the panel
        add(cheese);
        add(meat);
        add(veggie);


    }
}
