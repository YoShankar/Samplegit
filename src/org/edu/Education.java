package org.edu;

public class Education extends Medicine {
	public void ug() {
		System.out.println("Ug : 1000");

	}
	public void pg() {
		System.out.println("Pg : 500");

	}
	public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bEd();
		e.bA();
		e.bBA();
		e.bE();
		e.physiyo();
		e.dental();
		e.mbbs();
	}

}
