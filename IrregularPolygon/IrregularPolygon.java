import java.util.*;
import java.awt.geom.*;
import gpdraw.*;
public class IrregularPolygon
{
    private ArrayList<Point2D.Double> polygon;
    public IrregularPolygon()
    {
        polygon = new ArrayList<Point2D.Double>();
    }
    public IrregularPolygon(ArrayList<Point2D.Double> vertices){
        polygon = vertices;
    }
    public void add(double x, double y){
        Point2D.Double point = new Point2D.Double(x,y);
        polygon.add(point);
    }
    public double dist(int pos1, int pos2){
        Point2D.Double point1= polygon.get(pos1);
        Point2D.Double point2 = polygon.get(pos1);
        return point1.distance(point2);
    }
    public void sort(){
        Collections.sort(polygon, new PolygonComparator());
    }
    public double perimeter(){
        this.sort();
        double sum = 0;
        for(int i = 0; i < polygon.size(); i++){
            if(i != polygon.size() - 1) sum += this.dist(i, i+1);
            sum += this.dist(i, 0);
        }
        return sum;
    }

}
