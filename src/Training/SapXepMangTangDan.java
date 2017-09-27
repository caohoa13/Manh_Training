package Training;

public class SapXepMangTangDan {
	public static void main(String[] args) {
		int[] array = {2, 1, 3, 4, 5, 10, 7, 9, 6, 8};
		for(int i = 0 ; i < array.length - 1; i ++) {
			for(int j = i+1 ; j < array.length; j ++) {
				if(array[i] > array[j]) {
					int a  = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}   
		}
		for(int i = 0; i < array.length; i ++) {
			System.out.print(" " + array[i]);
		}
	}
}

