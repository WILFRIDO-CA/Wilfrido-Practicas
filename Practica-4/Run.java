public class Run{
    public static void main(String[] args) {
        EdadException edEx= new EdadException();
        
        
        try {
             int edad= 19;
             edEx.validarEdad(edad);
        } catch (EdadException ex) {
            ex.printStackTrace();
            System.out.println("Entre al Catch");
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Finally");

        }
        System.out.println("continuacion del programa en JAVA");
    }
}