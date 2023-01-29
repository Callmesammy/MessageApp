
package swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

/**
 *
 * @author HP
 */
public class pictureBox extends JLayeredPane{

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }

    private Icon image;
    
    @Override
    protected void paintComponent(Graphics g) {
        if (image != null) {
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            Rectangle rec = getAutoSize(image);
            g2.drawImage(toImage(image), rec.x, rec.y, rec.width, rec.height,null);
            
        }
        super.paintComponent(g);
    }
    
      private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
          if (w>image.getIconWidth()) {
              w = image.getIconWidth();
          }
          if (h>image.getIconHeight()) {
              h = image.getIconHeight();
          }
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.min(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = getWidth()/2-(width/2);
        int y = getHeight()/2-(height/2);
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }

}
    
    

