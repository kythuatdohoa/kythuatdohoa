
package ktdh;

import Element.DoiToaDo;
import Element.DrawCube;
import Element.DrawPyramid;
import Element.Dthang;
import Element.HienThiThongTIn;
import Element.NhapToaDo3D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author NHOM8
 */

public class Hinh3D extends javax.swing.JFrame {

    public Hinh3D() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("VẼ HÌNH 3D");
        this.setIconImage(new ImageIcon("E:\\JAVA\\KTDH\\KTDH\\src\\Img\\draw.png").getImage());
        
        color.setToolTipText("Chọn màu để vẽ !");
        NhapToaDo.setToolTipText("Nhập kích thước !");
        HHCN.setToolTipText("Vẽ hình hộp chữ nhật !"); 
        CHOP.setToolTipText("Vẽ hình chóp tam giác !");
        infor.setToolTipText("Hiển thị kích thước, toạ độ !");
        CLEAR.setToolTipText("Xoá !");   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HHCN = new javax.swing.JButton();
        CHOP = new javax.swing.JButton();
        ToaDo = new javax.swing.JPanel();
        CLEAR = new javax.swing.JButton();
        color = new javax.swing.JButton();
        infor = new javax.swing.JButton();
        NhapToaDo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        HHCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cube.png"))); // NOI18N
        HHCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HHCNActionPerformed(evt);
            }
        });

        CHOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pyramid.png"))); // NOI18N
        CHOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOPActionPerformed(evt);
            }
        });

        ToaDo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ToaDoLayout = new javax.swing.GroupLayout(ToaDo);
        ToaDo.setLayout(ToaDoLayout);
        ToaDoLayout.setHorizontalGroup(
            ToaDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        ToaDoLayout.setVerticalGroup(
            ToaDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clear.png"))); // NOI18N
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/color.png"))); // NOI18N
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        infor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/infoCursor.png"))); // NOI18N
        infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inforActionPerformed(evt);
            }
        });

        NhapToaDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/brushCursor2.png"))); // NOI18N
        NhapToaDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapToaDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NhapToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HHCN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CHOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(ToaDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HHCN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NhapToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //============================================================================//
    //======o0o==KHAI BÁO==o0o=========//
    public Color  choosecolor;
    DoiToaDo doitoado = new DoiToaDo();
    //======o0o==HÀM CON==o0o=========//
    public void heToaDo(){
        Graphics2D graphic = (Graphics2D) ToaDo.getGraphics();
        
        //đứng
        graphic.setColor(Color.blue);
        for(int i=0; i<=ToaDo.getWidth()/5; i++){
            graphic.drawLine(5* i, 0, 5* i, ToaDo.getHeight());
        }
        
        //ngang
        for(int j=0; j<=ToaDo.getHeight()/5; j++){
            graphic.drawLine(0, 5* j,ToaDo.getWidth(), 5* j);
        }
        
        //Trục toạ độ
        
        graphic.setColor(Color.RED);
        graphic.drawLine(ToaDo.getWidth()/2, 0, ToaDo.getWidth()/2, ToaDo.getHeight()/2);
        graphic.drawString("Z", ToaDo.getWidth()/2-10, 10);
        
        graphic.drawLine(ToaDo.getWidth(), ToaDo.getHeight()/2, ToaDo.getWidth()/2, ToaDo.getHeight()/2);
        graphic.drawString("X", ToaDo.getWidth()-10, ToaDo.getHeight()/2-10);

        graphic.drawLine(ToaDo.getWidth()/2, ToaDo.getHeight()/2, 146, 570); 
        graphic.drawString("Y", 146 - 10, 570 - 10);    
    }
    
    public void putpixel(int x,int y, Color color){
        double a=2.5;
        if (x < 0 || x > 830 || y < 0 || y > 600) return;
        
        Graphics2D graphic = (Graphics2D) ToaDo.getGraphics();

        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double(x, y, a, a));

        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double(x - a, y - a, a, a));

        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double( x , y - a, a, a));
          
        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double( x - a, y, a, a));

    }
    
    public void line_DDA(Dthang T){ // Ve duong thang co dinh dang mau
        Color m = T.mau;
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
    
    public void NetDut_DDA(Dthang T){ // Ve duong thang co dinh dang mau
        Color m=T.mau;
        int Dx, Dy, count, temp_1, temp_2, dem = 0;
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
                
                if (dem < 7) {
                    m=T.mau;
                } else {
                    m=Color.WHITE;
                }
                if (dem % 10 == 0) {
                    dem = 0;
                }
                temp_1 = doitoado.round(x);
                temp_2 = doitoado.round(y);
                putpixel(temp_1, temp_2, m);
                x += delta_X;
                y += delta_Y;
                count--;
                dem++;
            } while (count != -1);
        }
    } 
    
    //======o0o==BUTTON==o0o=========//
    //Chọn màu
    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        heToaDo();
        choosecolor =  JColorChooser.showDialog(this, "Bảng Màu ", Color.GREEN);
    }//GEN-LAST:event_colorActionPerformed

    //Nhập toạ độ
    private void NhapToaDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapToaDoActionPerformed
        heToaDo();
        new NhapToaDo3D(choosecolor);
    }//GEN-LAST:event_NhapToaDoActionPerformed

    //vẽ hình hộp
    private void HHCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HHCNActionPerformed
        heToaDo();
        NetDut_DDA(DrawCube.dt1);
        line_DDA(DrawCube.dt2);
        line_DDA(DrawCube.dt3);
        NetDut_DDA(DrawCube.dt4);
        line_DDA(DrawCube.dt5);
        NetDut_DDA(DrawCube.dt6);
        line_DDA(DrawCube.dt7);
        line_DDA(DrawCube.dt8);
        line_DDA(DrawCube.dt9);
        line_DDA(DrawCube.dt10);
        line_DDA(DrawCube.dt11);
        line_DDA(DrawCube.dt12);
    }//GEN-LAST:event_HHCNActionPerformed

    //vẽ hình chóp
    private void CHOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOPActionPerformed
        heToaDo();
        NetDut_DDA(DrawPyramid.dt1);
        line_DDA(DrawPyramid.dt2);
        line_DDA(DrawPyramid.dt3);
        NetDut_DDA(DrawPyramid.dt4);
        NetDut_DDA(DrawPyramid.dt5);
        line_DDA(DrawPyramid.dt6);
        line_DDA(DrawPyramid.dt7);
        line_DDA(DrawPyramid.dt8);
        NetDut_DDA(DrawPyramid.dt9);
        NetDut_DDA(DrawPyramid.dt10);
    }//GEN-LAST:event_CHOPActionPerformed

    //thông tin
    private void inforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforActionPerformed
        new HienThiThongTIn();
    }//GEN-LAST:event_inforActionPerformed

    //làm mới
    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        repaint();
    }//GEN-LAST:event_CLEARActionPerformed

   
   //========================================================================//
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Hinh3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hinh3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hinh3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hinh3D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hinh3D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHOP;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton HHCN;
    private javax.swing.JButton NhapToaDo;
    private javax.swing.JPanel ToaDo;
    private javax.swing.JButton color;
    private javax.swing.JButton infor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
