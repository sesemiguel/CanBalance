public class Main {
	public static void main(String[]args) {
		int[] array = {2,1,1,2,1};
		System.out.println(canBalance(array));
		
	}
	public static boolean canBalance(int[] array) {
		int end=array.length-1;
		int[] temp = new int[array.length];
		while(end>0) {
			for(int j=end; j<array.length; j++) {
				temp[j] = array[j];
			}
			if(addArrayElements(array, 0, end) == addArrayElements(temp, end, array.length)) {
				return true;
			}
			end--;
		}
		return false;
	}
	
	public static int addArrayElements(int[] array, int start, int end) {
		int result=0;
		for(int i=start; i<end; i++) {
			result = result + array[i];
		}
		return result;
	}
	
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
