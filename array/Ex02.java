package array;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 기본 초기값에 대해 알아보자
		//new 연산자로 배열을 생성했을 경우배열은 자동적으로
		// 기본값으로 초기화가 된다,
		
		
		//정수
		byte[] byteArray = new byte[1];
		char[] charArray = new char[1];
		short[] shoirtArray = new short[1];
		int[] intArray = new int[1];
		long[] longArray = new long[1];
		//실수
		float[] floatArray = new float[1];
		double[] doubleArray = new double[1];
		boolean[] booleanArray = new boolean[1];
		//문자열
		String[] StringArray = new String[1];
		
		System.out.println(byteArray[0]);
		System.out.println((int)charArray[0]);
		//char형 초기값 >> '\u0000'
		System.out.println(shoirtArray[0]);
		System.out.println(intArray[0]);
		System.out.println(longArray[0]);
		System.out.println(floatArray[0]);
		System.out.println(doubleArray[0]);
		System.out.println(booleanArray[0]);
		System.out.println(StringArray[0]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
