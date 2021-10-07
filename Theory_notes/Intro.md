# OOP


[toc]

## Infos
### Prof
- Fabrizio Lamberti
- Fabio Garcea

### Language
oop in java  
sw $\to$ Eclipse 21  
jvm $\to$ java 17

### Overview SE

Software $\neq$ Program

possible division:
- Safety critical
- Mission critical
- Others (like games)

  
# Object oriented programming

## Classes and Object


### Example using Basi di dati   
diagramma entità-relazioni


Codice tes  $\leftarrow$ Entità  
$\downarrow$
Medico|
---|  
$\downarrow$  
Nome Cognome $\leftarrow$ Attributi



CodTess|nome|cognome
---|---|---|--- 
1234|Alessio|Neri|--- 
---|---|---|--- 
---|---|---|--- 
---|---|---|--- 

righe $\to$ ditanza
dati veri


### Example using OOP   
Example|OOP Name|Meaning
:---:|:---:|:---:|  
Medico|Class
CodeTess, Nome, Cognome| Attributes| it describes the structure
...|Procedures

```C
int x;
```
$\downarrow$  
Reificazione (inverso di astrazione)

$\downarrow$  
Oggetto = istanza

```C
x = 5;
```

Classe solo struttura dei dati  
reificazioni $\to$ passo da classe a istanza

```C
  int r; //Global variable
//blocco
{
  int x; //scope
}
x = 5; //error

```
### Programmazione strutturata
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
### Vector
- It is not possible to consider a vector
as a primitive and modular concept
- Data and functions cannot be
modularized properly
