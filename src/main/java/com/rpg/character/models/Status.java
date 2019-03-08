package com.rpg.character.models;

public class Status {

	private Integer agi = 0;
	private Integer str = 0;

	public Status() {
	}

	public Status(Integer agi, Integer str) {
		super();
		this.agi = agi;
		this.str = str;
	}

	public Integer getAgi() {
		return agi;
	}

	public void setAgi(Integer agi) {
		this.agi = agi;
	}

	public Integer getStr() {
		return str;
	}

	public void setStr(Integer str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Status [agi=" + agi + ", str=" + str + "]";
	}

}
