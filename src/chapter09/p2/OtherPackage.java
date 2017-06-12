package chapter09.p2;

class OtherPackage {
	OtherPackage() {
		chapter09.p1.Protection p = new chapter09.p1.Protection();
		System.out.println("other package constructor");
		
		// class or package only
		// System.out.println("n = " + n);
		
        // class only can access private variable
		// System.out.println("n_pri " + p.n_pri);
		
		// class, subclass or package only
		//System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);

	}

}
