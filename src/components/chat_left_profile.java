
package components;

import java.awt.Color;


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
      chat_item1.setText(text);
      chat_item1.setTime("10:15 AM");
      chat_item1.sent();
     
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat_item1 = new components.chat_item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(chat_item1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.chat_item chat_item1;
    // End of variables declaration//GEN-END:variables
}
