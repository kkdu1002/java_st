package jang9;
/*
	�ڹٺ� use bean : �����ͺ��̽� ���̺��� select�� �Ŀ� ���ڵ������ VO(value Object) == DTO(Data Transfer Object)��ü�� ������ ��
	���� ����ϱ� ���� , ���� �ִ� �ڷḦ VO��ü�� ������ �� DB�� ���ڵ� ������ �����ϱ� ����
 */
public class StudentVO 
{
	private String no;
	private String name;
	private int score;
	private String subject;
	
	//getter , setter()�����
	public String getNo() // ���ο��� String s = ��ü.getNo();
	{
		return no;
	}
	public void setNo(String no) // ���ο��� ��ü.setNo("1");
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
	public int getScore() 
	{
		return score;
	}
	public void setScore(int score) 
	{
		this.score = score;
	}
	public String getSubject()
	{
		return subject;
	}
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	@Override
	public String toString() 
	{
		return "StudentVo [no = " + no + ", name = " + name + ", score = " + score +
				", subject = " + subject + "]";
	}
}