
package messageap;


import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import swings.ComponentResizer;


public class Main extends javax.swing.JFrame {

   
    public Main() {
        initComponents();
        ComponentResizer resize = new ComponentResizer();
        resize.registerComponent(this);
        resize.setMinimumSize(new Dimension(500,200));
        resize.setMaximumSize(getToolkit().getScreenSize());
        resize.getSnapSize();
        setIconImage(new ImageIcon(getClass().getResource("/image/pics/img.png")).getImage());
      
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bck = new javax.swing.JPanel();
        Sub = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bck.setBackground(new java.awt.Color(215, 213, 213));

        Sub.setBackground(new java.awt.Color(12, 12, 12));
        Sub.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                SubMouseDragged(evt);
            }
        });
        Sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SubLayout = new javax.swing.GroupLayout(Sub);
        Sub.setLayout(SubLayout);
        SubLayout.setHorizontalGroup(
            SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        SubLayout.setVerticalGroup(
            SubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout bckLayout = new javax.swing.GroupLayout(bck);
        bck.setLayout(bckLayout);
        bckLayout.setHorizontalGroup(
            bckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );
        bckLayout.setVerticalGroup(
            bckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckLayout.createSequentialGroup()
                .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Main(JPanel Sub, JPanel bck, JLayeredPane jLayeredPane1) throws HeadlessException {
        this.Sub = Sub;
        this.bck = bck;
        this.jLayeredPane1 = jLayeredPane1;
    }

    private int pX;
    private int pY;
    private void SubMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubMousePressed
           pX = evt.getX();
           pY = evt.getY();
    }//GEN-LAST:event_SubMousePressed

    private void SubMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubMouseDragged
         this.setLocation(this.getLocation().x + evt.getX() - pX,
         this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_SubMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sub;
    private javax.swing.JPanel bck;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
