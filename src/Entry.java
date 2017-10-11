
public class Entry {

	public static void main(String[] args) {
		
		int waterAmount = 3 ; 
		int steps = 5 ; 
		int faucet = 0 ;
		
		int cumulativeSteps = 0 ; 
		int CumulativeStepsUnit = 0 ; 
		
		int NoOfTress = 10 ; 
		boolean isThisStart = true ; 
		int currentTree = 0 ; 
		int goToLocation = NoOfTress ; 
		int howManyTreesDone = 0 ; 
		
		for (int i = 0; howManyTreesDone <= NoOfTress; i++) {
			
			
				
				if(isThisStart && waterAmount > 0 ){
					//System.out.println("Calling First");
					steps = goToLocation - faucet ; 
					currentTree = goToLocation ; 
					CumulativeStepsUnit += (steps * waterAmount);
					cumulativeSteps += steps ; 
					System.out.println("CurrentTree : " + currentTree);
					System.out.println(cumulativeSteps + " : " + waterAmount + " : " + CumulativeStepsUnit);
					waterAmount-- ; 
					isThisStart = false ; 
					howManyTreesDone ++;
				//	System.out.println();
					
				}else if(waterAmount > 0 && !isThisStart){
					//System.out.println("Calling Second");
					currentTree -- ;
					steps = (steps-(steps-1));
					CumulativeStepsUnit += (steps * waterAmount);
					cumulativeSteps += steps ; 
					System.out.println("CurrentTree : " + currentTree);
					System.out.println(cumulativeSteps + " : " + waterAmount + " : " + CumulativeStepsUnit) ;
					
					waterAmount-- ; 
					howManyTreesDone++ ; 
					// System.out.println();
				}else {
					//System.out.println("Calling Third");
					cumulativeSteps += currentTree - faucet ;
					goToLocation = currentTree- 1 ; 
					currentTree = 0 ; 
					
					CumulativeStepsUnit += (steps * waterAmount);
					System.out.println("CurrentTree : " + currentTree);
					System.out.println(cumulativeSteps + " : " + waterAmount + " : " + CumulativeStepsUnit) ;
					
					waterAmount = 3 ; 
					isThisStart = true ;
					//System.out.println();
				}
				 
			}
		
		
		
		

	}
	
	
	

}
