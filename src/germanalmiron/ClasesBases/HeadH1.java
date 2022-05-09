package germanalmiron.ClasesBases;

public class HeadH1 extends ElementoForm{

    private String contenido;

    public HeadH1(String contenido) {
        super(contenido);
        this.contenido = contenido;
    }

    public String dibujarHtml() {
        if(contenido == null) {
            contenido = "";
        }
        return "<h1>\""+ contenido + "\"</h1>";
    }
}

