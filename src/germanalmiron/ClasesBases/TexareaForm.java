package germanalmiron.ClasesBases;

public class TexareaForm extends ElementoForm {

    public int filas;
    public int columnas;
    public String nombre;

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public TexareaForm(String nombre, int filas, int columnas, String valor) {
        super(nombre);
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.valor = valor;
    }

    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<textarea ");
        sb.append("name='").append(this.nombre).append("' ");
        sb.append( "rows='").append(this.filas).append("' ");
        sb.append( "cols='").append(this.columnas).append("'");
        sb.append(">");
        sb.append(this.valor);
        sb.append("</textarea>");

        return sb.toString();
    }
}
