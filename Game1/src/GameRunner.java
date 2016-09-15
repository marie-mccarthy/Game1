import java.util.Scanner;

public class GameRunner
	{
		public static void main(String[] args)
		{
				
				
//				System.out.println("Odds or evens?");
//				Scanner userInputChoice= new Scanner(System.in);
//				String choice = "odd";
//				String choice2 = userInputChoice.nextLine();	
//				String odd= "odds";
//				String even= "evens";
//				if(choice.equals("odds"))
//					{
//						System.out.println("ok you chose odd");
//					}
//				if(choice.equals("evens"))
//					{
//						System.out.println("ok you chose even");
//					}
				String yes= " ";
				String no = "X";
				int numberA=(int)(Math.random()*8);
				int [][] myArray2 = new int [2][4];
				System.out.println("   [1]      [2]     [3]  ");
//				for(int a = 0; a<2; a++)
//					{
//						for (int i = 0; i < 4 ; i++)
//							{
//								
//								for(int j=0; j <1; j++)
//									{
//										 int arrayNumber1=(int)(Math.random()*1)+0;
//										 int arrayNumber2=(int)(Math.random()*1)+0;
//										System.out.println("|                        |");
//									}
//							}
						int [][] myArray = new int [2][4];
						for (int i = 0; i < 2 ; i++)
							{					 
								for(int j=0; j <4; j++)
									{
										int number = (int)(Math.random()*8);
										myArray[i][j]= number;
										System.out.println("|                        |");
										System.out.println("--  "+number+"  ---   "+number+"  ---  "+number+"  --");							
									}
							}
						System.out.println("Choose the odd number in the first, second, or third place");
						boolean stillPlaying = true;
						while(stillPlaying = true)
						for(int a = 0; a < 4 ; a++)
							{
								Scanner userInput2= new Scanner(System.in);
								int place = userInput2.nextInt();
								int chioce = myArray[a][place-1];
								if(chioce%2== 1)
									{
										System.out.println("Correct!");
										stillPlaying = true;
									}
								else
									{
										System.out.println("Incorrect. Game over.");
										stillPlaying = false;
									}
							}
			}
	}
	