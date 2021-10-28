package aeroporto;

public class Aereo {

  String modello;
  int capienza;
  int kmXTratta;
  int id;
  boolean alreadyTaken;

  public Aereo(String modello, int capienza, int kmXTratta, int id, boolean alreadyTaken) {
    this.modello = modello;
    this.capienza = capienza;
    this.kmXTratta = kmXTratta;
    this.id = id;
    this.alreadyTaken = alreadyTaken;
  }
  
  // public Aereo(String modello, int capienza, int kmXTratta) {
  //   this.modello = modello;
  //   this.capienza = capienza;
  //   this.kmXTratta = kmXTratta;
  //   alreadyTaken = false;
  // }

  static void bubbleSortC(Aereo[] arr, int n) {  
    String temp1 = "";  
    int temp2 = 0;  
    int temp3 = 0;  
    int temp4 = 0;  
    for(int i=0; i < n; i++){  
     for(int j=1; j < (n-i); j++){  
      if(arr[j-1].capienza > arr[j].capienza){  
         temp1 = arr[j-1].modello;  
         temp2 = arr[j-1].capienza;  
         temp3 = arr[j-1].kmXTratta;  
         temp4 = arr[j-1].id;  
         arr[j-1].modello = arr[j].modello;  
         arr[j-1].capienza = arr[j].capienza;  
         arr[j-1].kmXTratta = arr[j].kmXTratta;  
         arr[j-1].id = arr[j].id;  
         arr[j].modello = temp1;  
         arr[j].capienza = temp2;  
         arr[j].kmXTratta = temp3;  
         arr[j].id = temp4;  
      }  
      if(arr[j-1].capienza == arr[j].capienza){  
        if(arr[j-1].kmXTratta > arr[j].kmXTratta){  
         temp1 = arr[j-1].modello;  
         temp2 = arr[j-1].capienza;  
         temp3 = arr[j-1].kmXTratta;  
         temp4 = arr[j-1].id;  
         arr[j-1].modello = arr[j].modello;  
         arr[j-1].capienza = arr[j].capienza;  
         arr[j-1].kmXTratta = arr[j].kmXTratta;  
         arr[j-1].id = arr[j].id;  
         arr[j].modello = temp1;  
         arr[j].capienza = temp2;  
         arr[j].kmXTratta = temp3;  
         arr[j].id = temp4;  

        }
      }
     }  
    }  
  }
  static void bubbleSortK(Aereo[] arr, int n) {  
    String temp1 = "";  
    int temp2 = 0;  
    int temp3 = 0;  
    int temp4 = 0;  
    for(int i=0; i < n; i++){  
     for(int j=1; j < (n-i); j++){  
      if(arr[j-1].kmXTratta > arr[j].kmXTratta){  
         temp1 = arr[j-1].modello;  
         temp2 = arr[j-1].capienza;  
         temp3 = arr[j-1].kmXTratta;  
         temp4 = arr[j-1].id;  
         arr[j-1].modello= arr[j].modello;  
         arr[j-1].capienza= arr[j].capienza;  
         arr[j-1].kmXTratta= arr[j].kmXTratta;  
         arr[j-1].id= arr[j].id;  
         arr[j].modello= temp1;  
         arr[j].capienza= temp2;  
         arr[j].kmXTratta= temp3;  
         arr[j].id= temp4;  
      }  
     }  
    }  
  }
}