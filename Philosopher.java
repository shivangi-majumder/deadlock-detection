package com.shivangi.client;

public class Philosopher extends Thread {

	private Chopstick leftChopistick;
	private Chopstick rightChopistick;
	private String names;
	private int states;

	public Chopstick getLeftChopistick() {
		return leftChopistick;
	}

	public void setLeftChopistick(Chopstick leftChopistick) {
		this.leftChopistick = leftChopistick;
	}

	public Chopstick getRightChopistick() {
		return rightChopistick;
	}

	public void setRightChopistick(Chopstick rightChopistick) {
		this.rightChopistick = rightChopistick;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Philosopher [leftChopistick=" + leftChopistick
				+ ", rightChopistick=" + rightChopistick + ", name=" + names
				+ ", state=" + states + "]";
	}

	public Philosopher(String names, Chopstick left, Chopstick right) {
		this.states = 1;
		this.names = names;
		leftChopistick = left;
		rightChopistick = right;
	}

	public void eat() {
		if (!leftChopistick.used) {
			if (!rightChopistick.used) {
				leftChopistick.take();
				leftChopistick.take();
				Log.msg(names + " : Eat");
				Log.Delay(1000);
				leftChopistick.release();
				rightChopistick.release();
			}
		}
		think();
	}

	public void think() {
		this.states = 1;
		Log.msg(names + " : Think");
		Log.Delay(1000);
	}

	public void run() {
		for (int i = 0; i <= 10; i++)
			eat();
	}

}
