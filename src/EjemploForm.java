//ANÁLISIS E IMPLEMENTACIÓN DE LA CLASE MAIN.

/* (1) Analisis del código e implementación de la clase main para la app en cuestión y
llegar a la solución propuesta a partir de las clases del modelo definidas.*/
// (2) Comentar que operaciones realiza el cuerpo de código definido en el main.

import germanalmiron.ClasesBases.*;
import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        //******Se instancian las clases a implementar******************

        //Se crea etiqueta title - h1 con su estructura ==> Html.
        Title title = new Title("Challenger Programacion III");
        HeadH1 contenido = new HeadH1("Formulario con JAVA - Herencia");

        //Se crea etiqueta inputForm con su estructura ==> Html.
        InputForm username = new InputForm("text","nombre");
        InputForm password = new InputForm("password", "clave");
        InputForm email = new InputForm("mail", "mail");
        InputForm edad = new InputForm("number", "edad");

        //Se crea los valores a mostrar por consola de cada variable.
        username.setValor("German Almiron");
        edad.setValor("39");
        password.setValor("123456789");
        email.setValor("german.almiron13@gmail.com");


        //Se crea etiqueta TexareaForm con su estructura ==> Html.
        TexareaForm experiencia = new TexareaForm("experiencia", 4,8, "Nada de experiecia");

        //Se crea la lista que contendrá los elementos de la clase.
        List<ElementoForm> elementos = new ArrayList<>();

        //Se crea etiqueta SelectForm con su estructura ==> Html.
        SelectForm lenguaje = new SelectForm("Lenguaje");

        //Se crea etiqueta Option con su estrcutura ==> Html.
        Option java = new Option("Java", "java");
        Option python = new Option("Python", "python");
        Option typeScript = new Option("TypeScript", "TypeScript");
        Option php = new Option("Php", "Php");
        Option cmasmas = new Option("C++", "C++");

        //Se agrega de la clase padre de Option de SelecForm el método específico addOption.
        lenguaje.addOption(java);
        lenguaje.addOption(python);
        lenguaje.addOption(typeScript);
        lenguaje.addOption(php);
        lenguaje.addOption(cmasmas);

        //Se agrega los elementos para recorrer en el for.
        elementos.add(title);
        elementos.add(contenido);
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        //Recorre toda la lista de elementos.
        for(ElementoForm elemento : elementos) {
            System.out.println(elemento.dibujarHtml()); //Se renderiza todos los elemntos con el método dibujarHtml
        }
    }
}
