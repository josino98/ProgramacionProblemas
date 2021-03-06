/**
 *
 * @author Germ�n Arcos Arag�n
 */
public interface Animal {
    
    /* Crea el m�todo viveUnaHora pero no lo define,
     * Es implementado y despues sobreescrito m�s adelante,
     * seg�n el comportamiento de cada animal.
     */
    public void viveUnaHora(int hora);
    
    /* Implementa el m�todo que permita darle un nombre a un animal instanciado,
     * pero no lo define, ser� implementado en AnimalAbstracto-
     */
    public void setNombre(String nombre);
}
