
package components;

import java.awt.Color;
import javax.swing.Icon;


public class chat_right extends javax.swing.JLayeredPane {

   
    public chat_right() {
        initComponents();
        chat_item.setOpaque(false);
        chat_item.setBackground(new Color(109, 209, 252 ));
    }


  public void setText(String text){
      if (chat_item.equals(" ")) {
          chat_item.hideText(text);
      }else{                                                              
          chat_item.setText(text);
      }
      
      chat_item.seen();
     
  }
  public void setImage (Icon... image){
      chat_item.setImage(true, image);
  }
  public void setTime(){
      chat_item.setTime("10:15 AM");
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
