package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//<SE METE EL TIPO>
public class Test {

    public static void main(String[] args) {
        //COLECCION LIST
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        //buble FOR EACH
        for (Object elem : miLista) {
            System.out.println("elem= " + elem);

        }
        System.out.println("IMPRIMO MI LISTA ARRAY LIST");
        imprimir(miLista); //llamo a mi método
        System.out.println();

        //COLECCION MAP
        Map miMap = new HashMap();
        miMap.put("valor1", "Santiago");
        miMap.put("valor2", "Lorena");
        miMap.put("valor3", "Gema");
        miMap.put("valor4", "Werner");
        miMap.put("valor5", "Luis");

        String nombre = (String) miMap.get("valor3"); //casting a String xq es objeto
        System.out.println("Imprimo el elemento con ls clsve vslor3 de mi COLECCION MAP");
        System.out.println("nombre = " + nombre);
        
        
        //Métodos de MAPS
        imprimir(miMap.keySet()); //me devuelve todas las claves
        imprimir(miMap.values()); //Me devuelve todos los valores
        
    }

    
    public static void imprimir(Collection coleccion) { //se aplica POLIMORFISMO
        //bucle CON FUNCION LAMBDA (de flecha)
        coleccion.forEach(elem -> {
            System.out.println("elem " + elem);
        });
    }

}
