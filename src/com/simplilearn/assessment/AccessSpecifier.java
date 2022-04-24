package com.simplilearn.assessment;

class DefaultAccessSpecifier {
	void display() { // Default : available only within same package
		System.out.println("You are using Default Access Specifier");
	}
}

class PrivateAccessSpecifier {
	private void display() { // Private : only within the class
		System.out.println("You are using Private Access Specifier");
	}
}

class ProtectedAccessSpecifier {
	protected void display() { // Protected : available within same package and also inheritance class
		System.out.println("You are using Protected Access Specifier");
	}
}

public class AccessSpecifier {

	public static void main(String[] args) {

		// Default Access Specifier
		System.out.println("Dafault Access Specifier");
		DefaultAccessSpecifier obj1 = new DefaultAccessSpecifier(); // Object for Default Access Specifier
		obj1.display();

		System.out.println("Private Access Specifier");
		PrivateAccessSpecifier obj2 = new PrivateAccessSpecifier(); // Object for Private Access Specifier
		// obj2.display();

		System.out.println("Protected Access Specifier");
		ProtectedAccessSpecifier obj3 = new ProtectedAccessSpecifier(); // Object for Protected Access Specifier
		obj3.display();
	}
}
