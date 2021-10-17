public class Funzioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 2;
		int c = 100;

		//double somma = a + b + c;
		//double media = somma / 3;
		//double media;

		//int somma2 = a + b + c;
		//double media2 = (double)somma2 / 3;
		double media = calcolaMedia(a, b, c);
		System.out.println("la media vale "+media);
		//------------------------------
		//media array
		//------------------------------
		int array[] = {4, 10, 10};
		double mediaaa =  calcolaMedia(array);//calcolaMediaArray
		System.out.println("la media dell'array vale "+mediaaa);
		//------------------------------
	}//fine main

	public static double calcolaMedia(int primo, int secondo, int terzo) {
		return (primo+secondo+terzo)/3;
	}
	public static double calcolaMedia(int arr[]) {//calcolaMediaArray
		double somma = 0;
		for(int i=0; i<arr.length; i++) {somma+=arr[i];}
		return (somma)/arr.length;
	}
}