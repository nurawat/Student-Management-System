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
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;
import sun.reflect.generics.tree.CharSignature;

/**
 *
 * @author shubham
 */
public class moviedetailspanel extends javax.swing.JPanel {

    static void filltable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ImageIcon bg;
    Image img;
    private Object jDateChooser1;
    
    public moviedetailspanel() throws SQLException  {
        initComponents();
        
       // if(globalclass.imm == null) {
            //bg = globalclass.def;
            bg = globalclass.imm;
            img = bg.getImage();
            jLabel7.setText(globalclass.s1);
            jLabel8.setIcon(globalclass.deficon);
            
            Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
            setPreferredSize(d);
            setMinimumSize(d);
            setMaximumSize(d);
            setSize(d);
    //    } else {
  /*          bg = globalclass.imm;
        
        
        img = bg.getImage();
        System.out.println(globalclass.s1);
        jLabel7.setText(globalclass.s1);*/
        
    /*    boolean flag = false;
        String query;
        ResultSet rs;
        ImageIcon im;
        Statement stmt = null;
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
          } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
          }
          try {
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
                 stmt = conn.createStatement();
                
               if(globalclass.s2 == 1) {
            query = "Select img from movieTable where id = 1";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
            
            //jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ime.jpg"))); //1.jpeg
            
        }
                             
                if (flag) {
                         this.setVisible(false);
                         new homepage().setVisible(true);
                } 
      
                } catch (SQLException e) {
                    System.out.println("Cannot Connect");
            }
        
        
        
        
        //Dimension 
          d = new Dimension(img.getWidth(null), img.getHeight(null));
        jLabel7.setText(globalclass.s1);
        
        if(globalclass.s2 == 1) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ime.jpg")));
            query = "Select img from movieTable where id = 1";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 2) {
          //  jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sb.jpg")));
           query = "Select img from movieTable where id = 2";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            } 
        }
        if(globalclass.s2 == 3) {
          //  jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21.jpg")));
            query = "Select img from movieTable where id = 3";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 4) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 4";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 5) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kpc.jpg")));
            query = "Select img from movieTable where id = 5";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 6) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2611.jpg")));
            query = "Select img from movieTable where id = 6";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 7) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 7";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 8) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 8";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 9) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 9";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 10) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 10";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 11) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 11";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        if(globalclass.s2 == 12) {
           // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmm.jpg")));
            query = "Select img from movieTable where id = 12";
            System.out.println(query);
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                im = new ImageIcon(rs.getBytes(1)); 
                jLabel8.setIcon(im);
            }
        }
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
   // }*/
  }
    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D gg = (Graphics2D) g;
    gg.drawImage(img, 0, 0, this);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();

        setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Date :");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Show Timings : ");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Seats : ");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Class : ");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:00", "15:00", "18:00", "21:00" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "prime", "non prime" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Ticket Details");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Movie : ");

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("none");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sb.jpg"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Seat Preference : ");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", " ", " " }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forward.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Mode Of Delivery : ");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "By Courier :", "By Window :", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox3, 0, 184, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, 184, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel8))
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

      
       boolean flag;
           
       if (jDateChooser1.getDate() == null) {
           JOptionPane.showMessageDialog(null, "Please Choose a Date");
       } else {
       
       try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
          } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
          }
          try {
                System.out.println("yaha to hu m abhi");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
                Statement stmt = conn.createStatement();
                
                flag = true;
                System.out.println("yaha to hu m");
               
                    Date date = new Date();
                   
                    String query = "Select to_char(sysdate, 'dd-mon-yyyy') from dual";
                    System.out.println(query);
                    ResultSet rs = stmt.executeQuery(query);
                    System.out.println("haris bhai tu badiya h");
                    String today;
                    today = "12-Mar-2013";
                    if (rs.next()) {
                    System.out.println(rs.getObject(1));
                     today = rs.getObject(1).toString().toLowerCase();
                    }
                   
                    System.out.println(today);
                    
                    System.out.println("After date format");
                    date = jDateChooser1.getDate();
                    System.out.println("After date " + date);
                    String sp = jComboBox4.getSelectedItem().toString();
                    System.out.println("After seat pref " + sp);
                    String numseats = jComboBox3.getSelectedItem().toString();
                    System.out.println("After num seats " + numseats);
                    String cls = jComboBox2.getSelectedItem().toString();
                    cls = cls.toLowerCase();
                            
                    System.out.println("class = " + cls);
                    int foo = Integer.parseInt(numseats);
                    
                    System.out.println(foo);
                    String mname = jLabel7.getText();
                    mname = mname.toLowerCase();
                     
                    DateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyyy");
                    String dateString = dateFormat.format(date);
                    
                    //query = "Select * from movieTable where name=" + "'" + mname + "' AND prime >=" + numseats;
                    globalclass.defdate = "15-mar-2013";
                    String s = "lol";
                    if (globalclass.lol == true) {
                        s = globalclass.defdate;
                        
                    } else {
                    query = "Select to_char((Select dt from movieTable where name =";
                    
                    System.out.println("movie name " + mname);
                    
                    if (cls.equals("prime")) {
                        System.out.println("Its prime");
                        query = query + "'" + mname + "' AND seatpref = " + "'" + sp + "' AND prime >= " + numseats + "), 'dd-mon-yyyy') from dual";
                    } else {
                        System.out.println("Its non prime");
                        query = query + "'" + mname + "' AND seatpref = " + "'" + sp + "' AND nonprime >= " + numseats + "), 'dd-mon-yyyy') from dual";
                    }
                    
                    System.out.println(query);
                    
                   
                    
                    rs = stmt.executeQuery(query);
                    System.out.println("IT EXECUTED");
                     DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
                 
                    
                    if(rs.next()) {
                     s = rs.getObject(1).toString().toLowerCase();
                     System.out.println("s = "+ s);
                    System.out.println(dateString);
                    
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry! This number of seats are not available");
                    }
                 }
                    
                    query = "Select to_date('" + s + "', 'dd-mon-yyyy') - to_date('" + dateString + "', 'dd-mon-yyyy') from dual";
                    
                    System.out.println(query);
                    rs = stmt.executeQuery(query);
                    System.out.println(query);
                    flag = true;
                    if (rs.next()) {
                        if (rs.getInt(1) > 0) {
                            flag = false;
                        }
                        
                    }
                    
                    query = "Select to_date('" + dateString + "', 'dd-mon-yyyy') - to_date('" + today + "', 'dd-mon-yyyy') from dual";
                    rs = stmt.executeQuery(query);
                    
                    if (rs.next()) {
                        if (rs.getInt(1) < 3) {
                            flag = false;
                        }
                    }
                    
                    System.out.println(query);
                    query = "Select to_date('" + dateString + "', 'dd-mon-yyyy') - to_date('" + today + "', 'dd-mon-yyyy') from dual";
                    rs = stmt.executeQuery(query);
                    
                    if (rs.next()) {
                        if (rs.getInt(1) > 14) {
                            flag = false;
                        }
                        if (rs.getInt(1) < 2) {
                            flag = false;
                        }
                    }
                    boolean f = false;
                    System.out.println(query);
                    if (flag == false) {
                        JOptionPane.showMessageDialog(null, "Select a valid date");
                    } else {
                       f = true;
                       if (globalclass.lol == true) {
                           if(jComboBox5.getSelectedIndex() == 0) {
                                new addressframe().setVisible(true);
                                this.getTopLevelAncestor().setVisible(false);
                            } else {   
                                    this.getTopLevelAncestor().setVisible(false);
                                    new Carddetails().setVisible(true);
                                  }
        
                          
                       }
                    }
                    globalclass.dte = dateString;
                    globalclass.clss = cls;
                    globalclass.numseats = numseats;
                    
                    if (globalclass.lol == false) {
                    
                          if (cls.equals("prime")) {
                        query = "Select prime from movieTable where name = '" + jLabel7.getText() + "' AND seatpref = '" + sp + "'";
                        System.out.println(query);
                        rs = stmt.executeQuery(query);
                        
                        if (rs.next()) {
                            if (rs.getInt(1) >= Integer.parseInt(numseats)) {
                                query = "Update movieTable set prime = " + (rs.getInt(1) - Integer.parseInt(numseats)) + " where name = '" + jLabel7.getText() + "' AND seatpref = '" + sp + "'";
                                System.out.println(query);   
                                if(f == true) { 
                          //      this.setVisible(false);
                                  if(jComboBox5.getSelectedIndex() == 0) {
                                        new addressframe().setVisible(true);
                                  } else {   
                                    this.getTopLevelAncestor().setVisible(false);
                                    new Carddetails().setVisible(true);
                                  }
                                    
                                } 
                                stmt.executeQuery(query);
                            } else {
                                 JOptionPane.showMessageDialog(null, "Sorry this number of seats are not available");
                            }
                            
                        }
                    } else {
                            query = "Select nonprime from movieTable where name = '" + jLabel7.getText() + "' AND seatpref = '" + sp + "'";
                        System.out.println(query);
                        rs = stmt.executeQuery(query);
                        
                        if (rs.next()) {
                            if (rs.getInt(1) >= Integer.parseInt(numseats)) {
                                query = "Update movieTable set nonprime = " + (rs.getInt(1) - Integer.parseInt(numseats)) + " where name = '" + jLabel7.getText() + "' AND seatpref = '" + sp + "'";
                                System.out.println(query);
                                stmt.executeQuery(query);
                                if(f == true) {
                                    
                                  if(jComboBox5.getSelectedIndex() == 0) {
                                        new addressframe().setVisible(true);
                                  }  else {   
                                    this.getTopLevelAncestor().setVisible(false);
                                    new Carddetails().setVisible(true);
                                  }
                                }
                            } else {
                                 JOptionPane.showMessageDialog(null, "Sorry this number of seats are not available");
                            }
                        }
                        
                      }
                     
          
                    }
              } catch (SQLException e) {
                    System.out.println("Cannot Connect");
            }
       }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        globalclass.s1 = "";
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        globalclass.imm = null;
        globalclass.deficon = null;
        globalclass.lol = false;
      this.getTopLevelAncestor().setVisible(false);
        // this.setVisible(false);
       new booking().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
