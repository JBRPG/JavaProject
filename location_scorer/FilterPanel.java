package location_scorer;

import javax.swing.*;
import java.awt.*;

public class FilterPanel extends JPanel{

    private JComboBox<String> dropDownState = null;
    private JButton refreshButton = null;

    FilterPanel(){
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        dropDownState = new JComboBox<String>();
        refreshButton = new JButton("Refresh");

        add(dropDownState);
        add(Box.createHorizontalGlue());
        add(refreshButton);
        repaint();
        setVisible(true);

    }

}
