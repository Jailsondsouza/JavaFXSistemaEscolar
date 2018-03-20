package javafxsistemaescolar.model.domain;

/**
 *
 * @author jailson_a_souza
 */
public class Turma {

private String codigo;
private Curso codigoCurso;

    public Turma() {
        
    }

    public Turma(String curso, Curso codigoCurso) {
        this.codigo = curso;
        this.codigoCurso = codigoCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

  

    public Curso getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Curso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }



}
