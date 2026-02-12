package javagenerics;
import java.util.*;
public class BaseBallTeam {
	private String name;
	private List<BaseBallPlayer> teamMemeber=new ArrayList<>();
	private int totalWin=0;
	private int totalLoss=0;
	private int totalTies=0;
	public BaseBallTeam(String name) {
		
		this.name = name;
	}
	public void addTeamMemebrs(BaseBallPlayer player) {
		if(!teamMemeber.contains(player))
		{
			teamMemeber.add(player);
		}
		
	}
	public void listTeamMembers()
	{
		System.out.println("Roaster List");
		System.out.println(teamMemeber);
	}
	public int ranking()
	{
		return (totalLoss*2)+totalTies+1;
	}
	public String getScore(int ourScore,int thierScore)
	{
		String message="Lost to";
		if(ourScore > thierScore)
		{
			totalWin++;
		message="beat";
		}
		return message;
		
	}
	@Override
	public String toString() {
		return "BaseBallTeam [name=" + name + ", teamMemeber=" + teamMemeber + ", totalWin=" + totalWin + ", totalLoss="
				+ totalLoss + ", totalTies=" + totalTies + "]";
	}
	
	
	

}
