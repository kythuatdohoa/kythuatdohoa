
package ktdh;

import Element.DoiToaDo;
import Element.Dthang;
import Element.Elip;
import Element.Htron; 
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
//import Element.POINT;

/**
 *
 * @author NHOM8
 */
public class Hinh2D_1 extends javax.swing.JFrame {
    public Hinh2D_1() {
        initComponents();
        this.setLocationRelativeTo(null);
        color.setToolTipText("Chọn màu để vẽ !");
        hieu_ung.setToolTipText("Toạ hiệu ứng !");
        lam_moi.setToolTipText("Xoá !");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hieu_ung = new javax.swing.JButton();
        lam_moi = new javax.swing.JButton();
        draw = new javax.swing.JButton();
        Panel_ToaDo = new javax.swing.JPanel();
        color = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bkmt = new javax.swing.JTextField();
        nui2 = new javax.swing.JTextField();
        nui3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bx1 = new javax.swing.JTextField();
        bx2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cc5 = new javax.swing.JTextField();
        cc4 = new javax.swing.JTextField();
        cc3 = new javax.swing.JTextField();
        cc2 = new javax.swing.JTextField();
        cc1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel4.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Hien thi toa do");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        hieu_ung.setBackground(new java.awt.Color(255, 255, 255));
        hieu_ung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hieu_ung.setForeground(new java.awt.Color(255, 0, 0));
        hieu_ung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/move342.png"))); // NOI18N
        hieu_ung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hieu_ungActionPerformed(evt);
            }
        });

        lam_moi.setBackground(new java.awt.Color(255, 255, 255));
        lam_moi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lam_moi.setForeground(new java.awt.Color(255, 0, 0));
        lam_moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clear.png"))); // NOI18N
        lam_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lam_moiActionPerformed(evt);
            }
        });

        draw.setBackground(new java.awt.Color(255, 255, 255));
        draw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        draw.setForeground(new java.awt.Color(204, 0, 0));
        draw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/draw2.png"))); // NOI18N
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        Panel_ToaDo.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ToaDo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_ToaDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_ToaDoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_ToaDoLayout = new javax.swing.GroupLayout(Panel_ToaDo);
        Panel_ToaDo.setLayout(Panel_ToaDoLayout);
        Panel_ToaDoLayout.setHorizontalGroup(
            Panel_ToaDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        Panel_ToaDoLayout.setVerticalGroup(
            Panel_ToaDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        color.setBackground(new java.awt.Color(255, 255, 255));
        color.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        color.setForeground(new java.awt.Color(204, 0, 0));
        color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/color.png"))); // NOI18N
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Núi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tâm");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bán Kính");

        mt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Mặt Trời");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Điểm 1");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Điểm 2");

        bkmt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nui2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nui3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Xe");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tâm bx1");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tâm bx2");

        bx1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        bx2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Điểm 1");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Điểm 2");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Điểm 3");

        x1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        x2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        x3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("Chong Chóng");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Điểm 1");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Điểm 2");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Điểm 3");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Điểm 4");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Điểm 5");

        cc5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cc4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cc3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cc2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cc1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bkmt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel16))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(x1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(x2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bx2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel22))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cc3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cc4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cc5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(28, 28, 28)
                                            .addComponent(cc1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel19)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nui2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nui3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bkmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nui2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nui3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(bx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20))
                    .addComponent(cc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //========================================================================//
    public Color choosecolor;
    public static Point point1,point2,point3,point4 ,point5,point6,point7,
            point8,point9,point10,point11,point12,point13,point14,
            point15,point16,point17,point18,point19,point20,point21,
            pointcc1,pointcc2,pointcc3,pointcc4,pointcc5,pointcc6,
            pointcc7,pointcc8,pointtru,pointtrucc,pointmt;
    
    public Dthang dt1, dt2  ,dt3, dt4, dt5,dt6,dt7,dt8,dt9,dt10,dt11,
            dt12,dt13,dt14,
            dtcc1,dtcc2,dtcc3,dtcc4,dtcc5,dtcc6,dtcc7,dtcc8,dttru;
    
    public Htron ht1,ht2,ht3,ht4,htmt;

    double sin20 = Math.sin(-20*Math.PI/180);
    double cos20 = Math.cos(-20*Math.PI/180);
    
    DoiToaDo doitoado = new DoiToaDo();
    
    //========================================================================//
    //===HÀM CON===//
    //THUẬT TOÁN
    public void heToaDo(){
        Graphics2D graphic = (Graphics2D) this.Panel_ToaDo.getGraphics();
        //đứng
        graphic.setColor(Color.black);
        for (int i = 0; i <= Panel_ToaDo.getWidth() / 5; i++) {
            graphic.drawLine(5 * i, 0, 5 * i, Panel_ToaDo.getHeight());
        }

        //ngang
        for (int j = 0; j <= Panel_ToaDo.getHeight() / 5; j++) {
            graphic.drawLine(0, 5 * j, Panel_ToaDo.getWidth(), 5 * j);
        }
        
        graphic.setColor(Color.RED);
        graphic.drawLine(Panel_ToaDo.getWidth()/2, 0, Panel_ToaDo.getWidth()/2, Panel_ToaDo.getHeight());
        graphic.drawLine(0, Panel_ToaDo.getHeight()/2, Panel_ToaDo.getWidth(), Panel_ToaDo.getHeight()/2);
    }
    
    public void putpixel(int x,int y,Color m){
        double a=2.5;
        if (x < 0 || x > 700 || y < 0 || y > 560) return;
          
        Graphics2D graphic = (Graphics2D) this.Panel_ToaDo.getGraphics();
        
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double(x, y, a, a));
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double(x - a, y - a, a, a));
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double( x , y - a, a, a));
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double( x - a, y, a, a));
    }
    
    public void put4pitxel(int x, int y, int pointx, int pointy, Color m) {
        //put dưới
            //nửa phải
        putpixel(x + pointx, y + pointy, m);
            //nửa trái
        putpixel(-x + pointx, y + pointy, m);
        
        //put trên
            //nửa phải
        putpixel(x + pointx, -y + pointy, m);
            //nửa trái
        putpixel(-x + pointx, -y + pointy, m);
    }
    
    public void put8pitxel(int x,int y,int cx,int cy,Color m){
            putpixel(cx + x,cy + y, m);
            putpixel(cx + x,cy - y, m);
            putpixel(cx - x,cy + y, m);
            putpixel(cx - x,cy - y, m);
            putpixel(cx + y,cy + x, m);
            putpixel(cx + y,cy - x, m);
            putpixel(cx - y,cy + x, m);
            putpixel(cx - y,cy - x, m);
    }
    
    public void line_DDA(Dthang T){ // Ve duong thang co dinh dang mau
        Color m = T.mau;
        DoiToaDo doitoado = new DoiToaDo();
        int Dx, Dy, count, temp_1, temp_2;
        Dx = T.diemcuoi.x - T.diemdau.x;
        Dy = T.diemcuoi.y - T.diemdau.y;
       
        if (Math.abs(Dy) > Math.abs(Dx)) count = Math.abs(Dy);
        else count = Math.abs(Dx);
        float x, y, delta_X, delta_Y;
        if (count > 0){
            delta_X = Dx;
            delta_X /= count;
            delta_Y = Dy;
            delta_Y /= count;
            x =T.diemdau.x;
            y = T.diemdau.y;

            do{
                temp_1 = doitoado.round(x);
                temp_2 = doitoado.round(y);
                putpixel(temp_1, temp_2, m);
                x += delta_X;
                y += delta_Y;
                count--;
            } while (count != -1);
        }
    }
    
    public void Midpoint_htron (Htron T){// ve hinh tron
        int x, y,cx,cy,p,R;
        DoiToaDo doitoado = new DoiToaDo();
        Color m=T.mau;
        cx = T.tam.x; cy = T.tam.y;
        x = 0;
        y =R= T.bkinh;
        int maxX = doitoado.round( (float) (Math.sqrt(2)/2*R));
        // int maxX = Math.Sqrt(2) / 2 * R;
        p = 1 - R;
        put8pitxel(x, y, cx, cy, m);
        while (x <= maxX){
            if (p < 0) p += 2 * x+3;
            else { p += 2 * (x - y) +5; y-=5; }
            x+=5;
            put8pitxel(x,y,cx,cy, m);
        }
    }
    
    public Point nhanMT2(double[][]matran, double[] mang){
        double[] mangtam;
        mangtam = new double[3];
        int dem = 0;
        for (int i = 0; i < 3; i++)
        {
            mangtam[i] =     mang[0] * matran[0][dem] 
                        +    mang[1] * matran[1][dem] 
                        +    mang[2] * matran[2][dem];
            dem++;
        }
        Point pt = new Point((int)(mangtam[0]), (int)(mangtam[1]));
        return pt;
    }
       
    public Point Quay(Point point1,Point point2, int a){// Quay 1 diem (x,y)quanh diem(xo,yo)1 goc a;
            Point dd1, dd2;
            int x, y, xo, yo;
            double[][] matran1;
            double[][] matran2;
            double[][] matran3;
            double[] mang;
            double cos, sin;
            
//            dd1 = new Point(point1.x/5-166, 120-point1.y/5);
//            dd2 = new Point(point2.x/5-166, 120-point2.y/5);
            dd1 = new Point(point1.x, point1.y);
            dd2 = new Point(point2.x, point2.y);
            x = dd1.x; y = dd1.y; xo = dd2.x; yo = dd2.y;
            mang = new double[3];
            matran1 = new double[3][3];
            matran2 = new double[3][3];
            matran3 = new double[3][3];
            
            // ma tran tinh tien (xo,yo)ve goc toa do
            matran1[0][0] = 1; matran1[0][1] = 0; matran1[0][2] = 0;
            matran1[1][0] = 0; matran1[1][1] = 1; matran1[1][2] = 0;
            matran1[2][0] = -xo; matran1[2][1] = -yo; matran1[2][2] = 1;
            mang[0] = x; mang[1] = y; mang[2] = 1;
            Point pt = nhanMT2(matran1, mang);
            
            //Ma tran quay quanh goc toa do mot goc a;
            sin = Math.sin((Math.PI * a) / 180);
            cos = Math.cos((Math.PI * a) / 180);
            matran2[0][0] = cos; matran2[0][1] = sin; matran2[0][2] = 0;
            matran2[1][0] = -1 * sin; matran2[1][1] = cos; matran2[1][2] = 0;
            matran2[2][0] = 0; matran2[2][1] = 0; matran2[2][2] = 1;
            mang[0] = pt.x; mang[1] = pt.y; mang[2] = 1;
            Point pt1 = nhanMT2(matran2, mang);
            
            // ma tran doi diem ve toa do cu
            matran3[0][0] = 1; matran3[0][1] = 0; matran3[0][2] = 0;
            matran3[1][0] = 0; matran3[1][1] = 1; matran3[1][2] = 0;
            matran3[2][0] = xo; matran3[2][1] = yo; matran3[2][2] = 1;
            mang[0] = pt1.x; mang[1] = pt1.y; mang[2] = 1;
            Point pt2 = nhanMT2(matran3, mang);
            //Point kq = new Point(pt2.x*5 + 830, 600 - pt2.y*5);
            Point kq = new Point(pt2.x, pt2.y);
            
            return kq;
        }

    //=====các button===//
    //HIỆU ỨNG
    private void hieuUng_xe(int i){
       
        Color m = Color.WHITE;
        heToaDo();
        //body xe
        point5 = new Point(10+i, 350);//góc trái trên
        point6 = new Point(220+i, 350);
        point7 = new Point(60+i, 350);//nóc
        point8 = new Point(75+i, 330);///
        point9 = new Point(150+i, 330);//
        point10 = new Point(165+i, 350);//
        point11 = new Point(10+i, 380);
        point12 = new Point(220+i, 380);
        point13 = new Point(65+i,380);//bx1
        point14 = new Point(145+i,380);//bx2
        point15 = new Point(60+i, 380);
        point16 = new Point(80+i, 380);
        point17 = new Point(130+i, 380);
        point18 = new Point(160+i, 380);
        
             
        dt3 = new Dthang(point5, point6, choosecolor);
        dt4 = new Dthang(point7, point8, choosecolor);
        dt5 = new Dthang(point8, point9, choosecolor);
        dt6 = new Dthang(point9, point10, choosecolor);
        dt7 = new Dthang(point5, point11, choosecolor);
        dt8 = new Dthang(point6, point12, choosecolor);
        dt9 = new Dthang(point15, point11, choosecolor);
        dt10 = new Dthang(point16, point17, choosecolor);
        dt11 = new Dthang(point12, point18, choosecolor);
            
        ht1 = new Htron(15,point13,choosecolor);
        ht2 = new Htron(2,point13,choosecolor);
        ht3 = new Htron(15,point14,choosecolor);
        ht4 = new Htron(2,point14,choosecolor);
             
        line_DDA(dt3);
        line_DDA(dt4);
        line_DDA(dt5);
        line_DDA(dt6);
        line_DDA(dt7);
        line_DDA(dt8);
        line_DDA(dt9);
        line_DDA(dt10);
        line_DDA(dt11);
             
        Midpoint_htron(ht1);
        Midpoint_htron(ht2);
        Midpoint_htron(ht3);
        Midpoint_htron(ht4);

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh2D_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //white
        //body xe
        dt3 = new Dthang(point5, point6, m);
        dt4 = new Dthang(point7, point8, m);
        dt5 = new Dthang(point8, point9, m);
        dt6 = new Dthang(point9, point10, m);
        dt7 = new Dthang(point5, point11, m);
        dt8 = new Dthang(point6, point12, m);
        dt9 = new Dthang(point15, point11, m);
        dt10 = new Dthang(point16, point17, m);
        dt11 = new Dthang(point12, point18, m);
             
        ht1 = new Htron(15,point13,m);
        ht2 = new Htron(2,point13,m);
        ht3 = new Htron(15,point14,m);
        ht4 = new Htron(2,point14,m);
             
        line_DDA(dt3);
        line_DDA(dt4);
        line_DDA(dt5);
        line_DDA(dt6);
        line_DDA(dt7);
        line_DDA(dt8);
        line_DDA(dt9);
        line_DDA(dt10);
        line_DDA(dt11);
            
        Midpoint_htron(ht1);
        Midpoint_htron(ht2);
        Midpoint_htron(ht3);
        Midpoint_htron(ht4); 
        
        
    }
  
    private void hieuUng_chongChong(){
        
        Color m = Color.WHITE;
        heToaDo();
        dtcc1 = new Dthang (pointcc1, pointcc5, Color.BLUE);
        dtcc2 = new Dthang (pointcc3, pointcc7, Color.BLUE);
        dtcc3 = new Dthang (pointcc2, pointcc6, Color.BLUE);
        dtcc4 = new Dthang (pointcc4, pointcc8, Color.BLUE);
        dtcc5 = new Dthang (pointcc1, pointcc2, Color.BLUE);
        dtcc6 = new Dthang (pointcc3, pointcc4, Color.BLUE);
        dtcc7 = new Dthang (pointcc5, pointcc6, Color.BLUE);
        dtcc8 = new Dthang (pointcc7, pointcc8, Color.BLUE);

        line_DDA(dtcc1);
        line_DDA(dtcc2);
        line_DDA(dtcc3);
        line_DDA(dtcc4);
        line_DDA(dtcc5);
        line_DDA(dtcc6);
        line_DDA(dtcc7);
        line_DDA(dtcc8);
            
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh2D_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            /////
        dtcc1 = new Dthang (pointcc1, pointcc5, m);
        dtcc2 = new Dthang (pointcc3, pointcc7, m);
        dtcc3 = new Dthang (pointcc2, pointcc6, m);
        dtcc4 = new Dthang (pointcc4, pointcc8, m);
        dtcc5 = new Dthang (pointcc1, pointcc2, m);
        dtcc6 = new Dthang (pointcc3, pointcc4, m);
        dtcc7 = new Dthang (pointcc5, pointcc6, m);
        dtcc8 = new Dthang (pointcc7, pointcc8, m);

            
        line_DDA(dtcc1);
        line_DDA(dtcc2);
        line_DDA(dtcc3);
        line_DDA(dtcc4);
        line_DDA(dtcc5);
        line_DDA(dtcc6);
        line_DDA(dtcc7);
        line_DDA(dtcc8);
        line_DDA(dttru);
            
        pointcc1=Quay(pointcc1, pointtrucc,10);
        pointcc2=Quay(pointcc2, pointtrucc,10);
        pointcc3=Quay(pointcc3, pointtrucc,10);
        pointcc4=Quay(pointcc4, pointtrucc,10);
        pointcc5=Quay(pointcc5, pointtrucc,10);
        pointcc6=Quay(pointcc6, pointtrucc,10);
        pointcc7=Quay(pointcc7, pointtrucc,10);
        pointcc8=Quay(pointcc8, pointtrucc,10);
        heToaDo();    
        
        
    }

    private void hieu_ungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieu_ungActionPerformed
        int i=0;
        while(i<=700){
            heToaDo();
            hieuUng_xe(i);
            hieuUng_chongChong(); 
            i=i+40;
        }
        xe();
        chongchong();     
    }//GEN-LAST:event_hieu_ungActionPerformed

    //LÀM MỚI
    private void lam_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lam_moiActionPerformed
        Panel_ToaDo.repaint();
        System.out.println("rong: "+Panel_ToaDo.getWidth());
        System.out.println("cao: "+Panel_ToaDo.getHeight());
    }//GEN-LAST:event_lam_moiActionPerformed

   //VẼ HÌNH 1
    private void dthang_duoi(){
        point1 = new Point(0, 450);
        point2 = new Point(700, 450);
        dt1 = new Dthang(point1, point2, Color.RED);
        line_DDA(dt1);
        Graphics2D graphic = (Graphics2D) Panel_ToaDo.getGraphics();
        graphic.setPaint(Color.GREEN);
        graphic.fill(new Rectangle2D.Double(0, 450, 700, 200));
    }
    
    private void dthang_tren(){
        point3 = new Point(0, 270);
        point4 = new Point(700, 270);
        dt2 = new Dthang(point3, point4,  Color.RED);
        line_DDA(dt2);
    }
    
    private void xe(){
        //body xe
        point5 = new Point(10, 350);
        point6 = new Point(220, 350);
        point7 = new Point(60, 350);
        point8 = new Point(75, 330);
        point9 = new Point(150, 330);
        point10 = new Point(165, 350);
        point11 = new Point(10, 380);
        point12 = new Point(220, 380);
        point13 = new Point(65,380);
        point14 = new Point(145,380);
        point15 = new Point(60, 380);
        point16 = new Point(80, 380);
        point17 = new Point(130, 380);
        point18 = new Point(160, 380);
        
        dt3 = new Dthang(point5, point6, choosecolor);
        dt4 = new Dthang(point7, point8, choosecolor);
        dt5 = new Dthang(point8, point9, choosecolor);
        dt6 = new Dthang(point9, point10, choosecolor);
        dt7 = new Dthang(point5, point11, choosecolor);
        dt8 = new Dthang(point6, point12, choosecolor);
        dt9 = new Dthang(point15, point11, choosecolor);
        dt10 = new Dthang(point16, point17, choosecolor);
        dt11 = new Dthang(point12, point18, choosecolor);
        
        ht1 = new Htron(15,point13,choosecolor);
        ht2 = new Htron(2,point13,choosecolor);
        ht3 = new Htron(15,point14,choosecolor);
        ht4 = new Htron(2,point14,choosecolor);
        
        line_DDA(dt3);
        line_DDA(dt4);
        line_DDA(dt5);
        line_DDA(dt6);
        line_DDA(dt7);
        line_DDA(dt8);
        line_DDA(dt9);
        line_DDA(dt10);
        line_DDA(dt11);
        
        Midpoint_htron(ht1);
        Midpoint_htron(ht2);
        Midpoint_htron(ht3);
        Midpoint_htron(ht4);  
        
        //xuất
        bx1.setText("          ");
        bx2.setText("          ");
        x1.setText("          ");
        x2.setText("          ");
        x3.setText("          ");
        
        bx1.setText("( "+doitoado.doiMtoND(point13.x, point13.y).x+" ,"+doitoado.doiMtoND(point13.x, point13.y).y+" )");
        bx2.setText("( "+doitoado.doiMtoND(point14.x, point14.y).x+" ,"+doitoado.doiMtoND(point14.x, point14.y).y+" )");
        x1.setText("( "+doitoado.doiMtoND(point5.x, point5.y).x+" ,"+doitoado.doiMtoND(point5.x, point5.y).y+" )");
        x2.setText("( "+doitoado.doiMtoND(point7.x, point7.y).x+" ,"+doitoado.doiMtoND(point7.x, point7.y).y+" )");
        x3.setText("( "+doitoado.doiMtoND(point8.x, point8.y).x+" ,"+doitoado.doiMtoND(point8.x, point8.y).y+" )");
    }
    
    private void chongchong(){
        int k=80;
        pointcc1 = new Point(-40,210+k);
        pointcc5 = new Point(-40,210-k);
        pointcc3 = new Point(-40+k,210);
        pointcc7 = new Point(-40-k,210);
        
        pointcc2 = new Point(  (int)((0)*cos20-(k)*sin20+(-40)  ), (int)((0)*sin20+(k)*cos20+(210)) );
        pointcc6 = new Point(  (int)((0)*cos20-(-k)*sin20+(-40) ), (int)((0)*sin20+(-k)*cos20+(210))  );
        pointcc4 = new Point(  (int)((k)*cos20-(0)*sin20+(-40)  ), (int)((k)*sin20+(0)*cos20+(210))  );
        pointcc8 = new Point(  (int)((-k)*cos20-(0)*sin20+(-40) ), (int)((-k)*sin20+(0)*cos20+(210)) );

        pointcc1 = doitoado.NDtoM(pointcc1.x, pointcc1.y);
        pointcc2 = doitoado.NDtoM(pointcc2.x, pointcc2.y);
        pointcc3 = doitoado.NDtoM(pointcc3.x, pointcc3.y);
        pointcc4 = doitoado.NDtoM(pointcc4.x, pointcc4.y);
        pointcc5 = doitoado.NDtoM(pointcc5.x, pointcc5.y);
        pointcc6 = doitoado.NDtoM(pointcc6.x, pointcc6.y);
        pointcc7 = doitoado.NDtoM(pointcc7.x, pointcc7.y);
        pointcc8 = doitoado.NDtoM(pointcc8.x, pointcc8.y);
        
        
        dtcc1 = new Dthang (pointcc1, pointcc5, Color.BLUE);
        dtcc2 = new Dthang (pointcc3, pointcc7, Color.BLUE);
        dtcc3 = new Dthang (pointcc2, pointcc6, Color.BLUE);
        dtcc4 = new Dthang (pointcc4, pointcc8, Color.BLUE);
        dtcc5 = new Dthang (pointcc1, pointcc2, Color.BLUE);
        dtcc6 = new Dthang (pointcc3, pointcc4, Color.BLUE);
        dtcc7 = new Dthang (pointcc5, pointcc6, Color.BLUE);
        dtcc8 = new Dthang (pointcc7, pointcc8, Color.BLUE);
        
        line_DDA(dtcc1);
        line_DDA(dtcc2);
        line_DDA(dtcc3);
        line_DDA(dtcc4);
        line_DDA(dtcc5);
        line_DDA(dtcc6);
        line_DDA(dtcc7);
        line_DDA(dtcc8);
        
        //trụ
        pointtru = new Point(310,270);
        pointtrucc = new Point(310,90);
        dttru = new Dthang(pointtru, pointtrucc, Color.BLUE);
        line_DDA(dttru);
     
        //xuất
        cc1.setText("          ");
        cc2.setText("          ");
        cc3.setText("          ");
        cc4.setText("          ");
        cc5.setText("          ");
        
        cc1.setText("( "+doitoado.doiMtoND(pointcc1.x, pointcc1.y).x+" ,"+doitoado.doiMtoND(pointcc1.x, pointcc1.y).y+" )");
        cc2.setText("( "+doitoado.doiMtoND(pointcc5.x, point5.y).x+" ,"+doitoado.doiMtoND(pointcc5.x, pointcc5.y).y+" )");
        cc3.setText("( "+doitoado.doiMtoND(pointcc3.x, pointcc3.y).x+" ,"+doitoado.doiMtoND(pointcc3.x, pointcc3.y).y+" )");
        cc4.setText("( "+doitoado.doiMtoND(pointcc7.x, pointcc7.y).x+" ,"+doitoado.doiMtoND(pointcc7.x, pointcc7.y).y+" )");
        cc5.setText("( "+doitoado.doiMtoND(pointtrucc.x, pointtrucc.y).x+" ,"+doitoado.doiMtoND(pointtrucc.x, pointtrucc.y).y+" )");
    }
    
    private void nui(){
        point19 = new Point(196, 105);
        point20 = new Point(309, 268);
        point21 = new Point(505, 105);
        
        dt11 = new Dthang(point3, point19, Color.GREEN);
        dt12 = new Dthang(point20, point19, Color.GREEN);
        dt13 = new Dthang(point20, point21, Color.GREEN);
        dt14 = new Dthang(point4, point21, Color.GREEN);
        
        line_DDA(dt11);
        line_DDA(dt12);
        line_DDA(dt13);
        line_DDA(dt14);
        
        //xuất
        nui2.setText("( "+doitoado.doiMtoND(point19.x, point19.y).x+" ,"+doitoado.doiMtoND(point19.x, point19.y).y+" )");
        nui3.setText("( "+doitoado.doiMtoND(point21.x, point21.y).x+" ,"+doitoado.doiMtoND(point21.x, point21.y).y+" )");
    }
    
    private void mattroi(){
        pointmt = new Point(608,74);
        htmt = new Htron(38, pointmt, Color.RED);
        Midpoint_htron(htmt);
        
        Graphics2D graphic = (Graphics2D) Panel_ToaDo.getGraphics();
        graphic.setPaint(Color.RED);
        graphic.fill(new Ellipse2D.Double(570, 35, 76, 76));
        
        //xuất
        mt.setText("( "+doitoado.doiMtoND(pointmt.x, pointmt.y).x+" ,"+doitoado.doiMtoND(pointmt.x, pointmt.y).y+" )");
        bkmt.setText("38");
    }
    
    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        heToaDo();
        dthang_duoi();
        dthang_tren();   
        xe();
        nui();
        chongchong();
        mattroi();
    }//GEN-LAST:event_drawActionPerformed

    private void Panel_ToaDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ToaDoMouseClicked
        System.out.println("x: "+doitoado.doiMtoND(evt.getX(), evt.getY()));
        System.out.println("y: "+evt.getX());
        System.out.println("y: "+evt.getY());
    }//GEN-LAST:event_Panel_ToaDoMouseClicked

    //Chọn màu
    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        heToaDo();
        choosecolor = JColorChooser.showDialog(this, "Bảng Màu ", Color.GREEN);
    }//GEN-LAST:event_colorActionPerformed

    private void cc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cc1ActionPerformed

   //========================================================================//
    
        

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Hinh2D_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hinh2D_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hinh2D_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hinh2D_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Hinh2D_1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_ToaDo;
    private javax.swing.JTextField bkmt;
    private javax.swing.JTextField bx1;
    private javax.swing.JTextField bx2;
    private javax.swing.JTextField cc1;
    private javax.swing.JTextField cc2;
    private javax.swing.JTextField cc3;
    private javax.swing.JTextField cc4;
    private javax.swing.JTextField cc5;
    private javax.swing.JButton color;
    private javax.swing.JButton draw;
    private javax.swing.JButton hieu_ung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton lam_moi;
    private javax.swing.JTextField mt;
    private javax.swing.JTextField nui2;
    private javax.swing.JTextField nui3;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    // End of variables declaration//GEN-END:variables
}
