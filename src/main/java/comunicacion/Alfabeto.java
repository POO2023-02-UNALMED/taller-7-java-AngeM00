package comunicacion;

public class Alfabeto{
    private String nombre;
    protected String[] letras;
    protected String interpretacion;

    public Alfabeto(String nombre,String[] letras,String interpretacion){
        this.nombre = nombre;
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras(){
        return this.letras;
    }

    public void setLetras(String[] letras){
        this.letras = letras;
    }

    public int cantidadLetras(){
        int cantidad = 0;
        for (String string : letras) {
            cantidad += 1;
        }
        return cantidad;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < letras.length; i++) {
            stringBuilder.append(letras[i]);
            if (i < letras.length - 1) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }
}
