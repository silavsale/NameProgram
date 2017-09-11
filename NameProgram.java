
// Program print the text line

public class NameProgram
{
	 boolean graduated = false;
	
		public static void printName(boolean graduated){
			
			if (graduated == true) {
				System.out.println("And i drive red Ferrari");
			}
				
			else 
			{
				System.out.println("I drive a bicycle!");
			}
			
		}
	
	public static void main(String[] args)
	{
		System.out.println("My Name is Sergiy !!! \nI am student at Vanier College !");
			
		printName(false);
		
	}
	

}

