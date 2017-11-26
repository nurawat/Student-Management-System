/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author shubham
 */
public class helppANEL extends javax.swing.JPanel {

    /**
     * Creates new form helppANEL
     */
    ImageIcon bg;
    Image img;
    
    public helppANEL() {
        initComponents();
        bg = new ImageIcon("helpbg.jpeg");
        img = bg.getImage();
        
        Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
    }
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D gg = (Graphics2D) g;
    gg.drawImage(img, 0, 0, this);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contact Us");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("query@shacinemas.com");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 180, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("help@shacinemas.com");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 180, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/180.gif"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 100, 80));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
