

public class Disciplina {

    private String titulo;
    private String NomeDocente;

    public Disciplina(String titulo, String NomeDocente) {
        this.titulo = titulo;
        this.NomeDocente = NomeDocente;
    }

    public Disciplina() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDocente() {
        return NomeDocente;
    }

    public void setNomeDocente(String NomeDocente) {
        this.NomeDocente = NomeDocente;
    }

    public static double calcularMelhorMedia() {
        try (BufferedReader br = new BufferedReader(new FileReader(fich))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] coluna = linha.split(";");
                double notas = Double.parseDouble(coluna[1]);
                double melhorMedia = notas[0];
                for (int i = 0; i < notas.length; i++) {
                    if (notas[i] > melhorMedia) {
                        melhorMedia = notas[i];
                    }
                }
                return melhorMedia;

            }
        }
