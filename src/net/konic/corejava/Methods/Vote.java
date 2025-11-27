package net.konic.corejava.Methods;

public class Vote {

	public boolean vote(int age) {
		if (age >= 18) {
			System.out.println("eligble for vote");

			return true;
		} else {
			System.out.println("not eligble for votee");
			return false;
		}
	}

	public static void main(String[] args) {
		Vote vote = new Vote();
		vote.vote(20);
	}
}
