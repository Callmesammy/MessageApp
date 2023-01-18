
package components;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.Icon;
import net.miginfocom.swing.MigLayout;
import swing.pictureBox;


public class chat_image extends javax.swing.JLayeredPane {

    /**
     * Creates new form chat_image
     */
    public chat_image(boolean tight) {
        initComponents();
        setLayout(new MigLayout("", "0[("+(tight ? "right" : "left")+"]0", "2[]2"));
    }

    public void setImage (Icon... image){
        for(Icon images: image){
            pictureBox pic = new pictureBox();
            pic.setPreferredSize(getAutoSize(images, 200, 200));
            pic.setImage(images);
            add(pic, "wrap");
        }
    }
    
    
       private Dimension getAutoSize(Icon image, int w, int h) {
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.min(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        return new Dimension(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
