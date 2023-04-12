package jang12;

import java.util.Scanner;

public class ProductionInfo 
{
	// 정적필드 선언
	static int productID = 0; // 상품 고유 식별번호
	static int numberOfProduct = 0; // 상품 수를 체크
	static Product [] p = new Product[3];
	
	public static void main(String[] args) 
	{
		Scanner sin = new Scanner(System.in);
		int choice = 0;
		while(choice != 3)
		{
			int type;
			System.out.print("상품 추가 (1) , 모든 상품 조회 (2) , 끝내기 (3) : ");
			choice = sin.nextInt();
			switch(choice)
			{
				case 1: // 상품 추가
					if(numberOfProduct > p.length)
					{
						System.out.println("더이상 추가 할 수 없습니다.");
						break;
					}
					
					System.out.print("상품 종류 책(1) , 음악CD (2) , 회화책 (3) : ");
					type = sin.nextInt();
					
					if(type < 1 || type > 3)
					{
						System.out.println("잘못된 상품 분류입니다.");
						break;
					}
					addProduct(type); // 상품 추가 메소드
				case 2:
					for(int i = 0; i < numberOfProduct; i++)
					{
						p[i].showInfo();
					}
					break;
				case 3:
					System.out.println("그만");
					break;
				default:
					System.out.println("잘못 입력 하셨습니다.");
					break;
			} 
		}	
	}	
	public static void addProduct(int type)
	{
		 Scanner sin = new Scanner(System.in);
		 System.out.print("상품 설명 : ");
		 String desc = sin.nextLine();
		 System.out.print("생산자 : ");
		 String maker = sin.nextLine();
		 System.out.print("가격 : ");
		 int price = Integer.parseInt(sin.nextLine());
		 
		 switch(type)
		 {
		 	case 1:
		 		System.out.print("책 제목 : ");
		 		String title = sin.nextLine();
		 		
		 		System.out.print("저자 : ");
		 		String author = sin.nextLine();
		 		
		 		System.out.print("ISBN : ");
		 		int ISBN = Integer.parseInt(sin.nextLine());
		 		
		 		p[numberOfProduct] = new Book(productID++, desc , maker , price , ISBN , title ,author  );
		 		break;
		 	case 2: // 음악 cd
		 		System.out.print("앨범 제목 : ");
		 		String album_title = sin.nextLine();
		 		
		 		System.out.print("가수 : ");
		 		String singer = sin.nextLine();
		 		
		 		p[numberOfProduct] = new CompacDisc (productID++, desc , maker , price , album_title , singer);
		 		break;
		 	case 3: // 회화책
		 		System.out.print("책 제목 : ");
		 		String title2 = sin.nextLine();
		 		
		 		System.out.print("저자 : ");
		 		String author2 = sin.nextLine();
		 		
		 		System.out.print("언어 : ");
		 		String languege = sin.nextLine();
		 		
		 		System.out.print("ISBN : ");
		 		int ISBN2 = Integer.parseInt(sin.nextLine());
		 		
		 		p[numberOfProduct] = new ConversationBook (productID++, desc , maker , price , ISBN2 , title2 , author2 , languege);
		 		break;
		 }
		 numberOfProduct++;
	}
}
