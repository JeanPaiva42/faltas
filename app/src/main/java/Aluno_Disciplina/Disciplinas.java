package Aluno_Disciplina;

/**
 * Created by jcpmg on 23/09/2016.
 */
public class Disciplinas {
//ficar no básico mesmo, só o nome, a quantidade de faltas e se estourou ou não
    int faltasPermitidas;
    int diasFaltados;
    String nomeDaDisciplina;

    Disciplinas(String a, int b){

        this.setNomeDaDisciplina(a);
        this.setFaltasPermitidas(b);

    }

    Disciplinas (){}


    void setNomeDaDisciplina(String a)
    {
        nomeDaDisciplina = a;

    }

    String getNomeDaDisciplina() {

        return nomeDaDisciplina;
    }

    void adicionaFalta()
    {
        diasFaltados++;
    }

    void  tiraFalta()
    {
        diasFaltados--;
    }

    int getDiasFaltados(){

        return diasFaltados;
    }

    int getFaltasPermitidas()
    {

        return faltasPermitidas;
    }

    void setFaltasPermitidas(int b)
    {

        faltasPermitidas = b;
    }

}
