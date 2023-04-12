package jang12;

public class CompacDisc extends Product
{
	private String album_title ; // 앨범제목
	private String singer; // 가수이름
	
	public CompacDisc(int productID, String descrption, String maker, int price , String album_title , String singer) 
	{
		super(productID, descrption, maker, price);
		this.album_title = album_title;
		this.singer = singer;
	}
	
	public String getAlbum_title() 
	{
		return album_title;
	}
	public void setAlbum_title(String album_title) 
	{
		this.album_title = album_title;
	}

	public String getSinger() 
	{
		return singer;
	}
	public void setSinger(String singer) 
	{
		this.singer = singer;
	}
	
	public void showInfo() 
	{
		super.showInfo();
		System.out.println("---------------------------");
		System.out.println("앨범제목 : " + album_title);
		System.out.println("가수이름 : " + singer + "\n");
	}
}
