package Hal18;


public class Matematika {
    
    int c;
    
   void tambah(int a, int b){
   c = a + b;
   System.out.println("Perhitungan Penambahan     :" + a + " + " + b + " = " + c);
   };
    
   void kali(int a, int b){
   c = a * b;
   System.out.println("Perhitungan Perkalian      :" + a + " * " + b + " = " + c);
   };
   
   void kurang(int a, int b){
   c = a - b;
   System.out.println("Perhitungan Pengurangan    :" + a + " - " + b + " = " + c);
   };
    
   void bagi(int a, int b){
   c = a / b;
   System.out.println("Perhitungan Pembagian      :" + a + " / " + b + " = " + c);
   };
    
}
