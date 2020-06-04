package location_scorer;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel{

    private JLabel companyTitle;
    private JLabel productTitle;

    TitlePanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        companyTitle = new JLabel("Time Keep Co");
        productTitle = new JLabel("Location Score Calculator");

        add(companyTitle);
        add(Box.createHorizontalGlue());
        add(productTitle);
        repaint();
        setVisible(true);
    }

    
}