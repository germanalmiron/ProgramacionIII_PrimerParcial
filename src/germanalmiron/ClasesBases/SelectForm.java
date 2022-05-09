package germanalmiron.ClasesBases;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {
    private List<Option> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = opciones = new ArrayList<>();
    }

    public SelectForm(String nombre, List<Option> opciones){
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOption(Option opcion) {
        this.opciones.add(opcion);
        return this;
    }

    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Option opcion : this.opciones) {
            sb.append("<option value='")
                    .append(opcion.getValor())
                    .append("'")
                    .append(opcion.isSelected() ? " selected" : "")
                    .append(">")
                    .append(opcion.getNombre())
                    .append("</option>");

        }
        sb.append("</select>");
        return sb.toString();
    }
}
