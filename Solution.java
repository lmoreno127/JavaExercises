import java.util.ArrayList;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        Object[] solucion=new Object[5];
        Cliente clientemax= null;
        Cliente clientemin = null;
        int maxtotal=-1;
        int mintotal=999999999;
        float average;
        int sum=0;
        for (Cliente cliente : tienda) {
          sum+= cliente.getTotalAPagar();
          if(cliente.getTotalAPagar()>maxtotal)
          {
              maxtotal=cliente.getTotalAPagar();
              clientemax=cliente;
          }
          if(cliente.getTotalAPagar()<mintotal){
              mintotal=cliente.getTotalAPagar();
              clientemin=cliente;
          }

        }
        average=sum/tienda.size();
        solucion[0]=average;
        solucion[1]=clientemin.getNombreCompleto();
        solucion[2]=clientemin.getTotalAPagar();
        solucion[3]=clientemax.getNombreCompleto();
        solucion[4]=clientemax.getTotalAPagar();
        
        return solucion;
    }
}