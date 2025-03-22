package com.dssns.board.entity.common;

public enum YesOrNo {
	Y("Y"),
	N("N");

	private final String value;

	YesOrNo(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}
}
