package arrayUsePra;

public class MultipleArrayPractice {

	public static void main(String[] args) {
		
	char	Grade[][]= {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}};
	
	for (int i=0;i<=2;i++) 
	{
		for (int j=0;j<=3;j++)
		{
			System.out.print(Grade[i][j]+" ");
		}
		System.out.println();
	}
	}
}
