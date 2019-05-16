import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Raster
{
    public static void main(String[] args) throws IOException
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI()
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new CircleIntersectionPanel());
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

class CircleIntersectionPanel extends JPanel
        implements MouseMotionListener
{
    private Point mousePosition = null;

    CircleIntersectionPanel()
    {
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D)gr;

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radius = 200;

        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);;
        g.draw(new Ellipse2D.Double(
                centerX-radius, centerY-radius,
                radius+radius, radius+radius));
        if (mousePosition == null)
        {
            return;
        }

        g.setColor(Color.RED);
        g.draw(new Line2D.Double(
                mousePosition.x, centerY, mousePosition.x, 0));

        g.setColor(Color.BLUE);

        double x = (mousePosition.x - centerX) / radius;
        double y = computeY(x);

        double cx = centerX + radius * x;
        double cy = centerY - radius * y;
        g.fill(new Ellipse2D.Double(cx-8, cy-8, 16, 16));

        g.setColor(Color.BLACK);
        g.drawString("x = "+x, 10, 30);
        g.drawString("y = "+y, 10, 46);
        g.drawString("angle: "+Math.toDegrees(Math.acos(x)), 10, 62);

    }

    private static double computeY(double x)
    {
        return Math.sin(Math.acos(x));
    }


    @Override
    public void mouseMoved(MouseEvent e)
    {
        mousePosition = e.getPoint();
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
    }

}