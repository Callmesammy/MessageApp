
package components;

import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import swing.JIMSendTextPane;

/**
 *
 * @author HP
 */
public class chat_bottom extends javax.swing.JPanel {

    /**
     * Creates new form chat_bottom
     */
    public chat_bottom() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx, filly", "", "[fill]"));
        JScrollPane scroll = new JScrollPane();
        JIMSendTextPane txt = new JIMSendTextPane();
        scroll.setViewportView(txt);
        add(scroll, "w 100%");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(89, 89, 89));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
