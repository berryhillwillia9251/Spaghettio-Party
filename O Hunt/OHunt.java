import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;


public class OHunt
{
    public static int keyPress;
    public static int time = 30;
    public static int timecheck = 1;
    static class SayHello extends TimerTask {
        public void run() {
         if (time > 0) {time = time - 1;}
         timecheck = 0;
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        DrawingPanel panel = new DrawingPanel(1060,720);
        int p1c = 0;
        int p2c = 0;
        int p3c = 0;
        int p4c = 0;
        int test = 0;
        int num = 0;
        int p1win = 0;
        int p2win = 0;
        int p3win = 0;
        int p4win = 0;
        
        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 1000);
        KeyEventClass myKeyEvent = new KeyEventClass();
        int random = (int) (Math.random()*10);
        String thing = "O";
        String[][] board = new String[20][20];
        for (int i = 0; i < board.length; i++)
         {
            for (int k = 0; k < board[0].length; k++)
          {
                if (random == 0){
                 thing = "O";
                }else if (random == 1){
                 thing = "o";
                }else if (random == 2){
                 thing = "0";
                }else{
                 thing = "";
                }
                board[i][k] = thing;
                random = (int) (Math.random()*10);
          }
         }
        while (time > 0) { 
        
         for (int i = 0; i < board.length; i++)
         {
            for (int k = 0; k < board[0].length; k++)
          {
                Graphics g = panel.getGraphics();
                g.setFont(new Font("Times New Roman", Font.PLAIN,18));
                g.setColor(new Color(255,0,255));  //sets the r,g,b color values
                g.drawString(board[i][k], 30*i+30, 30*k+30);
          }
         }
         Graphics g = panel.getGraphics();
         g.setFont(new Font("Times New Roman", Font.PLAIN,25));
         g.setColor(new Color(0, 0, 255));
         g.drawString("Player 1", 100, 650);
         g.drawString(Integer.toString(p1c), 100, 680);
         g.setColor(new Color(255, 0, 0));
         g.drawString("Player 2", 300, 650);
         g.drawString(Integer.toString(p2c), 300, 680);
         g.setColor(new Color(17, 196, 23));
         g.drawString("Player 3", 500, 650);
         g.drawString(Integer.toString(p3c), 500, 680);
         g.setColor(new Color(255, 200, 0));
         g.drawString("Player 4", 700, 650);
         g.drawString(Integer.toString(p4c), 700, 680);
         g.setColor(new Color(0, 0, 0));
         g.drawString(Integer.toString(time), 1000, 50);
         int looking = 0;
         keyPress = '0';
         while (looking == 0 && time > 0) {
          if(keyPress == 68){
            p1c = p1c  + 1;
            looking = 1;
           }
          if(keyPress == 65 && p1c > 0){
            p1c = p1c - 1;
            looking = 1;
           }
          if(keyPress == 76){
            p2c = p2c  + 1;
            looking = 1;
          }
          if(keyPress == 74 && p2c > 0){
            p2c = p2c  - 1;
            looking = 1;
          }
          if(keyPress == 39){
            p3c = p3c  + 1;
            looking = 1;
          }
          if(keyPress == 37 && p3c > 0){
            p3c = p3c  - 1;
            looking = 1;
          }
          if(keyPress == 102){
            p4c = p4c  + 1;
            looking = 1;
          }
          if(keyPress == 100 && p4c > 0){
            p4c = p4c  - 1;
            looking = 1;
          }
          if(timecheck == 0){
              panel.clear();
              for (int i = 0; i < board.length; i++)
         {
            for (int k = 0; k < board[0].length; k++)
          {
                g = panel.getGraphics();
                g.setFont(new Font("Times New Roman", Font.PLAIN,18));
                g.setColor(new Color(255,0,255));  //sets the r,g,b color values
                g.drawString(board[i][k], 30*i+30, 30*k+30);
          }
         }
          g = panel.getGraphics();
          g.setFont(new Font("Times New Roman", Font.PLAIN,25));
          g.setColor(new Color(0, 0, 255));
          g.drawString("Player 1", 100, 650);
          g.drawString(Integer.toString(p1c), 100, 680);
          g.setColor(new Color(255, 0, 0));
          g.drawString("Player 2", 300, 650);
          g.drawString(Integer.toString(p2c), 300, 680);
          g.setColor(new Color(17, 196, 23));
          g.drawString("Player 3", 500, 650);
          g.drawString(Integer.toString(p3c), 500, 680);
          g.setColor(new Color(255, 200, 0));
          g.drawString("Player 4", 700, 650);
          g.drawString(Integer.toString(p4c), 700, 680);
          g.setColor(new Color(0, 0, 0));
          g.drawString(Integer.toString(time), 1000, 50);
          timecheck = 1;
         }
        }
         panel.clear();
       }
       for (int i = 0; i < board.length; i++)
         {
            for (int k = 0; k < board[0].length; k++)
          {
                if (board[i][k] == "O") {
                    num = num + 1;
                }
          }
         }
         Graphics g = panel.getGraphics();
          g.setFont(new Font("Times New Roman", Font.PLAIN,25));
          g.setColor(new Color(0, 0, 0));
          g.drawString("The count was " + num + "!", 300, 300);
       int p1d = Math.abs(p1c - num);
       int p2d = Math.abs(p2c - num);
       int p3d = Math.abs(p3c - num);
       int p4d = Math.abs(p4c - num);
       if (p2d <= p1d && p2d <= p3d && p2d <= p4d) {
          p2win = 1;
          g = panel.getGraphics();
          g.setFont(new Font("Times New Roman", Font.PLAIN,25));
          g.setColor(new Color(255, 0, 0));
          g.drawString("Player 2 Wins with " + p2c + "!", 300, 650);
       } else if (p1d <= p2d && p1d <= p3d && p1d <= p4d) {
          p1win = 1;
          g = panel.getGraphics();
          g.setFont(new Font("Times New Roman", Font.PLAIN,25));
          g.setColor(new Color(0, 0, 255));
          g.drawString("Player 1 Wins with " + p1c + "!", 100, 650);
        } else if (p3d <= p1d && p3d <= p2d && p3d <= p4d) {
          p3win = 1;
          g = panel.getGraphics();
          g.setFont(new Font("Times New Roman", Font.PLAIN,25));
          g.setColor(new Color(17, 196, 23));
          g.drawString("Player 3 Wins with " + p3c + "!", 500, 650);
        } else if (p4d <= p1d && p4d <= p2d && p4d <= p3d) {
            p4win = 1;
           g = panel.getGraphics();
          g.setFont(new Font("Times New Roman", Font.PLAIN,25));
          g.setColor(new Color(255, 200, 0));
          g.drawString("Player 4 Wins with " + p4c + "!", 700, 650);
        }
       //if p1win = 1, give coins to p1 and same for the other 3 players
    }
    
}
