package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        int factor = 1;
        return this.getPaginas()*palabrasPagina*factor;
    }

    public String toString(){
        String frase = this.getOrigen() +"\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" +
        this.getPaginas() + "\n" + this.ensenanza;
        return frase;
    }
    
}
