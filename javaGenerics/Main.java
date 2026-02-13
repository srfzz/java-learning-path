package javaGenerics;
interface Player{}
record BaseBallPlayer(String name,String postion) implements Player
{
	
}
record FootBallPlayer(String name,String postion) implements Player
{
	
}

public class Main {
	
	public static void main(String[] args)
	{
	  BaseBallTeam delhi1=new BaseBallTeam("delhi");
	  BaseBallTeam mumbai1=new BaseBallTeam("mumbai");
	  
		 var mithun=new BaseBallPlayer("mithun kumar","front");
		  var prem =new BaseBallPlayer("prem","backward");
		  delhi1.addTeamMembers(prem);
		  mumbai1.addTeamMembers(mithun);
		delhi1.listTeamMembers();
		mumbai1.listTeamMembers();
	  scoreResult(delhi1,34,mumbai1,45);
	  SportsTeam delhi=new SportsTeam("delhi");
	  SportsTeam mumbai=new SportsTeam("mumbai");
		var mithun1=new FootBallPlayer("mithun kumar1","front");
		var prem1=new FootBallPlayer("prem1","backward");	
		delhi.addTeamMembers(prem1);
		mumbai.addTeamMembers(mithun1);
		delhi.listTeamMembers();
		mumbai.listTeamMembers();
		scoreResult(delhi,34,mumbai,45);
		
		
		
		  scoreResult(delhi1,34,mumbai1,45);
		  Team<FootBallPlayer> delhi3=new Team<>("delhi");
		  Team<FootBallPlayer> mumbai3=new Team<>("mumbai");
			var mithun3=new FootBallPlayer("mithun kumar1","front");
			var prem3=new FootBallPlayer("prem1","backward");	
			delhi3.addTeamMembers(prem3);
			mumbai3.addTeamMembers(mithun3);
			delhi3.listTeamMembers();
			mumbai3.listTeamMembers();
			scoreResult(delhi3,34,mumbai3,45);
	 
	}
	public static void scoreResult(BaseBallTeam team1,int t1,BaseBallTeam team2,int t2)
	{
		String message=team1.getScore(t1, t2);
		team2.getScore(t2,t1);
		System.out.printf("%s ",message);
	}
	
	public static void scoreResult(SportsTeam team1,int t1,SportsTeam team2,int t2)
	{
		String message=team1.getScore(t1, t2);
		team2.getScore(t2,t1);
		System.out.printf("%s ",message);
	}
	public static void scoreResult(Team<FootBallPlayer> team1,int t1,Team<FootBallPlayer> team2,int t2)
	{
		String message=team1.getScore(t1, t2);
		team2.getScore(t2,t1);
		System.out.printf("%s ",message);
	}
}
