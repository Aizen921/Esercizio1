public class Studenti {
    public String nome;

    public String cognome;

    public int id;

    public Studenti(String nome, String cognome, int id){
        this.nome=nome;
        this.cognome=cognome;
        this.id=id;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }
}
