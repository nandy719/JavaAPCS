import java.awt.geom.*;
import java.util.*;
public class PolygonComparator implements Comparator<Point2D.Double>
{
   public int compare(Point2D.Double a, Point2D.Double b){
       return  (int)Math.ceil((a.distance(new Point2D.Double(0,0)) - b.distance(new Point2D.Double(0,0))));
    }

}
