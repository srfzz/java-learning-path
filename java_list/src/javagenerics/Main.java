package javagenerics;
import java.util.*;
record BaseBallPlayer(String name,String position)
{
	
}

public class Main {
	public static void main(String[] args)
	{
		BaseBallTeam phillips= new BaseBallTeam("philidehpia");
		BaseBallTeam mumbaiIndians= new BaseBallTeam("mumbaiindians");
		System.out.println(phillips);
	}
//	public static void ScoreResult(BaseBallTeam team1,int t1_score,BaseBallTeam team2,int t2_score)
//	{
//		String ,
//	}

}
