package ktdh;

import Element.DoiToaDo;
import Element.DrawCylinder;
import Element.DrawCube;
import Element.DrawPyramid;
import Element.Dthang;
import Element.Elip;
import Element.HienThiThongTIn;
import Element.NhapToaDo3D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        TRU.setToolTipText("Vẽ hình trụ !");
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
        color = new javax.swing.JButton();
        infor = new javax.swing.JButton();
        NhapToaDo = new javax.swing.JButton();
        TRU = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();

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

        ToaDo.setBackground(new java.awt.Color(255, 255, 255));
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

        TRU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cylinder5.png"))); // NOI18N
        TRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRUActionPerformed(evt);
            }
        });

        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clear.png"))); // NOI18N
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NhapToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HHCN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CHOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HHCN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NhapToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHOP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToaDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    public Color choosecolor;
    DoiToaDo doitoado = new DoiToaDo();
    Color[][] arrcolor = new Color[165][115];

    //======o0o==HÀM CON==o0o=========//
    public void heToaDo() {
        Graphics2D graphic = (Graphics2D) ToaDo.getGraphics();

        //đứng
        graphic.setColor(Color.blue);
        for (int i = 0; i <= ToaDo.getWidth() / 5; i++) {
            graphic.drawLine(5 * i, 0, 5 * i, ToaDo.getHeight());
        }

        //ngang
        for (int j = 0; j <= ToaDo.getHeight() / 5; j++) {
            graphic.drawLine(0, 5 * j, ToaDo.getWidth(), 5 * j);
        }

        //Trục toạ độ
        graphic.setColor(Color.RED);
        graphic.drawLine(ToaDo.getWidth() / 2, 0, ToaDo.getWidth() / 2, ToaDo.getHeight() / 2);
        graphic.drawString("Z", ToaDo.getWidth() / 2 - 10, 10);

        graphic.drawLine(ToaDo.getWidth(), ToaDo.getHeight() / 2, ToaDo.getWidth() / 2, ToaDo.getHeight() / 2);
        graphic.drawString("X", ToaDo.getWidth() - 10, ToaDo.getHeight() / 2 - 10);

        graphic.drawLine(ToaDo.getWidth() / 2, ToaDo.getHeight() / 2, 146, 570);
        graphic.drawString("Y", 146 - 10, 570 - 10);
    }
    //=== vẽ đường thẳng ===//
    public void putpixel(int x, int y, Color color) {
        double a = 2.5;
        if (x < 0 || x > 830 || y < 0 || y > 600) {
            return;
        }

        Graphics2D graphic = (Graphics2D) ToaDo.getGraphics();

//        graphic.setPaint(color);
//        graphic.fill(new Rectangle2D.Double(x, y, a, a));
        
        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double(x, y, a, a));

        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double(x - a, y - a, a, a));

        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double(x, y - a, a, a));

        graphic.setPaint(color);
        graphic.fill(new Ellipse2D.Double(x - a, y, a, a));
    }

    public void line_DDA(Dthang T) { // Ve duong thang co dinh dang mau
        Color m = T.mau;
        int Dx, Dy, count, temp_1, temp_2;
        Dx = T.diemcuoi.x - T.diemdau.x;
        Dy = T.diemcuoi.y - T.diemdau.y;
        if (Math.abs(Dy) > Math.abs(Dx)) {
            count = Math.abs(Dy);
        } else {
            count = Math.abs(Dx);
        }
        float x, y, delta_X, delta_Y;
        if (count > 0) {
            delta_X = Dx;
            delta_X /= count;
            delta_Y = Dy;
            delta_Y /= count;
            x = T.diemdau.x;
            y = T.diemdau.y;
            do {
                temp_1 = doitoado.round(x);
                temp_2 = doitoado.round(y);
                putpixel(temp_1, temp_2, m);
                x += delta_X;
                y += delta_Y;
                count--;
            } while (count != -1);
        }
    }

    public void NetDut_DDA(Dthang T) { // Ve duong thang co dinh dang mau
        Color m = T.mau;
        int Dx, Dy, count, temp_1, temp_2, dem = 0;
        Dx = T.diemcuoi.x - T.diemdau.x;
        Dy = T.diemcuoi.y - T.diemdau.y;
        if (Math.abs(Dy) > Math.abs(Dx)) {
            count = Math.abs(Dy);
        } else {
            count = Math.abs(Dx);
        }
        float x, y, delta_X, delta_Y;
        if (count > 0) {
            delta_X = Dx;
            delta_X /= count;
            delta_Y = Dy;
            delta_Y /= count;
            x = T.diemdau.x;
            y = T.diemdau.y;
            do { 
                if (dem < 7) {
                    m = T.mau;
                } else {
                    m = Color.WHITE;
                }
                if (dem % 10 == 0 && dem!=0) {
                    dem = 0;
                }
                
                temp_1 = doitoado.round(x);
                temp_2 = doitoado.round(y);
                putpixel(temp_1, temp_2, m);
                m = T.mau;
                
                x += delta_X;
                y += delta_Y;
                count--;
                dem++;
            } while (count != -1);
        }
    }

    //===vẽ eclip ===//
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

    public void Midpoint_elip(Elip T) {
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

    public void NetDut_Midpoint_elip(Elip T) {
        int x, y, pointx, pointy, R, r;
        int count=-1;
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
                putpixel(x + pointx, doitoado.round(y) + pointy, T.mau);
                putpixel(-x + pointx, doitoado.round(y) + pointy, T.mau);
                
                
                putpixel(x + pointx, -doitoado.round(y) + pointy, m);
                putpixel(-x + pointx, -doitoado.round(y) + pointy, m);
                
            }
            if(count < 4){
                m = T.mau;
            }else{
                m = Color.WHITE;
            }
            if(count % 10 == 0 && count!=0){
                count = -1;
            }
            count++;
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
    //======o0o==BUTTON==o0o=========//
    //Chọn màu
    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        heToaDo();
        choosecolor = JColorChooser.showDialog(this, "Bảng Màu ", Color.GREEN);
    }//GEN-LAST:event_colorActionPerformed

    //Nhập toạ độ
    private void NhapToaDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapToaDoActionPerformed
        heToaDo();
        new NhapToaDo3D(choosecolor);
    }//GEN-LAST:event_NhapToaDoActionPerformed

    //vẽ hình hộp
    private void HHCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HHCNActionPerformed
        heToaDo();
        putpixel(DrawCube.point1.x, DrawCube.point1.y, choosecolor);
        putpixel(DrawCube.point2.x, DrawCube.point2.y, choosecolor);
        putpixel(DrawCube.point3.x, DrawCube.point3.y, choosecolor);
        putpixel(DrawCube.point4.x, DrawCube.point4.y, choosecolor);
        putpixel(DrawCube.point5.x, DrawCube.point5.y, choosecolor);
        putpixel(DrawCube.point6.x, DrawCube.point6.y, choosecolor);
        putpixel(DrawCube.point7.x, DrawCube.point7.y, choosecolor);
        putpixel(DrawCube.point8.x, DrawCube.point8.y, choosecolor);
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 1
        NetDut_DDA(DrawCube.dt1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 2
        line_DDA(DrawCube.dt2);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 3
        line_DDA(DrawCube.dt3);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 4
        NetDut_DDA(DrawCube.dt4);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 5
        line_DDA(DrawCube.dt5);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 6
        NetDut_DDA(DrawCube.dt6);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 7
        line_DDA(DrawCube.dt7);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 8
        line_DDA(DrawCube.dt8);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 9
        line_DDA(DrawCube.dt9);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 10
        line_DDA(DrawCube.dt10);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 11
        line_DDA(DrawCube.dt11);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        line_DDA(DrawCube.dt12);
    }//GEN-LAST:event_HHCNActionPerformed

    //vẽ hình chóp
    private void CHOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOPActionPerformed
        heToaDo();
        putpixel(DrawPyramid.point1.x, DrawPyramid.point1.y, choosecolor);
        putpixel(DrawPyramid.point2.x, DrawPyramid.point2.y, choosecolor);
        putpixel(DrawPyramid.point3.x, DrawPyramid.point3.y, choosecolor);
        putpixel(DrawPyramid.point4.x, DrawPyramid.point4.y, choosecolor);
        putpixel(DrawPyramid.point5.x, DrawPyramid.point5.y, choosecolor);
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 1
        NetDut_DDA(DrawPyramid.dt1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 2
        line_DDA(DrawPyramid.dt2);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 3
        line_DDA(DrawPyramid.dt3);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 4
        NetDut_DDA(DrawPyramid.dt4);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 5
        NetDut_DDA(DrawPyramid.dt5);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 6
        line_DDA(DrawPyramid.dt6);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 7
        line_DDA(DrawPyramid.dt7);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 8
        line_DDA(DrawPyramid.dt8);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 9
        NetDut_DDA(DrawPyramid.dt9);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 10
        NetDut_DDA(DrawPyramid.dt10);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_CHOPActionPerformed

    //thông tin
    private void inforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforActionPerformed
        new HienThiThongTIn();
    }//GEN-LAST:event_inforActionPerformed

    //làm mới
    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        repaint();
        System.out.println("rong: "+ToaDo.getWidth());
        System.out.println("cao: "+ToaDo.getHeight());
    }//GEN-LAST:event_CLEARActionPerformed

    //hình trụ
    private void TRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRUActionPerformed
        heToaDo();
        putpixel(DrawCylinder.point1.x, DrawCylinder.point1.y, choosecolor);
        putpixel(DrawCylinder.point2.x, DrawCylinder.point2.y, choosecolor);
        putpixel(DrawCylinder.point3.x, DrawCylinder.point3.y, choosecolor);
        putpixel(DrawCylinder.point4.x, DrawCylinder.point4.y, choosecolor);
        putpixel(DrawCylinder.point5.x, DrawCylinder.point5.y, choosecolor);
        putpixel(DrawCylinder.point6.x, DrawCylinder.point6.y, choosecolor);
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 1
        NetDut_DDA(DrawCylinder.dt1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 2
        NetDut_DDA(DrawCylinder.dt2);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 3
        line_DDA(DrawCylinder.dt3);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 4
        NetDut_DDA(DrawCylinder.dt4);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dương thẳng 5
        line_DDA(DrawCylinder.dt5);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //elip 1
        Midpoint_elip(DrawCylinder.elip1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hinh3D.class.getName()).log(Level.SEVERE, null, ex);
        }
        //elip 2
        NetDut_Midpoint_elip(DrawCylinder.elip2);
    }//GEN-LAST:event_TRUActionPerformed

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
    private javax.swing.JButton TRU;
    private javax.swing.JPanel ToaDo;
    private javax.swing.JButton color;
    private javax.swing.JButton infor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
