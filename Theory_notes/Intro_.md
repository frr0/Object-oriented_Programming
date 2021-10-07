#  OOP
  
  
- [OOP](#oop )
  - [Infos](#infos )
    - [Prof](#prof )
    - [Language](#language )
    - [Overview SE](#overview-se )
- [Object oriented programming](#object-oriented-programming )
  - [Classes and Object](#classes-and-object )
    - [Example using Basi di dati](#example-using-basi-di-dati )
    - [Example using OOP](#example-using-oop )
    - [Programmazione strutturata](#programmazione-strutturata )
    - [Vector](#vector )
  
##  Infos
  
###  Prof
  
- Fabrizio Lamberti
- Fabio Garcea
  
###  Language
  
oop in java  
sw <img src="https://latex.codecogs.com/gif.latex?&#x5C;to"/> Eclipse 21  
jvm <img src="https://latex.codecogs.com/gif.latex?&#x5C;to"/> java 17
  
###  Overview SE
  
  
Software <img src="https://latex.codecogs.com/gif.latex?&#x5C;neq"/> Program
  
possible division:
- Safety critical
- Mission critical
- Others (like games)
  
  
#  Object oriented programming
  
  
##  Classes and Object
  
  
  
###  Example using Basi di dati   
  
diagramma entità-relazioni
  
  
Codice tes  <img src="https://latex.codecogs.com/gif.latex?&#x5C;leftarrow"/> Entità  
<img src="https://latex.codecogs.com/gif.latex?&#x5C;downarrow"/>
Medico|
---|  
<img src="https://latex.codecogs.com/gif.latex?&#x5C;downarrow"/>  
Nome Cognome <img src="https://latex.codecogs.com/gif.latex?&#x5C;leftarrow"/> Attributi
  
  
  
CodTess|nome|cognome
---|---|---|--- 
1234|Alessio|Neri|--- 
---|---|---|--- 
---|---|---|--- 
---|---|---|--- 
  
righe <img src="https://latex.codecogs.com/gif.latex?&#x5C;to"/> ditanza
dati veri
  
  
###  Example using OOP   
  
Example|OOP Name|Meaning
:---:|:---:|:---:|  
Medico|Class
CodeTess, Nome, Cognome| Attributes| it describes the structure
...|Procedures
  
```C
int x;
```
<img src="https://latex.codecogs.com/gif.latex?&#x5C;downarrow"/>  
Reificazione (inverso di astrazione)
  
<img src="https://latex.codecogs.com/gif.latex?&#x5C;downarrow"/>  
Oggetto = istanza
  
```C
x = 5;
```
  
Classe solo struttura dei dati  
reificazioni <img src="https://latex.codecogs.com/gif.latex?&#x5C;to"/> passo da classe a istanza
  
```C
  int r; //Global variable
//blocco
{
  int x; //scope
}
x = 5; //error
  
```
###  Programmazione strutturata
  
costrutto selezione o scelta ```if```  
costrutto iterazione ```for(), while()```  
  
eccezione è prima dell'errore
  
```
int vect[20];
void sort() { /* sort */ }
int search(int n){ /* search */ }
void init() { /* init */ }
// …
int i;
void main(){
  init();
  sort();
  search(13);
}
```
###  Vector
  
- It is not possible to consider a vector
as a primitive and modular concept
- Data and functions cannot be
modularized properly
  