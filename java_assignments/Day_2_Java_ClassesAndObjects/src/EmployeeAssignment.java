
public class EmployeeAssignment {
	private  int id;
	private String name;
	private float monthlyBasic;
	public static float medicalAllowance=1250;
	public static float conveyenceAllowance=800;
	public static float pfRate=20;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMonthlyBasic() {
		return monthlyBasic;
	}
	
	public static float getPfRate() {
		return pfRate;
	}
	
	
	public void setMonthlyBasic(float monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public float setAnnualBasic()
	{
		return monthlyBasic;
	}
	public float getAnnualBasic()
	{
		return 12*monthlyBasic;
	}
	
	public float hraCalculation(){
		float hra=((monthlyBasic*50)/100)+ medicalAllowance+conveyenceAllowance;
		return hra;		
	}
	
	public float setGetPf(){
		float pfCalculation=(monthlyBasic*EmployeeAssignment.getPfRate())/100;
		if(pfCalculation<=6500)
			pfCalculation = 6500;
		return pfCalculation;	
	} 
	
	public float esic(){
		float esic=0;
		if(monthlyBasic<=5000)
			esic= (float) (0.0475*monthlyBasic);
		return esic;
		
	}
	
	public float getMonthlyGrossSalary(){
		return (monthlyBasic+hraCalculation()+medicalAllowance+conveyenceAllowance);
	}
	
	public int professionalTax(){
		int tax=0;
		if(getMonthlyGrossSalary()<=10000)
			tax=50;
		else
			tax=100;
		return tax;
	}
	
	public float getAnnualGrossSalary(){
		return (12 * getMonthlyGrossSalary());
	}
	
	public float getMonthlyDeductions(){
		return (professionalTax() + esic() + setGetPf());
	}
	
	public float getMonthlyTakeHome(){
		return (getMonthlyGrossSalary()- getMonthlyDeductions());
	}
	
	public float getAnnualTakeHome(){
		return (12 * getMonthlyTakeHome());
	}
}
