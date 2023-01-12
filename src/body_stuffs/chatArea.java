
package body_stuffs;

/**
 *
 * @author HP
 */
public class chatArea extends javax.swing.JPanel {


    public chatArea(String text) {
        initComponents();
        strngText.setEditable(false);
        strngText.setText(text);
    }
    
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        strngText = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jScrollPane1.setViewportView(strngText);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private swing.JIMSendTextPane strngText;
    // End of variables declaration//GEN-END:variables
}
