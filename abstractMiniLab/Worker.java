package abstractMiniLab;
/*
Description: This program will compare ratings between two employees and return the status of the employee as a string such as rating, id, job title.
*/
public abstract class Worker implements Comparable<Worker>{
	
	protected String name;
	protected int rating;
	protected int id;
	
	public Worker() {
	}
		//check to make sure the rating is between 1 and 5 then sets values
	public Worker(String name, int rating, int id){
		if(rating <= 1 && rating >= 5) throw new IllegalArgumentException("Please enter a rating between 1 and 5.");
			this.name = name;
			this.rating = rating;
			this.id = id;
	}
		// compares the rating between two employees, this rating if greater if positive and less than if negative then equal if 0
	public int compareTo(Worker another){
		return (this.id - another.id);
	}	
	
	abstract double calculateBonus(double multiplier);
		// returns employees status
	public String toString(){
		return "\"" + this.getClass().getName() + ", rating:" + rating + ", id:" + id + "\"";
	}
}
