public class Article{
    private int id;
    private String nom;
    private double prix;
    private int quantite;
    private String categorie;

    public Article(int id, String nom, double prix, int quantite, String categorie){
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public int getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        if(prix < 1){
            System.out.println("Prix invalide");
        }
        else{
            this.prix = prix;
        }

    }

    public int getQuantite(){
        return quantite;
    }

    public void setQuantite(int quantite){
        if(quantite < 0){
            System.out.println("Quantite invalide");
        }
        else{
            this.quantite = quantite;
        }

    }

    public String getCategorie(){
        return categorie;
    }

    public void setCategorie(String categorie){
        this.categorie = categorie;
    }


    public void afficherArticle(){
        System.out.println("ID: "+ getId());
        System.out.println("NOM: "+ getNom());
        System.out.println("PRIX: "+ getPrix());
        System.out.println("QANTITE: "+ getQuantite());
        System.out.println("CATEGORIE: "+ getCategorie());
    }
}
