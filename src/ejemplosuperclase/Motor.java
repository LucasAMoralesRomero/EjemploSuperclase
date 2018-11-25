/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosuperclase;

/**
 *
 * @author Lucas A. Morales Romero
 */
public class Motor {
    public int cilindrada;
    public String traccion;
    public String transmision;
    public String combustible;
    public double aceleracion;
    public int velocidadmaxima;
    
      public Motor(int cilindrada,String traccion,String transmision, String combustible, double aceleracion, int velocidadmaxima)
    {
        this.cilindrada = cilindrada;
        this.traccion = traccion;
        this.transmision = transmision;
        this.combustible = combustible;
        this.aceleracion = aceleracion;
        this.velocidadmaxima = velocidadmaxima;
    }
}

  