//TesteLivroDeNotas é um código cliente da classe LivroDeNotas

public class TesteLivroDeNotas{
    static public void main(String [] args){
        String disciplina1 = "POO";
        String disciplina2 = "PEM";
        LivroDeNotas livro1 = new LivroDeNotas(); // Construir/Instanciar objeto
        livro1.setDisciplina(disciplina1)
        livro1.exibirMensagem();
        LivroDeNotas livro2 = new LivroDeNotas();
        livro2.setDisciplina(disciplina2);
        livro2.exibirMensagem();
        //livro1 = livro2;
    }
}