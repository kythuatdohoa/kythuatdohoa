
package ktdh;

import Element.DoiToaDo;
import Element.Dthang;
import Element.Elip;
import Element.Hbh;
import Element.Hcn;
import Element.Htron;
import Element.Hvuong;
        
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(draw2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hieu_ung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lam_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
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
                    .addComponent(draw2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    static int click=-1;
    public Point[] points = new Point[2];
    public Color choosecolor;
    //========================================================================//
    //===HÀM CON===//
    public void putpixel(int x,int y,Color m){
        double a=5;
        if (x < 0 || x > 700 || y < 0 || y > 560) return;
          
        Graphics2D graphic = (Graphics2D) this.Panel_ToaDo.getGraphics();
        
        graphic.setPaint(m);
        graphic.fill(new Rectangle2D.Double(x, y, a, a));
//        graphic.setPaint(m);
//        graphic.fill(new Ellipse2D.Double(x, y, a, a));
//          
//        graphic.setPaint(m);
//        graphic.fill(new Ellipse2D.Double(x - a, y - a, a, a));
//          
//        graphic.setPaint(m);
//        graphic.fill(new Ellipse2D.Double( x , y - a, a, a));
//          
//        graphic.setPaint(m);
//        graphic.fill(new Ellipse2D.Double( x - a, y, a, a));
         
        //PutColor.putcolor(x, y, m);
    }
    
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
    
    // các thuật toán vẽ hình
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
    
    private void put8pitxel(int x,int y,int cx,int cy,Color m){
            putpixel(cx + x,cy + y, m);
            putpixel(cx + x,cy - y, m);
            putpixel(cx - x,cy + y, m);
            putpixel(cx - x,cy - y, m);
            putpixel(cx + y,cy + x, m);
            putpixel(cx + y,cy - x, m);
            putpixel(cx - y,cy + x, m);
            putpixel(cx - y,cy - x, m);
    }
    
    public void Midpoint_htron (Htron T){
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
    
    public void hinhbinhhanh(Hbh T){
        Color m = T.mau;
        line_DDA(new Dthang(T.d1, T.d2, m));
        line_DDA(new Dthang(T.d2, T.d3, m));
        line_DDA(new Dthang(T.d1, T.d4, m));
        line_DDA(new Dthang(T.d4, T.d3, m));
    }
    
    public void hinhcn(Hcn T) {
        Color m=T.mau;
        line_DDA(new Dthang(T.d1,T.d4,m));
        line_DDA(new Dthang(T.d1,T.d3, m));
        line_DDA(new Dthang(T.d4, T.d2,m));
        line_DDA(new Dthang(T.d2, T.d3, m));
    }
    
    public void hinhvuong(Hvuong T){
        Color m=T.mau;
        line_DDA(new Dthang(T.d1,T.d2, m));
        line_DDA(new Dthang(T.d1,T.d3,m));
        line_DDA(new Dthang(T.d2, T.d4, m));
        line_DDA(new Dthang(T.d3, T.d4, m));
    }
    
    public Dthang[] lines;
    public Htron[] circles ;
    public Hvuong[] squares;
    public Hcn[] rectangles;
    public Elip[] elippses;
    public Hbh[] hinhbhs;

     //THÊM HÌNH VÀO 1 MẢNG
    public void Add(Dthang dt){
        if (lines == null){
            lines = new Dthang[1]; lines[0] = dt;
        }
        else { 
            Dthang[]temp=new Dthang[lines.length+1];
            for (int i = 0; i < lines.length; i++) temp[i] = lines[i];
            temp[lines.length] = dt;
            lines = temp;
        }
    }
    
    public void Add(Htron dt){
        if (circles == null){
            circles = new Htron[1]; circles[0] = dt;
        }
        else{
            Htron[] temp = new Htron[circles.length + 1];
            for (int i = 0; i < circles.length; i++) temp[i] = circles[i];
            temp[circles.length] = dt;
            circles = temp;
        }
    }
    
    public void Add(Hvuong hv){
        if (squares == null){
            squares = new Hvuong[1];
            squares[0] = hv;
        }
        else { 
            Hvuong[] temp = new Hvuong[squares.length + 1];
            for (int i = 0; i < squares.length; i++) temp[i] = squares[i];
            temp[squares.length] = hv;
            squares = temp;
        }
    
    }
    
    public void Add(Hcn cn){
        if (rectangles == null) { rectangles = new Hcn[1]; rectangles[0] = cn; }
        else {
            Hcn []temp=new Hcn[rectangles.length+1];
            for (int i = 0; i < rectangles.length; i++) temp[i] = rectangles[i];
            temp[rectangles.length] = cn;
            rectangles = temp;
        }
                    }
    
    public void Add(Hbh bh){
        if (hinhbhs == null) { hinhbhs = new Hbh[1]; hinhbhs[0] = bh; }
        else { 
            Hbh []temp=new Hbh[hinhbhs .length+1];
            for (int i = 0; i < hinhbhs.length; i++) temp[i] = hinhbhs[i];
            temp[hinhbhs.length] = bh;
            hinhbhs = temp;
        }
    }
    
    //=====các button===//
    //HIỆU ỨNG
    private void hieu_ungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieu_ungActionPerformed
        Color m = Color.WHITE;
        for(int i=0; i<=700; i=i+20){
             heToaDo();
             //body xe
             point5 = new Point(10+i, 350);
             point6 = new Point(220+i, 350);
             dt3 = new Dthang(point5, point6, choosecolor);
             line_DDA(dt3);
             point7 = new Point(60+i, 350);
             point8 = new Point(75+i, 330);
             dt4 = new Dthang(point7, point8, choosecolor);
             line_DDA(dt4);

             point9 = new Point(150+i, 330);
             dt5 = new Dthang(point8, point9, choosecolor);
             line_DDA(dt5);

             point10 = new Point(165+i, 350);
             dt6 = new Dthang(point9, point10, choosecolor);
             line_DDA(dt6);

             point11 = new Point(10+i, 380);
             dt7 = new Dthang(point5, point11, choosecolor);
             line_DDA(dt7);

             point12 = new Point(220+i, 380);
             dt8 = new Dthang(point6, point12, choosecolor);
             line_DDA(dt8);

             point13 = new Point(65+i,380);
             ht1 = new Htron(15,point13,choosecolor);
             ht2 = new Htron(2,point13,choosecolor);
             Midpoint_htron(ht1);
             Midpoint_htron(ht2);

             point14 = new Point(145+i,380);
             ht3 = new Htron(15,point14,choosecolor);
             ht4 = new Htron(2,point14,choosecolor);
             Midpoint_htron(ht3);
             Midpoint_htron(ht4);

             point15 = new Point(60+i, 380);
             dt9 = new Dthang(point15, point11, choosecolor);
             line_DDA(dt9);

             point16 = new Point(80+i, 380);
             point17 = new Point(130+i, 380);
             dt10 = new Dthang(point16, point17, choosecolor);
             line_DDA(dt10);

             point18 = new Point(160+i, 380);
             dt11 = new Dthang(point12, point18, choosecolor);
             line_DDA(dt11);
             //body xe
             point5 = new Point(10+i, 350);
             point6 = new Point(220+i, 350);
             dt3 = new Dthang(point5, point6, m);
             line_DDA(dt3);

             point7 = new Point(60+i, 350);
             point8 = new Point(75+i, 330);
             dt4 = new Dthang(point7, point8, m);
             line_DDA(dt4);

             point9 = new Point(150+i, 330);
             dt5 = new Dthang(point8, point9, m);
             line_DDA(dt5);

             point10 = new Point(165+i, 350);
             dt6 = new Dthang(point9, point10, m);
             line_DDA(dt6);

             point11 = new Point(10+i, 380);
             dt7 = new Dthang(point5, point11, m);
             line_DDA(dt7);

             point12 = new Point(220+i, 380);
             dt8 = new Dthang(point6, point12, m);
             line_DDA(dt8);

             point13 = new Point(65+i,380);
             ht1 = new Htron(15,point13,m);
             ht2 = new Htron(2,point13,m);
             Midpoint_htron(ht1);
             Midpoint_htron(ht2);

             point14 = new Point(145+i,380);
             ht3 = new Htron(15,point14,m);
             ht4 = new Htron(2,point14,m);
             Midpoint_htron(ht3);
             Midpoint_htron(ht4);

             point15 = new Point(60+i, 380);
             dt9 = new Dthang(point15, point11, m);
             line_DDA(dt9);

             point16 = new Point(80+i, 380);
             point17 = new Point(130+i, 380);
             dt10 = new Dthang(point16, point17, m);
             line_DDA(dt10);

             point18 = new Point(160+i, 380);
             dt11 = new Dthang(point12, point18, m);
             line_DDA(dt11);
        }
        
        
        
    }//GEN-LAST:event_hieu_ungActionPerformed

    //LÀM MỚI
    private void lam_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lam_moiActionPerformed
        Panel_ToaDo.repaint();
        System.out.println("rong: "+Panel_ToaDo.getWidth());
        System.out.println("cao: "+Panel_ToaDo.getHeight());
        
    }//GEN-LAST:event_lam_moiActionPerformed

   
    //VẼ HÌNH 1
    public Point point1,point2,point3,point4 ,point5,point6,point7,point8,point9,point10,point11,point12,point13,point14
            ,point15,point16,point17,point18,point19, point20, point21, point22, point23;
    public Dthang dt1, dt2  ,dt3, dt4, dt5,dt6,dt7,dt8,dt9,dt10,dt11,dt12,dt13,dt14,dt15,dt16;
    public Htron ht1,ht2,ht3,ht4;
    private void dthang_duoi(){
        point1 = new Point(0, 450);
        point2 = new Point(700, 450);
        dt1 = new Dthang(point1, point2, choosecolor);
        line_DDA(dt1);
    }
    
    private void dthang_tren(){
        point3 = new Point(0, 270);
        point4 = new Point(700, 270);
        dt2 = new Dthang(point3, point4, choosecolor);
        line_DDA(dt2);
    }
    
    private void xe1(){
        //body xe
        point5 = new Point(10, 350);
        point6 = new Point(220, 350);
        dt3 = new Dthang(point5, point6, choosecolor);
        line_DDA(dt3);
        
        point7 = new Point(60, 350);
        point8 = new Point(75, 330);
        dt4 = new Dthang(point7, point8, choosecolor);
        line_DDA(dt4);

        point9 = new Point(150, 330);
        dt5 = new Dthang(point8, point9, choosecolor);
        line_DDA(dt5);
        
        point10 = new Point(165, 350);
        dt6 = new Dthang(point9, point10, choosecolor);
        line_DDA(dt6);
        
        point11 = new Point(10, 380);
        dt7 = new Dthang(point5, point11, choosecolor);
        line_DDA(dt7);
        
        point12 = new Point(220, 380);
        dt8 = new Dthang(point6, point12, choosecolor);
        line_DDA(dt8);
        
        point13 = new Point(65,380);
        ht1 = new Htron(15,point13,choosecolor);
        ht2 = new Htron(2,point13,choosecolor);
        Midpoint_htron(ht1);
        Midpoint_htron(ht2);
        
        point14 = new Point(145,380);
        ht3 = new Htron(15,point14,choosecolor);
        ht4 = new Htron(2,point14,choosecolor);
        Midpoint_htron(ht3);
        Midpoint_htron(ht4);
        
        point15 = new Point(60, 380);
        dt9 = new Dthang(point15, point11, choosecolor);
        line_DDA(dt9);
        
        point16 = new Point(80, 380);
        point17 = new Point(130, 380);
        dt10 = new Dthang(point16, point17, choosecolor);
        line_DDA(dt10);
        
        point18 = new Point(160, 380);
        dt11 = new Dthang(point12, point18, choosecolor);
        line_DDA(dt11);
    }
    
    private void nui(){
        point18 = new Point(196, 105);
        dt11 = new Dthang(point3, point18, choosecolor);
        line_DDA(dt11);
        
        point19 = new Point(309, 268);
        dt12 = new Dthang(point19, point18, choosecolor);
        line_DDA(dt12);
        
        point20 = new Point(505, 105);
        dt13 = new Dthang(point19, point20, choosecolor);
        line_DDA(dt13);
        
        dt14 = new Dthang(point4, point20, choosecolor);
        line_DDA(dt14);
    }
    
    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        heToaDo();
        dthang_duoi();
        dthang_tren();   
        xe1();
        nui();
    }//GEN-LAST:event_drawActionPerformed

    private void Panel_ToaDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ToaDoMouseClicked
        System.out.println("x: "+evt.getX());
        System.out.println("y: "+evt.getY());
    }//GEN-LAST:event_Panel_ToaDoMouseClicked

    //Chọn màu
    private void draw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draw1ActionPerformed
        heToaDo();
        choosecolor = JColorChooser.showDialog(this, "Bảng Màu ", Color.GREEN);
    }//GEN-LAST:event_draw1ActionPerformed

    //VẼ HÌNH 2
    private void draw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draw2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_draw2ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lam_moi;
    // End of variables declaration//GEN-END:variables
}
