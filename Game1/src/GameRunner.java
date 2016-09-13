import java.util.Scanner;

public class GameRunner
	{
		public static void main(String[] args)
			{
				String myArray [][] = new String [3][2];
//						myArray [0][0] = "X";
//						myArray [0][1] = "O";
//						myArray [1][0] = "X";
//						myArray [1][1] = "O";
//						myArray [2][0] = "X";
//						myArray [2][1] = "O";
				System.out.println("Odds or evens?");
				Scanner userInputChoice= new Scanner(System.in);
				String choice = userInputChoice.nextLine();	
				String odd= "odd";
				String even= "even";
				if(choice.equals("odd"))
					{
						System.out.println("ok you chose odd");
					}
				if(choice.equals("even"))
					{
						System.out.println("ok you chose even");
					}
				String yes= " ";
				String no = "X";
				System.out.println("-start-------------");
				for(int a = 0; a<3; a++)
					{
						for (int i = 0; i < 1 ; i++)
							{
								
								for(int j=0; j <1; j++)
									{
										int number1=(int)(Math.random()*8);
										int number2=(int)(Math.random()*8);
										int number3=(int)(Math.random()*8);
										System.out.println(myArray[i][j] ="|  "+number1+"  |  "+number2+"  |  "+number3+"  |");
									}
							}
						for (int i = 0; i < 1 ; i++)
							{								
								for(int j=0; j <1; j++)
									{
										
										System.out.println(myArray[i][j] ="-------------------");
									}
							}
					}
//						for()
//							{
//							System.out.print( i= 1 );
//							}								
			}
	}