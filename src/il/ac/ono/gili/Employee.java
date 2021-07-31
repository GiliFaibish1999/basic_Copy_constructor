package il.ac.ono.gili;

// Employee immutable class
public final class Employee {

	// Strings
	private String name;
	private String job;
	private String rank;
	
	// Constructor 
    public Employee (String name, String job, String rank)
		{
			 this.name = name;
			 this.job = job;
			 this.rank = rank;
		}
    
    // Copy constructor
    public Employee (Employee g)
		{
			 this.name = g.name;
			 this.job = g.job;
			 this.rank = g.rank;
		}
    
    // Setters
    
    // Setter name
    public Employee setName(String name) {
    	Employee gili = new Employee(this);
		gili.name = name;
		return gili;
	}
    
    // Setter job
	public Employee setJob(String job) {
    	Employee gili = new Employee(this);
		gili.job = job;
		return gili;
	}
	
	// Setter rank
	public Employee setRank(String rank) {
    	Employee gili = new Employee(this);
		gili.rank = rank;
		return gili;
	}

	// Getters
    public String getName() { return name; }
    public String getJob() { return job; }
    public String getRank() { return rank; }
    
    // Print function
    public void printEmployee() {
    	System.out.println("Name : " + name + "\r\n" + "Job : " + job + "\r\n" + "Rank : " + rank);
    }
}