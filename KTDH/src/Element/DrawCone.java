
package Element;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author NHOM8
 */
public class DrawCone {
    public static Point point1, point2, point3, point4;
    public static Dthang dt1, dt2, dt3, dt4, dt5;
    public static Elip elip;
    DoiToaDo doitoado = new DoiToaDo();
    double HESO = Math.sqrt(2)/2;
    public  DrawCone(Color choosecolor, int X, int Y, int Z, int L, int W, int H){

        //point 
        point1 = new Point((int)(X-HESO*Z), (int)(Y - HESO*Z));
        point2 = new Point((int)(X + L -HESO*Z), (int)(Y - HESO*Z));
        point3 = new Point((int)(X - L -HESO*Z), (int)(Y - HESO*Z));
        point4 = new Point((int)(X - HESO*Z), (int)(Y + H - HESO*Z));

        //xử lý toạ độ
        point1 = doitoado.NDtoM(point1.x, point1.y);
        point2 = doitoado.NDtoM(point2.x, point2.y);
        point3 = doitoado.NDtoM(point3.x, point3.y);
        point4 = doitoado.NDtoM(point4.x, point4.y);

        //đường thẳng, elip
        dt1 = new Dthang(point1, point2, choosecolor);
        dt2 = new Dthang(point1, point3, choosecolor);
        dt3 = new Dthang(point2, point4, choosecolor);
        dt4 = new Dthang(point3, point4, choosecolor);
        dt5 = new Dthang(point1, point4, choosecolor);
        elip = new Elip(point1, L, W, choosecolor);
    }

}
