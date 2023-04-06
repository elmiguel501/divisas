/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class LogicaCodigo {
    
    private double valor, resultado;
    private int combo1, combo2;
    
    //valor
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    //combo1
    public int getCombo1() {
        return combo1;
    }

    public void setCombo1(int combo1) {
        this.combo1 = combo1;
    }

    
    //combo2
    public int getCombo2() {
        return combo2;
    }

    public void setCombo2(int combo2) {
        this.combo2 = combo2;
    }

    
    //resultado
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
    
    public LogicaCodigo() {
    }
    
    
    
    //logica metodos
    //convertir de soles a los 5 paises
    public double SolesDolares() {
        
        if (combo1 == 0 && combo2 == 1) {//soles a dolares
            resultado = valor * 0.26;
        }else if(combo1 == 0 && combo2== 0){
            resultado = valor;
        }else if(combo1 == 1 && combo2 == 0) {
            resultado = valor * 3.79;
        }
        return resultado; 
    } 
    
    
    
      public double SolesEuros() {
        
        if (combo1 == 0 && combo2 == 2) {//soles a euros
            resultado = valor * 0.24;
        }else if(combo1 == 2 && combo2== 0){
            resultado = valor * 4.06;
        }
        return resultado; 
    } 
    
    
    
      public double Soleslibra() {
        
        if (combo1 == 0 && combo2 == 3) {//soles a libra esterliana
            resultado = valor * 0.21;
        }else if(combo1 == 3 && combo2== 0){
            resultado = valor * 4.63;
        }
        return resultado; 
    } 
    
      
      
        public double solesyen() {
        
        if (combo1 == 0 && combo2 == 4) {//soles a yen japones
            resultado = valor * 34.50;
        }else if(combo1 == 4 && combo2== 0){
            resultado = valor * 0.029;
        }
        return resultado; 
    } 
    
        
        
          public double Soleswon() {
        
        if (combo1 == 0 && combo2 == 5) {//soles a wom surcoreano
            resultado = valor * 342.26;
        }else if(combo1 == 5 && combo2== 0){
            resultado = valor * 0.0029;
        }
        return resultado; 
    } 
    
    
          
          
          //convertir de dolares a los 4paises
          
          
           public double DolaresEur() {
        
        if (combo1 == 1 && combo2 == 2) {//soles a dolares
            resultado = valor * 0.92;
        } else if (combo1 == 1 && combo2 == 1) {
            resultado = valor;
        }
        else if(combo2 == 1 && combo1 == 2){
            resultado = valor * 1.09;
        }
        return resultado; 
    } 
    
    
    
      public double DolaresLibra() {
        
        if (combo1 == 1 && combo2 == 3) {//soles a euros
            resultado = valor * 0.81;
        }else if(combo2 == 1 && combo1== 3){
            resultado = valor * 1.24;
        }
        return resultado; 
    } 
    
    
    
      public double DolarYen() {
        
        if (combo1 == 1 && combo2 == 4) {//soles a libra esterliana
            resultado = valor * 132.7;
        }else if(combo2 == 1 && combo1== 4){
            resultado = valor * 0.0075;
        }
        return resultado; 
    } 
    
      
      
        public double DolarWon() {
        
        if (combo1 == 1 && combo2 == 5) {//soles a yen japones
            resultado = valor * 1.293;
        }else if(combo2 == 1 && combo1== 5){
            resultado = valor * 0.00077;
        }
        return resultado; 
    } 
    
        //convertir de euro a 3paises
        
          public double EurLibra() {
        
        if (combo1 == 2 && combo2 == 3) {//soles a wom surcoreano
            resultado = valor * 0.88;           
        }else if(combo1 == 2 && combo2 == 2) {
            resultado = valor;
        }
        else if(combo2 == 2 && combo1== 3){
            resultado = valor * 1.14;
        }
        return resultado; 
    } 
    
    
           public double EurYen() {
        
        if (combo1 == 2 && combo2 == 4) {//soles a dolares
            resultado = valor * 144.9;
        }else if(combo2 == 2 && combo1== 4){
            resultado = valor * 0.0069;
        }
        return resultado; 
    } 
    
    
    
      public double EurWon() {
        
        if (combo1 == 2 && combo2 == 5) {//soles a euros
            resultado = valor * 1.411;
        }else if(combo2 == 2 && combo1== 5){
            resultado = valor * 0.00071;
        }
        return resultado; 
    } 
    
      //convertir de libra a 3 paises
    
      public double LibraYen() {
        
        if (combo1 == 3 && combo2 == 4) {//soles a libra esterliana
            resultado = valor * 164.8;
        }else if(combo1 == 3 && combo2 == 3) {
          resultado = valor;
      }
        else if(combo2 == 3 && combo1== 4){
            resultado = valor * 0.0061;
        }
        return resultado; 
    } 
    
      
      
        public double LibraWon() {
        
        if (combo1 == 3 && combo2 == 5) {//soles a yen japones
            resultado = valor * 1.61;
        }else if(combo2 == 3 && combo1== 5){
            resultado = valor * 0.00062;
        }
        return resultado; 
    } 
    
    
    //convertir de yen japones a won-surcoreano
        
           public double YenWon() {
        
        if (combo1 == 4 && combo2 == 5) {//soles a yen japones
            resultado = valor * 9.74;
        }else if(combo1 == 4 && combo2 == 4) {
            resultado = valor;
        }
        else if(combo2 == 4 && combo1== 5){
            resultado = valor * 0.10;
        }else if(combo1 == 5 && combo2 == 5) {
            resultado = valor;
        }
        return resultado; 
    } 
    
    
    
    
    
    
    
    
}
    

