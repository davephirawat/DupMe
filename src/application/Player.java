package application;

import java.util.ArrayList;

public class Player {
	String name;
	Boolean goFirst;
	int score;
	ArrayList<Integer> pattern ;
	
	public Player() {
		super();
		this.name = "Steve";
		this.goFirst = false;
		this.score = 0;
		this.pattern = null;
	}
	
	public Player(String name) {
		super();
		this.name = name;
		this.goFirst = false;
		this.score = 0;
		this.pattern = null;
	}
	
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Player(String name, Boolean goFirst, int score) {
		super();
		this.name = name;
		this.goFirst = goFirst;
		this.score = score;
	}
	
	public Player(String name, Boolean goFirst, int score, ArrayList<Integer> pattern) {
		super();
		this.name = name;
		this.goFirst = goFirst;
		this.score = score;
		this.pattern = pattern;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getgoFirst() {
		return goFirst;
	}

	public void setgoFirst(Boolean goFirst) {
		this.goFirst = goFirst;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<Integer> getPattern() {
		return pattern;
	}

	public void setPattern(ArrayList<Integer> pattern) {
		this.pattern = pattern;
	}
	
//	public String printAll(Player p) {
//		
//	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
}
