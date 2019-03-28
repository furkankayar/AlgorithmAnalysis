public class Quicksort{
	
	private int[] array;
	
	
	public Quicksort(){
		
		this.array = new int[]{15,10,14,5,2,12,11};
		sort(array, 0, array.length - 1);
		for(int i : array)
			System.out.print(i + " ");
	
	}
	
	
	
	public static void main(String[] args){
		
	
		new Quicksort();
		
	}
	
	public void sort(int[] arr, int p, int r){
		
		if(p < r){
			
			int q = partition(arr, p, r);
			sort(arr, p, q-1);
			sort(arr, q + 1, r);
		}
	}
	
	
	
	public int partition(int[] arr, int p, int r){
		
		int x = arr[r];
		int i = p - 1;

		for(int j = p; j <= r - 1; j++){
			if(arr[j] <= x){

				i = i + 1;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		
	
		return i + 1;
	}
	
	
	
}
