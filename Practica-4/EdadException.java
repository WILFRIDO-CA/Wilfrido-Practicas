public class EdadException extends Exception{
   
     public EdadException(){
         
     }

     public EdadException(String mensaje){
         super(mensaje);

     }

     public EdadException(int edad)throws EdadException{
        this.validarEdad(edad);
     }

     public void validarEdad(int edad)throws EdadException{
        if(!(edad>=18 && edad<=45)){
            // 17, 16, 15 .... 46, 47
            throw new EdadException("Error en la edad es menor de 18 o mayor de 45");

        }
     }
}