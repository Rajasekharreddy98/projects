package atmWorking;

public interface AtmProcedure {
		void showBalance(int amount);
		int withdrawAmount(int amount);
		void showRemainingBalance(int amount);
		int depositAmount(int amount);

	
}
