package Aluno_Disciplina; /**
 * Created by jcpmg on 23/09/2016.
 */
import java.util.ArrayList;
public class Aluno {

    //arraylist de disciplinas

    ArrayList<Disciplinas> disciplinas;
    String nome;


    public Aluno(String n)
    {
        nome = n;
        disciplinas = new ArrayList<Disciplinas>();
    }

    public Aluno()
    {

        disciplinas = new ArrayList<Disciplinas>();
    }

    public void adicionarDisciplina(String nome, int faltas)
    {
        Disciplinas d = new Disciplinas(nome, faltas);
        disciplinas.add(d);
    }

    public void setNome(String a)
    {
        this.nome = a;

    }
    public String getNome()
    {

        return this.nome;
    }
}
