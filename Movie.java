package comparableInterfaceImplementation;

public class Movie implements Comparable<Movie> {
	private double rating;
    private String name;
    private int year;
    
	public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
	
	// Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
