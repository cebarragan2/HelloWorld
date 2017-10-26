public class Chicken
{
	
		//atributos
		private String name;
		private String color;
		private int age;
		//metodos
		public void initializeData (String name, String color, int age)
		{
			this.name=name;
			this.color=color;
			this.age=age;
			
		}
		
		public void layAnEgg()
		{
			System.out.println ("the Chicken " + name + " lays an egg");
		}
		public void pooped()
		{
			System.out.println ("the Chicken "+ name + " pooped");
		}
		public void drink ()
		{
			System.out.println ("the Chicken " + name + " drank");
		}
		
		
		
		public void print ()
		{
			System.out.println("the name of the chicken is  "+ name + " color "+color+ "  the age is "+age);
		}
		
		

	

}