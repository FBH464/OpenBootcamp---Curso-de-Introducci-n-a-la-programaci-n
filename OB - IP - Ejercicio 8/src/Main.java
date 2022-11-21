public class Main {
    public static void main(String[] args) {
        Persona personaObjeto = new Persona();
        personaObjeto.setNombre("Isabella");
        personaObjeto.setEdad(22);
        personaObjeto.setTelefono(320977726);
        System.out.println(personaObjeto.getNombre()+", "+personaObjeto.getEdad()+", "+personaObjeto.getTelefono());
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