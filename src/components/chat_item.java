
package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;


public class chat_item extends javax.swing.JPanel {

    private JLabel label;
 
    public chat_item() {
        initComponents();
        chat_item.setEditable(false);
        chat_item.setOpaque(false);
        chat_item.setBackground(new Color(0,0,0,0));
        
    }

    public void setProfile (String button){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
         JButton but = new JButton(button);
        but.setContentAreaFilled(false);
        but.setBorder(new EmptyBorder(10,5,0,5));
        but.setForeground(new Color(21,152,221));
        but.setFont(new Font("sansserif", 1,12));
        but.setCursor(new Cursor(Cursor.HAND_CURSOR));
        chat_item.setBorder(new EmptyBorder(0,10,5,10));
        layer.setBorder(new EmptyBorder(0,5,10,5));
        layer.add(but);
        add(layer, 0);
    }
    public void setText (String text){
        chat_item.setText(text);
    }
      public void hideText (String text){
        chat_item.setVisible(false);
    }
    
    public void setImage (boolean right, Icon... image){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(right? FlowLayout.RIGHT : FlowLayout.LEFT));
        layer.setBorder(new EmptyBorder(0,5,0,5));
        chat_image imagee = new chat_image(right);
        imagee.setBorder(new EmptyBorder(0,5,0,10));
        imagee.setImage(image);
        layer.add(imagee);
        add(layer);
        
        
    }
    public void setTime(String time){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        layer.setBorder(new EmptyBorder(0,5,5,5));
        label = new JLabel(time);
        label.setForeground(new Color(93, 93, 93));
        label.setHorizontalTextPosition(JLabel.LEFT);
        layer.add(label);
        add(layer);
    }
    

    public void sent(){
        if (label != null) {
            label.setIcon(new ImageIcon(getClass().getResource("/message/pics/tick1.png")));
        }
    }
    
        public void seen(){
        if (label != null) {
            label.setIcon(new ImageIcon(getClass().getResource("/message/pics/dtick.png")));
        }
    }
    
  
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 17, 17);
        super.paintComponent(g);
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat_item = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        chat_item.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        chat_item.setSelectionColor(new java.awt.Color(161, 208, 252));
        add(chat_item);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.JIMSendTextPane chat_item;
    // End of variables declaration//GEN-END:variables
}
