
package Element;

import java.awt.Color;
import java.awt.Point;


/**
 *
 * @author NHOM8
 */
public class DrawPyramid {
    public static Point point1, point2, point3, point4, point5;
    public static Dthang dt1, dt2, dt3, dt4, dt5, dt6, dt7, dt8, dt9, dt10;
    DoiToaDo_3D doitoado = new DoiToaDo_3D();
    double HESO = Math.sqrt(2)/2;
    public  DrawPyramid(Color choosecolor, int X, int Y, int Z, int L, int W, int H){
        
        X*=5; Y*=5; Z*=5; L*=5; W*=5; H*=5;
        //point (KHỬ TRỤC OZ)
        point1 = new Point((int)(X-HESO*Z), (int)(Y - HESO*Z));
        point2 = new Point((int)(X + L -HESO*Z), (int)(Y - HESO*Z));
        point3 = new Point((int)(X + L -HESO*(Z+W)), (int)(Y - HESO*(Z+W)));
        point4 = new Point((int)(X-HESO*(Z+W)), (int)(Y  - HESO*(Z+W)));
        point5 = new Point((int)(X-HESO*Z), (int)(Y + H - HESO*Z));
         
        //xử lý toạ độ
        point1 = doitoado.NDtoM(point1.x, point1.y);
        point2 = doitoado.NDtoM(point2.x, point2.y);
        point3 = doitoado.NDtoM(point3.x, point3.y);
        point4 = doitoado.NDtoM(point4.x, point4.y);
        point5 = doitoado.NDtoM(point5.x, point5.y);
        
        //đường thẳng
        dt1 = new Dthang(point1, point2, choosecolor);
        dt2 = new Dthang(point2, point3, choosecolor);
        dt3 = new Dthang(point3, point4, choosecolor);
        dt4 = new Dthang(point4, point1, choosecolor);
        
        dt5 = new Dthang(point1, point5, choosecolor);       
        
        dt6 = new Dthang(point2, point5, choosecolor);       
        dt7 = new Dthang(point3, point5, choosecolor);
        dt8 = new Dthang(point4, point5, choosecolor); 
        
        dt9 = new Dthang(point1, point3, choosecolor);     
        dt10 = new Dthang(point2, point4, choosecolor);
    }
}
