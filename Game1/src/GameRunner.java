import java.util.Scanner;

public class GameRunner
	{
		public static void main(String[] args)
			{
//				String myArray [][] = new String [2][2];
//						myArray [0][0] = "|";
//						myArray [0][1] = " ";						
//						myArray [1][0] = " ";
//						myArray [1][1] = "|";
				String [] myArray = new String [2];
				 myArray [0] =" ";
				 myArray [1] ="|";

				
				System.out.println("Odds or evens?");
				Scanner userInputChoice= new Scanner(System.in);
				String choice = userInputChoice.nextLine();	
				String odd= "odds";
				String even= "evens";
				if(choice.equals("odds"))
					{
						System.out.println("ok you chose odd");
					}
				if(choice.equals("evens"))
					{
						System.out.println("ok you chose even");
					}
				String yes= " ";
				String no = "X";
				int numberA=(int)(Math.random()*8);
				System.out.println("-start-------------");
				for(int a = 0; a<9; a++)
					{
						for (int i = 0; i < 1 ; i++)
							{
								
								for(int j=0; j <1; j++)
									{
										 int arrayNumber1=(int)(Math.random()*1)+0;
										 int arrayNumber2=(int)(Math.random()*1)+0;
										System.out.println("|       "+myArray[arrayNumber1]+"        "+myArray[arrayNumber2]+"       |");
									}
							}
						for (int i = 0; i < 1 ; i++)
							{								
								for(int j=0; j <1; j++)
									{
										int number1=(int)(Math.random()*8);
										int number2=(int)(Math.random()*8);
										int number3=(int)(Math.random()*8);
										
										System.out.println("--  "+number1+"  ---   "+number2+"  ---  "+number3+"  -- ");
							
							}
					}
//						for()
//							{
//							System.out.print( i= 1 );
//							}								
			}
	}
	}