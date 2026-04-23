import java.util.Scanner;
public class pistas
{
   
    public static void main(String[] args)
    
    {
       String nombre;
       boolean casoResuelto = false;
       
        System.out.println("Hola, detective");
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cual es tu nombre ?: ");
        nombre = teclado.nextLine();
        System.out.print("¿Cual es tu edad?: ");
        int edad = teclado.nextInt();
        System.out.print(" ID: ");
        int ID= teclado.nextInt();
        
        System.out.println("================================");

    System.out.println(" DESPACHO DE JUAN & ASOCIADOS");
    System.out.println(" Caso #1: HIDDEN");
    System.out.println("================================");

     System.out.println("");
     System.out.println("Bienvenido, detective " + nombre + "."); 
     
     System.out.println("Tu misión es resolver el caso HIDDEN Necesitas al menos 3 pistas.");
     
        
        
        if(edad <=12)
        {
            System.out.println("Eres demasiado joven para ser dectetive");
        }else if (edad >=12&& edad<=17)
        {
            System.out.println("Puedes ser detective junior");
        } else if (edad >=18&& edad<=59)
        {
            System.out.println("Bievenido a grupo de detectives");
        }else if (edad >60)
        {
            System.out.println("Eres un detective con experiencia");
        }
       
        System.out.println("Los sospechosos son: ");
        System.out.println("1. Victoria Mendoza");
        System.out.println("2. Aurelio Vásquez");
        System.out.println("3. Simón Quiroga");
        System.out.println("4. Bruno");
       
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas pistas encontraste? ");
        int pistas = sc.nextInt();
       
        if (pistas == 0)
        {
            System.out.println("Ingresa otro número que no sea cero");
            System.out.println("Intenta otra vez");
        } else if(pistas >= 5)
        {
            System.out.println("¡Eres un detective EXPERTO!");
            System.out.println("Puedes resolver el caso.");
        } else if (pistas >= 3)
        {
            System.out.println("Buen trabajo, detective.");
            System.out.println("Necesitas unas pistas más.");
        } else if (pistas >= 1)
        {
            System.out.println("Vas por buen camino...");
            System.out.println("¡Sigue investigando!");
        } else
        {
            System.out.println("¡No has encontrado nada!");
            System.out.println("Revisa la escena del crimen.");
            
            
        
        }
         System.out.println("================================");
         System.out.println("\n  MENÚ DEL DETECTIVE ");
         System.out.println("================================");
         
     System.out.println("1. Que pistas encontraste."); 
      System.out.println("2. Interogacion a los sospechosos."); 
       System.out.println("3. Resolver este caso."); 
       
      System.out.print("Elige una opción (1-3): ");
      
      int opcion = teclado.nextInt();
      teclado.nextLine();
      
      switch (opcion) { 
      
     case 1:
    System.out.println("\n BUSCANDO PISTAS...");
    String[] evidencias = {
        "Huella digital en la ventana",
        "Copa de vino con residuos",
        "Nota rasgada en el escritorio",
        "Cuchillo en la cocina"
    };
    for (int i = 0; i < evidencias.length; i++) {
        pistas++;
        System.out.println("  Pista #" + pistas + ": " + evidencias[i]);
    }
    System.out.println("Total de pistas: " + pistas);
    break;

case 2:
    System.out.println("\n INTERROGATORIOS");
    String[] sospechosos = {
        "James Barnes", "Aurelio Vásquez",
        "Victoria Reyes", "Bruno Quiroga"
    };
    int s = 0;
    String seguir = "si";
    while (seguir.equals("si")) {
        System.out.println("  Interrogando a: " + sospechosos[s]);
        System.out.println("  -> Dice que es inocente...");
        s++;
        if (s < sospechosos.length) {
            System.out.print("  ¿Interrogar al siguiente? (si/no): ");
            seguir = teclado.nextLine();
        } else {
            System.out.println("  No hay más sospechosos.");
            seguir = "no";
        }
    }
    break;

case 3:
    System.out.println("\n RESOLUCIÓN DEL CASO");
    if (pistas >= 3) {
        System.out.println("  ¡Tienes suficientes pistas!");
        System.out.println("  El culpable es: Aurelio Vásquez");
        System.out.println("  ¡CASO RESUELTO, detective " + nombre + "!");
        casoResuelto = true;
    } else if (pistas >= 1) {
        System.out.println("  Tienes " + pistas + " pista(s). Necesitas 3.");
        System.out.println("  ¡Sigue investigando!");
    } else {
        System.out.println("  No tienes ninguna pista.");
        System.out.println("  Ve a buscar pistas primero.");
    }
    break;

    }
}
}

