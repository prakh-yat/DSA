class ms{
	int[] array;
	int[] tempMergeArr;
	int length;

	public static void main(String[] args){
		int[] inputArr = {48,36,13,52,19,94};
		ms p = new ms();
		p.sort(inputArr);

		for (int i=0 ; i<inputArr.length; i++){
			System.out.print(inputArr[i]+" ");
		}
	}

	public void sort(int inputArr[]){
	 	this.array=inputArr;
	 	this.length=inputArr.length;
	 	this.tempMergeArr=new int[length];
	 	divideArr(0,length-1);
	 }

	 public void divideArr(int low, int high){
	 	if (low < high){
	 		int mid = low + ( high - low ) / 2;
	 		divideArr(low,mid);
	 		divideArr(mid+1,high);
	 		mergeArr(low,mid,high);
	 	}
	 }

	 public void mergeArr(int low, int mid, int high){
	 	for (int i=low; i<= high; i++){
	 		tempMergeArr[i] = array[i];
	 	}
	 	int i = low;
	 	int j = mid+1;
	 	int k = low;

	 	while (i<=mid && j<=high){
	 		if ( tempMergeArr[i] <= tempMergeArr[j]){
	 			array[k] = tempMergeArr[i];
	 			i++;
	 		}
	 		else{
	 			array[k] = tempMergeArr[j];
	 			j++;
	 		}
	 		k++;
	 	}

	 	while (i<=mid){
	 		array[k] = tempMergeArr[i];
	 		k++;
	 		i++;
	 	}
	 }

	
}