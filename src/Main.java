public class Main {
    public static void main(String[] args) {

        Studenti studente1= new Studenti("Gianluca", "Mulieddi", 9210812);
   /* studente1.nome="Gianluca";
    studente1.cognome="Mulieddi";
    studente1.id=9210812; */

        System.out.println(studente1.getNome());
        System.out.println(studente1.getCognome());
        System.out.println(studente1.getId());
    }
}
