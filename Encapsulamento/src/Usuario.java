public class Usuario {

    private String nome;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        setIdade(idade); //construtor chama o set, para idade ficar positiva
    }

    private int idade;

    //Alt + Insert
    public int getIdade() {  //get - ira consultar por isso tipo int
        return idade;
    }

    public void setIdade(int idade) {  //tipo void - pois vai modificar


        this.idade = Math.abs(idade); //mesmo se digitar negativo, ficará positivo a idade
    }

    //Alt+Insert
    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
