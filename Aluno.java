package trabFinal;
public class Aluno {
    private String nome;
    private float notap1;
    private float notap2;
    private float notatrab;

    public Aluno(String nome, float notap1, float notap2, float notatrab) {
        this.nome = nome;
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notatrab = notatrab;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getNotap1() {
        return notap1;
    }
    public void setNotap1(float notap1) {
        this.notap1 = notap1;
    }
    public float getNotap2() {
        return notap2;
    }
    public void setNotap2(float notap2) {
        this.notap2 = notap2;
    }
    public float getNotatrab() {
        return notatrab;
    }
    public void setNotatrab(float notatrab) {
        this.notatrab = notatrab;
    }
    public float getMedia() {//fazendo média com pesos já no cálculo
        return (notap1*0.25f + notap2*0.25f + notatrab*0.5f);

    }

    @Override
    public String toString() {//formatação do texto
        return "Nome=" + nome + ", Nota Prova 1=" + notap1 + ", Nota Prova 2=" + notap2
                + ", Nota trabalho=" + notatrab + "]";
    }

}