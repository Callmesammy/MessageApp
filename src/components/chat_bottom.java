
package components;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import swing.JIMSendTextPane;
import swing.ScrollBar;

/**
 *
 * @author HP
 */
public class chat_bottom extends javax.swing.JPanel {

    /**
     * Creates new form chat_bottom
     */
    public chat_bottom() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx, filly", "0[]0", "[]"));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                refreash();
            }
            
        });
        scroll.setViewportView(txt);
        ScrollBar sb = new ScrollBar();
        scroll.setVerticalScrollBar(sb);
        add(scroll, "w 100%");

    }
  
    private void refreash(){
        revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(89, 89, 89));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
