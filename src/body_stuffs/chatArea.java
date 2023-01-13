
package body_stuffs;

import java.awt.Color;
import swing.ScrollBar;

/**
 *
 * @author HP
 */
public class chatArea extends javax.swing.JPanel {

   
    public chatArea() {
        initComponents();
    }
    
    public void setText(String name){
        smk.setVerticalScrollBar(new ScrollBar());
        smk.getVerticalScrollBar().setBackground(Color.white);
        menulist.setText(name);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        smk = new javax.swing.JScrollPane();
        menulist = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        smk.setViewportView(menulist);

        add(smk);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.JIMSendTextPane menulist;
    private javax.swing.JScrollPane smk;
    // End of variables declaration//GEN-END:variables
}
