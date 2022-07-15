public class Tripulante extends UsuarioMoodle {
    //Atributos
    double[] calificaciones;
    boolean[] entregas;
    
    //Constructor


    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        entregas= new boolean[n];
        calificaciones=new double[n];
    }

    //Método
    public void resolverReto(int retoAEntregar){
        entregas[retoAEntregar]=true;
    }
    
    //Getter del atributo calificaciones
    public double[] getCalificaciones() {
        return calificaciones;
    }
    
    //Setter del atributo calificaciones
    public void setCalificaciones(double[] calificaciones) {
       this.calificaciones = calificaciones;
    }
    
    //Getter del atributo entregas
    public boolean[] getEntregas() {
        return entregas;
    }
    
    //Setter del atributo entrgas
    public void setEntregas(boolean[] entregas) {
        this.entregas=entregas;
    }
}
