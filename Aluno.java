
import java.util.Arrays;


public class Aluno {
    private String nome;

    private int[] notas;

    //construtor

    public Aluno(String nome, int[] notas) {

        this.nome = nome;

        this.notas = notas;

    }

    //geterres e setterres

  public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int[] getNotas() {

        return notas;

    }

    public void setNota(int[] notas) {

        this.notas = notas;
    }
    //calcula a media e ordenar
     public double calcularMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        
        
        double media = (double) soma / notas.length;
        
       Arrays.sort(notas);
       
        return media;
       
        
     }
    @Override

    public String toString() {

        return "Aluno{" + "nome=" + nome + ", nota=" + notas+ '}';

    }

    

   
}
