
public class Insurance 
{
	private double base;
	private int age;
	private boolean smoker = false;
	private boolean married = false;
	
	public Insurance(int age, boolean smoker, boolean married)
	{
		this.age = age;
		this.smoker = smoker;
		this.married = married;
	}
	
	public void setBasePremium()
	{
		this.base = 500;
	}
	
	public double Premium()
	{
		double premium = base;
	
		if (age > 65)
		{
			premium += 300.00;
		}
		else if (age <= 65 && smoker == true)
		{
			premium += 50.00;
		}
		
		if (married == true)
		{
			premium -= 30.00;
		}
		return premium;
	}
}
