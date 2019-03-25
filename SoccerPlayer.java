
public class SoccerPlayer {
	private String name ;
	private int number ;
	private SoccerTeam team;
	private boolean YellowCard, RedCard= false;
	private int numberOfGoals;
	
	public SoccerPlayer(String name){
		this.name=name;
	}
	public SoccerPlayer(String name ,int number ,SoccerTeam team,String yellowOrRedCard,int numberOfGoals){
	    this.name=name;
	    this.number=number;
	    this.team=team;
	    this.RedCard=RedCard;
	    this.YellowCard=YellowCard;
	    this.numberOfGoals=numberOfGoals;	
	}
	public void redCard(){
		RedCard=true;
	}
	public void yellowCard(){
		if (YellowCard){
			redCard();
		}
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public String getName(){
		return name ;
		
	}
	public SoccerTeam getTeam(){
		return team;
	}
	public void increaseGoalCount(){
		numberOfGoals++;
	}
	public void setTeam(SoccerTeam newTeam){
		this.team=newTeam;
	}
	public String toString(){
		return name + ", " + number + ", " + team.getName() + ", " + numberOfGoals;
	}
}
