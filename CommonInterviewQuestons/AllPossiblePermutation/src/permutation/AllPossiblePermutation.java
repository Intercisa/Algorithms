package permutation;

public class AllPossiblePermutation {
	public void permute(int[] a, int k) {

		if (k == a.length) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		} else {
			for (int i = k; i < a.length; i++) {
				swap(a, i, k);

				permute(a, k + 1);

				swap(a, i, k);
			}
		}
	}

	private void swap(int[] a, int i, int k) {
		int tmp = a[k];
		a[k] = a[i];
		a[i] = tmp;
	}

}
