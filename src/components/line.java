
package components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class line extends JLabel{

    public line() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor( getForeground());
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
    }
    
}
