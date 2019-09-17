package tallerpolimorfismo;


public class ProgramaInterfaz {
    
    public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro rebuzna = new Burro();
        hacerCantar(rebuzna);
       
    } 
     public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}


    

