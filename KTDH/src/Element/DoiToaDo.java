
package Element;

import java.awt.Point;

/**
 *
 * @author NHOM8
 */
public class DoiToaDo {
     public int round(double tds){
        int tdm;
        double sodu = tds % 5;
        if (sodu != 0){
            if (sodu >= 3) tdm = (int)(tds + 5 - sodu);
            else tdm = (int)(tds - sodu);
        }
        else 
            tdm = (int)tds;
        
//        if (tdm > 830 && "x".equals(a)){
//            tdm = 830;
//        } 
//            
//        
//        if (tdm > 600 && "y".equals(a)){
//            tdm = 600;
//        }
            
        return tdm;
        }
     
    public Point doiMtoND(int x, int y){
        Point temp = new Point();
        temp.x = x - 415;
        temp.y = (y - 300) * (-1);

        return temp;
    }
     
    public Point NDtoM(int x, int y){
        Point temp = new Point();
        temp.x = x + 415;
        temp.y = y* (-1) + 300 ;

        return temp;
    } 

        /*  public int round(double tds)
          {
              int tdm;
              float sodu = tds % 5;
              if (sodu != 0)
              {
                  if (sodu >= 3) tdm = (int)(tds + 5 - sodu);
                  else tdm = (int)(tds - sodu);
              }
              else tdm = (int)tds;
              return tdm;
          }*/
//        public Point toado1(int x, int y){//lon ra nho
//            return (new Point(x / 5 - 59, 59 - y / 5));//voi x va y deu chia het cho 5
//        }
//        
//        public Point toado2(int x, int y){//nho ra lon
//            return (new Point(x * 5 + 295, 295 - 5 * y));
//        }
//        
//        public Point toado2(double x, double y){//nho ra lon
//            return (new Point(round(x * 5 + 295, "x"), round(295 - 5 * y, "y")));
//        }
}
