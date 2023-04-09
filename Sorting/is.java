class is{
	public static void main(String[] args){
		int[] a = {5,3,7,9,8,1,2,4,6};
		int temp, i, j, k;
		for ( i=1 ; i<a.length ; i++){
			temp = a[i];
			j = i;
			while ( j>0 && a[j-1]>temp){
				a[j] = a[j-1];
				j=j-1;
			}
			a[j] = temp;
		}
		for ( k=0 ; k<a.length ; k++){
			System.out.println(a[k]);
		}
	}
}