package packages;

// case 1:

//class Test {
//	String name;
//	 
//	
//	Test(String name) {
//		this.name = name;
//	}

// in this case the output would be cat dog
	
//	case 2 : in the above example we change the variable from instance to static 

//class Test {
//	
//	static String name;
//	
//	
//	Test(String name) {
//		Test.name = name;
//	}
	
// in this case the output will be dog dog as name is the property of the class and hence on changing it the whole class property will change
	

// case 3 : we put the class inside the inner class




public class InnerClasses {
	
	static class Test {	// test depends on the objects of InnerClass.. so we use static keyword and hence it does not depend on the objects of the InnerClass
		static String name;
		
		Test(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		
		Test obj1 = new Test("Cat");	
		Test obj2 = new Test("Dog");
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		
	}
}
