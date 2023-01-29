
package components;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

public class chat_body extends javax.swing.JPanel {

  
    public chat_body() {
        initComponents();
        init();
        left_text("Texts lets you send and receive messages from all major messaging platforms ", "James", new ImageIcon(getClass().getResource("/message/pics/cv.jpg")));
        left_text("Texts lets you send and receive messages from all major messaging platformsTexts lets you send and receive messages from all major messaging platforms", "George", new ImageIcon(getClass().getResource("/message/pics/dog.jpg")),new ImageIcon(getClass().getResource("/message/pics/dog.jpg")));
        right_text("Hello");
        addDate("15/01/2023");
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
         left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.", "Peace");
        right_text("Hello");
          addDate("16/01/2023");
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn."); 
        left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.", "Sammy");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.", "Dayo");
        right_text("Hello");
          addDate("18/02/2023");
      
    
    }
    
    private void init(){
        panel.setLayout(new MigLayout("fillx"));
        smk.setVerticalScrollBar(new ScrollBar());
        smk.getVerticalScrollBar().setBackground(Color.WHITE);
        
    }
    private void left_text(String text, String txt, Icon... image){
        chat_left_profile chat = new chat_left_profile();
        chat.setImage(image);
        chat.setTime();
        chat.setProfile(txt);
        chat.setText(text);
        panel.add(chat, "wrap, w al ::65%");
        panel.repaint();
        panel.revalidate();
    }
    
    public void addDate(String txt){
        Date adddate = new Date();
        adddate.addDate(txt);
        panel.add(adddate, "wrap, center ");
        panel.repaint();
        panel.revalidate();
        
    }
    
       private void right_text (String text){
        chat_right chats = new chat_right();
               chats.setTime();
        chats.setText(text);
        panel.add(chats, "wrap, right, w al ::70%");
        panel.repaint();
        panel.revalidate();
    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        smk = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        smk.setBorder(null);
        smk.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        smk.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(smk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(smk)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane smk;
    // End of variables declaration//GEN-END:variables
}
