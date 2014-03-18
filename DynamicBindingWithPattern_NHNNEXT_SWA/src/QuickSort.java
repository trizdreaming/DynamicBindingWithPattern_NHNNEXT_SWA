import sorts.Sort;


public class QuickSort implements ISort{

	@Override
	public void sort(int array[]) {
		System.out.println("퀵 소트 실행\n");
		
		array = Sort.quickSort(array);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("\n 퀵 소트 완료\n");
		System.out.println("====================\n");
	}

}
