/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import oracle.net.aso.s;

/**
 *
 * @author shubham
 */
public class movielistpanel extends javax.swing.JPanel {

    /**
     * Creates new form movielistpanel
     */
    public movielistpanel() {
        initComponents();
        filltable();
        
    }
    
    public void filltable()  {
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
          } catch(Exception e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
          }
          try {
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
                Statement stmt = conn.createStatement();
                
                String query = "Select id,name,dt,prime,nonprime,seatpref,director,star1,star2 from movieTable";
                // query = query + "'" + s + "'";
                System.out.println(query);
                
                ResultSet rs = stmt.executeQuery(query);
                 DefaultTableModel model = new DefaultTableModel(
                    new Object [][] {},
                    new String [] {" Movie Id ", "Movie Name", "Date", "Prime","Non Prime", "Seat pref", "director", "star1", "star2"}
                    ) {
                    boolean[] canEdit = new boolean [] {false, false, false, false, false, false, false, false, false};
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                    }
                    };
                    jTable1.setModel(model);
                    
                   while(rs.next()) {
                    model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
                    }  
              //     jTable1.setValueAt(rs.getInt(1), 2, 1);
    
            //}   //catch (IOException ex) {
                  //  Logger.getLogger(loginframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException e) {
                    System.out.println("Cannot Connect");
            }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jLabel1.setText("All Movies ");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Movie Id", "Movie Name ", "Date ", "Non Prime", "Prime", "Class"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}