package javaGenerics;
import java.util.*;
public class Team<T extends Player> {
	private String name;
	private List<T> teamMemeber = new ArrayList<>();
	private int totalWins=0;
	private int totalLosses=0;
	private int totalTies=0;
	public Team(String name) {
		super();
		this.name = name;
	}
	public void addTeamMembers(T player)
	{
		if(!teamMemeber.contains(player))
		{
			teamMemeber.add(player);
		}
	}
	public void listTeamMembers()
	{
		System.out.println(teamMemeber);
	}
	public int rankings()
	{
		return (totalLosses*2)+totalTies+1;
	}
	public String getScore(int ourScore,int thierScore)
	{
		String message="lost to";
		if(ourScore>thierScore)
		{
			totalWins++;
			message="we beat them";
		}
		return message;
	}
	@Override
	public String toString() {
		return "BaseBallTeam [name=" + name + ", teamMemeber=" + teamMemeber + ", totalWins=" + totalWins
				+ ", totalLosses=" + totalLosses + ", totalTies=" + totalTies + "]";
	}
	
	

}
