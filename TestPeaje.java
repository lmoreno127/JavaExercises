import java.util.Arrays;

public class TestPeaje {


    public static void main(String[] args) {
        String [] cola = new String [] { "FNC901", "RBP250", "TPS706", "ITN503", "RSP845", "SBL560", "IVD432", "LCS254", "ECT243", "RPL122", "FRS484", "TLB884", "NFT948", "INS230"
        };
        Peaje taquillaPeaje =new Peaje(cola);
       taquillaPeaje.proximoCoche();
       taquillaPeaje.proximoCoche();
       taquillaPeaje.proximoCoche();
       taquillaPeaje.proximoCoche();

       taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();

        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        System.out.println(Arrays.toString(taquillaPeaje.getFilaCoches()));
        System.out.println(Arrays.toString(taquillaPeaje.getCochesFlyPass()));
        System.out.println(taquillaPeaje.isEstadoPeaje());
        System.out.println(taquillaPeaje.getCocheEnAtencion());
        System.out.println(taquillaPeaje.getCantidadCochesAtendidos());
    }
}