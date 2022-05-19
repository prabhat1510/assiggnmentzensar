package com.assignment.demo.entities;

public enum Active {
	close(0), open(1);

	private int active;

	Active(int active) {
		this.active = active;
	}
}
