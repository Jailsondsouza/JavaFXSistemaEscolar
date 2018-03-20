package javafxsistemaescolar.model.domain;

/**
 *
 * @author jailson_a_souza
 */
public class Curso {
    
    private String curso;
    private String nome;

    public Curso() {
    }

    public Curso(String curso, String nome) {
        this.curso = curso;
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
