/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MIGUELITO
 */
public class LogicacdMasa {
    
    private double valor, resultado;
    private int Vcombo1, Vcombo2;
    
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

    public int getVcombo1() {
        return Vcombo1;
    }

    public void setVcombo1(int Vcombo1) {
        this.Vcombo1 = Vcombo1;
    }
    
    

    public int getVcombo2() {
        return Vcombo2;
    }

    public void setVcombo2(int Vcombo2) {
        this.Vcombo2 = Vcombo2;
    }
    
    

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    

    public LogicacdMasa() {
    }
    
    //todos los metodos
    
    public double kgMasa() {
        //kg/toneladas
      if(Vcombo1 == 0 && Vcombo2 == 1) {
         resultado = valor / 1000; 
      }else if(Vcombo1 == 0 && Vcombo2 == 0) {
          resultado = valor;
      }else if(Vcombo1 == 1 && Vcombo2 == 0) {
          resultado = valor *1000 ;
      }  //kg/a gramos
      else if(Vcombo1 == 0 && Vcombo2 == 2) {
          resultado = valor * 1000;   
      }else if(Vcombo1 == 2 && Vcombo2 == 0){
          resultado = valor / 1000;
      } //kg a miligramos
      else if(Vcombo1 == 0 && Vcombo2 == 3) {
          resultado = valor * 1000000;
      }else if(Vcombo1 == 3 && Vcombo2 == 0) {
          resultado = valor / 1000000;
      } //kg a stone
      else if(Vcombo1 ==0 && Vcombo2 == 4) {
          resultado = valor / 6.35;
      }else if(Vcombo1 ==4 && Vcombo2 ==0 ){
          resultado = valor * 6.35;
      } //kg a libra
       else if(Vcombo1 ==0 && Vcombo2 == 5) {
          resultado = valor * 2.205;
      }else if(Vcombo1 ==5 && Vcombo2 ==0 ){
          resultado = valor / 2.205;
      } //kg a onzas
       else if(Vcombo1 ==0 && Vcombo2 == 6) {
          resultado = valor * 35.274;
      }else if(Vcombo1 ==6 && Vcombo2 ==0 ){
          resultado = valor / 35.274;
      }
      return resultado;
  }
    
    
 
    public double Tonelada()  { //tonelada a gramo
         if(Vcombo1 == 1 && Vcombo2 == 2) {
         resultado = valor * 1000000; 
      }else if(Vcombo1 == 1 && Vcombo2 == 1) {
          resultado = valor;
      }else if(Vcombo1 == 2 && Vcombo2 == 1) {
          resultado = valor / 1000000;
      } //tonelada a miligramo
         else if(Vcombo1 == 1 && Vcombo2 == 3) {
          resultado = valor * 1000000000;   
      }else if(Vcombo1 == 3 && Vcombo2 == 1){
          resultado = valor / 1000000000;
      } //tonelada a stone
      else if(Vcombo1 == 1 && Vcombo2 == 4) {
          resultado = valor * 157.5;
      }else if(Vcombo1 == 4 && Vcombo2 == 1) {
          resultado = valor / 157.5;
      } //tonelada a libra
      else if(Vcombo1 ==1 && Vcombo2 == 5) {
          resultado = valor * 2205;
      }else if(Vcombo1 ==5 && Vcombo2 ==1){
          resultado = valor / 2205;
      } //tonelada a onzas
       else if(Vcombo1 ==1 && Vcombo2 == 6) {
          resultado = valor * 35270;
      }else if(Vcombo1 ==6 && Vcombo2 ==1 ){
          resultado = valor / 35270;
      }
    return resultado;
    } 
      
    
    
   public double Gramo()  { //gramo a miligramo
         if(Vcombo1 == 2 && Vcombo2 == 3) {
         resultado = valor * 1000; 
      }else if(Vcombo1 == 2 && Vcombo2 == 2) {
          resultado = valor;
      }else if(Vcombo1 == 3 && Vcombo2 == 2) {
          resultado = valor / 1000 ;
    } //gramo a stone
          else if(Vcombo1 == 2 && Vcombo2 == 4) {
          resultado = valor / 6350;
      }else if(Vcombo1 == 4 && Vcombo2 == 2) {
          resultado = valor *6350;
      } //tonelada a libra
      else if(Vcombo1 ==2 && Vcombo2 == 5) {
          resultado = valor / 453.6;
      }else if(Vcombo1 ==5 && Vcombo2 ==2){
          resultado = valor *453.6;
      } //tonelada a onzas
       else if(Vcombo1 ==2 && Vcombo2 == 6) {
          resultado = valor / 28.35;
      }else if(Vcombo1 ==6 && Vcombo2 ==2 ){
          resultado = valor * 28.35 ;
      }
    return resultado;
    }
  
     
     
      public double Miligramo()  { //miligramo a stone
         if(Vcombo1 == 3 && Vcombo2 == 4) {
         resultado = valor / 6.35000000; 
      }else if(Vcombo1 == 3 && Vcombo2 == 3) {
          resultado = valor;
      }else if(Vcombo1 == 4 && Vcombo2 == 3) {
          resultado = valor *6.35000000;
    } //miligramo a libra
           else if(Vcombo1 ==3 && Vcombo2 == 5) {
          resultado = valor / 453600;
      }else if(Vcombo1 ==5 && Vcombo2 ==3){
          resultado = valor *453600;
      } //tonelada a onzas
       else if(Vcombo1 ==3 && Vcombo2 == 6) {
          resultado = valor / 28350;
      }else if(Vcombo1 ==6 && Vcombo2 ==3 ){
          resultado = valor *28350;
      }  
    return resultado;
    }
      
      
   public double Stone()  { //stone a libra
         if(Vcombo1 == 4 && Vcombo2 == 5) {
         resultado = valor * 14; 
      }else if(Vcombo1 == 4 && Vcombo2 == 4) {
          resultado = valor;
      }else if(Vcombo1 == 5 && Vcombo2 == 4) {
          resultado = valor / 14;
    } //stone a onzas
      else if(Vcombo1 == 4 && Vcombo2 == 6) {
          resultado = valor * 224;
      }else if(Vcombo1 == 6 && Vcombo2 == 4) {
          resultado = valor / 224;
      }
    return resultado;
    }
    
    
   
    public double Libra()  { //libra a onzas
         if(Vcombo1 == 5 && Vcombo2 == 6) {
         resultado = valor * 16; 
      }else if(Vcombo1 == 5 && Vcombo2 == 5) {
          resultado = valor;
      }else if(Vcombo1 == 6 && Vcombo2 == 5) {
          resultado = valor / 16;
    } //onzas a onzas
      else if(Vcombo1 == 6 && Vcombo2 == 6) {
          resultado = valor;
      }
    return resultado;
    }
   
}