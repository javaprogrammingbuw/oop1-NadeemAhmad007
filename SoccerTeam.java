
public class SoccerTeam {
	private String name;
	private SoccerTrainer trainer;
	private int tablePosition;
	private int numberOfGoalsScored;
	private int numberOfGoalsAgainst;
	private  SoccerPlayer [] players = new SoccerPlayer[11];
	int count=0;
	public SoccerTeam(String name,SoccerTrainer trainer,int tablePosition){
		this.name=name;
		this.trainer=trainer;
		this.tablePosition=tablePosition;
	}
	//Intendation
public String getName(){
	return name ;
}
	public boolean addPlayer(SoccerPlayer player){
		//check for first empty slot in array
		for(int i=0;i<players.length;i++){
			if(players[i]==null){
				//add player
				players[i]=player;
				players[i].setTeam(this);
				players[i].setNumber(i+1);
				
				return true;
			}
		}
		return false;
		
//		players[count]=player;
//		count++;
//		if (count<=players.length){
//			return true;
//		}else {
//			return false;
//			}
		}
	public void goal(int playerNumber){
		players[playerNumber-1].increaseGoalCount();
		numberOfGoalsScored++;
	}
	public void goalAgainst(){
		numberOfGoalsAgainst++;
	}
	public String ratioString(){
		return + numberOfGoalsScored + " : " + numberOfGoalsAgainst; 
	}
	public String toString(){
		String result = name + ", " + trainer.getName() + ", " + ratioString() + "\n " ;
		
		for(int i=0;i<players.length;i++){
			result +="player:\n"+players[i].toString();
		}
		
		return result;
	}
	}
