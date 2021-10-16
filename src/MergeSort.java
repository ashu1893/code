
public class MergeSort {
	
	MergeSort(A,ub,lb){
		if(lb<ub) {
			mid = (lb+ub)/2;
			mergeSort(A, lb, mid);
			mergeSort(A, mid+1, ub);
			merge(A, lb, mid, ub);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
