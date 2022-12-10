public class Main
{
	public static void main(String args[])
	{
		Min m = new Min();
		System.out.println(m.min(10, 20));
		Max n = new Max();
		System.out.println(n.max(10, 20));
		Avg a = new Avg();
		System.out.println(a.avg(10, 20));

	}
}



public class Min{
	public int min(int x, int y)
	{
	    if (x<y){
		return x;
	    }
	    else{
	    return y;
	    }
	    }
	}
  
  
  class Max {
	public int max(int x, int y)
	{
	    if (y>x){
		return y;
	    }
	    else{
	    return x;
	    }
	    }
	}
  
  
  class Avg {
	public int avg(int x, int y)
	{
		return (y+x)/2;
	}
}
