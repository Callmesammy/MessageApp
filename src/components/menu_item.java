package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author HP
 */
public class menu_item extends javax.swing.JPanel {

    /**
     * Creates new form menu_item
     */
    public menu_item(String text) {
        initComponents();
        enterText.setText(text);
        setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        init();
    }
    
    private void init(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(222, 224, 225));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(238,238,238));
            }
            
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new swing.ImageAvatar();
        enterText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));

        imageAvatar1.setAutoscrolls(true);
        imageAvatar1.setBorderColor(new java.awt.Color(255, 51, 255));
        imageAvatar1.setBorderSize(1);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/message/pics/US.png"))); // NOI18N

        enterText.setText("text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(enterText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterText, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterText;
    private swing.ImageAvatar imageAvatar1;
    // End of variables declaration//GEN-END:variables
}
