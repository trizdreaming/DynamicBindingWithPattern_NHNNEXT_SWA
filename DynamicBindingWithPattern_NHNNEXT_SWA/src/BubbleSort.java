import sorts.Sort;


public class BubbleSort implements ISort{

	@Override
	public void sort(int array[]) {
		System.out.println("버블 소트 실행\n");
		
		array = Sort.bubbleSort(array);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("\n 버블 소트 완료\n");
		System.out.println("====================\n");
	}


}
