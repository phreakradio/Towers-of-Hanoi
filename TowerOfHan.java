import java.util.*;
import java.io.*;
public class TowerOfHan{

public static void main (String[] args)
{
	System.out.println("How many discs? (Limit to 6 discs): ");
	Scanner input = new Scanner(System.in);
	int discs = input.nextInt();
	while(discs<0 || discs>6)
	{
		System.out.println("YOU'RE OUTTA LINE, BUDDY. Try again.");
		discs = input.nextInt();
	}
	if(discs == 0)
	{
		System.out.println("There's nothing to move. Goodbye");
		try 
		{
			Thread.sleep(2000);
		} 
		catch(InterruptedException e) 
		{
			System.exit(0);
		} 
	}
	else
	{
		Hanoi('A','B','C', discs);
		int moves = Moves(discs);
		System.out.println("# of moves neccasary to move " + discs + " discs is: " + moves);
	}
	
}//End Main


	
public static void Hanoi(char src, char dest, char by, int discNum)
{
	if (discNum > 0)
	{
		Hanoi(src, by, dest, discNum-1);
		System.out.println("Move disk "+ discNum + " from " + src + " to " + dest);
		Hanoi(by, dest, src, discNum-1);
	}
}//End Hanoi

public static int Moves(int discNum)
{
	if(discNum == 0)
	{
		return 0;
	}
		return 2 * Moves(discNum-1)+1;
}//End Moves

}//End Class
