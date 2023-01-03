import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo("Mercedes","E",55));
        listaVehiculos.add(new Autobus("Mercedes", "M20",100,20));
        listaVehiculos.add(new Turismo("BMW","525",50,4));
        listaVehiculos.add(new Turismo("Audi","A4",55,4));
        listaVehiculos.add(new Autobus("Mercedes", "M20",120,20));
        listaVehiculos.add(new Turismo("VM","Passat",35,4));
        listaVehiculos.add(new Turismo("Audi","A3",30,2));
        listaVehiculos.add(new Turismo("Mercedes","E",60,4));
        listaVehiculos.add(new Vehiculo("Audi","A3",30));
        imprimirElementosLista((ArrayList)listaVehiculos);
    }

    private  static void imprimirElementosLista(ArrayList list){
        for (int i = 0; i < list.size(); i++){
            Vehiculo v = (Vehiculo)list.get(i);
            v.imprimirAtributos();
            System.out.println("");
        }
    }
}
