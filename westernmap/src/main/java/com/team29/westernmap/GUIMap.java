/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.team29.westernmap;

import java.awt.Image;
import java.io.IOException;
import java.math.*;
import java.net.URISyntaxException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.http.client.utils.URIBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Tristan
 */
public class GUIMap extends javax.swing.JFrame {

    /**
     * Creates new form GUIMap
     */
    public GUIMap() {
        initComponents();
        FloorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ground Floor", "First Floor", "Second Floor", "Third Floor", "Fourth Floor"}));
        uwoimage.setIcon(new ImageIcon("src/main/java/images/uwologo.png"));
    }
    
    public void displayWeather() throws IOException, InterruptedException{
        Weather weather = new Weather();
        JSONObject info = weather.getWeather();
        String location = (String) info.get("address");
        JSONArray days = (JSONArray) info.get("days");
        JSONObject days2 = (JSONObject) days.get(0);
        BigDecimal tempmin = (BigDecimal) days2.get("tempmin");
        String datetime = (String) days2.get("datetime");
        BigDecimal feelslike = (BigDecimal) days2.get("feelslike");
        BigDecimal tempmax = (BigDecimal) days2.get("tempmax");
        BigDecimal temp = (BigDecimal) days2.get("temp");
        
        loctable2.setText(location);
        datelabel.setText(datetime);
        mintemplabel.setText(tempmin.toString() + " °C");
        maxtemplabel.setText(tempmax.toString() + " °C");
        feelslabel.setText(feelslike.toString() + " °C");
        templabel.setText(temp.toString() + " °C");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buildingcombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        FloorComboBox = new javax.swing.JComboBox<>();
        searchBotton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        floormap = new javax.swing.JLabel();
        uwoimage = new javax.swing.JLabel();
        loctable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loctable2 = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        mintemplabel = new javax.swing.JLabel();
        maxtemplabel = new javax.swing.JLabel();
        templabel = new javax.swing.JLabel();
        feelslabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        buildingcombo.setBackground(new java.awt.Color(138, 43, 226));
        buildingcombo.setForeground(new java.awt.Color(255, 255, 255));
        buildingcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Middlesex College", "Arts and Humanities Building", "Elborn College" }));
        buildingcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingcomboActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(138, 43, 226));
        jLabel2.setForeground(new java.awt.Color(138, 43, 226));
        jLabel2.setText("Building:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        FloorComboBox.setBackground(new java.awt.Color(138, 43, 226));
        FloorComboBox.setForeground(new java.awt.Color(255, 255, 255));
        FloorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FloorComboBoxActionPerformed(evt);
            }
        });

        searchBotton.setBackground(new java.awt.Color(138, 43, 226));
        searchBotton.setForeground(new java.awt.Color(255, 255, 255));
        searchBotton.setText("Search");
        searchBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBottonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 43, 226));
        jLabel1.setText("Western Maps");

        jButton1.setBackground(new java.awt.Color(138, 43, 226));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("User Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(floormap);

        loctable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(138, 43, 226));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Weather");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Location: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Min Temp:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Max Temp: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Current Temp:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Feels Like Temp:");

        loctable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loctable2.setForeground(new java.awt.Color(255, 255, 255));
        loctable2.setText("jLabel9");

        datelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datelabel.setForeground(new java.awt.Color(255, 255, 255));
        datelabel.setText("jLabel9");

        mintemplabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mintemplabel.setForeground(new java.awt.Color(255, 255, 255));
        mintemplabel.setText("jLabel10");

        maxtemplabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        maxtemplabel.setForeground(new java.awt.Color(255, 255, 255));
        maxtemplabel.setText("jLabel11");

        templabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        templabel.setForeground(new java.awt.Color(255, 255, 255));
        templabel.setText("jLabel10");

        feelslabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        feelslabel.setForeground(new java.awt.Color(255, 255, 255));
        feelslabel.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datelabel)
                                    .addComponent(loctable2)
                                    .addComponent(mintemplabel)
                                    .addComponent(maxtemplabel)
                                    .addComponent(feelslabel)
                                    .addComponent(templabel)))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(loctable2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mintemplabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxtemplabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(templabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(feelslabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(searchBotton)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buildingcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(FloorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(uwoimage)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(loctable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buildingcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addComponent(FloorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uwoimage)
                        .addGap(123, 123, 123)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(jScrollPane1)))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(searchBotton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(loctable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buildingcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingcomboActionPerformed
        // TODO add your handling code here:
        System.out.println(buildingcombo.getItemAt(buildingcombo.getSelectedIndex()));
        String buildingName = buildingcombo.getItemAt(buildingcombo.getSelectedIndex());
        if (buildingName.equals("Middlesex College")){
            FloorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ground Floor", "First Floor", "Second Floor", "Third Floor", "Fourth Floor" }));
        }else if(buildingName.equals("Arts and Humanities Building")){
            FloorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lower Floor", "First Floor", "Second Floor", "Third Floor" }));
        }
    }//GEN-LAST:event_buildingcomboActionPerformed

    private void FloorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FloorComboBoxActionPerformed
        // TODO add your handling code here:
        System.out.print(".");
    }//GEN-LAST:event_FloorComboBoxActionPerformed

    private void searchBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBottonActionPerformed
        String buildingName = buildingcombo.getItemAt(buildingcombo.getSelectedIndex());
        String floorName = FloorComboBox.getItemAt(FloorComboBox.getSelectedIndex());
        if (buildingName.equals("Middlesex College")) {
            if(floorName.equals("Ground Floor")){
                floormap.setIcon(new ImageIcon("src/main/java/images/middlesexLevel1.png"));
            }else if (floorName.equals("First Floor")){
                floormap.setIcon(new ImageIcon("src/main/java/images/middlesexLevel2.png"));
//            }else if (floorName.equals("Second Floor")){
//                floormap.setIcon(new ImageIcon("src/main/java/images/middlesexLevel3.png"));
//            }else if (floorName.equals("Third Floor")){
//                floormap.setIcon(new ImageIcon("src/main/java/images/middlesexLevel4.png"));
//            }else if (floorName.equals("Fourth Floor")){
//                floormap.setIcon(new ImageIcon("src/main/java/images/middlesexLevel5.png"));
            }
        }else if(buildingName.equals("Arts and Humanities Building")){
            if(floorName.equals("Lower Floor")){
                ImageIcon ahb = new ImageIcon("src/main/java/images/ahblower.png");
                Image ahblowerImage = ahb.getImage();
                int ahbwidth = ahb.getIconWidth();
                int ahbheight = ahb.getIconHeight();
                ahbwidth = (int)(ahbwidth/2);
                ahbheight = (int)(ahbheight/2);
                Image newahb = ahblowerImage.getScaledInstance(ahbwidth, ahbheight, Image.SCALE_SMOOTH);
                ahb = new ImageIcon(newahb);
                floormap.setIcon(ahb);
                
            }else if(floorName.equals("First Floor")){
                ImageIcon ahb = new ImageIcon("src/main/java/images/ahb1.png");
                Image ahblowerImage = ahb.getImage();
                int ahbwidth = ahb.getIconWidth();
                int ahbheight = ahb.getIconHeight();
                ahbwidth = (int)(ahbwidth/2);
                ahbheight = (int)(ahbheight/2);
                Image newahb = ahblowerImage.getScaledInstance(ahbwidth, ahbheight, Image.SCALE_SMOOTH);
                ahb = new ImageIcon(newahb);
                floormap.setIcon(ahb);
                
            }else if(floorName.equals("Second Floor")){
                ImageIcon ahb = new ImageIcon("src/main/java/images/ahb2.png");
                Image ahblowerImage = ahb.getImage();
                int ahbwidth = ahb.getIconWidth();
                int ahbheight = ahb.getIconHeight();
                ahbwidth = (int)(ahbwidth/2);
                ahbheight = (int)(ahbheight/2);
                Image newahb = ahblowerImage.getScaledInstance(ahbwidth, ahbheight, Image.SCALE_SMOOTH);
                ahb = new ImageIcon(newahb);
                floormap.setIcon(ahb);
            }else if(floorName.equals("Third Floor")){
                ImageIcon ahb = new ImageIcon("src/main/java/images/ahb3.png");
                Image ahblowerImage = ahb.getImage();
                int ahbwidth = ahb.getIconWidth();
                int ahbheight = ahb.getIconHeight();
                ahbwidth = (int)(ahbwidth/2);
                ahbheight = (int)(ahbheight/2);
                Image newahb = ahblowerImage.getScaledInstance(ahbwidth, ahbheight, Image.SCALE_SMOOTH);
                ahb = new ImageIcon(newahb);
                floormap.setIcon(ahb);
            }
        }
    }//GEN-LAST:event_searchBottonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new UserHelp3().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FloorComboBox;
    private javax.swing.JComboBox<String> buildingcombo;
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel feelslabel;
    private javax.swing.JLabel floormap;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loctable;
    private javax.swing.JLabel loctable2;
    private javax.swing.JLabel maxtemplabel;
    private javax.swing.JLabel mintemplabel;
    private javax.swing.JButton searchBotton;
    private javax.swing.JLabel templabel;
    private javax.swing.JLabel uwoimage;
    // End of variables declaration//GEN-END:variables
}
