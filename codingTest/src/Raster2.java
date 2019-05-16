import java.io.Console;

public class Raster2 {
    void DrawCirclePoints(int points, double radius, Point center)
    {
        double slice = 2 * Math.PI / points;
        for (int i = 0; i < points; i++)
        {
            double angle = slice * i;
            int newX = (int)(center.X + radius * Math.Cos(angle));
            int newY = (int)(center.Y + radius * Math.Sin(angle));
            Point p = new Point(newX, newY);
            System.out.println(p);
        }
    }
    class Point {
        int X;
        int Y;
        Point(){};
        Point(int newX,int  newY){

        };

    }

}
