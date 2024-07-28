
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        LlamadasTelefonicas[] TablaDeCostos = new LlamadasTelefonicas[7];

        TablaDeCostos[0] = new LlamadasTelefonicas (12,"AMÉRICA DEL NORTE",2.0);
        TablaDeCostos[1] = new LlamadasTelefonicas (15,"AMÉRICA CENTRAL",2.2);
        TablaDeCostos[2] = new LlamadasTelefonicas (18,"AMÉRICA DEL SUR",4.5);
        TablaDeCostos[3] = new LlamadasTelefonicas (19,"EUROPA",3.5);
        TablaDeCostos[4] = new LlamadasTelefonicas (23,"ASIA",6);
        TablaDeCostos[5] = new LlamadasTelefonicas (25,"ÁFRICA",6);
        TablaDeCostos[6] = new LlamadasTelefonicas (29,"OCIAÍA",5);

        Scanner valor = new Scanner(System.in);


        //Pedimos los datos al Usuario

          String Entrada;      
          int clave;
          double tiempo;
          double Costo=0.0;

        System.out.println("Ingrese por favor la clave y los minutos de su llamada \nen el siguiente formato\n");
        System.out.println("CLAVE,NUMIN\n");
        Entrada=valor.nextLine();
        //Separa los dos datos
        String[] Partes = Entrada.split(",");
        // guarda los datos en su respectivo variable
        clave = Integer.parseInt(Partes[0].trim());
        tiempo = Double.parseDouble(Partes[1].trim());

        boolean ExisteClave= false;

        for(LlamadasTelefonicas Llamada : TablaDeCostos){
            //System.out.println("Precio:"+Llamadas.getPrecio());
            if(clave==Llamada.getClave()){
                ExisteClave=true;
                Costo=tiempo*Llamada.getPrecio();
                break;
            }
        }

        if(ExisteClave){
            System.out.println("El costo de su llamada es: $"+Costo+",00");

        }else{
            System.out.println("Lo sentimos, la clave que proporciono no existe en nuesta base de datos");
            System.out.println("vuelva a intentarlo");
        }

       


       
    }


}