package mini_project;

public class EmployeeVO 
{
	private int no; // ���
	private String name; // �̸�
	private String jobgrade; // ��å
	private int department; // �μ�
	private String email; // ����
	// (EmployeeDAO) 1. �ű� ����� ��� - sql�� ���� ����� EmployeeVO�� ����
	private String status; 
	public EmployeeVO(int no, String name, String jobgrade, int department, String email) 
	{
		this.no = no;
		this.name = name;
		this.jobgrade = jobgrade;
		this.department = department;
		this.email = email;
	}
	// status�� ���� �ִ� ������
	public EmployeeVO(int no, String name, String jobgrade, int department, String email, String status) 
	{
		this.no = no;
		this.name = name;
		this.jobgrade = jobgrade;
		this.department = department;
		this.email = email;
		this.status = status;
	}
	public EmployeeVO() // �⺻������ 
	{}
	public int getNo() 
	{
		return no;
	}
	public void setNo(int no) 
	{
		this.no = no;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getJobgrade() 
	{
		return jobgrade;
	}
	public void setJobgrade(String jobgrade) 
	{
		this.jobgrade = jobgrade;
	}
	public int getDepartment() 
	{
		return department;
	}
	public void setDepartment(int department) 
	{
		this.department = department;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	@Override
	public String toString() 
	{
		return "EmployeeVO [no=" + no + ", name=" + name + ", jobgrade=" + 
					jobgrade + ", department=" + department
				+ ", email=" + email + ", status=" + status + "]";
	}
}