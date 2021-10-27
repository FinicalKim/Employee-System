package abstractMiniLab;
/*
Description: This is a program to calculate the statistics of an employee with the job title Specialist and extends the Worker class
*/
public class Specialist extends Worker{

	double bonusTarget;
	double profitSharing;
	
		//check to make sure the rating is between 1 and 5 then sets values
	public Specialist(String name, int rating, int id, double bonusTarget, double profitSharing) {
		if(rating <= 1 && rating >= 5) throw new IllegalArgumentException("Please enter a rating between 1 and 5.");
			this.name = name;
			this.rating = rating;
			this.id = id;
			this.bonusTarget = bonusTarget;
			this.profitSharing = profitSharing;
	}
		//calculates the employees bonus
	public double calculateBonus(double multiplier) {
		return (bonusTarget + profitSharing) * multiplier;
	}
		// returns employees status
	public String toString(){
		return "\"" + this.getClass().getName() + ", rating:" + rating + ", id:" + id + "target:" + bonusTarget + "profit:" + profitSharing + "\"";
	}	
}
