import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;
public class test
{
    public static void test()
    {
        String[][] a = {{" ", " ", "B", "B", "B", "•", "•", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", "B", " ", "*", " ", "•", " ", " ", " ", " ", " ", " ", " ", " "},
                        {" ", " ", "B", " ", "R", " ", "G", "B", "B", "B", "B", "G", "G", "B", "B"},
                        {" ", " ", "B", " ", "R", " ", "B", " ", " ", " ", " ", " ", " ", " ", "B"},
                        {" ", " ", "B", " ", "B", " ", "B", " ", " ", " ", " ", " ", " ", " ", "W"},
                        {"B", "W", " ?", " ", "G", " ", "X", " ", " ", " ", " ", " ", "B", "W", " ?"},
                        {"B", " ", "W", " ", "G", " ", "•", "B", "B", "B", "R", "B", "•", " ", "B"},
                        {"B", " ", "R", " ", "B", " ", " ", " ", " ", " ", " ", " ", " ", " ", "B"},
                        {"X", " ", "B", " ", "B", " ", " ", " ", " ", " ", " ", " ", " ", " ", "W"},
                        {"B", " ", "B", " ", "B", " ", "B", "B", "*", "B", "A", "B", "B", "W", " ?"},
                        {"B", " ", "B", " ", "B", " ", "G", " ", "B", " ", " ", " ", " ", " ", "B"},
                        {"B", " ", "B", " ", "B", " ", "B", " ", "B", " ", " ", " ", " ", " ", "B"},
                        {"G", " ", "G", " ", "B", " ", "B", " ", "B", " ", " ", " ", " ", " ", "R"},
                        {"G", " ", "B", " ", "B", " ", "B", " ", "R", " ", " ", " ", " ", " ", "B"},
                        {"B", "•", "B", "B", "B", "•", "B", "X", "B", "B", "B", "B", "B", "•", "•"}
                    
                    
                    };
        
        DrawingPanel panel = new DrawingPanel(600 ,600);
        int turns = 1;
        
        for (int i = 0; i < 15; i++)
        {
            for (int k = 0; k < 15; k++)
            {
                Graphics g = panel.getGraphics();
                if(a[i][k]=="B")
                {
                    g.setColor(new Color(0 , 0 , 255));
                }
                if (a[i][k]=="R")
                {
                    g.setColor(new Color(255 , 0 , 0));
                }
                if(a[i][k]=="G")
                {
                    g.setColor(new Color(0 , 255 , 0));
                }
                if(a[i][k]=="W")
                {
                    g.setColor(new Color(131 , 131 , 131));
                }
                if(a[i][k]=="X")
                {
                    g.setColor(new Color(255 , 0 ,0));
                    a[i][k]="Ø";
                }
                if(((((a[i][k]!=" ")&&(a[i][k]!="W"))&&(a[i][k]!=" ?"))&&(a[i][k]!="•"))&&(a[i][k]!="Ø"))
                {
                    a[i][k]="O";
                }
                g.setFont(new Font("Calibri", Font.ITALIC,36)); 
                g.drawString(a[i][k], 25*k+25, 25*i+25);
                
            }
        }
        int[][] p = {{99,99,19,18,17,16,16,99,99,99,99,99,99,99,99},
                     {99,99,20,99,18,99,16,99,99,99,99,99,99,99,99},
                     {99,99,21,99,19,99,16,15,14,13,12,11,10,9,8},
                     {99,99,22,99,20,99,99,15,99,99,99,99,99,99,7},
                     {99,99,23,99,21,99,99,14,99,99,99,99,99,99,80},
                     {24,80,23,99,22,99,13,99,99,99,99,99,7,80,6},
                     {25,99,80,99,23,99,12,12,11,10,9,8,7,99,6},
                     {26,99,24,99,24,99,99,99,99,99,99,99,99,99,5},
                     {27,99,25,99,25,99,99,99,99,99,99,99,99,99,80},
                     {28,99,26,99,26,99,10,9,8,8,7,6,5,80,4},
                     {29,99,27,99,27,99,11,99,9,99,99,99,99,99,4},
                     {30,99,28,99,28,99,12,99,10,99,99,99,99,99,3},
                     {31,99,29,99,29,99,13,99,11,99,99,99,99,99,2},
                     {32,99,30,99,30,99,14,99,12,99,99,99,99,99,1},
                     {33,33,34,35,36,36,37,38,39,40,41,42,43,43,43}};
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many turns will this game last?");
        int gameLength = myObj.nextInt();
        Scanner setP1 = new Scanner(System.in);
        System.out.println("What will player 1's piece be?");
        p1 = setP1.nextLine();
        Scanner setP2 = new Scanner(System.in);
        System.out.println("What will player 2's piece be?");
        p2 = setP2.nextLine();
        Scanner setP3 = new Scanner(System.in);
        System.out.println("What will player 3's piece be?");
        p3 = setP3.nextLine();
        Scanner setP4 = new Scanner(System.in);
        System.out.println("What will player 4's piece be?");
        p4 = setP4.nextLine();
        
        int p1LocX = 0;
        int p2LocX = 0;
        int p3LocX = 0;
        int p4LocX = 0;
        int p1LocY = 0;
        int p2LocY = 0;
        int p3LocY = 0;
        int p4LocY = 0;
        int p1decision = 0;
        int p2decision = 0;
        int p3decision = 0;
        int p4decision = 0;
        int p1Coins = 10;
        int p2Coins = 10;
        int p3Conis = 10;
        int p4Coins = 10;
        int p1Stars = 0;
        int p2Stars = 0;
        int p3Stars = 0;
        int p4Stars = 0;
        int p1Roll = 0;
        int p2Roll = 0;
        int p3Roll = 0;
        int p4Roll = 0;
        String p1Placeholder = "";
        String p2Placeholder = "";
        String p3Placeholder = "";
        String p4Placeholder = "";
        while (turns<=gameLength)
        {
            System.out.println("Player 1 is up!");
            while ((p1decision!=1)&&(p1decision!=2))
            {
                Scanner p1turn = new Scanner(System.in);
                System.out.println("Enter 1 to roll the dice, or 2 to use an item and roll.");
                p1decision = p1turn.nextInt();
            }
            if (p1decision == 1)
            {
                p1Roll = (int)(Math.random()*10)+1;
                System.out.println("Player 1 rolled a " + p1Roll +"!");
            }
            else if (p1decision == 2)
            {
                p1Roll = (int)(Math.random()*10)+1;
                System.out.println("Player 1 rolled a " + p1Roll +"!");
            }
            p1decision = 0;
            if (turns == 0)
            {
                while (p1Roll > 0)
                {
                    for (int i = 0; i < 15; i++)
                    {
                        for (int k = 0; k < 15; k++)
                        {
                            if (p[i][k]==1)
                            {
                                p1LocX = k;
                                p1LocY = i;
                                p1Roll = p1Roll - 1;
                                p1Placeholder = a[i][k];
                                a[i][k] = p1;
                            }
                        }
                    }
                    panel.clear();
                    for (int i = 0; i < 15; i++)
                    {
                        for (int k = 0; k < 15; k++)
                        {
                            Graphics g = panel.getGraphics();
                            if(a[i][k]=="B")
                            {
                                g.setColor(new Color(0 , 0 , 255));
                            }
                            if (a[i][k]=="R")
                            {
                                g.setColor(new Color(255 , 0 , 0));
                            }
                            if(a[i][k]=="G")
                            {
                                g.setColor(new Color(0 , 255 , 0));
                            }
                            if(a[i][k]=="W")
                            {
                                g.setColor(new Color(131 , 131 , 131));
                            }
                            if(a[i][k]=="X")
                            {
                                g.setColor(new Color(255 , 0 ,0));
                                a[i][k]="Ø";
                            }
                            if(a[i][k]==p1)
                            {
                                g.setColor(new Color(0 , 0 , 255));
                            }
                            if(a[i][k]==p2)
                            {
                                g.setColor(new Color(255 , 0 , 0));
                            }
                            if(a[i][k]==p3)
                            {
                                g.setColor(new Color(17, 196, 23));
                            }
                            if(a[i][k]==p4)
                            {
                                g.setColor(new Color(255, 200, 0));
                            }
                            if(((((((((a[i][k]!=" ")&&(a[i][k]!="W"))&&(a[i][k]!=" ?"))&&(a[i][k]!="•"))&&(a[i][k]!="Ø"))&&(a[i][k]!=p1))&&(a[i][k]!=p2))&&(a[i][k]!=p3))&&(a[i][k]!=p4))
                            {
                                a[i][k]="O";
                            }
                            g.setFont(new Font("Calibri", Font.ITALIC,36)); 
                            g.drawString(a[i][k], 25*k+25, 25*i+25);
                
                        }
                    }
                    while (p1Roll > 0)
                    {
                        if (p[p1LocY][p1LocX]==1)
                        {
                            p1LocY = 12;
                            p1LocX = 14;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==2)
                        {
                            p1LocY = 11;
                            p1LocX = 14;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==3)
                        {
                            p1LocY = 10;
                            p1LocX = 14;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==4)
                        {
                            int n = (int) (Math.random()*3)+1;
                            if (n > 1)
                            {
                                p1LocY = 7;
                                p1LocX = 14;
                                p1Roll = p1Roll - 1;
                            }
                            else
                            {
                                p1LocY = 9;
                                p1LocX = 12;
                                p1Roll = p1Roll - 1;
                            }
                        }
                        else if ((p1LocY == ) && (p1LocX == ))
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==6)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==7)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==8)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==9)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==10)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==11)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==12)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==13)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==14)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==15)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==16)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==17)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==18)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==19)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==20)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==21)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==22)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==23)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==24)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==25)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==26)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==27)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==28)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==29)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==30)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==31)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==32)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==33)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==34)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==35)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==36)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==37)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==38)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==39)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==40)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==41)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==42)
                        {
                            p1LocY = 13;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                        else if (p[p1LocY][p1LocX]==43)
                        {
                            p1LocY = 14;
                            p1LocX = 15;
                            p1Roll = p1Roll - 1;
                        }
                    }  
                }
            }
            //else
            //{
            //    
            //}
            //p[][]
            
            
            
            turns = turns +1;
        }
        System.out.println("Game end?");
    }
}
