
package ktdh;

import Element.DoiToaDo;
import Element.Dthang;
import Element.Elip;
import Element.Htron; 
import Element.Hvuong;
import Element.Hbh;
import Element.Hcn;
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
public class Hinh2D extends javax.swing.JFrame {
    public Hinh2D() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hieu_ung = new javax.swing.JButton();
        lam_moi = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        draw = new javax.swing.JButton();
        Panel_ToaDo = new javax.swing.JPanel();
        draw1 = new javax.swing.JButton();
        draw2 = new javax.swing.JButton();
        hieu_ung1 = new javax.swing.JButton();

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

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
            .addGap(0, 558, Short.MAX_VALUE)
        );

        draw1.setBackground(new java.awt.Color(255, 255, 255));
        draw1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        draw1.setForeground(new java.awt.Color(204, 0, 0));
        draw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/color.png"))); // NOI18N
        draw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                draw1ActionPerformed(evt);
            }
        });

        draw2.setBackground(new java.awt.Color(255, 255, 255));
        draw2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        draw2.setForeground(new java.awt.Color(204, 0, 0));
        draw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/brushCursor2.png"))); // NOI18N
        draw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                draw2ActionPerformed(evt);
            }
        });

        hieu_ung1.setBackground(new java.awt.Color(255, 255, 255));
        hieu_ung1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hieu_ung1.setForeground(new java.awt.Color(255, 0, 0));
        hieu_ung1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/move342.png"))); // NOI18N
        hieu_ung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hieu_ung1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(draw2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hieu_ung1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(draw2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hieu_ung1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
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
    //static int click=-1;
    //public Point[] points = new Point[2];
    public Color choosecolor;
    public Point point1,point2,point3,point4 ,point5,point6,point7,
            point8,point9,point10,point11,point12,point13,point14,
            point15,point16,point17,point18,point19, point20, point21,
            point22, point23,point24, point25, point26, point27,
            point28,point29,point30,point31,point32,point33,point34,
            point35,point36,point37,point38,point39,point40,point41,
            pointcc1,pointcc2,pointcc3,pointcc4,pointcc5,pointcc6,
            pointcc7,pointcc8,pointtru,pointtrucc,pointmt;
    
    public Dthang dt1, dt2  ,dt3, dt4, dt5,dt6,dt7,dt8,dt9,dt10,dt11,
            dt12,dt13,dt14,dt15,dt16,dt17,dt18,dt19,dt20,dt21,dt22,
            dt23,dt24,dt25,dt26,dt27,dt28,dt29,dt30,dt31,dt32,
            dtcc1,dtcc2,dtcc3,dtcc4,dtcc5,dtcc6,dtcc7,dtcc8,dttru;
    
    public Htron ht1,ht2,ht3,ht4,ht5,ht6,htmt;

    public Elip el1, el2;
    
    double sin45 = Math.sin(-45);
    double cos45 = Math.cos(-45);
    
    DoiToaDo doitoado = new DoiToaDo();
    public Dthang[] lines;
    public Htron[] circles ;
    public Hvuong[] squares;
    public Hcn[] rectangles;
    public Elip[] elippses;
    public Hbh[] hinhbhs;
    
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
    //15:47 21-5 jun
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
    

    public Point nhanMT2(double[][]matran, double[] mang)
    {
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
    
    public void bd_tinhtien_dt_chanphai_tren1(int x1,int y1, Color color){
   
                Dthang dt24 = new Dthang(Tinhtien(point26,0,0), Tinhtien(point34, 10,-10), color);
                line_DDA(dt24);    
       
    }
    public void bd_tinhtien_dt_chanphai_tren2(int x1,int y1, Color color){
   
                Dthang dt25 = new Dthang(Tinhtien(point34,10,-10), Tinhtien(point35, 10,-15), color);
                line_DDA(dt25);    
       
    }
    
    

    public void bd_tinhtien_elip1(int dx, int dy, Color color){
        Elip temp = new Elip(Tinhtien(point36, dx,dy), 10, 5, color);
                Midpoint_elip(temp);
             
    }

       
    public Point Quay(Point point1,Point point2){// Quay 1 diem (x,y)quanh diem(xo,yo)1 goc a;
            Point dd1, dd2;
            int x, y, xo, yo;
            int a = -15;
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
            matran1[0][0] = 1;      matran1[0][1] = 0;      matran1[0][2] = 0;
            matran1[1][0] = 0;      matran1[1][1] = 1;      matran1[1][2] = 0;
            matran1[2][0] = -xo;    matran1[2][1] = -yo;    matran1[2][2] = 1;
            mang[0] = x; mang[1] = y; mang[2] = 1;
            Point pt = nhanMT2(matran1, mang);
            
            //Ma tran quay quanh goc toa do mot goc a;
            
            sin = Math.sin((Math.PI * a) / 180);
            cos = Math.cos((Math.PI * a) / 180);
            matran2[0][0] = cos;        matran2[0][1] = sin;    matran2[0][2] = 0;
            matran2[1][0] = -1 * sin;   matran2[1][1] = cos;    matran2[1][2] = 0;
            matran2[2][0] = 0;          matran2[2][1] = 0;      matran2[2][2] = 1;
            mang[0] = pt.x; mang[1] = pt.y; mang[2] = 1;
            Point pt1 = nhanMT2(matran2, mang);
            
            // ma tran doi diem ve toa do cu
            matran3[0][0] = 1;      matran3[0][1] = 0;  matran3[0][2] = 0;
            matran3[1][0] = 0;      matran3[1][1] = 1;  matran3[1][2] = 0;
            matran3[2][0] = xo;     matran3[2][1] = yo; matran3[2][2] = 1;
            mang[0] = pt1.x; mang[1] = pt1.y; mang[2] = 1;
            Point pt2 = nhanMT2(matran3, mang);
            //Point kq = new Point(pt2.x*5 + 830, 600 - pt2.y*5);
            Point kq = new Point(pt2.x, pt2.y);
            
            return kq;
        }
    
    //15;47 21-5

    //=====các button===//
    //HIỆU ỨNG
    private void hieuUng_xe(int i){
        Color m = Color.WHITE;
      //  for(int i=0; i<=700; i=i+20){
             heToaDo();
             //body xe
             point5 = new Point(10+i, 350);
             point6 = new Point(220+i, 350);
             point7 = new Point(60+i, 350);
             point8 = new Point(75+i, 330);
             point9 = new Point(150+i, 330);
             point10 = new Point(165+i, 350);
             point11 = new Point(10+i, 380);
             point12 = new Point(220+i, 380);
             point13 = new Point(65+i,380);
             point14 = new Point(145+i,380);
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

            //white
             //body xe
             point5 = new Point(10+i, 350);
             point6 = new Point(220+i, 350);
             point7 = new Point(60+i, 350);
             point8 = new Point(75+i, 330);
             point9 = new Point(150+i, 330);
             point10 = new Point(165+i, 350);
             point11 = new Point(10+i, 380);
             point12 = new Point(220+i, 380);
             point13 = new Point(65+i,380);
             point14 = new Point(145+i,380);
             point15 = new Point(60+i, 380);
             point16 = new Point(80+i, 380);
             point17 = new Point(130+i, 380);
             point18 = new Point(160+i, 380);
             
             
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
   
     //   }  
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
            
            pointcc1=Quay(pointcc1, pointtrucc);
            pointcc2=Quay(pointcc2, pointtrucc);
            pointcc3=Quay(pointcc3, pointtrucc);
            pointcc4=Quay(pointcc4, pointtrucc);
            pointcc5=Quay(pointcc5, pointtrucc);
            pointcc6=Quay(pointcc6, pointtrucc);
            pointcc7=Quay(pointcc7, pointtrucc);
            pointcc8=Quay(pointcc8, pointtrucc);
            heToaDo();
    }
    //21-5 jun v
    private void hieuUng_sut(){
        Color m = Color.BLACK;
        int i=0;
        for (i=0; i<10; i++){
            bd_tinhtien_dt_chanphai_tren1(210+i,405-i,m.white);
        }
        dt24 = new Dthang(point26, point34,m.white);
        bd_tinhtien_dt_chanphai_tren1(210+i,405-i,m);
        for (i=0; i<10; i++){
            bd_tinhtien_dt_chanphai_tren2(235+i,455-i,m.white);
        }
        bd_tinhtien_dt_chanphai_tren2(235+i,455-i,m);
        bd_tinhtien_elip1(10,-15,m);
        
 
    }
    
    private void hieuUng_ball(){
        int i=0;
        for(i=0; i<380; i=i+10){
            Ball(i,i,choosecolor);
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hinh2D.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Ball(i,i,Color.WHITE); 
            heToaDo();
        }
        Ball(i,i,choosecolor);
    }
    //21-5 jun ^
    private void hieu_ungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieu_ungActionPerformed
        for(int i=0; i<=700; i=i+50){
            heToaDo();
            hieuUng_xe(i);
            hieuUng_chongChong();  
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
    }
    
    private void chongchong(){
        pointcc1 = new Point(-105,270);
        pointcc5 = new Point(-105,150);
        pointcc3 = new Point(-45,210);
        pointcc7 = new Point(-165,210);
        
        pointcc2 = new Point(  (int)((0)*cos45-(60)*sin45+(-105)  ), (int)((0)*sin45+(60)*cos45+(210))  );
        pointcc6 = new Point(  (int)((0)*cos45-(-60)*sin45+(-105)  ), (int)((0)*sin45+(-60)*cos45+(210))  );
        pointcc4 = new Point(  (int)((60)*cos45-(0)*sin45+(-105)   ), (int)((60)*sin45+(0)*cos45+(210))  );
        pointcc8 = new Point(  (int)((-60)*cos45-(0)*sin45+(-105)  ), (int)((-60)*sin45+(0)*cos45+(210))  );
        
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
        
    }
    
    private void nui(){
        point18 = new Point(196, 105);
        point19 = new Point(309, 268);
        point20 = new Point(505, 105);
        
        dt11 = new Dthang(point3, point18, Color.GREEN);
        dt12 = new Dthang(point19, point18, Color.GREEN);
        dt13 = new Dthang(point19, point20, Color.GREEN);
        dt14 = new Dthang(point4, point20, Color.GREEN);
        
        line_DDA(dt11);
        line_DDA(dt12);
        line_DDA(dt13);
        line_DDA(dt14);
    }
    
    private void mattroi(){
        pointmt = new Point(620,60);
        htmt = new Htron(38, pointmt, Color.RED);
        Midpoint_htron(htmt);
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
    private void draw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draw1ActionPerformed
        heToaDo();
        choosecolor = JColorChooser.showDialog(this, "Bảng Màu ", Color.GREEN);
    }//GEN-LAST:event_draw1ActionPerformed

    //VẼ HÌNH 2
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
        point41 = new Point (290+x,435-y);
        ht6 = new Htron(20,point41,color);
        Midpoint_htron(ht6);
    }
    
    //VẼ HÌNH 2
    private void draw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draw2ActionPerformed
        heToaDo();
        Header();
        Body();
        Goal();
        Ball(0,0,choosecolor);   
    }//GEN-LAST:event_draw2ActionPerformed

    //HIỆU ỨNG 2
    private void hieu_ung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieu_ung1ActionPerformed
        // TODO add your handling code here:
            //21-5 jun  v
            hieuUng_sut();
            hieuUng_ball();
            
    
         //21-5 jun   ^
    }//GEN-LAST:event_hieu_ung1ActionPerformed

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
            java.util.logging.Logger.getLogger(Hinh2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hinh2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hinh2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hinh2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Hinh2D().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_ToaDo;
    private javax.swing.JButton draw;
    private javax.swing.JButton draw1;
    private javax.swing.JButton draw2;
    private javax.swing.JButton hieu_ung;
    private javax.swing.JButton hieu_ung1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lam_moi;
    // End of variables declaration//GEN-END:variables
}
