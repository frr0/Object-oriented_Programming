public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****For****");
		for(int i=0; i<10; i=1+2) {
			System.out.print((i+1) + "\n");
		}

		System.out.println("****While****");
		int j = 0;
		while(j<10){
			System.out.print(j+1);
			j++;
		}

    System.out.println("do-while");
		int k = 0;
		do {
			System.out.print(k+1);
			k++;
		}while(k<10);

  }
}
