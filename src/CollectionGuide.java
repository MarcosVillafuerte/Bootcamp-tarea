import java.util.*;

public class CollectionGuide {
    public static void main(String[] args) {
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.add(11.4);
        calificaciones.add(19.0);
        calificaciones.add(13.4);
        calificaciones.add(18.3);
        calificaciones.add(16.5);

        // Calcular el promedio
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Su promedio es: " + promedio);

        // Encontrar el máximo y el mínimo
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("La nota más alta y mínima es: " + max + ", " + min);

        // Buscar un elemento
        System.out.println("¿La nota de 18.0 existe en mi lista? " + calificaciones.contains(18.0));

        Set<String> nombres = new HashSet<>();
        nombres.add("Yovana");
        nombres.add("Thais");
        nombres.add("Yeimi");
        nombres.add("Thais");
        for (String nombre: nombres){
            System.out.println(nombre);
        }


        Map<String, Integer> edad = new HashMap<>();
        edad.put("pepito",39);
        edad.put("Miguel",40);
        edad.put("Thais",21);
        System.out.println("La edad de paula es: " +edad.get("Thais"));
        System.out.println("Thais existe? " +edad.containsKey("Thais"));
        for (var e : edad.entrySet()){
            String nombre = e.getKey();
            Integer eda = e.getValue();
            System.out.println(nombre + "->" + eda);
        }
        edad.forEach((clave, valor)-> System.out.println(clave + " tiene " + valor));
    }
}
