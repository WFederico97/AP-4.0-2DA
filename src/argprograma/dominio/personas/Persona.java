package src.argprograma.dominio.personas;

//* Las clases se escriben en CamelCase, deben estar en una clase y se escriben en singular
//*SOLO USO INT EN CASOS DONDE NECESITE REALIZAR OPERACIONES ARITMETICAS CON ESE DATO
public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int cantDiasPresentes;
    private TipoDocumento tipoDocumento;

    public String presentacion (){
        return "Mi nombre es " + this.nombre + " " + this.apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getCantDiasPresentes() {
        return cantDiasPresentes;
    }

    public void setCantDiasPresentes(int cantDiasPresentes) {
        this.cantDiasPresentes = cantDiasPresentes;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
