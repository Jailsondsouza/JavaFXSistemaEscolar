package javafxsistemaescolar.model.domain;

/**
 *
 * @author jailson_a_souza
 */
public class Professor {

private String nome;
private String sexo;
private String registro;

    public Professor() {
    
    }

    public Professor(String nome, String sexo, String registro) {
        this.nome = nome;
        this.sexo = sexo;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    


    
}
