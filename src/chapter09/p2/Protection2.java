package chapter09.p2;

class Protection2 extends chapter09.p1.Protection {
	Protection2() {
		System.out.println("derived other package constructor");
		
		// class or package only
		// System.out.println("n = " + n);
		
        // class only can access private variable
		// System.out.println("n_pri " + p.n_pri);
		
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
		
	}

}
