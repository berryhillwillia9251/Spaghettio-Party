import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Arrays;

public class CrowdedKeyboard
{
    public static char keyPress;
    
    public static void main(String[] args) throws InterruptedException
    {
         DrawingPanel panel = new DrawingPanel(1060,720);
         String team1 = "";
         String team2 = "";
         String[]tophundred = {"A", "about", "all", "also", "and", "as", "at", "be", "because", "but", "by", "can", "come", "could", "day", "do", "even", "find", "first", "for", "from", "get", "give", "go", "have", "he", "her", "here", "him", "his", "how", "i", "if", "in", "into", "it", "its", "just", "know", "like", "look", "make", "man", "many", "me", "more", "my", "new", "no", "not", "now", "of", "on", "one", "only", "or", "other", "our", "out", "people", "say", "see", "she", "so", "some", "take", "tell", "than", "that", "the", "their", "them", "then", "there", "these", "they", "thing", "think", "this", "those", "time", "to", "two", "up", "use", "very", "want", "way", "we", "well", "what", "when", "which", "who", "will", "with", "would", "year", "you", "your"};
         KeyEventClass myKeyEvent = new KeyEventClass();
        for (int i = 0; i < 20; i++)
        {
            team1 = team1 + tophundred[(int) (Math.random()*50)+1] + " ";
        }
        for (int i = 0; i < 20; i++)
        {
            team2 = team2 + tophundred[(int) (Math.random()*50)+1] + " ";
        }
        while (team1.length() > 1 && team2.length() > 1) {
          String[]newtest = {team1};
          String[]newtest2 = {team2};
         
         for (int i = 0; i < newtest.length; i++)
         {
            Graphics g = panel.getGraphics();
                g.setFont(new Font("Times New Roman", Font.PLAIN,30));
                g.setColor(new Color(255,0,0));  //sets the r,g,b color values
                g.drawString(newtest[i], 25*i+5, 25*i+25);
         }
         for (int i = 0; i < newtest2.length; i++)
         {
            Graphics g = panel.getGraphics();
                g.setFont(new Font("Times New Roman", Font.PLAIN,30));
                g.setColor(new Color(0,0,255));  //sets the r,g,b color values
                g.drawString(newtest2[i], 25*i+5, 25*i+125);
         }
         int looking = 0;
         keyPress = '0';
         while (looking == 0 && team1.length() > 1 && team2.length() > 1) {
          if(keyPress == team1.charAt(0)){
            team1 = team1.substring(1, team1.length());
            looking = 1;
           }
          if(keyPress == team2.charAt(0)) {
            team2 = team2.substring(1, team2.length());
            looking = 1;
           }
         }
         if(keyPress == team1.charAt(0)){
            team1 = team1.substring(1, team1.length());
            looking = 1;
           }  
         panel.clear();
        }
        if (team1.length() <= 1) {
            Graphics g = panel.getGraphics();
                g.setFont(new Font("Times New Roman", Font.PLAIN,30));
                g.setColor(new Color(255,0,0));  //sets the r,g,b color values
                g.drawString("Player 1 and Player 2 Win!", 100, 100);
        }
        if (team2.length() <= 1) {
            Graphics g = panel.getGraphics();
                g.setFont(new Font("Times New Roman", Font.PLAIN,30));
                g.setColor(new Color(255,0,0));  //sets the r,g,b color values
                g.drawString("Player 3 and Player 4 Win!", 300, 100);
        }
    }
}
