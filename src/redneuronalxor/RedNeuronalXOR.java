/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redneuronalxor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Sebastian
 */
public class RedNeuronalXOR {

    private double pesos[];
    private double salidas[] = new double[4];
    private double entradas[][] = new double[4][4];
    private double salida;
    private double coeficienteAprendizaje;
    private String log = "Aprendiendo XOR\n";

    public RedNeuronalXOR() {
    }

    public void entrenarXOR() throws IOException {
        this.coeficienteAprendizaje = 0.7;
        this.pesos = new double[]{1.0, -1.0, 2.0};

        this.leerEntradasSalidas(); //Llenar arreglos de entradas y salidas
        this.salida = 0;
        int centinela = 0;
        while (centinela < entradas.length) {

            salida = pesos[0] * entradas[centinela][0] + pesos[1] * entradas[centinela][1] + pesos[2] * entradas[centinela][2];

            if (salida >= 0) {
                salida = 1;
            } else {
                salida = 0;
            }

            this.log = this.log + "Entradas (" + entradas[centinela][0] + "," + entradas[centinela][0] + ") Salidas (" + salidas[centinela] + ")\n";
            System.out.println("Salida => " + salida + " Salida esperada: " + salidas[centinela]);
            double error = verificarError(salidas[centinela], salida);
            this.log = this.log + "Error: " + error + "\n";
            if (error == 0.0) {
                System.out.println("OK \n\n\n");
                this.log = this.log + "OK \n\n\n";
            } else {
                System.out.println("Entradas (" + entradas[centinela][1] + "," + entradas[centinela][2] + ") Salidas (" + salidas[centinela] + ") == Error:" + error);
                System.out.println("Recalculando nuevos pesos..");
                this.log = this.log + "\n\nRecalculando nuevos pesos..\n";

                for (int p = 0; p < pesos.length; p++) {
                    this.pesos[p] = this.calcularPesos(pesos[p], this.coeficienteAprendizaje, error, entradas[centinela][p]);
                    System.out.println("Nuevo Peso" + (p + 1) + ": " + pesos[p]);
                    this.log = this.log + "Peso(" + (p + 1) + "): " + pesos[p] + "\n";
                }

                System.out.println("Pesos nuevos calculados..\n \n\n");
                this.log = this.log + "Pesos nuevos calculados.. \n \n\n";
                centinela = centinela - 1;
            }
            centinela++;
        }
        System.out.println("Número de Interacciones: " + centinela);
        System.out.println("FIN....");
        this.log = this.log + "Número de Interacciones: " + centinela+ "\nCOMPUERTA (XOR) Entrenada correctamente..";
        
    }

    public double calcularPesos(double pesoAnterior, double coeficienteError, double error, double entrada) {
        double peso = 0.0;
        peso = pesoAnterior + coeficienteError * error * entrada;
        return peso;
    }

    public double verificarError(double salidaDeseada, double salida) {
        double error = 0;
        error = salidaDeseada - salida;
        return error;
    }

    public int calcular(int x1, int x2) {
        int resultado;
        if (x1 == x2) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public void leerEntradasSalidas() throws FileNotFoundException, IOException {
        String cadena;
        String filePath = new File("").getAbsolutePath();
        FileReader f = new FileReader(filePath + "/src/redneuronalxor/Entradas_Salidas.txt"); //Ruta relativa
        BufferedReader b = new BufferedReader(f);
        int i = 0;
        while ((cadena = b.readLine()) != null) {
            String[] parts = cadena.split("-");
            System.out.println("Valor int: " + parseInt(parts[0]));
            this.entradas[i][0] = parseInt(parts[0]);
            this.entradas[i][1] = parseInt(parts[1]);
            this.entradas[i][2] = parseInt(parts[2]);
            this.salidas[i] = parseInt(parts[3]);
            i++;
        }
        System.out.println("Entradas");
        for (int x = 0; x < this.entradas.length; x++) {
            System.out.print("|");
            for (int y = 0; y < this.entradas[x].length; y++) {
                System.out.print(this.entradas[x][y]);
                if (y != this.entradas[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        System.out.println("Salidas");
        for (int j = 0; j < this.salidas.length; j++) {
            System.out.println(this.salidas[j] + "\t");
        }

        b.close();
    }
}
