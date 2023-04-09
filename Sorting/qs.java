class qs{
	public static void main (String[] args){
		int[] list = {15,9,7,13,12,16,4,18,11};
		int len = list.length;
		qs q = new qs();
		q.recursion(list , 0, len-1);
		q.print(list);
	}

	int partition ( int[] list, int low, int high ){
		int pivot = list[(low+high) /2 ];
		while( low <= high){
			while ( list[low] < pivot){
				low++;
			}
			while (list[high] > pivot){
				high--;
			}
			if (low <= high){
				int temp = list[low];
				list[low] = list[high];
				list[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}

	void recursion (int[] list, int low, int high){
		int pi = partition (list,low,high);
		if (low < pi-1){
			recursion(list,low,pi-1);
		}
		if (pi < high){
			recursion(list,pi,high);
		}
	}

	void print(int[] list){
		for(int i:list){
			System.out.print(i+" ");
		}
	}
}