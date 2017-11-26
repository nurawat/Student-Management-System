/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shubham
 */
public class bookingpanel extends javax.swing.JPanel {

   ImageIcon bg;
    Image img;
    
    public bookingpanel() throws SQLException {
        initComponents();
        
        
        bg = new ImageIcon("BookingBg.jpg");
        img = bg.getImage();
        
        Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
    

       
        boolean flag = false;
        String query;
        ResultSet rs;
        ImageIcon im;
        Statement stmt = null;
      //  if(globalclass.imm != null){
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
          } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
          }
          try {
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
                 stmt = conn.createStatement();            
               // if (flag) {
             //            this.setVisible(false);
             //            new homepage().setVisible(true);
             //   }
                 
         query = "Select id, name, director, star1, star2, img  from movieTable";
         rs = stmt.executeQuery(query);
         
         while (rs.next()) {
             if (rs.getInt(1) == 1) {
                im = new ImageIcon(rs.getBytes(6)); 
                jButton1.setIcon(im);
                jLabel1.setText(rs.getString(2));
                jLabel12.setText(rs.getString(3));
                jLabel8.setText(rs.getString(4));
                jLabel9.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 2) {
                 im = new ImageIcon(rs.getBytes(6)); 
                jButton2.setIcon(im);
                jLabel2.setText(rs.getString(2));
                jLabel15.setText(rs.getString(3));
                jLabel16.setText(rs.getString(4));
                jLabel17.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 3) {
                  im = new ImageIcon(rs.getBytes(6)); 
                jButton4.setIcon(im);
                jLabel4.setText(rs.getString(2));
                jLabel28.setText(rs.getString(3));
                jLabel24.setText(rs.getString(4));
                jLabel25.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 4) {
                   im = new ImageIcon(rs.getBytes(6)); 
                jButton6.setIcon(im);
                jLabel6.setText(rs.getString(2));
                jLabel39.setText(rs.getString(3));
                jLabel35.setText(rs.getString(4));
                jLabel36.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 5) {
                  im = new ImageIcon(rs.getBytes(6)); 
                jButton5.setIcon(im);
                jLabel5.setText(rs.getString(2));
                jLabel33.setText(rs.getString(3));
                jLabel30.setText(rs.getString(4));
                jLabel31.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 6) {
                 im = new ImageIcon(rs.getBytes(6)); 
                jButton3.setIcon(im);
                jLabel3.setText(rs.getString(2));
                jLabel22.setText(rs.getString(3));
                jLabel20.setText(rs.getString(4));
                jLabel21.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 7) {
                   im = new ImageIcon(rs.getBytes(6)); 
                jButton10.setIcon(im);
                jLabel43.setText(rs.getString(2));
                jLabel65.setText(rs.getString(3));
                jLabel62.setText(rs.getString(4));
                jLabel63.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 8) {
                   im = new ImageIcon(rs.getBytes(6)); 
                jButton10.setIcon(im);
                jLabel43.setText(rs.getString(2));
                jLabel65.setText(rs.getString(3));
                jLabel62.setText(rs.getString(4));
                jLabel63.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 9) {
                  im = new ImageIcon(rs.getBytes(6)); 
                jButton8.setIcon(im);
                jLabel41.setText(rs.getString(2));
                jLabel56.setText(rs.getString(3));
                jLabel52.setText(rs.getString(4));
                jLabel53.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 10) {
                 im = new ImageIcon(rs.getBytes(6)); 
                 jButton11.setIcon(im);
                jLabel44.setText(rs.getString(2));
                jLabel70.setText(rs.getString(3));
                jLabel67.setText(rs.getString(4));
                jLabel68.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 11) {
                 im = new ImageIcon(rs.getBytes(6)); 
                jButton9.setIcon(im);
                jLabel42.setText(rs.getString(2));
                jLabel60.setText(rs.getString(3));
                jLabel57.setText(rs.getString(4));
                jLabel55.setText(rs.getString(5));
             }
             
             if (rs.getInt(1) == 12) {
                im = new ImageIcon(rs.getBytes(6)); 
                jButton12.setIcon(im);
                jLabel45.setText(rs.getString(2));
                jLabel75.setText(rs.getString(3));
                jLabel72.setText(rs.getString(4));
                jLabel73.setText(rs.getString(5));
             }
         }
         
                 
      
                } catch (SQLException e) {
                    System.out.println("Cannot Connect");
            }
        
        
      //  if(globalclass.s2 == 1)
        
        
      /*  if(true){
            query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 1";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton1.setIcon(im);
                jLabel1.setText(rs.getString(2));
                jLabel12.setText(rs.getString(3));
                jLabel8.setText(rs.getString(4));
                jLabel9.setText(rs.getString(5));
              //  globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
        
       // if(globalclass.s2 == 2) {
      if(true){
            query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 2";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton2.setIcon(im);
                jLabel2.setText(rs.getString(2));
                jLabel15.setText(rs.getString(3));
                jLabel16.setText(rs.getString(4));
                jLabel17.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
        
        // if(globalclass.s2 == 3) {
        if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 3";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton4.setIcon(im);
                jLabel4.setText(rs.getString(2));
                jLabel28.setText(rs.getString(3));
                jLabel24.setText(rs.getString(4));
                jLabel25.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
         
  //        if(globalclass.s2 == 4) {
         if(true){
            query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 4";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton6.setIcon(im);
                jLabel6.setText(rs.getString(2));
                jLabel39.setText(rs.getString(3));
                jLabel35.setText(rs.getString(4));
                jLabel36.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
          
       //  if(globalclass.s2 == 5) {
          if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 5";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton5.setIcon(im);
                jLabel5.setText(rs.getString(2));
                jLabel33.setText(rs.getString(3));
                jLabel30.setText(rs.getString(4));
                jLabel31.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
         
        //  if(globalclass.s2 == 6) {
           if(true){
            query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 6";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton3.setIcon(im);
                jLabel3.setText(rs.getString(2));
                jLabel22.setText(rs.getString(3));
                jLabel20.setText(rs.getString(4));
                jLabel21.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
        
      //   if(globalclass.s2 == 7) {
            if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 7";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton7.setIcon(im);
                jLabel40.setText(rs.getString(2));
                jLabel50.setText(rs.getString(3));
                jLabel47.setText(rs.getString(4));
                jLabel48.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
         
     //    if(globalclass.s2 == 8) {
             if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 8";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton10.setIcon(im);
                jLabel43.setText(rs.getString(2));
                jLabel65.setText(rs.getString(3));
                jLabel62.setText(rs.getString(4));
                jLabel63.setText(rs.getString(5));
             //   globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
         
       //   if(globalclass.s2 == 9) {
              if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 9";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton8.setIcon(im);
                jLabel41.setText(rs.getString(2));
                jLabel56.setText(rs.getString(3));
                jLabel52.setText(rs.getString(4));
                jLabel53.setText(rs.getString(5));
              //  globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
          
       //    if(globalclass.s2 == 10) {
               if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 10";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton11.setIcon(im);
                jLabel44.setText(rs.getString(2));
                jLabel70.setText(rs.getString(3));
                jLabel67.setText(rs.getString(4));
                jLabel68.setText(rs.getString(5));
            //    globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
           
     //   if(globalclass.s2 == 11) {
                if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 11";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton9.setIcon(im);
                jLabel42.setText(rs.getString(2));
                jLabel60.setText(rs.getString(3));
                jLabel57.setText(rs.getString(4));
                jLabel55.setText(rs.getString(5));
              //  globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }
            
     //    if(globalclass.s2 == 12) {
                 if(true){
             query = "Select img, name, director, star1, star2, bgimg from movieTable where id = 12";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jButton12.setIcon(im);
                jLabel45.setText(rs.getString(2));
                jLabel75.setText(rs.getString(3));
                jLabel72.setText(rs.getString(4));
                jLabel73.setText(rs.getString(5));
                //globalclass.imm = new ImageIcon(rs.getBytes(6));
            }
        }*/
        
  //  }
    }
       public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D gg = (Graphics2D) g;
    gg.drawImage(img, 0, 0, this);
}
   /* @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D gg = (Graphics2D) g;
    gg.drawImage(img, 0, 0, this);
}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ime.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 30, 102, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kpc.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 30, 99, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2611.jpg"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 99, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sb.jpg"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 221, 102, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21.jpg"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 99, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 95, 142));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("I ME AUR MAIN (HINDI)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KAI PO CHE (HINDI)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 6, 133, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("26/11 (HINDI)");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 99, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SAHEB BIWI & GANGSTER");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("21 & OVER (ENGLISH)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MERE DAD KI MARUTI ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stars :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 38, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("John Abrahim");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 58, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Prachi Desai");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 78, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Director:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 130, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kapil Sharma");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 148, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Stars :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Director :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Abhishek Kapoor");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ajay Jadeja");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Raj Yadav");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Stars :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Director :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nana Patekar");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("S Jaiswal");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ram Gopal Verma");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Stars :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 245, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Jimmy Shergill");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 265, -1, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mahi Gill");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 285, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Director  : ");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 337, -1, -1));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Tigmanshu");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 357, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Stars :");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Miles Teller Justin");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Chon");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Directors :");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Scott Moore");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Stars :");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 237, -1, -1));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Ram Kapoor");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 280, -1, -1));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Saquib");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 300, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Directors :");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 332, -1, -1));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Ashima Chibber");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 357, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rangrezz.jpg"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 149));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3g.jpg"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 100, 149));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/im3.jpg"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 100, 149));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atma.jpg"))); // NOI18N
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setOpaque(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 97, 149));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ektd.jpg"))); // NOI18N
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 97, 149));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chas.jpg"))); // NOI18N
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 440, 97, 149));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Rangreez");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("3g");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("iron man 3");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("aatma");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("e k thi dayan");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, -1, -1));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("chasme baddoor");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 420, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Stars : ");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, -1, -1));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("jacky");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, -1, -1));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("priya");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, -1, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Director : ");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, -1, -1));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("priyadarshan ");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Stars : ");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, -1, -1));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("neel nitin mukesh");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, -1, -1));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("sonal chauhan");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Director : ");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, -1, -1));

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("guy pearce");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, -1));

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("sheershak");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, -1, -1));

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("robert downey");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Stars : ");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Director : ");
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, -1, -1));

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("shane black");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Stars : ");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, -1, -1));

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("bipasha basu");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, -1, -1));

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("nawazuddin");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Director : ");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 130, -1, -1));

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("suparn");
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, -1, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Stars : ");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 230, -1, -1));

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("emraan hashmi");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 250, -1, -1));

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("huma qureshi");
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 270, -1, -1));

        jLabel69.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Director : ");
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 320, -1, -1));

        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("kannan ");
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 340, -1, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Stars : ");
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 460, -1, -1));

        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("ali zafar");
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 480, -1, -1));

        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("d sharma");
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 500, -1, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Director :");
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 550, -1, -1));

        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("jLabel75");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 570, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/successfully.gif"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 220, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Upcoming.gif"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, 220, 30));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton.png"))); // NOI18N
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       // this.setVisible(false);
       // this.getTopLevelAncestor().setVisible(false);
        //   globalclass.s1 = "Mere Dad Ki Maruti";
        globalclass.s2 = 4;
     //   globalclass.def = new ImageIcon("madd.jpg");
      //  globalclass.deficon = new ImageIcon("dmm.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "mere dad ki maruti";
            }
            
            query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("madd.jpg");
                globalclass.deficon = new ImageIcon("dmm.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

      if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
 // this.getTopLevelAncestor().setVisible(false);
        //   globalclass.s1 = "21 & Over";
        globalclass.s2 = 5;
       // globalclass.def = new ImageIcon("noo.jpg");
      //  globalclass.deficon = new ImageIcon("21.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "21 and over";
            }
            
             query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("noo.jpg");
                globalclass.deficon = new ImageIcon("21.jpg");
            }
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        this.setVisible(false);
  
     //   this.getTopLevelAncestor().setVisible(false);
        //   globalclass.s1 = "Saheb Biwi & Gangster";
        globalclass.s2 = 3;
      //  globalclass.def = new ImageIcon("sahebb.jpg");
       // globalclass.deficon = new ImageIcon("sb.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "saheb biwi and gangster";
            }
            
             query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("sahebb.jpg");
                globalclass.deficon = new ImageIcon("sb.jpg");
            }
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
    //    this.getTopLevelAncestor().setVisible(false);
       // this.setVisible(false);
        //   globalclass.s1 = "26/11";
        globalclass.s2 = 6;
     //   globalclass.def = new ImageIcon("atak.jpg");
   //     globalclass.deficon = new ImageIcon("2611.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "26/11";
            }
              query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("atak.jpg");
                globalclass.deficon = new ImageIcon("2611.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        globalclass.s2 = 2;
      //  globalclass.def = new ImageIcon("kaii.jpg");
   //     globalclass.deficon = new ImageIcon("kpc.jpg");
     //   this.getTopLevelAncestor().setVisible(false);
       // this.setVisible(false);
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "kai po che";
            }
            
             query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("kaii.jpg");
                globalclass.deficon = new ImageIcon("kpc.jpg");
            }
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

      if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        //this.setVisible(false);
        // globalclass.s1 = "I Me Aur Main";
        
        
  //      globalclass.def = new ImageIcon("imm.jpg");
        globalclass.s2 = 1;
     //   globalclass.deficon = new ImageIcon("ime.jpg");

        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "i me aur mai";
            }
            
            System.out.println(globalclass.s1);
            
              query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("imm.jpg");
                globalclass.deficon = new ImageIcon("ime.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

        if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
      //  this.setVisible(false);
       //this.getTopLevelAncestor().setVisible(false);
        //   globalclass.s1 = "26/11";
        globalclass.s2 = 7;
     //   globalclass.def = new ImageIcon("rang.jpg");
     //   globalclass.deficon = new ImageIcon("Rangrezz.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select unique name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "rangrez";
            }
            
            
             query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("rang.jpg");
                globalclass.deficon = new ImageIcon("Rangrezz.jpg");
            }
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
       // this.getTopLevelAncestor().setVisible(false);
        // globalclass.s1 = "I Me Aur Main";
        globalclass.s2 = 8;
     //   globalclass.def = new ImageIcon("atm.jpg");
    //    globalclass.deficon = new ImageIcon("atma.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "aatma";
            }
            System.out.println(globalclass.s1);
            
            query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("atm.jpg");
                globalclass.deficon = new ImageIcon("atma.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
      //  this.getTopLevelAncestor().setVisible(false);
        // globalclass.s1 = "I Me Aur Main";
        globalclass.s2 = 11;
   //    globalclass.def = new ImageIcon("ire.jpg");
     //   globalclass.deficon = new ImageIcon("im3.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "iron man";
                
            }
            System.out.println(globalclass.s1);
             query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("ire.jpg");
                globalclass.deficon = new ImageIcon("im3.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
      //  this.setVisible(false);
 //       // globalclass.s1 = "I Me Aur Main";
//   this.getTopLevelAncestor().setVisible(false);
        globalclass.s2 = 10;
  //      globalclass.def = new ImageIcon("daiin.jpg");
  //      globalclass.deficon = new ImageIcon("ektd.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "ek thi daiyan";
            }
            System.out.println(globalclass.s1);
            
              query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("daiin.jpg");
                globalclass.deficon = new ImageIcon("ektd.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
      //  this.setVisible(false);
       // this.getTopLevelAncestor().setVisible(false);
        // globalclass.s1 = "I Me Aur Main";
        globalclass.s2 = 12;
    //    globalclass.def = new ImageIcon("chashmu.jpg");
    //    globalclass.deficon = new ImageIcon("chas.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
                //System.out.println("YAHA HU MAI TO harry");
            } else {
                globalclass.lol = true;
                globalclass.s1 = "chashme baddur";
            }
            System.out.println(globalclass.s1);
            
            query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("chashmu.jpg");
                globalclass.deficon = new ImageIcon("chas.jpg");
            }
            
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

        if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
     //    this.setVisible(false);
      // this.getTopLevelAncestor().setVisible(false);
        // globalclass.s1 = "I Me Aur Main";
        globalclass.s2 = 9;
  //     globalclass.def = new ImageIcon("hot.jpg");
   //     globalclass.deficon = new ImageIcon("3g.jpg");
        
        if (globalclass.username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Login/Signup To Book Tickets");
            this.getTopLevelAncestor().setVisible(false);
            new loginframe().setVisible(true);
        } else {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement stmt = conn.createStatement();

            String query = "Select name from movieTable where id = " + globalclass.s2;
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                globalclass.s1 = rs.getString(1);
            } else {
                globalclass.lol = true;
                globalclass.s1 = "3g";
            }
            System.out.println(globalclass.s1);
            
             query = "Select bgimg, img from movieTable where id = " + globalclass.s2;
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                globalclass.imm = new ImageIcon(rs.getBytes(1));
                globalclass.deficon = new ImageIcon(rs.getBytes(2));
            } else {
                globalclass.imm = new ImageIcon("hot.jpg");
                globalclass.deficon = new ImageIcon("3g.jpg");
            }
            boolean flag = false;

        } catch (SQLException e) {
            System.out.println("Cannot Connect");
        }

       if (!globalclass.username.equals("")) {
            this.getTopLevelAncestor().setVisible(false);
            new moviedetails().setVisible(true);
        }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        this.getTopLevelAncestor().setVisible(false);
        //this.setVisible(false);
        new homepage().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
