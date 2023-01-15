
package components;

import java.awt.Color;


public class chat_title extends javax.swing.JPanel {

    
    public chat_title() {
        initComponents();
    }

 public void addUsername (String nm){
     name.setText(nm);
 }
 
 public void addStatuse (){
     status.setForeground(new Color(40,239,105));
     status.setText("Active Now");
 }
 
 public void addstatusetex(String stat){
     status.setText(stat);
     status.setForeground(new Color(40,239,105));
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        name = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 220, 220));

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1));

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setText("Callmesammy");
        jLayeredPane1.add(name);

        status.setBackground(new java.awt.Color(109, 198, 245));
        status.setForeground(new java.awt.Color(20, 197, 78));
        status.setText("Active Now");
        jLayeredPane1.add(status);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
