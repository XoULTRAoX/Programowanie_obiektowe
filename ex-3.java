public class Theater
{
	public static void main(String[] args) {
		Actors actors1 = new Actors("Anna Er",25,2.1);
		Movie movie1=new Movie("Marvel","comedy",120,actors1);
		System.out.println(movie1.movieInformation());
	}
}

class Movie
{
    private String name;
    private String category;
    private int lenght;
    private Actors movieActors;
    Movie(String nm,String cg,int le,Actors ac)
    {
        this.name=nm;
        this.category=cg;
        this.lenght=le;
        this.movieActors=ac;
    }
    
    public String movieInformation()
    {
        String movies;
        movies=movieActors.engineInformation();
        String data=String.format("Movie name: %s \rCategory: %s \rLenght:  %d min \r%s\n",this.name,this.category,this.lenght,movies);
        return data;
    } 
}
class Actors{
    private String name;
    private int age;
    private double rate;
    Actors(String nm, int ag, double rt)
    {
        this.age=ag;
        this.name=nm;
        this.rate=rt;
    }
    public String engineInformation()
    {   
        String data=String.format("Actor name: %s \rAge: %d \rHis rate on Filmweb: %.1f",this.name,this.age,this.rate);
        return data;
    }   
}
