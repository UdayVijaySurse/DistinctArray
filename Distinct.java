
public class Distinct {
	
	public static void main(String args[]){
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,2,3,4};
		for (int i =0; i<arr1.length;i++){
			boolean isDistinct = false;
			for(int j =0 ;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					isDistinct	= true;
					break;
				}
			  }
			if(!isDistinct){
				System.out.println(""+arr1[i]);
			}
				
			}
				
		
	}

}
