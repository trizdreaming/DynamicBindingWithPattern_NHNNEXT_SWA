import sorts.Sort;


public class QuickSort implements ISort{

	@Override
	public void sort(int array[]) {
		System.out.println("�� ��Ʈ ����\n");
		
		array = Sort.quickSort(array);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("\n �� ��Ʈ �Ϸ�\n");
		System.out.println("====================\n");
	}

}
