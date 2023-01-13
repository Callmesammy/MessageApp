
package body_stuffs;


public class chat_left extends javax.swing.JLayeredPane {

    
    public chat_left() {
        initComponents();
    }

 public void left_text(String name){
     chatArea1.setText(name);
     
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chatArea1 = new body_stuffs.chatArea();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        add(chatArea1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private body_stuffs.chatArea chatArea1;
    // End of variables declaration//GEN-END:variables
}
