import javax.swing.JApplet;
import java.awt.*;
import java.util.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between  2 points ex. - x,y & x1,y1
       
       double d = Math.sqrt((Math.pow((xPos[1] - xPos[0]),2) + Math.pow((yPos[1] - yPos[0]),2)));


        //if the segment/distance is 30 or so, good length to stop
        
            if (d > 2){
            //{
                //find the mid points of each line segment 
                int x1 = (xPos[0] + xPos[1])/2;
                int x2 = (xPos[1] + xPos[2])/2;
                int x3 = (xPos[2] + xPos[3])/2;
                int y1 = (yPos[0] + yPos[1])/2;
                int y2 = (yPos[1] + yPos[2])/2;
                int y3 = (yPos[2] + yPos[3])/2;
                int nX[] = {x1, x2, x3, x1};
                int nY[] = {y1, y2, y3, y1};
    
    
                //make the x and y array (3 points + first point to finish triangle)
    
    
                //draw the Triangle
                page.drawPolyline (nX, nY, nX.length);
    
                //create x,y Array using the midpoints you calculated
                //example
                int X1[] = {xPos[0],x1, x3, xPos[0]};
                int X2[] = {xPos[1],x2, x1, xPos[1]};
                int X3[] = {xPos[2],x3, x2, xPos[2]};
                 int Y1[] = {yPos[0],y1, y3, yPos[0]};
                int Y2[] = {yPos[1],y2, y1, yPos[1]};
                int Y3[] = {yPos[2],y3, y2, yPos[2]};
    
    
    
    
                // Recursive calls for each section of triangle
    
                Triangle(X1, Y1, page);
                Triangle(X2, Y2, page);
                Triangle(X3, Y3, page);
    
            //}
            
       }



   }//end of Triangle
}
