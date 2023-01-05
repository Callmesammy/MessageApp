
package Components;

import net.miginfocom.swing.MigLayout;


public class Home extends javax.swing.JLayeredPane {

 private MigLayout layout;
    public Home() {
        initComponents();
        init();
    }
    
    private void init(){
        layout = new MigLayout("inset 0");
         setLayout(new MigLayout("fillx, filly", "0[180!]5[fill, 80%]5[180!]5", "0[fill]0"));
         this.add(new left());
         this.add(new Chat());
         this.add(new right());
    }

    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
