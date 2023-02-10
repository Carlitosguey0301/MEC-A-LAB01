package com.mycompany.calculadora;

public class Metodos {

    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean sin;
    private boolean cos;
    private boolean tan;
    private boolean raiz;
    private boolean potencia;
    private boolean porcentaje;

    public Metodos() {

        cadena = "";
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        sin = false;
        cos = false;
        tan = false;
        raiz = false;
        potencia = false;
        porcentaje = false;

    }

    public String concatenamiento(String cadena) {

        this.cadena = this.cadena + cadena;
        return this.cadena;
    }

    public void suma(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        suma = true;
        this.cadena = "";
    }

    public void resta(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        resta = true;
        this.cadena = "";
    }

    public void multiplicacion(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        multiplicacion = true;
        this.cadena = "";
    }

    public void division(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        division = true;
        this.cadena = "";
    }

    public void sin(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        sin = true;
        this.cadena = "";
    }

    public void cos(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        cos = true;
        this.cadena = "";
    }

    public void tan(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        tan = true;
        this.cadena = "";
    }

    public void raiz(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        raiz = true;
        this.cadena = "";
    }

    public void potencia(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        potencia = true;
        this.cadena = "";
    }

    public void porcentaje(String cadena) {

        this.resultado = Double.parseDouble(cadena);
        porcentaje = true;
        this.cadena = "";
    }

    ///////////////////////////////////////////////////////////////////////////////
    public double resultado(String numero) {
        
        
        
        if (suma == true) {
            resultado = resultado + Double.parseDouble(numero);
        } else if (resta == true) {
            resultado = resultado - Double.parseDouble(numero);
        } else if (multiplicacion == true) {
            resultado = resultado * Double.parseDouble(numero);
        } else if (division == true) {
            resultado = resultado / Double.parseDouble(numero);
        } else if (sin == true) {
            double sin = Math.toRadians(resultado);
            resultado = Math.sin(sin);
        } else if (cos == true) {
            double cos = Math.toRadians(resultado);
            resultado = Math.cos(cos);
        } else if (tan == true) {
            double tan = Math.toRadians(resultado);
            resultado = Math.tan(tan);
        } else if (raiz == true) {
            resultado=Math.sqrt(resultado);
        } else if (potencia == true) {
            resultado = Math.pow(resultado, Double.parseDouble(numero));
        } else if (porcentaje == true) {
            resultado = (0.19 * resultado);
        }
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;
        sin = false;
        cos = false;
        tan = false;
        raiz = false;
        potencia = false;
        porcentaje = false;

        return resultado;
    }
}
