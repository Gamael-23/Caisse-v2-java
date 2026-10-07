public class Article{
    private String nom;
    private double prix;
    

    public Article(String nom, double prix){
        this.nom = nom ;
        this.prix = prix;
       
    }

    public String getNom(){
        return nom;
    }

    public double getPrix(){
        return prix;
    }

    public int getQuantite(){
        return quantite;
    }
}