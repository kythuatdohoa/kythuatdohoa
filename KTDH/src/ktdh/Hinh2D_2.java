
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
        jTextField1 = new javax.swing.JTextField();
        Panel_ToaDo = new javax.swing.JPanel();
        color = new javax.swing.JButton();
        draw = new javax.swing.JButton();
        hieu_ung = new javax.swing.JButton();

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

        lam_moi.setBackground(new java.awt.Color(255, 255, 255));
        lam_moi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lam_moi.setForeground(new java.awt.Color(255, 0, 0));
        lam_moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clear.png"))); // NOI18N
        lam_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lam_moiActionPerformed(evt);
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }
    
    private void Body(){
        //thanh nguoi
        point25 = new Point (160,330);
        point26 = new Point (160,380);
        dt17 = new Dthang (point25,point26, choosecolor);
        line_DDA(dt17);
        //tay trai
        point27 = new Point (120,350);
        dt18 = new Dthang (point25,point27,choosecolor);
        line_DDA(dt18);
        point28 = new Point (145,365);
        dt19 = new Dthang (point27,point28,choosecolor );
        line_DDA(dt19);
        //tay phai
        point29 = new Point (180,350);
        dt20 = new Dthang(point25, point29, choosecolor);
        line_DDA(dt20);
        point30 = new Point (200,330);
        dt21 = new Dthang( point29, point30, choosecolor);
        line_DDA(dt21);
        //chantrai
        point31 = new Point (180,430);
        dt22 = new Dthang(point26, point31, choosecolor);
        line_DDA(dt22);
        point32 = new Point (160,480);
        dt23 = new Dthang(point31, point32, choosecolor);
        line_DDA(dt23);
        point33 = new Point (170,480);
        el1 = new Elip(point33, 10, 5, choosecolor);
        Midpoint_elip(el1);
        //chan phai
        point34 = new Point (210,405);
        dt24 = new Dthang(point26, point34, choosecolor);
        line_DDA(dt24);
        point35 = new Point (235,455);
        dt25 = new Dthang(point34, point35, choosecolor);
        line_DDA(dt25);
        point36 = new Point (245,455);
        el2 = new Elip(point36, 10, 5, choosecolor);
        Midpoint_elip(el2);
        
        
       
    }
    
    private void Goal(){
       // cot doc tren
       point37 = new Point(450, 10);
       point38 = new Point(450, 70);
       dt26 = new Dthang(point37, point38, choosecolor);
       line_DDA(dt26); 
       //cot doc duoi
       point39 = new Point(699, 10);
       point40 = new Point(699, 70);
       dt27 = new Dthang(point39, point40, choosecolor);
       line_DDA(dt27); 
       //cot ngang
       dt28 = new Dthang(point37, point39, choosecolor);
       line_DDA(dt28);
    }
    
    private void Ball(int x, int y, Color color){
        point41 = new Point (280+x,435-y);
        ht6 = new Htron(25,point41,color);
        Midpoint_htron(ht6);
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
    private javax.swing.JButton color;
    private javax.swing.JButton draw;
    private javax.swing.JButton hieu_ung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lam_moi;
    // End of variables declaration//GEN-END:variables
}
