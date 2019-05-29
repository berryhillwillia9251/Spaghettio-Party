import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class blank
{
    public static void blank()
    {
        String[][]test = {{"A", "B", "C"},
                          {"D", "E", "F"},
                          {"G", "H", " I"}};
        DrawingPanel panel = new DrawingPanel(1060,720); //creates the size of the panel
        for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 3; k++) 
            {
                Graphics g = panel.getGraphics();
                g.setFont(new Font("Calibri", Font.PLAIN,36));
                g.setColor(new Color(255,0,0));  //sets the r,g,b color values
                g.drawString(test[i][k], 25*k+25, 25*i+25);
            }
        }
    }
}