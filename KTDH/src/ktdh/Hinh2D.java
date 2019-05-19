
package ktdh;

import Element.DoiToaDo;
import Element.Dthang;
import Element.Hbh;
import Element.Hcn;
import Element.Htron;
import Element.Hvuong;
        
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
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
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Panel_ToaDo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel4.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Hien thi toa do");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Hiệu Ứng");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Làm Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Vẽ Hình");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
            .addGap(0, 590, Short.MAX_VALUE)
        );
        Panel_ToaDoLayout.setVerticalGroup(
            Panel_ToaDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton3)
                        .addGap(60, 60, 60)
                        .addComponent(jButton4)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1))
                    .addComponent(Panel_ToaDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(Panel_ToaDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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

    
    //========================================================================//
    static int click=-1;
    public Point[] points = new Point[2];
    //========================================================================//
    public void putpixel(int x,int y,Color m){
        if (x < 0 || x > 400 || y < 0 || y > 400) return;
          
        Graphics2D graphic = (Graphics2D) this.Panel_ToaDo.getGraphics();
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double(x, y, 2, 2));
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double(x - 2, y - 2, 2, 2));
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double( x , y - 2, 2, 2));
          
        graphic.setPaint(m);
        graphic.fill(new Ellipse2D.Double( x - 2, y, 2, 2));
         
        //PutColor.putcolor(x, y, m);
    }
    
    public void heToaDo(){
        Graphics2D graphic = (Graphics2D) this.Panel_ToaDo.getGraphics();
        for (int i = 0; i <= 118; i++){
            graphic.drawLine(5*i, 0, 5*i, 590);
            graphic.drawLine(0, 5*i, 590, 5*i);
        }
        graphic.setColor(Color.RED);
        graphic.drawLine(0, 295, 590, 295);
        graphic.drawLine(295, 0, 295, 590);
    }
    // các thuật toán vẽ hình
    public void line_DDA(Dthang T){ // Ve duong thang co dinh dang mau
        Color m = T.mau;
        DoiToaDo doitoado = new DoiToaDo();
        int Dx, Dy, count, temp_1, temp_2, dem = 1;
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
                dem++;
            } while (count != -1);
        }
    }
    private void put8pitxel(int x,int y,int cx,int cy,Color m)
        {
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
            while (x <= maxX)
            {
                if (p < 0) p += 2 * x+3;
                else { p += 2 * (x - y) +5; y-=5; }
                x+=5;
                put8pitxel(x,y,cx,cy, m);
            }
          
    }
    public void hinhbinhhanh(Hbh T)
        {
            Color m = T.mau;
            line_DDA(new Dthang(T.d1, T.d2, m));
            line_DDA(new Dthang(T.d2, T.d3, m));
            line_DDA(new Dthang(T.d1, T.d4, m));
            line_DDA(new Dthang(T.d4, T.d3, m));
        }
    public void hinhcn(Hcn T)
        {
          
            Color m=T.mau;
            line_DDA(new Dthang(T.d1,T.d4,m));
            line_DDA(new Dthang(T.d1,T.d3, m));
            line_DDA(new Dthang(T.d4, T.d2,m));
            line_DDA(new Dthang(T.d2, T.d3, m));
        }
    public void hinhvuong(Hvuong T)
        {
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
   // public elip[] elippses;
    public Hbh[] hinhbhs;
    //LƯỚI PIXEL
    /*    */
    //HIỆU ỨNG
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
    }//GEN-LAST:event_jButton4ActionPerformed

    //THÊM HÌNH VÀO 1 MẢNG
    public void Add(Dthang dt)
        {
            if (lines == null)
            {
                lines = new Dthang[1]; lines[0] = dt;
            }
            else { Dthang[]temp=new Dthang[lines.length+1];
                for (int i = 0; i < lines.length; i++) temp[i] = lines[i];
                temp[lines.length] = dt;
                 lines = temp;
            }
        }
        public void Add(Htron dt)
        {
            if (circles == null)
            {
                circles = new Htron[1]; circles[0] = dt;
            }
            else
            {
                Htron[] temp = new Htron[circles.length + 1];
                for (int i = 0; i < circles.length; i++) temp[i] = circles[i];
                temp[circles.length] = dt;
               circles = temp;
            }
        }
        public void Add(Hvuong hv)
        {
            if (squares == null)
            {
                squares = new Hvuong[1];
                squares[0] = hv;
            }
            else { Hvuong[] temp = new Hvuong[squares.length + 1];
                   for (int i = 0; i < squares.length; i++) temp[i] = squares[i];
                   temp[squares.length] = hv;
                   squares = temp;
                     }
        }
        public void Add(Hcn cn)
        {
            if (rectangles == null) { rectangles = new Hcn[1]; rectangles[0] = cn; }
            else {Hcn []temp=new Hcn[rectangles.length+1];
            for (int i = 0; i < rectangles.length; i++) temp[i] = rectangles[i];
            temp[rectangles.length] = cn;
            rectangles = temp;
        }
                    }
        public void Add(Hbh bh)
        {
            if (hinhbhs == null) { hinhbhs = new Hbh[1]; hinhbhs[0] = bh; }
            else { Hbh []temp=new Hbh[hinhbhs .length+1];
            for (int i = 0; i < hinhbhs.length; i++) temp[i] = hinhbhs[i];
            temp[hinhbhs.length] = bh;
            hinhbhs = temp;
        }
        }
    //LÀM MỚI
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Panel_ToaDo.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    //VẼ HÌNH
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        heToaDo();//18-5
        Dthang []lines = null;
        for(int i=0; i< lines.length; i++){
            line_DDA(lines[i]);
        }
        
        Htron []circles = null;
        for (int i = 0; i < circles.length; i++) {
            Midpoint_htron(circles[i]);
        }
        Hbh []hinhbhs = null;
        for (int i = 0; i < hinhbhs.length; i++){
            hinhbinhhanh(hinhbhs[i]);
        }
        Hcn []rectangles = null;
        for (int i = 0; i < rectangles.length; i++){
            hinhcn(rectangles[i]);
        }
        Hvuong []squares = null;
        for (int i = 0; i < squares.length; i++){
            hinhvuong(squares[i]);
        }
               
    }//GEN-LAST:event_jButton3ActionPerformed
    // click chuột vẽ
    private void Panel_ToaDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ToaDoMouseClicked
        int X, Y;
        DoiToaDo doitoado = new DoiToaDo();
        X = doitoado.round(evt.getX());
        Y = doitoado.round(evt.getY());
        ++click;
        if (click == 0){
            points[click] = new Point(X, Y);
            putpixel(X, Y, Color.BLUE);//to diem da chon
        }
        if (click == 1){
            points[click] = new Point(X, Y);
            putpixel(X, Y, Color.BLUE);
           /* 
            // ĐƯỜNG THẲNG
            Dthang dt = new Dthang(points[0], points[1], Color.BLUE);
            line_DDA(dt);
            */
           /*
            // HÌNH TRÒN
            int bk = Math.abs(points[1].x - points[0].x);
                Htron tr = new Htron(bk, points[0], Color.DARK_GRAY);
               // this.Add(tr);
                Midpoint_htron(tr);
           */
           /*
           //HÌNH VUÔNG
           Hvuong hv = new Hvuong(points[0], points[1], Color.DARK_GRAY);
                //this.Add(hv);
                hinhvuong(hv);
           */
            /*
           //HÌNH CHỮ NHẬT
            Hcn cn = new Hcn(points[0], points[1], Color.DARK_GRAY);
                this.Add(cn);
                hinhcn(cn);
           */
            
            //HÌNH BÌNH HÀNH
            Hbh bh = new Hbh(points[0], points[1], points[2], Color.DARK_GRAY);
                //this.Add(bh);
                hinhbinhhanh(bh);
        }
        if(click > 1){
            click = -1;
        }
    }//GEN-LAST:event_Panel_ToaDoMouseClicked
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
