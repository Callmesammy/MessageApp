
package components;

import java.awt.Color;


public class chat_right extends javax.swing.JLayeredPane {

   
    public chat_right() {
        initComponents();
        chat_item.setOpaque(false);
        chat_item.setBackground(new Color(109, 209, 252 ));
    }

  public void setText(String text){
      chat_item.setText(text);
      chat_item.setTime("1:30 PM");
      chat_item.seen();
    
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat_item = new components.chat_item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(chat_item);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.chat_item chat_item;
    // End of variables declaration//GEN-END:variables
}
