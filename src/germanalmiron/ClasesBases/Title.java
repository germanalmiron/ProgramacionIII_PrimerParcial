package germanalmiron.ClasesBases;

public class Title extends ElementoForm{

    private String titulo;

    public Title(String titulo) {
        super(titulo);
        this.titulo = titulo;
    }

    public String dibujarHtml() {
        if(titulo == null) {
            titulo = "";
        }
        return "<title>\""+ titulo + "\"</title>";
    }
}
