package jang9;
/*
	자바빈 use bean : 데이터베이스 테이블에서 select한 후에 레코드단위로 VO(value Object) == DTO(Data Transfer Object)객체에 저장한 후
	폼에 출력하기 위함 , 폼에 있는 자료를 VO객체에 저장한 후 DB에 레코드 단위로 저장하기 위함
 */
public class StudentVO 
{
	private String no;
	private String name;
	private int score;
	private String subject;
	
	//getter , setter()만들기
	public String getNo() // 메인에서 String s = 객체.getNo();
	{
		return no;
	}
	public void setNo(String no) // 메인에서 객체.setNo("1");
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