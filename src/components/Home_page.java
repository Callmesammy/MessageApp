
package components;

import net.miginfocom.swing.MigLayout;


public class Home_page extends javax.swing.JLayeredPane {

    /**
     * Creates new form Home_page
     */
    public Home_page() {
        initComponents();
        init();
    }
    
    private void init(){
        setLayout(new MigLayout("fillx, filly", "0[180!]5[fill, 100%]5[180!]5", "0[fill]0"));
        this.add(new menu_left());
        this.add(new menu_chat());
        this.add(new menu_right());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(238, 238, 238));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
