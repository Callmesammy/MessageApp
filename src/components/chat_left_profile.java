
package components;

import java.awt.Color;
import javax.swing.Icon;


public class chat_left_profile extends javax.swing.JLayeredPane {

   
    public chat_left_profile() {
        initComponents();
        chat_item1.setOpaque(false);
        chat_item1.setBackground(new Color(225, 225, 225 ));
    }

    public void setProfile (String text){
        chat_item1.setProfile(text);
    }
  public void setText(String text){
      if (chat_item1.equals("")) {
          chat_item1.hideText();
      }else{
          chat_item1.setText(text);
      }
      chat_item1.sent();
     
  }
  public void setImage (Icon... image){
      chat_item1.setImage(false, image);
  }
  public void setTime(){
      chat_item1.setTime("10:15 AM");
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        imageAvatar1 = new swing.ImageAvatar();
        chat_item1 = new components.chat_item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        imageAvatar1.setBorderSize(0);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/message/pics/dog.jpg"))); // NOI18N

        jLayeredPane1.setLayer(imageAvatar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);
        add(chat_item1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.chat_item chat_item1;
    private swing.ImageAvatar imageAvatar1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
