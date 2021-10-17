public class Array {

  public static void main(String[] args) {

    //Enumerazione
    int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int aa[] = new int [100];
    
    aa[0] = 3;
    int x = aa[1];
    System.out.println(x);
    System.out.println(aa[1]);
    System.out.println("Contenuto array");
    System.out.println(a.length);

    System.out.print("\n");
    System.out.println("print array");
    for (int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
    System.out.println("done");
    
    //string
    
    String stringhe[] = new String[10];
    stringhe[0]= "Primo";
    stringhe[1]= "Secondo";
    stringhe[2]= "Terzo";
    stringhe[3]= "Terzo";
    stringhe[4]= "Terzo";
    stringhe[5]= "Terzo";
    stringhe[6]= "Terzo";
    stringhe[7]= "Terzo";
    stringhe[8]= "Terzo";
    stringhe[9]= "Terzo";
    for (int i=0; i<stringhe.length; i++){
      System.out.println(stringhe[i]);
    }
  }
}
