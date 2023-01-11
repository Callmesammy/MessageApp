
package components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;


public class menu_left extends javax.swing.JPanel {

    /**
     * Creates new form menu_left
     */
    public menu_left() {
        initComponents();
        init();
        scr.setVerticalScrollBar(new ScrollBar());
       
       
    }
    
    private void init(){
        menulist.setLayout(new MigLayout("fillx", "0[]0", "1[]1"));
                  call();
        }
        private void call(){
            menulist.removeAll();
          for(int i =0; i <20; i++){
          menulist.add(new menu_item("Last calls " +i),"wrap");
         
        }
           status();
        }
           private void message(){
               menulist.removeAll();
          for(int i =0; i <9; i++){
          menulist.add(new menu_item("Enter Message" +i),"wrap");
         
          }
            status();
        }
           private void user(){
               menulist.removeAll();
          for(int i =0; i <11; i++){
          menulist.add(new menu_item("Enter name" +i),"wrap");
          
        }
          status();
    }
           
           private void status(){
               menulist.repaint();
               menulist.revalidate();
           }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLayeredPane();
        call = new swing.button();
        message = new swing.button();
        user = new swing.button();
        scr = new javax.swing.JScrollPane();
        menulist = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(236, 255, 254));
        setOpaque(false);

        heading.setBackground(new java.awt.Color(218, 215, 215));
        heading.setOpaque(true);
        heading.setLayout(new javax.swing.BoxLayout(heading, javax.swing.BoxLayout.LINE_AXIS));

        call.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message/pics/call.png"))); // NOI18N
        call.setIcon1(new javax.swing.ImageIcon(getClass().getResource("/message/pics/call.png"))); // NOI18N
        call.setIcon2(new javax.swing.ImageIcon(getClass().getResource("/message/pics/call2.png"))); // NOI18N
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });
        heading.add(call);

        message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message/pics/message2.png"))); // NOI18N
        message.setIcon1(new javax.swing.ImageIcon(getClass().getResource("/message/pics/message.png"))); // NOI18N
        message.setIcon2(new javax.swing.ImageIcon(getClass().getResource("/message/pics/message2.png"))); // NOI18N
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });
        heading.add(message);

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message/pics/user2.png"))); // NOI18N
        user.setIcon1(new javax.swing.ImageIcon(getClass().getResource("/message/pics/user.png"))); // NOI18N
        user.setIcon2(new javax.swing.ImageIcon(getClass().getResource("/message/pics/user2.png"))); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        heading.add(user);

        scr.setBorder(null);
        scr.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scr.setOpaque(false);

        menulist.setBackground(new java.awt.Color(236, 255, 254));
        menulist.setOpaque(true);
        menulist.setLayout(new java.awt.BorderLayout());
        scr.setViewportView(menulist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
            .addComponent(scr)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scr, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        if (!call.isSelected()) {
            call.setSelected(true);
            message.setSelected(false);
            user.setSelected(false);
              call();
        }
    }//GEN-LAST:event_callActionPerformed

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
           if (!message.isSelected()) {
            call.setSelected(false);
            message.setSelected(true);
            user.setSelected(false);
            message();
           }
    }//GEN-LAST:event_messageActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
           if (!user.isSelected()) {
            call.setSelected(false);
            message.setSelected(false);
            user.setSelected(true);
            user();
           }
    }//GEN-LAST:event_userActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.button call;
    private javax.swing.JLayeredPane heading;
    private javax.swing.JLayeredPane menulist;
    private swing.button message;
    private javax.swing.JScrollPane scr;
    private swing.button user;
    // End of variables declaration//GEN-END:variables
}
