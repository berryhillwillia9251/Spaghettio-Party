import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Arrays;

public class LetterHunt
{
    public static char keyPress;
    
    public static void main(String[] args) throws InterruptedException
    {
        String[][]grid = new String[25][25];
        DrawingPanel panel = new DrawingPanel(1060,720); //creates the size of the panel
        Graphics g = panel.getGraphics();
                g.setFont(new Font("Calibri", Font.PLAIN,36));
                g.setColor(new Color(0,0,0));  //sets the r,g,b color values
        KeyEventClass myKeyEvent = new KeyEventClass();
                
        int[] xPos = {-1,-1,-1,-1};
        int[] yPos = {-1,-1,-1,-1};
        char[] letter = new char[4];
        int temp = 0;
        char tempChar;
        int p1Score = 0, p2Score = 0, p3Score = 0, p4Score = 0;
        int loop;
        
        for (int i = 0; i < 25; i++)
        {
            for (int k = 0; k < 25; k++) 
            {
                grid[i][k] = " ";
            }
        }
        for(int j = 0; j < 11; j++){
            g.setColor(new Color(0, 0, 255));
            g.drawString("Player 1: " + p1Score, 25*0+25, 25*27+25);
            g.setColor(new Color(255, 0, 0));
            g.drawString("Player 2: " + p2Score, 25*10+25, 25*27+25);
            g.setColor(new Color(17, 196, 23));
            g.drawString("Player 3: " + p3Score, 25*20+25, 25*27+25);
            g.setColor(new Color(255, 200, 0));
            g.drawString("Player 4: " + p4Score, 25*30+25, 25*27+25);
            
            for(int i = 0; i < 4; i++){
                xPos[i] = -1;
                yPos[i] = -1;
                letter[i] = '0';
            }
            Thread.sleep((long)((Math.random()*7000)+3000));
            for(int i = 0; i < 4; i++){
                while(xPos[i] == -1){
                    temp = (int)(Math.random() * 25);
                    if(!Arrays.asList(xPos).contains(temp)){
                        xPos[i] = temp;
                    }
                }
                while(yPos[i] == -1){
                    temp = (int)(Math.random() * 25);
                    if(!Arrays.asList(yPos).contains(temp)){
                        yPos[i] = temp;
                    }
                }
                while(letter[i] == '0'){
                    tempChar = (char)((int)(Math.random()*26)+65);
                    if(!((Arrays.asList(letter)).contains(tempChar))){
                        letter[i] = tempChar;
                    }
                }
            }
            g.setColor(new Color(0, 0, 255));
            g.drawString(String.valueOf(letter[0]), 25*xPos[0]+25, 25*yPos[0]+25);
            g.setColor(new Color(255, 0, 0));
            g.drawString(String.valueOf(letter[1]), 25*xPos[1]+25, 25*yPos[1]+25);
            g.setColor(new Color(17, 196, 23));
            g.drawString(String.valueOf(letter[2]), 25*xPos[2]+25, 25*yPos[2]+25);
            g.setColor(new Color(255, 200, 0));
            g.drawString(String.valueOf(letter[3]), 25*xPos[3]+25, 25*yPos[3]+25);
            
            
            loop = 0;
            keyPress = '0';
            while(loop == 0){
                if(Character.toUpperCase(keyPress) == letter[0]){
                    //System.out.println("Player 1 point");
                    p1Score++;
                    g.setColor(new Color(0, 0, 255));
                    loop = 1;
                }else if(Character.toUpperCase(keyPress) == letter[1]){
                    //System.out.println("Player 2 point");
                    p2Score++;
                    g.setColor(new Color(255, 0, 0));
                    loop = 2;
                }else if(Character.toUpperCase(keyPress) == letter[2]){
                    //System.out.println("Player 3 point");
                    p3Score++;
                    g.setColor(new Color(17, 196, 23));
                    loop = 3;
                }else if(Character.toUpperCase(keyPress) == letter[3]){
                    //System.out.println("Player 4 point");
                    p4Score++;
                    g.setColor(new Color(255, 200, 0));
                    loop = 4;
                }
            }
            
            g.fillRect(0, 0, 1060, 720);
 
            Thread.sleep(1000);
            
            panel.clear();
            //System.out.println(p1Score + " " + p2Score + " " + p3Score + " " + p4Score);
            
            //while(){
                
            //}
            //panel.clear();
        }
        
        g.setColor(new Color(0, 0, 255));
            g.drawString("Player 1: " + p1Score, 25*0+25, 25*27+25);
            g.setColor(new Color(255, 0, 0));
            g.drawString("Player 2: " + p2Score, 25*10+25, 25*27+25);
            g.setColor(new Color(17, 196, 23));
            g.drawString("Player 3: " + p3Score, 25*20+25, 25*27+25);
            g.setColor(new Color(255, 200, 0));
            g.drawString("Player 4: " + p4Score, 25*30+25, 25*27+25);
        
        int largest = 0;
        int large = 0;
        if(p1Score > largest){
            largest = p1Score;
            large = 0;
        }
        if(p2Score > largest){
            largest = p2Score;
            large = 1;
        }
        if(p3Score > largest){
            largest = p3Score;
            large = 2;
        }
        if(p4Score > largest){
            largest = p4Score;
            large = 3;
        }
        
        if(large == 0){
            g.setColor(new Color(0, 0, 255));
            g.drawString("Player 1 Wins!", 25*16+25, 25*12+25);
        }
        if(large == 1){
            g.setColor(new Color(255, 0, 0));
            g.drawString("Player 2 Wins!", 25*16+25, 25*12+25);
        }
        if(large == 2){
            g.setColor(new Color(17, 196, 23));
            g.drawString("Player 3 Wins!", 25*16+25, 25*12+25);
        }
        if(large == 3){
            g.setColor(new Color(255, 200, 0));
            g.drawString("Player 4 Wins!", 25*16+25, 25*12+25);
        }
    }
}
