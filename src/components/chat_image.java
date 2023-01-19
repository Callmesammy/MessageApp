
package components;

import events.EventHandler;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import swing.pictureBox;


public class chat_image extends javax.swing.JLayeredPane {

  
    public chat_image(boolean right) {
        initComponents();
        setLayout(new MigLayout("", "0[" +(right ? "right" : "left")+"]0", "2[]2"));
    }

    public void setImage (Icon... images){
        for(Icon image: images){
            pictureBox pic = new pictureBox();
            pic.setPreferredSize(getAutoSize(image, 200, 200));
            pic.setImage(image);
            addImage(pic, image);
            add(pic, "wrap");
          
        }
    }
    
    public void addImage(Component com, Icon imag){
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    EventHandler.gEventHandler().getEvent().viewImage(imag);
                    
                }
            }
        
        });
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
