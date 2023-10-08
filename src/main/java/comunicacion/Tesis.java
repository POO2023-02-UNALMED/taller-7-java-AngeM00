package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }
    
    public void setIdea(String idea) {
        this.idea = idea;
    }    

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        int factor = 5;
        return this.getPaginas()*palabrasPagina*factor;
    }

    private int getCantidadArgumentos(){
        int cantidad =  0;
        for (String string : argumentos) {
            cantidad += 1;
        }
        return cantidad;
    }

    public String toString(){
        String frase = this.getOrigen() +"\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" +
        this.getPaginas() + "\n" + this.idea + "\n" + this.getCantidadArgumentos() + "\n" + this.conclusion+ "\n" 
        + this.referencias;
        return frase;
    }
}
