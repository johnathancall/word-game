import java.util.ArrayList;
import java.util.Random;
//add all adjacent cells to an array, check pos with that array

public class Game 
{
	char[][] grid = new char[4][4];
	
	public static char randomLetter()
	{
		int x = (int)(Math.random()*26)+65;
		char temp = (char)x;
		return temp;
	}
	
	public boolean isAdjacent(int x1, int y1, int x2, int y2)
	{
		return (Math.abs(x1 - x2) == 1 || Math.abs(y1 - y2) == 1);
	}

	public boolean isRepeating(int x1, int y1, int x2, int y2)
	{
		return (grid[x1][y1] == grid[x2][y2]);
	}
	
	public static void main(String[] args)
	{
		char[][] grid = new char[4][4];
			
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<4; c++)
			{
				grid[r][c] = randomLetter();
			}
		}

		
		for (int r = 0; r < 4; r++) 
		{
		    for (int c = 0; c < 4; c++) 
		    {
		        System.out.print(grid[r][c] + " ");
		    }
		    System.out.println();
		  
		} 
		
	}
}