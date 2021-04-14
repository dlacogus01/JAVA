
public class ArrayReturn {

	public static void main(String[] args) {
		int intArray[] = {3, 4, 5, 6, 7, 8}; int intArr2[] = new int[4];
		int sum = 0;
		sum = hap(intArray);
		System.out.println("รัวี =" + sum);
		intArr2 = hap2();
		for(int i = 0; i< intArr2.length; i++)
			System.out.printf("%3d", intArr2[i]);
		
	}
	static int hap(int [] abc) {
		int hap = 0;
		for(int i =0; i < abc.length; i++)
			hap += abc[i];
		return hap;
	}
	static int [] hap2 {
		int hap = {3, 4, 5, 6};
		for(int i =0; i < hap.length; i++)
			hap[i] = hap[i] + 5;
		return hap;
	}
}
