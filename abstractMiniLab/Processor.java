package abstractMiniLab;
/*CSC 205: 12247 / Asynchronous (no meets)
Minilab: #4 Abstract
Author: Kim Finical & ID# 36283133
Description: This is a program to calculate the statistics of an employee with the job title Processor and extends the Worker class
*/
public class Processor extends Worker{

	double bonusTarget;
	
		//check to make sure the rating is between 1 and 5 then sets values
	public Processor(String name, int rating, int id, double toTarget) {
		if(rating <= 1 && rating >= 5) throw new IllegalArgumentException("Please enter a rating between 1 and 5.");
			this.name = name;
			this.rating = rating;
			this.id = id;
			this.bonusTarget = bonusTarget;
	}
		//calculates the employees bonus
	public double calculateBonus(double multiplier) {
		return (bonusTarget * multiplier);
	}
		// returns employees status
	public String toString(){
		return "\"" + this.getClass().getName() + ", rating:" + rating + ", id:" + id + "target:" + bonusTarget + "\"";
	}
}


