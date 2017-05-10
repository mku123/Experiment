package com.practice;

enum enums
{
    FIRST
    {
        int j = 10;   // Field of FIRST
 
        void methodOfFirst()
        {
            System.out.println(j);  //Field j can be used within the constant body
        }
 
        @Override
        void abstractMethod()
        {
            methodOfFirst();     //methodOfFirst() can be used within the constant body
        }
    },
 
    SECOND
    {
        int k = 20;   //Field of SECOND
 
        void methodOfSecond()
        {
            System.out.println(k);  //Field k can be used within the constant body
        }
 
        @Override
        void abstractMethod()
        {
            methodOfSecond();     //methodOfSecond() can be used within the constant body
        }
    };
 
    int i=5;   //this field is available in all constants
 
    abstract void abstractMethod();  //this method is available in all constants
}

public class MainClass {
	
	enum Hello{
		A, B , C;
		
		void hello(){
			System.out.println("Tak ei t bacl:"+this.toString());
		}
		
		public static void main(String[] args){
			System.out.println("Froom enum");
		}
	}
	
//	public int hello(){
//		System.out.println("Hello function");
//		return 1;
//	}
	
	public void hello1(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e = new Employee("Mani", 1340.0);
//		Manager m = new Manager("Mohan",45000.0);
//		e = m;
//		System.out.println(e.getName());
////		Book b = new Book("Hello", 3.4);
////		Book c = new Book("Hey", 5.5);
////		b=c;
//		Integer I = new Integer(50);
//		int i = I;
//		System.out.println(i);
//		//Hello h1 = Hello.A;
//		enums en = enums.FIRST;
//		System.out.println(en.i);
//		en.abstractMethod();
//		(Hello.A).hello();
//		System.out.println(e.getName());
//		System.out.println(e.modifySalary(e.getSalary()));
		try
        {
            nestedTry();
        }
        catch(Exception ex)
        {
            System.out.println("NumberFormatException will be caught here");
        }
	}
	
	static void nestedTry()
    {
        try
        {
            int i = Integer.parseInt("abc");    //This statement throws NumberFormatException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NumberFormatException will not be caught here");
        }
    }

}
