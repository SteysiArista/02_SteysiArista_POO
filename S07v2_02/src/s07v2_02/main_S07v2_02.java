
package s07v2_02;

public class main_S07v2_02 {

    public static void main(String[] args) {
        persona persona1 = new persona();
        persona persona1 = new persona("juan",25,170.5);
        
        persona1.setNombre("ana");
        persona1.setEdad(30);
        persona1.setAltura(165.0);
        
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getAltura());
        
        System.out.println(persona1);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getAltura());
    }
    
}
