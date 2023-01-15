
package components;

import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

public class chat_body extends javax.swing.JPanel {

  
    public chat_body() {
        initComponents();
        init();
        left_text("Callmesammy");
        left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
         left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn."); left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn."); left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn."); left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn."); left_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
        right_text("Hello");
        
        right_text("Texts lets you send and receive messages from all major messaging platforms:"
                + " iMessage. WhatsApp. Telegram. Signal. Messenger. Twitter. Instagram. LinkedIn.");
    }
    
    private void init(){
        panel.setLayout(new MigLayout("fillx"));
        smk.setVerticalScrollBar(new ScrollBar());
        smk.getVerticalScrollBar().setBackground(Color.WHITE);
        
    }
    private void left_text(String text){
        chat_left chat = new chat_left();
        chat.setText(text);
        panel.add(chat, "wrap, w al ::70%");
        panel.repaint();
        panel.revalidate();
    }
    
       private void right_text (String text){
        chat_right chats = new chat_right();
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
