
package swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;



public class button extends JButton{

    /**
     * @return the iconselect
     */
    public Icon getIconselect() {
        return iconselect;
    }

    /**
     * @param iconselect the iconselect to set
     */
    public void setIconselect(Icon iconselect) {
        this.iconselect = iconselect;
    }

    /**
     * @return the icon2
     */
    public Icon getIcon2() {
        return icon2;
    }

    /**
     * @param icon2 the icon2 to set
     */
    public void setIcon2(Icon icon2) {
        this.icon2 = icon2;
    }
    public button(Icon iconselect, Icon icon2) {
        this.iconselect = iconselect;
        this.icon2 = icon2;
    }

    private Icon iconselect;
    private Icon icon2;


     
    public button() {
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
    }

    @Override
    public void setSelected(boolean bn) {
        super.setSelected(bn); 
        if (bn) {
            setIcon(icon2);
        }else{
            setIcon(iconselect);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.red);
    }
    
    
    
}
