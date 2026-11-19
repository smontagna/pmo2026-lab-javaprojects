package it.unibo.oop.jcf.ex1;

public class Team implements Comparable<Team>
{
	private String name;
	private int score;
	
	public Team(final String name)
	{
		this.name = name;
	}

	public void win() 
	{
		this.score += 3;
	}
	
	public void draw() 
	{
		this.score += 1;
	}

	
	/* Getter */
	public String getName() 
	{
		return this.name;
	}
	
	public int getScore() 
	{
		return this.score;
	}

	@Override
	public String toString() 
	{
		return "Team [name=" + name + ", score=" + score + "]";
	}
	
	
	@Override
	public int compareTo(Team o) 
	{
		if ((this.score != o.getScore()))
			return this.score - o.getScore();
		else
			return this.name.compareTo(o.getName());
	}
	
	
	
}
