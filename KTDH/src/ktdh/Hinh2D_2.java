
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
//import Element.POINT;

/**
 *
 * @author NHOM8
 */
public class Hinh2D_2 extends javax.swing.JFrame {
    public Hinh2D_2() {
        initComponents();
        this.setLocationRelativeTo(null);
        color.setToolTipText("Chọn màu để vẽ !");
       // infor.setToolTipText("Hiển thị kích thước, toạ độ !");
        hieu_ung.setToolTipText("Toạ hiệu ứng !");
        lam_moi.setToolTipText("Xoá !");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lam_moi = new javax.swing.JButton();
        Panel_ToaDo = new javax.swing.JPanel();
        color = new javax.swing.JButton();
        draw = new javax.swing.JButton();
        hieu_ung = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bk_header = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        d1_thân = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        d2_thân = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        d2_taytrai = new javax.swing.JTextField();
        d1_taytrai = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        d1_tayphai = new javax.swing.JTextField();
        d2_tayphai = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        d1_chantrai = new javax.swing.JTextField();
        d2_chantrai = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tam_chantrai = new javax.swing.JTextField();
        bklon_chantrai = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        bknho_chantrai = new javax.swing.JTextField();
        tam_header = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        d3_taytrai = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        d3_tayphai = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        d3_chantrai = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        tam_ball = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        bk_ball = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        d1_xa_ngang = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        d2_xa_ngang = new javax.swing.JTextField();
        d1_doc_trai = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        d2_doc_trai = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        d1_doc_phai = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        d2_doc_phai = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        d1_chanphai = new javax.swing.JTextField();
        d2_chanphai = new javax.swing.JTextField();
        tam_chanphai = new javax.swing.JTextField();
        bklon_chanphai = new javax.swing.JTextField();
        bknho_chanphai = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        d3_chanphai = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();

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
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lam_moi.setBackground(new java.awt.Color(255, 255, 255));
        lam_moi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lam_moi.setForeground(new java.awt.Color(255, 0, 0));
        lam_moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clear.png"))); // NOI18N
        lam_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lam_moiActionPerformed(evt);
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
            .addGap(0, 722, Short.MAX_VALUE)
        );
        Panel_ToaDoLayout.setVerticalGroup(
            Panel_ToaDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        draw.setBackground(new java.awt.Color(255, 255, 255));
        draw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        draw.setForeground(new java.awt.Color(204, 0, 0));
        draw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/brushCursor2.png"))); // NOI18N
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        hieu_ung.setBackground(new java.awt.Color(255, 255, 255));
        hieu_ung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hieu_ung.setForeground(new java.awt.Color(255, 0, 0));
        hieu_ung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/move342.png"))); // NOI18N
        hieu_ung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hieu_ungActionPerformed(evt);
            }
        });

        jLabel6.setText("Tâm");

        bk_header.setText("jTextField3");

        jLabel9.setText("Bán kính");

        jLabel10.setText("Header");

        jLabel17.setText("Body");

        jLabel18.setText("Thân");

        jLabel25.setText("Điểm 1");

        d1_thân.setText("jTextField4");

        jLabel26.setText("Điểm 2");

        d2_thân.setText("jTextField5");

        jLabel27.setText("Tay Trái");

        jLabel28.setText("Điểm 1");

        jLabel29.setText("Điểm 2");

        d2_taytrai.setText("jTextField4");
        d2_taytrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2_taytraiActionPerformed(evt);
            }
        });

        d1_taytrai.setText("jTextField4");

        jLabel30.setText("Tay Phải");

        jLabel31.setText("Điểm 1");

        jLabel32.setText("Điểm 2");

        d1_tayphai.setText("jTextField8");

        d2_tayphai.setText("jTextField9");

        jLabel33.setText("Chân Trái");

        jLabel34.setText("Điểm 1");

        jLabel35.setText("Điểm 2");

        d1_chantrai.setText("jTextField10");

        d2_chantrai.setText("jTextField11");

        jLabel36.setText("Tâm");

        tam_chantrai.setText("jTextField12");

        bklon_chantrai.setText("jTextField16");

        jLabel41.setText("Bk lớn");

        jLabel42.setText("Bk nhỏ");

        bknho_chantrai.setText("jTextField17");

        tam_header.setText("jTextField1");
        tam_header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam_headerActionPerformed(evt);
            }
        });

        jLabel58.setText("Điểm 3");

        d3_taytrai.setText("jTextField1");

        jLabel59.setText("Điểm 3");

        d3_tayphai.setText("jTextField1");

        jLabel60.setText("Điêm 3");

        d3_chantrai.setText("jTextField1");
        d3_chantrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3_chantraiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel33))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(d2_thân, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d2_taytrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d1_taytrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d3_taytrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(d1_thân, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel6))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(bk_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tam_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel29))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d3_tayphai, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(d2_tayphai)
                                    .addComponent(d1_tayphai)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel60))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d3_chantrai, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tam_chantrai, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bklon_chantrai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bknho_chantrai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(d2_chantrai, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(d1_chantrai, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(tam_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(bk_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(d1_thân, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel27))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel26)
                                            .addComponent(d2_thân, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(d1_taytrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(d2_taytrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel58)
                                    .addComponent(d3_taytrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(d1_tayphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(d2_tayphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel59))
                            .addComponent(d3_tayphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel33)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(d1_chantrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(d2_chantrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(d3_chantrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(tam_chantrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(bklon_chantrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42))
                    .addComponent(bknho_chantrai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jLabel45.setText("Tâm");

        tam_ball.setText("jTextField20");
        tam_ball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tam_ballActionPerformed(evt);
            }
        });

        jLabel46.setText("Ball");

        jLabel47.setText("Bán kính");

        bk_ball.setText("jTextField21");

        jLabel48.setText("Xà ngang");

        jLabel49.setText("Điểm 1");

        d1_xa_ngang.setText("jTextField22");

        jLabel50.setText("Điểm 2");

        d2_xa_ngang.setText("jTextField23");

        d1_doc_trai.setText("jTextField24");

        jLabel51.setText("Cột dọc trái");

        jLabel52.setText("Điểm 1");

        jLabel53.setText("Điểm 2");

        d2_doc_trai.setText("jTextField25");

        jLabel54.setText("Cột dọc phải");

        jLabel55.setText("Điểm 1");

        d1_doc_phai.setText("jTextField26");

        jLabel56.setText("Điểm 2");

        d2_doc_phai.setText("jTextField27");
        d2_doc_phai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2_doc_phaiActionPerformed(evt);
            }
        });

        jLabel57.setText("Goal");

        jLabel37.setText("Chân Phải");

        d1_chanphai.setText("jTextField13");

        d2_chanphai.setText("jTextField14");

        tam_chanphai.setText("jTextField15");

        bklon_chanphai.setText("jTextField18");

        bknho_chanphai.setText("jTextField19");

        jLabel44.setText("Bk nhỏ");

        jLabel43.setText("Bk lớn");

        jLabel40.setText("Tâm");

        jLabel39.setText("Điểm 2");

        jLabel38.setText("Điểm 1");

        jLabel61.setText("Điểm 3");

        d3_chanphai.setText("jTextField1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d2_xa_ngang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52)
                        .addGap(41, 41, 41)
                        .addComponent(d1_doc_trai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel51))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel54))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel48))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel57))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel56)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel37)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d2_doc_phai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel46))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bklon_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tam_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tam_ball, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(d1_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bknho_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel61))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(d2_chanphai)
                                    .addComponent(d3_chanphai)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bk_ball, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d1_xa_ngang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d2_doc_trai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d1_doc_phai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(tam_ball, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(bk_ball, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(d1_xa_ngang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(d2_xa_ngang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1_doc_trai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(d2_doc_trai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(d1_doc_phai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(d2_doc_phai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(d2_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(d3_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tam_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bklon_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bknho_chanphai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Panel_ToaDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //========================================================================//
    //static int click=-1;
    //public Point[] points = new Point[2];
    public Color choosecolor;
    public Point point24, point25, point26, point27,point28,point29,point30,
            point31,point32,point33,point34,point35,point36,point37,point38,
            point39,point40,point41;
    
    public Dthang dt17,dt18,dt19,dt20,dt21,dt22,dt23,dt24,dt25,dt26,dt27,dt28;
    
    public Htron ht5,ht6;

    public Elip el1, el2;

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
    
    public void Midpoint_elip(Elip T) {
        DoiToaDo doitoado = new DoiToaDo();
        int x, y, pointx, pointy, R, r;
        pointx = T.point.x;
        pointy = T.point.y;
        R = T.R;
        r = T.r;
        Color m = T.mau;
        x = 0;
        y = r;
        int A, B;
        A = R * R;
        B = r * r;
        double p = B + A / 4 - A * r;
        x = 0;
        y = r;
        int Dx = 0;
        int Dy = 2 * A * y;
        put4pitxel(x, y, pointx, pointy, m);

        while (Dx < Dy) {
            x++;
            Dx += 2 * B;
            if (p < 0) {
                p += B + Dx;
            } else {
                y--;
                Dy -= 2 * A;
                p += B + Dx - Dy;
            }
            if (x % 5 == 0) {
                put4pitxel(x, doitoado.round(y), pointx, pointy, m);
            }
        }
        p = Math.round(B * (x + 0.5f) * (x + 0.5f) + A * (y - 1) * (y - 1) - A * B);
        while (y > 0) {
            y--;
            Dy -= A * 2;
            if (p > 0) {
                p += A - Dy;
            } else {
                x++;
                Dx += B * 2;
                p += A - Dy + Dx;
            }
            if (x % 5 == 0) {
                put4pitxel(x, doitoado.round(y), pointx, pointy, m);
            }
        }
    }
     
    //tịnh tiến
    public Point Tinhtien(Point d1,int dx,int dy){// tinh tien sang diem moi

            int x,y;
            x=d1.x;y=d1.y;
            double[][] matran1;
            double[] mang;
            mang = new double[3];
            matran1 = new double[3][3];

            //Ma tran cua phep tinh tien diem p theo vecter(dx,dy);
            matran1[0][0] = 1; 
            matran1[0][1] = 0; 
            matran1[0][2] = 0;
            matran1[1][0] = 0; 
            matran1[1][1] = 1; 
            matran1[1][2] = 0;
            matran1[2][0] = dx; 
            matran1[2][1] = dy; 
            matran1[2][2] = 1;
            mang[0] = x; 
            mang[1] = y; 
            mang[2] = 1;
            Point pt2 = nhanMT2(matran1, mang);
            Point kq = new Point(doitoado.round(pt2.x), doitoado.round(pt2.y));
            return kq;
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
    
    public void bd_tinhtien_dt_chanphai_tren1(int dx,int dy, Color color){
         Dthang dt24 = new Dthang(point26, Tinhtien(point34, 10,-10), color);
                line_DDA(dt24);  
    }
    
    public void bd_tinhtien_dt_chanphai_tren2(int dx,int dy, Color color){
        Dthang dt25 = new Dthang(Tinhtien(point34,10,-10), Tinhtien(point35, 10,-15), color);
                line_DDA(dt25);
    }
    
    public void bd_tinhtien_elip1(int dx, int dy, Color color){
       Elip temp = new Elip(Tinhtien(point36, dx,dy), 10, 5, color);
                Midpoint_elip(temp);
    }
       
    //=====các button===//

    //LÀM MỚI
    private void lam_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lam_moiActionPerformed
        Panel_ToaDo.repaint();
        System.out.println("rong: "+Panel_ToaDo.getWidth());
        System.out.println("cao: "+Panel_ToaDo.getHeight());
    }//GEN-LAST:event_lam_moiActionPerformed

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

    //VẼ HÌNH 
    private void Header(){
        point24 = new Point (160,300);
        ht5 = new Htron(30,point24,choosecolor);
        Midpoint_htron(ht5);
        
        tam_header.setText("( "+doitoado.doiMtoND(point24.x, point24.y).x+" ,"+doitoado.doiMtoND(point24.x, point24.y).y+" )");
        bk_header.setText("30");
    }
    
    private void Body(){
        //thanh nguoi
        point25 = new Point (160,330);
        point26 = new Point (160,380);
        dt17 = new Dthang (point25,point26, choosecolor);
        line_DDA(dt17);
        
        d1_thân.setText("( "+doitoado.doiMtoND(point25.x, point25.y).x+" ,"+doitoado.doiMtoND(point25.x, point25.y).y+" )");
        d2_thân.setText("( "+doitoado.doiMtoND(point26.x, point26.y).x+" ,"+doitoado.doiMtoND(point26.x, point26.y).y+" )");
        //tay trai
        point27 = new Point (120,350);
        dt18 = new Dthang (point25,point27,choosecolor);
        line_DDA(dt18);
        
        d1_taytrai.setText("( "+doitoado.doiMtoND(point25.x, point25.y).x+" ,"+doitoado.doiMtoND(point25.x, point25.y).y+" )");
        d2_taytrai.setText("( "+doitoado.doiMtoND(point27.x, point27.y).x+" ,"+doitoado.doiMtoND(point27.x, point27.y).y+" )");
        point28 = new Point (145,365);
        dt19 = new Dthang (point27,point28,choosecolor );
        line_DDA(dt19);
        
        d3_taytrai.setText("( "+doitoado.doiMtoND(point28.x, point28.y).x+" ,"+doitoado.doiMtoND(point28.x, point28.y).y+" )");
        //tay phai
        point29 = new Point (180,350);
        dt20 = new Dthang(point25, point29, choosecolor);
        line_DDA(dt20);
        
        d1_tayphai.setText("( "+doitoado.doiMtoND(point25.x, point25.y).x+" ,"+doitoado.doiMtoND(point25.x, point25.y).y+" )");
        d2_tayphai.setText("( "+doitoado.doiMtoND(point29.x, point29.y).x+" ,"+doitoado.doiMtoND(point29.x, point29.y).y+" )");
        point30 = new Point (200,330);
        dt21 = new Dthang( point29, point30, choosecolor);
        line_DDA(dt21);
        
        d3_tayphai.setText("( "+doitoado.doiMtoND(point30.x, point30.y).x+" ,"+doitoado.doiMtoND(point30.x, point30.y).y+" )");
        //chantrai
        point31 = new Point (180,430);
        dt22 = new Dthang(point26, point31, choosecolor);
        line_DDA(dt22);
        
        d1_chantrai.setText("( "+doitoado.doiMtoND(point26.x, point26.y).x+" ,"+doitoado.doiMtoND(point26.x, point26.y).y+" )");
        d2_chantrai.setText("( "+doitoado.doiMtoND(point31.x, point31.y).x+" ,"+doitoado.doiMtoND(point31.x, point31.y).y+" )");
        point32 = new Point (160,480);
        dt23 = new Dthang(point31, point32, choosecolor);
        line_DDA(dt23);
        
        d3_chantrai.setText("( "+doitoado.doiMtoND(point32.x, point32.y).x+" ,"+doitoado.doiMtoND(point32.x, point32.y).y+" )");
        point33 = new Point (170,480);
        el1 = new Elip(point33, 10, 5, choosecolor);
        Midpoint_elip(el1);
        
        tam_chantrai.setText("( "+doitoado.doiMtoND(point33.x, point33.y).x+" ,"+doitoado.doiMtoND(point33.x, point33.y).y+" )");
        bklon_chantrai.setText("10");
        bknho_chantrai.setText("5");
        
        //chan phai
        point34 = new Point (210,405);
        dt24 = new Dthang(point26, point34, choosecolor);
        line_DDA(dt24);
        
        d1_chanphai.setText("( "+doitoado.doiMtoND(point26.x, point26.y).x+" ,"+doitoado.doiMtoND(point26.x, point26.y).y+" )");
        d2_chanphai.setText("( "+doitoado.doiMtoND(point34.x, point34.y).x+" ,"+doitoado.doiMtoND(point34.x, point34.y).y+" )");
        point35 = new Point (235,455);
        dt25 = new Dthang(point34, point35, choosecolor);
        line_DDA(dt25);
        
        d3_chanphai.setText("( "+doitoado.doiMtoND(point35.x, point35.y).x+" ,"+doitoado.doiMtoND(point35.x, point35.y).y+" )");
        point36 = new Point (245,455);
        el2 = new Elip(point36, 10, 5, choosecolor);
        Midpoint_elip(el2);
        
        tam_chanphai.setText("( "+doitoado.doiMtoND(point36.x, point36.y).x+" ,"+doitoado.doiMtoND(point36.x, point36.y).y+" )");
        bklon_chanphai.setText("10");
        bknho_chanphai.setText("5");
        
       
    }
    
    private void Goal(){
       // cot doc trai
       point37 = new Point(450, 10);
       point38 = new Point(450, 70);
       dt26 = new Dthang(point37, point38, choosecolor);
       line_DDA(dt26); 
       
       d1_doc_trai.setText("( "+doitoado.doiMtoND(point37.x, point37.y).x+" ,"+doitoado.doiMtoND(point37.x, point37.y).y+" )");
       d2_doc_trai.setText("( "+doitoado.doiMtoND(point38.x, point38.y).x+" ,"+doitoado.doiMtoND(point38.x, point38.y).y+" )");
       //cot doc phai
       point39 = new Point(699, 10);
       point40 = new Point(699, 70);
       dt27 = new Dthang(point39, point40, choosecolor);
       line_DDA(dt27); 
       
       d1_doc_phai.setText("( "+doitoado.doiMtoND(point39.x, point39.y).x+" ,"+doitoado.doiMtoND(point39.x, point39.y).y+" )");
       d2_doc_phai.setText("( "+doitoado.doiMtoND(point40.x, point40.y).x+" ,"+doitoado.doiMtoND(point40.x, point40.y).y+" )");
       //cot ngang
       dt28 = new Dthang(point37, point39, choosecolor);
       line_DDA(dt28);
       
       d1_xa_ngang.setText("( "+doitoado.doiMtoND(point37.x, point37.y).x+" ,"+doitoado.doiMtoND(point37.x, point37.y).y+" )");
       d2_xa_ngang.setText("( "+doitoado.doiMtoND(point39.x, point39.y).x+" ,"+doitoado.doiMtoND(point39.x, point39.y).y+" )");
    }
    
    private void Ball(int x, int y, Color color){
        point41 = new Point (280+x,435-y);
        ht6 = new Htron(25,point41,color);
        Midpoint_htron(ht6);
        
        tam_ball.setText("( "+doitoado.doiMtoND(point41.x, point41.y).x+" ,"+doitoado.doiMtoND(point41.x, point41.y).y+" )");
        bk_ball.setText("25");
    }

    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        heToaDo();
        Header();
        Body();
        Goal();
        Ball(0,0,choosecolor);   
    }//GEN-LAST:event_drawActionPerformed

    //HIỆU ỨNG
    private void hieuUng_sut(){
       Color m = Color.BLACK;

        bd_tinhtien_dt_chanphai_tren1(210,405,m);
        bd_tinhtien_dt_chanphai_tren2(235,455,m);
        bd_tinhtien_elip1(10,-15,m);
        
        
        dt24 = new Dthang(point26, point34, Color.WHITE);
        line_DDA(dt24);
        
        dt25 = new Dthang(point34, point35, Color.WHITE);
        line_DDA(dt25);
        el2 = new Elip(point36, 10, 5, Color.WHITE);
        Midpoint_elip(el2);
        
        heToaDo();
        
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh2D_2.class.getName()).log(Level.SEVERE, null, ex);
        }

        bd_tinhtien_dt_chanphai_tren1(210,405,Color.WHITE);
        bd_tinhtien_dt_chanphai_tren2(235,455,Color.WHITE);
        bd_tinhtien_elip1(10,-15,Color.WHITE);

        heToaDo();
        
        dt24 = new Dthang(point26, point34, choosecolor);
        line_DDA(dt24);
        dt25 = new Dthang(point34, point35, choosecolor);
        line_DDA(dt25);
        el2 = new Elip(point36, 10, 5, choosecolor);
        Midpoint_elip(el2);
        
    }
    
    private void hieuUng_ball(){
        int i=0;
        for(i=0; i<380; i=i+10){
            Ball(i,i,choosecolor);
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hinh2D_2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Ball(i,i,Color.WHITE); 
            heToaDo();
            
        }
        Ball(i,i,choosecolor);
    }
    private void hieu_ungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieu_ungActionPerformed
            hieuUng_sut();
            hieuUng_ball();
    }//GEN-LAST:event_hieu_ungActionPerformed

    private void d2_taytraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2_taytraiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2_taytraiActionPerformed

    private void tam_ballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam_ballActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tam_ballActionPerformed

    private void d2_doc_phaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2_doc_phaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2_doc_phaiActionPerformed

    private void tam_headerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tam_headerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tam_headerActionPerformed

    private void d3_chantraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3_chantraiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d3_chantraiActionPerformed

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
            java.util.logging.Logger.getLogger(Hinh2D_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hinh2D_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hinh2D_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hinh2D_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Hinh2D_2().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_ToaDo;
    private javax.swing.JTextField bk_ball;
    private javax.swing.JTextField bk_header;
    private javax.swing.JTextField bklon_chanphai;
    private javax.swing.JTextField bklon_chantrai;
    private javax.swing.JTextField bkmt;
    private javax.swing.JTextField bknho_chanphai;
    private javax.swing.JTextField bknho_chantrai;
    private javax.swing.JTextField bx1;
    private javax.swing.JTextField bx2;
    private javax.swing.JTextField cc1;
    private javax.swing.JTextField cc2;
    private javax.swing.JTextField cc3;
    private javax.swing.JTextField cc4;
    private javax.swing.JTextField cc5;
    private javax.swing.JButton color;
    private javax.swing.JTextField d1_chanphai;
    private javax.swing.JTextField d1_chantrai;
    private javax.swing.JTextField d1_doc_phai;
    private javax.swing.JTextField d1_doc_trai;
    private javax.swing.JTextField d1_tayphai;
    private javax.swing.JTextField d1_taytrai;
    private javax.swing.JTextField d1_thân;
    private javax.swing.JTextField d1_xa_ngang;
    private javax.swing.JTextField d2_chanphai;
    private javax.swing.JTextField d2_chantrai;
    private javax.swing.JTextField d2_doc_phai;
    private javax.swing.JTextField d2_doc_trai;
    private javax.swing.JTextField d2_tayphai;
    private javax.swing.JTextField d2_taytrai;
    private javax.swing.JTextField d2_thân;
    private javax.swing.JTextField d2_xa_ngang;
    private javax.swing.JTextField d3_chanphai;
    private javax.swing.JTextField d3_chantrai;
    private javax.swing.JTextField d3_tayphai;
    private javax.swing.JTextField d3_taytrai;
    private javax.swing.JButton draw;
    private javax.swing.JButton hieu_ung;
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
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton lam_moi;
    private javax.swing.JTextField mt;
    private javax.swing.JTextField nui2;
    private javax.swing.JTextField nui3;
    private javax.swing.JTextField tam_ball;
    private javax.swing.JTextField tam_chanphai;
    private javax.swing.JTextField tam_chantrai;
    private javax.swing.JTextField tam_header;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    // End of variables declaration//GEN-END:variables
}
