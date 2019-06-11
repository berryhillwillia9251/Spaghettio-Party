import java.util.Scanner;
/**
 * Write a description of class Race here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Race
{
    // instance variables - replace the example below with your own

    public static void main ()
    {
        //Declare the gameboard
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of Players (3 or 4): ");
        int players = reader.nextInt();
        while (players < 3 || players > 4) {
            System.out.println("Invalid Number of Players. Try again: ");
            players = reader.nextInt();
          }
        if (players == 3) {
        int player1r = 0;
        int player1c = 0;
        int player2r = 0;
        int player2c = 1;
        int player3r = 0;
        int player3c = 2;
        int player1d;
        int player2d;
        int player3d;
        int player1td;
        int player2td;
        int player3td;
        String continuegame;
        char continuegam;
        boolean gameend = false;
        System.out.println("Set Game Size (Must be larger than 3): ");
         
        int rowsize = reader.nextInt();
        while (rowsize < 4) {
            System.out.println("Invalid Game Size. Try again: ");
            rowsize = reader.nextInt();
          }
        System.out.println("Player 1 - Choose a game piece: ");
        String user1Str = reader.next();
        char user1Char = user1Str.charAt(0);
        System.out.println("Player 2 - Choose a game piece: ");
        String user2Str = reader.next();
        char user2Char = user2Str.charAt(0);
        System.out.println("Player 3 - Choose a game piece: ");
        String user3Str = reader.next();
        char user3Char = user3Str.charAt(0);
        char[][] gBoard = new char[rowsize + 1][players];
        
        
        
        while (gameend == false) {
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 1 - Choose a number of spaces to travel (1-4): ");
        player1d = reader.nextInt();
        player1td = player1d;
        while (player1d > 4 || player1d < 1) {
            player1d = reader.nextInt();
            player1td = player1d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 2 - Choose a number of spaces to travel (1-4): ");
        player2d = reader.nextInt();
        player2td = player2d;
        while (player2d > 4 || player2d < 1) {
            player2d = reader.nextInt();
            player2td = player2d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 3 - Choose a number of spaces to travel (1-4): ");
        player3d = reader.nextInt();
        player3td = player3d;
        while (player3d > 4 || player3d < 1) {
            player3d = reader.nextInt();
            player3td = player3d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        if (player1td == player2td || player1td == player3td ) {
            player1d = 0;
        }
        if (player2td == player1td || player2td == player3td ) {
            player2d = 0;
        }
        if (player3td == player2td || player3td == player1td ) {
            player3d = 0;
        }
        player1r = player1r + player1d;
        if (player1r > rowsize) {
            player1r = rowsize;
        }
        player2r = player2r + player2d;
        if (player2r > rowsize) {
            player2r = rowsize;
        }
        player3r = player3r + player3d;
        if (player3r > rowsize) {
            player3r = rowsize;
        }
        
        if (player1r == rowsize) {
            gameend = true;
        }
        
        if (player2r == rowsize) {
            gameend = true;
        }
        
        if (player3r == rowsize) {
            gameend = true;
        }
        
      System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }  
     System.out.println("Player 1 Chose: " + player1td);
     System.out.println("Player 2 Chose: " + player2td);
     System.out.println("Player 3 Chose: " + player3td);
     System.out.println("---------------------------------------------------");
     System.out.println("Player 1 Moved: " + player1d);
     System.out.println("Player 2 Moved: " + player2d);
     System.out.println("Player 3 Moved: " + player3d);
     System.out.println("---------------------------------------------------");
     System.out.println("Press c to Continue");
     continuegame = reader.next();
     continuegam = continuegame.charAt(0);
     while (continuegam != 'c') {
            continuegame = reader.next();
            continuegam = continuegame.charAt(0);
          }
     continuegam = 'A';
     

    
     }
     
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
        }
        if (player1r == rowsize) {
            System.out.println("Player 1 Won!");
        } if (player2r == rowsize) {
            System.out.println("Player 2 Won!");
        } if (player3r == rowsize) {
            System.out.println("Player 3 Won!");
        }
    }
        if (players == 4) {
        int player1r = 0;
        int player1c = 0;
        int player2r = 0;
        int player2c = 1;
        int player3r = 0;
        int player3c = 2;
        int player4r = 0;
        int player4c = 3;
        int player1d;
        int player2d;
        int player3d;
        int player4d;
        int player1td;
        int player2td;
        int player3td;
        int player4td;
        String continuegame;
        char continuegam;
        boolean gameend = false;
        System.out.println("Set Game Size (Must be larger than 3): ");
         
        int rowsize = reader.nextInt();
        while (rowsize < 4) {
            System.out.println("Invalid Game Size. Try again: ");
            rowsize = reader.nextInt();
          }
        System.out.println("Player 1 - Choose a game piece: ");
        String user1Str = reader.next();
        char user1Char = user1Str.charAt(0);
        System.out.println("Player 2 - Choose a game piece: ");
        String user2Str = reader.next();
        char user2Char = user2Str.charAt(0);
        System.out.println("Player 3 - Choose a game piece: ");
        String user3Str = reader.next();
        char user3Char = user3Str.charAt(0);
        System.out.println("Player 4 - Choose a game piece: ");
        String user4Str = reader.next();
        char user4Char = user4Str.charAt(0);
        char[][] gBoard = new char[rowsize + 1][players];
        
        
        
        while (gameend == false) {
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 1 - Choose a number of spaces to travel (1-4): ");
        player1d = reader.nextInt();
        player1td = player1d;
        while (player1d > 4 || player1d < 1) {
            player1d = reader.nextInt();
            player1td = player1d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 2 - Choose a number of spaces to travel (1-4): ");
        player2d = reader.nextInt();
        player2td = player2d;
        while (player2d > 4 || player2d < 1) {
            player2d = reader.nextInt();
            player2td = player2d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 3 - Choose a number of spaces to travel (1-4): ");
        player3d = reader.nextInt();
        player3td = player3d;
        while (player3d > 4 || player3d < 1) {
            player3d = reader.nextInt();
            player3td = player3d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        System.out.println("Player 4 - Choose a number of spaces to travel (1-4): ");
        player4d = reader.nextInt();
        player4td = player4d;
        while (player4d > 4 || player4d < 1) {
            player4d = reader.nextInt();
            player4td = player4d;
        }
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }
        if (player1td == player2td || player1td == player3td || player1td == player4td) {
            player1d = 0;
        }
        if (player2td == player1td || player2td == player3td || player2td == player4td) {
            player2d = 0;
        }
        if (player3td == player2td || player3td == player1td || player3td == player4td) {
            player3d = 0;
        }
        if (player4td == player2td || player4td == player3td || player4td == player1td) {
            player4d = 0;
        }
        player1r = player1r + player1d;
        if (player1r > rowsize) {
            player1r = rowsize;
        }
        player2r = player2r + player2d;
        if (player2r > rowsize) {
            player2r = rowsize;
        }
        player3r = player3r + player3d;
        if (player3r > rowsize) {
            player3r = rowsize;
        }
        player4r = player4r + player4d;
        if (player4r > rowsize) {
            player4r = rowsize;
        }
        
        if (player1r == rowsize) {
            gameend = true;
        }
        
        if (player2r == rowsize) {
            gameend = true;
        }
        
        if (player3r == rowsize) {
            gameend = true;
        }
        
        if (player4r == rowsize) {
            gameend = true;
        }
      System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
            }  
     System.out.println("Player 1 Chose: " + player1td);
     System.out.println("Player 2 Chose: " + player2td);
     System.out.println("Player 3 Chose: " + player3td);
     System.out.println("Player 4 Chose: " + player4td);
     System.out.println("---------------------------------------------------");
     System.out.println("Player 1 Moved: " + player1d);
     System.out.println("Player 2 Moved: " + player2d);
     System.out.println("Player 3 Moved: " + player3d);
     System.out.println("Player 4 Moved: " + player4d);
     System.out.println("---------------------------------------------------");
     System.out.println("Press c to Continue");
     continuegame = reader.next();
     continuegam = continuegame.charAt(0);
     while (continuegam != 'c') {
            continuegame = reader.next();
            continuegam = continuegame.charAt(0);
          }
     continuegam = 'A';
     

    
     }
     
        System.out.print("\f");
        for ( int row = 0; row < gBoard.length; row++ )
        {
            for (int col = 0; col < gBoard[0].length; col++ )
            {
                //Fill the gBoard with blank values 
                gBoard[row][col] = '.';
             
            } //inner for loop
        }
        gBoard[player1r][player1c] = user1Char;
        gBoard[player2r][player2c] = user2Char;
        gBoard[player3r][player3c] = user3Char;
        gBoard[player4r][player4c] = user4Char;
        for ( int row = 0; row < gBoard.length; row++ )
            {
                for (int col = 0; col < gBoard[0].length; col++ )
                {
                    //Print across.  One line.  Use '.print()'
                    System.out.print(gBoard[row][col]);
                 
                } //inner for loop
                //End the line.  use ".println()"
                System.out.println();
        }
        if (player1r == rowsize) {
            System.out.println("Player 1 Won!");
        } if (player2r == rowsize) {
            System.out.println("Player 2 Won!");
        } if (player3r == rowsize) {
            System.out.println("Player 3 Won!");
        } if (player4r == rowsize) {
            System.out.println("Player 4 Won!");
        }
    }
   }
}


