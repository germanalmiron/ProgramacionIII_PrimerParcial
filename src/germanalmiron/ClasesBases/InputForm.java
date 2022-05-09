package germanalmiron.ClasesBases;

public class InputForm extends ElementoForm {
    private String tipo;
    private String nombre;

    public String dibujarHtml() {
        if(nombre == null) {
            nombre = "";
        }
        return "<input type=\"" + tipo + "\" name=\"" + nombre + "\"  value=\"" + valor + "\"/>";
    }

    public InputForm(String tipo) {
        super(tipo);
        this.tipo = tipo;
    }

    public InputForm(String tipo, String nombre) {
        super(nombre);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
