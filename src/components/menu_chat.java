
package components;

import net.miginfocom.swing.MigLayout;


public class menu_chat extends javax.swing.JPanel {

    public menu_chat() {
        initComponents();
        init();
    }

    private void init (){
        setLayout(new MigLayout("fillx","0[fill]0","0[]1[100%,bottom]0[shrink]"));
        chat_title title = new chat_title();
        chat_body body = new chat_body();
        chat_bottom bottom = new chat_bottom();
        add(title, "wrap");
        add(body, "wrap");
        add(bottom, "h 50");
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
