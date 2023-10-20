package interfaces3;

public class Working implements B {		// only implemented B but methods of A is also there.. because B extends A and thus we should call both

	@Override
	public void greet() {
		// here the access control should be same as that of the Interface or something better than the one of interface
		// if in A greet() is protected.. here we can have greet either protected or public(better/less restrictive than protected) and we cant have private..check
		
		System.out.println("greeting");
		
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("welcoming");
		
	}

}
