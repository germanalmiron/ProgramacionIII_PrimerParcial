package germanalmiron.ClasesBases;

import java.util.ArrayList;
import java.util.List;

//Implementación de class abstract para ElementoForm
public abstract class ElementoForm {

    //Atributos de la clase.
    public String nombre;
    public String valor;

    //Modificadores set and get
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    private List<String> validadores = new ArrayList<>();

    private List<String> errores = new ArrayList<>();

    //Constructor con parámetro

    public ElementoForm(String nombre) {
        this.nombre = nombre;
    }

    //Método específico de la clase

    private boolean esValido(){
        return errores.isEmpty();
    };

    //Método abstract de la clase

    public abstract String dibujarHtml();
}
