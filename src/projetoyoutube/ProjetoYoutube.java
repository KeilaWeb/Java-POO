package projetoyoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 POO");
        v[2] = new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 18, "F", "créu");

        //System.out.println(v[0].toString());
        System.out.println(g[0].toString());


    }


}