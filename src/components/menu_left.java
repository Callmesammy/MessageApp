
package components;

/**
 *
 * @author HP
 */
public class menu_left extends javax.swing.JPanel {

    
    public menu_left() {
        initComponents();
        init();
    }
    
    private void init(){
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        user = new swing.button();
        call = new swing.button();
        message = new swing.button();
        menulist = new javax.swing.JLayeredPane();

        jLayeredPane1.setBackground(new java.awt.Color(171, 171, 171));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new javax.swing.BoxLayout(jLayeredPane1, javax.swing.BoxLayout.LINE_AXIS));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message/pics/user.png"))); // NOI18N
        user.setIcon2(new javax.swing.ImageIcon(getClass().getResource("/message/pics/user.png"))); // NOI18N
        user.setIconselect(new javax.swing.ImageIcon(getClass().getResource("/message/pics/user2.png"))); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jLayeredPane1.add(user);

        call.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message/pics/call.png"))); // NOI18N
        call.setIcon2(new javax.swing.ImageIcon(getClass().getResource("/message/pics/call.png"))); // NOI18N
        call.setIconselect(new javax.swing.ImageIcon(getClass().getResource("/message/pics/call2.png"))); // NOI18N
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });
        jLayeredPane1.add(call);

        message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message/pics/message.png"))); // NOI18N
        message.setIcon2(new javax.swing.ImageIcon(getClass().getResource("/message/pics/message.png"))); // NOI18N
        message.setIconselect(new javax.swing.ImageIcon(getClass().getResource("/message/pics/message2.png"))); // NOI18N
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });
        jLayeredPane1.add(message);

        javax.swing.GroupLayout menulistLayout = new javax.swing.GroupLayout(menulist);
        menulist.setLayout(menulistLayout);
        menulistLayout.setHorizontalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menulistLayout.setVerticalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menulist)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menulist)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        if (!call.isSelected()) {
            call.setSelected(true);
            user.setSelected(false);
            message.setSelected(false);
        }
    }//GEN-LAST:event_callActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        if (!user.isSelected()) {
            call.setSelected(false);
            user.setSelected(true);
            message.setSelected(false);
        }
    }//GEN-LAST:event_userActionPerformed

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
         if (!message.isSelected()) {
            call.setSelected(false);
            user.setSelected(false);
            message.setSelected(true);
        }
    }//GEN-LAST:event_messageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.button call;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane menulist;
    private swing.button message;
    private swing.button user;
    // End of variables declaration//GEN-END:variables
}
