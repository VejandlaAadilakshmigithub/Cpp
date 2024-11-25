class Student
{
	protected int rollNumber;
	protected String studentName;
	protected String studentAddress;
}
class Science extends Student
{
	protected int physics, chemistry;
}
class PCM extends Science
{
	int maths;
    
	public PCM(int sno, String sname, String addr, int phy, int che, int math)
	{
		rollNumber = sno;
		studentName = sname;
		studentAddress = addr;
		physics = phy;
		chemistry = che;
		maths = math;
	}

	@Override
	public String toString() 
	{
		return "PCM [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", rollNumber="
				+ rollNumber + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}	
}

public class MultiLevel 
{
	public static void main(String[] args) 
	{
		System.out.println(new PCM(1,"A","Adoni",78,89,99));
	}
}