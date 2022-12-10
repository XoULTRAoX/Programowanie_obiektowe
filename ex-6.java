public class Main
{
	public static void main(String args[])
	{
		Min m = new Min(10,20);
		m.min();
		Max n = new Max(10,20);
		n.max();
		Avg a = new Avg(10,20);
		a.avg();

	}
}

class Min{
    int a;
    int b;
	Min(int a, int b){
	    this.a = a;
	    this.b = b;
	}
    public void min(){
	    if (a<b){
	    System.out.println("Min: " + a);
	    }
	    else{
	    System.out.println("Min: " + b);
	    }
	    }
	}

 class Max{
    int a;
    int b;
	Max(int a, int b){
	    this.a = a;
	    this.b = b;
	}
    public void max(){
	    if (a>b){
	    System.out.println("Max: " + a);
	    }
	    else{
	    System.out.println("Max: " + b);
	    }
	    }
	}
  
  class Avg{
    int a;
    int b;
	Avg(int a, int b){
	    this.a = a;
	    this.b = b;
	}
    public void avg(){
	    System.out.println("Avg: " + (a+b)/2);
	    }
	}
