import java.util.Set;
//import java.util.HashSet;
//import java.util.TreeSet;
import java.util.LinkedHashSet;
//-------------------------------
import java.util.List;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args) throws Exception
    {
        // --------------------------------
        // ---  USANDO "Set<String>" :  ---
        // --------------------------------
        System.out.println("Coleccion_01 --> Set<String>  . . .  new LinkedHashSet<>();");
        System.out.println("Bienvenido a la Fiesta de los SuperHéroes !!!");
    //  Set<String> Superheroes01 = new HashSet<>();        // Sin Ordenamiento
    //  Set<String> Superheroes01 = new TreeSet();          // Ordena Alfabeticamente
        Set<String> Superheroes01 = new LinkedHashSet<>();  // Ordena según su inserción
        
        Superheroes01.add("SpiderMan");
        Superheroes01.add("BatMan");
        Superheroes01.add("CatWoman");
        Superheroes01.add("Hulk");
        Superheroes01.add("Wonder Woman");
        Superheroes01.add("Superman");
        
        // Nuestro SuperHéroe estrella llegó tarde:
        Superheroes01.add("IronMan");
        
        // Buscando Superheroe:
        if (Superheroes01.contains("SpiderMan"))
            System.out.println("SpiderMan está en la Fiesta !!!");
        
        // SuperHéroe se retiró:
        Superheroes01.remove("Hulk");
        if (!Superheroes01.contains("Hulk"))
            System.out.println("Hulk se fue de la Fiesta !!!");
        
        // SuperHéroe se fue y volvió rapidamente de la tienda:
        Superheroes01.add("Superman");
        Superheroes01.add("Superman");
        Superheroes01.add("Superman");
        
        // Verificando Si hay SuperHéroes:
        if (Superheroes01.isEmpty())
            System.out.println("La Fiesta ha terminado, Todos se han retirado !!!");
        else
            System.out.println("La fiesta aún continúa con " + Superheroes01.size() + " SuperHéroes");
        
        // Recorriendo Lista de SuperHéroes:
        System.out.println("¿Quienes están aún en la fiesta?");
        for (String invitado : Superheroes01)
            System.out.println(invitado);
        
        
        // ---------------------------------
        // ---  USANDO "List<String>" :  ---
        // ---------------------------------
        System.out.println("");
        System.out.println("Coleccion_02 --> List<String>  . . .  new ArrayList<>();");
        System.out.println("Bienvenido a la Fiesta de los SuperHéroes !!!");
        List<String> Superheroes02 = new ArrayList<>();
        
        Superheroes02.add("SpiderMan");
        Superheroes02.add("BatMan");
        Superheroes02.add("CatWoman");
        Superheroes02.add("Hulk");
        Superheroes02.add("Wonder Woman");
        Superheroes02.add("Superman");
        
        // Nuestro SuperHéroe estrella llegó tarde:
        Superheroes02.add("IronMan");
        
        // Buscando Superheroe:
        if (Superheroes02.contains("SpiderMan"))
            System.out.println("SpiderMan está en la Fiesta !!!");
        
        // Buscando Superheroe ebrio:
        if (Superheroes02.contains("SpiderMan"))
            System.out.println("Hay un SuperHeroe ebrio en la fiesta, ese es : "+ Superheroes02.get(0) +".");
        
        // Superheroe revela su identidad:
        Superheroes02.set(6, "Tony Stark");
        System.out.println("IRONMAN revela su verdadera identidad, Él es : "+ Superheroes02.get(6) +".");
        
        // SuperHéroe se retiró:
        Superheroes02.remove(3);
        if (!Superheroes02.contains("Hulk"))
            System.out.println("Hulk se fue de la Fiesta !!!");
        
        // Verificando Si hay SuperHéroes:
        if (Superheroes02.isEmpty())
            System.out.println("La Fiesta ha terminado, Todos se han retirado !!!");
        else
            System.out.println("La fiesta aún continúa con " + Superheroes02.size() + " SuperHéroes");
        
        // Recorriendo Lista de SuperHéroes:
        System.out.println("");
        System.out.println("¿Quienes están aún en la fiesta?");
        for (String invitado : Superheroes02)
        {
            System.out.println(invitado);
        }
    }
}
