package softuni1;

public class arrays-homework-3 {

	public static void main(String[] args) {
		// Show best length and start position of same int in array
		int[] array = new int[] {2,2,2,2,3,2,6,1,1,2,3,2};
		int startPosition = 0;
		int newStartPosition = 0;
		int newBestLength = 1;
		int bestLength = 1;
		
		for (int i = 0; i < array.length-1; i++){
			if(array[i]==array[i+1]){
				newStartPosition=i;
				newBestLength++;
			}
			if (newBestLength > bestLength){				
				bestLength=newBestLength;
				startPosition = newStartPosition +2 - bestLength;
			
			}
			if (array[i]!= array[i+1]){
				newStartPosition =0;
				newBestLength = 1;			
			}
		}
		System.out.println(startPosition);
		System.out.println(bestLength);
	}

}
