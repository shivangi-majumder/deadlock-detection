package com.shivangi.client;

public class Chopstick {
	public boolean used;
	public String name;
	

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chopstick(String name) {
		this.name = name;
	}

	public synchronized void take() {
		Log.msg("Used :: " + name);
		this.used = true;
	}

	public synchronized void release() {
		Log.msg("Released :: " + name);
		this.used = false;
	}

}
