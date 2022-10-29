package JavaTask;

public class LabelledLoop {

	public static void main(String[] args) {
		one:for(int i= 1;i<=5;i++)
		{
			two:for(int j = 1;j<=7;j++)
			{
				three:for(int k=1;k<=3;k++)
				{
					if(k==2)
						break three;
				System.out.print("Jay");
				
				}
				
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
