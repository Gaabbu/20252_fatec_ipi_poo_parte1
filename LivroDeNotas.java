public class LivroDeNotas{
    //Variável de instância
    //Variável de referência
    //primitivas: int, long, double
    private String disciplina;

    public void setDisciplina(String d){
        disciplina = d;
    }

    public void exibirMensagem(){
        System.out.println("Bem vindo ao livre de " + disciplina);
    }
}