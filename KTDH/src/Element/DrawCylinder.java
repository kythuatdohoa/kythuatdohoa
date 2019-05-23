
package Element;

import Element.DoiToaDo;
import Element.Dthang;
import Element.Elip;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author NHOM8
 */
public class DrawCylinder {
    public static Point point1, point2, point3, point4, point5, point6;
    public static Dthang dt1, dt2, dt3, dt4, dt5;
    public static Elip elip1, elip2;
    DoiToaDo doitoado = new DoiToaDo();
    double HESO = Math.sqrt(2)/2;
    public  DrawCylinder(Color choosecolor, int X, int Y, int Z, int L, int W, int H){

        //point 
//        point1 = new Point((int)(X-HESO*Z), (int)(Y - HESO*Z));
//        point2 = new Point((int)(X - L -HESO*Z), (int)(Y - HESO*Z));
//        point3 = new Point((int)(X + L -HESO*Z), (int)(Y - HESO*Z));
//        
//        point4 = new Point((int)(X - HESO*(Z-H)), (int)(Y - HESO*(Z-H)));
//        point5 = new Point((int)(X - L - HESO*(Z-H)), (int)(Y - HESO*(Z-H)));
//        point6 = new Point((int)(X + L - HESO*(Z-H)), (int)(Y - HESO*(Z-H)));

        X*=5; Y*=5; Z*=5; L*=5; W*=5; H*=5;
        point1 = new Point(X, Y);
        point2 = new Point(X - L, Y);
        point3 = new Point(X + L, Y);
        
        point4 = new Point(X, Y - H);
        point5 = new Point(X - L , Y - H);
        point6 = new Point(X + L, Y - H);

        //xử lý toạ độ
        point1 = doitoado.NDtoM(point1.x, point1.y);
        point2 = doitoado.NDtoM(point2.x, point2.y);
        point3 = doitoado.NDtoM(point3.x, point3.y);
        point4 = doitoado.NDtoM(point4.x, point4.y);
        point5 = doitoado.NDtoM(point5.x, point5.y);
        point6 = doitoado.NDtoM(point6.x, point6.y);
        //đường thẳng, elip
        dt1 = new Dthang(point2, point3, choosecolor);
        dt2 = new Dthang(point5, point6, choosecolor);
        dt3 = new Dthang(point2, point5, choosecolor);
        dt4 = new Dthang(point1, point4, choosecolor);
        dt5 = new Dthang(point3, point6, choosecolor);
        elip1 = new Elip(point1, L, W, choosecolor);
        elip2 = new Elip(point4, L, W, choosecolor);
    }

}
