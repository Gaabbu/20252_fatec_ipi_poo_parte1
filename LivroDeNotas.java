public class LivroDeNotas{
    //Variável de instância
    //Variável de referência
    //primitivas: int, long, double
    private String disciplina;

    //Construtor e não é método
    //Todo new executa o que tem dentro do construtor
    public LivroDeNotas(String disciplina){
        System.out.println("Criando mais um objeto...");
        setDisciplina(disciplina);
    }


    public void setDisciplina(String disciplina){
        if(disciplina.length() = 3)
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void exibirMensagem(){
        System.out.println("Bem vindo ao livre de " + disciplina);
    }
}