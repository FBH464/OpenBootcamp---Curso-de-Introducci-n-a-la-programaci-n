public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad(24);
        cliente.setTelefono(109383883);
        cliente.credito = 3224;
        System.out.println(" Cliente: \n Nombre: "+cliente.getNombre()+"," +
                " Edad: "+cliente.getEdad()+", Teléfono: "+cliente.getTelefono()+"" +
                ", Crédito: "+cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Carlos");
        trabajador.setEdad(31);
        trabajador.setTelefono(138484812);
        trabajador.salario = 44124;
        System.out.println(" Trabajador: \n Nombre: "+trabajador.getNombre()+"," +
                " Edad: "+trabajador.getEdad()+", Teléfono: "+trabajador.getTelefono()+"" +
                ", Salario: "+trabajador.salario);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}