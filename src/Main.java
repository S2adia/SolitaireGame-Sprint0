import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public PizzaPanel pizza; //panel for pizza
    public Toppings toppings; //panel for toppings
    public Soda soda; //panel for soda

    private JPanel panel;//to hold buttons
    private JButton orderBtn, exitBtn, cancelBtn; //buttons
    public Main(){

        setTitle("Pink Cafe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        panel = new JPanel();
        orderBtn = new JButton("Place Order");
        cancelBtn = new JButton("Cancel");
        exitBtn = new JButton("Exit");
        panel.add(orderBtn);
        panel.add(cancelBtn);
        panel.add(exitBtn);
        //create panels
        pizza = new PizzaPanel();
        toppings = new Toppings();
        soda = new Soda();
        //add components to content pane
        add(pizza, BorderLayout.WEST);
        add(toppings, BorderLayout.CENTER);
        add(soda, BorderLayout.EAST);
        add(panel, BorderLayout.SOUTH);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

}