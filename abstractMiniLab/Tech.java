package abstractMiniLab;
/*
Description: This is a program to calculate the statistics of an employee with the job title Tech and extends the Worker class
*/
public class Tech extends Worker{
	
		//check to make sure the rating is between 1 and 5 then sets values
	public Tech(String name, int rating, int id){
		if(rating <= 1 && rating >= 5) throw new IllegalArgumentException("Please enter a rating between 1 and 5.");
			this.name = name;
			this.rating = rating;
			this.id = id;
	}
		//calculates the employees bonus
	public double calculateBonus(double multiplier){
	return 0;
	}
		// returns employees status
	public String toString(){
		return "\"" + this.getClass().getName() + ", rating:" + rating + ", id:" + id + "\"";
	}
}
