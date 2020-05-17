package com.shivangi.client;

public class Dine {

	public Dine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x=2;
		//Log.msg(String.valueOf(x));
		Chopstick[] c = new Chopstick[5];
		for(int i=0; i< c.length; i++)
			c[i] = new Chopstick("C: "+i);
		Philosopher[] p = new Philosopher[5];
		p[0] = new Philosopher("P: 0 - ",c[0], c[1]);
		p[1] = new Philosopher("P: 1 - ", c[1], c[2]);
		p[2] = new Philosopher("P: 2 - ", c[2], c[3]);
		p[3] = new Philosopher("P: 3 - ", c[3], c[4]);
		p[4] = new Philosopher("P: 4 - ", c[0], c[4]);
		for(int i=0;i<p.length;i++) {
			Log.msg("Thread "+ i);
			Thread t= new Thread(p[i]);
			t.start();
		}
	}
}
