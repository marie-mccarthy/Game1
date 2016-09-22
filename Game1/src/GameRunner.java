import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GameRunner
	{
		private static final long[] Stringa1 = null;
		public static void main(String[] args)
		{
			exercise1();			
		}
	public static String exercise1()
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
				String b = "0";
				int [][] myArray1 = new int [2][4];
				int [][] myArray2 = new int [2][4];
				int [][] myArray3 = new int [2][4];
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
				
		//				int [] a =new int [] {4,7,8};
		//				int[] number = a; 
				
				
						int [][] myArray = new int [2][4];
						for (int i = 0; i < 2 ; i++)
							{					 
								for(int j=0; j <4; j++)
									{
										int number1 = (int)(Math.random()*7+1);
										int number2 = (int)(Math.random()*7+1);
										int number3 = (int)(Math.random()*7+1);

										int [] a1 =new int [] {1, 2, 3, 4, 5, 6, 7, 8,};
										
							//			myArray[i][j]= a1;
										System.out.println("|                        |");
									//	System.out.println("--  "+Arrays.toString(a1)+"  ---   "+Arrays.toString(a1)+"  ---  "+Arrays.toString(a1)+"  --");							
										System.out.println("--  "+a1[number1]+"  ---   "+a1[number2]+"  ---  "+a1[number3]+"  --");						
//									}
//							}
						System.out.println("Choose the odd number in the first, second, or third place");
						boolean stillPlaying = true;
						while(stillPlaying = true)
//						for(int a = 0; a < 4 ; a++)
//							{
							 userInputWord2= new Scanner(System.in);						
							String userChoice1 = userInputWord2.nextLine();	
								if(userChoice1.equals(1))
									{
										userChoice2= a1[number1];										
									}
								if(userChoice1.equals(2))
									{
										userChoice2= a1[number2];										
									}
								if(userChoice1.equals(3))
									{
										int userChoice2= a1[number3];										
									}
								if(userChoice2%2== 1)
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
						return b;
		}
			
	}
	