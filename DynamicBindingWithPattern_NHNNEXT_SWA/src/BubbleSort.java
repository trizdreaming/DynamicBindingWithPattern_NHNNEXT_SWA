import sorts.Sort;


public class BubbleSort implements ISort{

	@Override
	public void sort(int array[]) {
		System.out.println("���� ��Ʈ ����\n");
		
		array = Sort.bubbleSort(array);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("\n ���� ��Ʈ �Ϸ�\n");
		System.out.println("====================\n");
	}


}
