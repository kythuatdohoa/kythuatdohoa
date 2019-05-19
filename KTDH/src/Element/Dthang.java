
package Element;
import java.awt.Color;
import java.awt.Point;
import java.math.MathContext;
/**
 *
 * @author NHOM8
 */
public class Dthang {
    public Point diemdau;
    public Point diemcuoi;
    public Color mau;
    public double hesogoc, b1;
    public int b;
      
    public Dthang(){
        diemdau = new Point(0,0);
        diemcuoi = new Point(0,0);
        mau=Color.GREEN;
        hesogoc = 0;
        b1 = b = 0;
      }
    
    public Dthang(Point dd, Point dc, Color m){
        int ddx = dd.x; 
        int dcx = dc.x; 
        int ddy = dd.y;
        int dcy = dc.y;
        diemdau =dd ;
        diemcuoi = dc;
        mau = m;
        if (ddx == dcx) 
               hesogoc = 0;
      /*  else 
            hesogoc = (ddy - dcy) / (ddx - dcx);
        b1 = ddy - hesogoc * ddx;
        b= (int)b1;
        */// 18-5
        //18-5
        /* nhận thấy mất logic ở phần ddy - dcy trong trường hợp ddy < dcy*/
        else 
            hesogoc = Math.abs((Math.abs(ddy) - Math.abs(dcy))) / Math.abs(Math.abs(ddx) -  Math.abs(dcx));
            if (ddy>dcy)
                b1 = Math.abs(Math.abs(ddy) - hesogoc * Math.abs(ddx));
            else
                b1 = Math.abs(Math.abs(dcy) - hesogoc * Math.abs(ddx));
            
                   
        b= (int)b1;
    }
      
    public void setpro(Point dd,Point dc,Color m){
        diemdau = dd;
        diemcuoi = dc;
        mau = m;
    }
    
    public Dthang getpro(){
        Dthang item = new Dthang(diemdau, diemcuoi, mau);
        return item;
    }
    
    public double gethsg(){ 
        return hesogoc; 
    }
      
    public int getb(){ 
        return b; 
    }
}
