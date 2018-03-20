package javafxsistemaescolar.model.domain;

import java.util.Date;

/**
 *
 * @author jailson_a_souza
 */
public class Aluno {

private String nome;
private String sexo;
private String matricula;
private Date dataNascimento;

    public Aluno() {
        
    }

    public Aluno(String nome, String sexo, String matricula, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    
}
