public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Cristian");
		Chicken chicken=new Chicken (); 
		chicken.initializeData("Lucy","brown",2);
		chicken.print();
		chicken.layAnEgg();
		chicken.pooped();
		chicken.drink();
		
		Chicken chicken1=new Chicken(); 
		chicken1.initializeData("Confy","yellow",1);
		chicken1.print();
		chicken1.layAnEgg();
		
		
		Chicken chicken2=new Chicken(); 
		chicken2.initializeData("Lupe","black",3);
		chicken2.print();
		chicken2.pooped();
		
		
		Chicken chicken3=new Chicken(); 
		chicken3.initializeData("Maggy","orange",3);
		chicken3.print();
		chicken3.drink();
		
	

	}

}