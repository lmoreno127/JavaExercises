public class Peaje {
    
    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    
    private String[] filaCoches;
    private String[] cochesFlyPass;
    private boolean estadoPeaje;
    private int cantidadCochesAtendidos;
    private int cocheEnAtencion; 
    
    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:
    
    

    public Peaje(String[] filaCoches) {
        //COMPLETE AQU�? LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
        this.filaCoches=filaCoches;
        this.cochesFlyPass = new String[filaCoches.length];
        for(int i=0;i<filaCoches.length;i++)
            this.cochesFlyPass[i]=" ";
        this.estadoPeaje=true;
        this.cocheEnAtencion=0;
        this.cantidadCochesAtendidos=1;
    }
    
    public void proximoCoche(){
        //COMPLETE AQU�? LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(estadoPeaje){
            cantidadCochesAtendidos++;
            cocheEnAtencion++;
        }

    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }
    
    public void cambiarEstadoPeaje(){
        //COMPLETE AQU�? LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(estadoPeaje)
            estadoPeaje=false;
        else
            estadoPeaje=true;
    }
    
    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE AC�?:


    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }
}
