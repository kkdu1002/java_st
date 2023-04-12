package jang12;

import java.util.Scanner;

public class ProductionInfo 
{
	// �����ʵ� ����
	static int productID = 0; // ��ǰ ���� �ĺ���ȣ
	static int numberOfProduct = 0; // ��ǰ ���� üũ
	static Product [] p = new Product[3];
	
	public static void main(String[] args) 
	{
		Scanner sin = new Scanner(System.in);
		int choice = 0;
		while(choice != 3)
		{
			int type;
			System.out.print("��ǰ �߰� (1) , ��� ��ǰ ��ȸ (2) , ������ (3) : ");
			choice = sin.nextInt();
			switch(choice)
			{
				case 1: // ��ǰ �߰�
					if(numberOfProduct > p.length)
					{
						System.out.println("���̻� �߰� �� �� �����ϴ�.");
						break;
					}
					
					System.out.print("��ǰ ���� å(1) , ����CD (2) , ȸȭå (3) : ");
					type = sin.nextInt();
					
					if(type < 1 || type > 3)
					{
						System.out.println("�߸��� ��ǰ �з��Դϴ�.");
						break;
					}
					addProduct(type); // ��ǰ �߰� �޼ҵ�
				case 2:
					for(int i = 0; i < numberOfProduct; i++)
					{
						p[i].showInfo();
					}
					break;
				case 3:
					System.out.println("�׸�");
					break;
				default:
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					break;
			} 
		}	
	}	
	public static void addProduct(int type)
	{
		 Scanner sin = new Scanner(System.in);
		 System.out.print("��ǰ ���� : ");
		 String desc = sin.nextLine();
		 System.out.print("������ : ");
		 String maker = sin.nextLine();
		 System.out.print("���� : ");
		 int price = Integer.parseInt(sin.nextLine());
		 
		 switch(type)
		 {
		 	case 1:
		 		System.out.print("å ���� : ");
		 		String title = sin.nextLine();
		 		
		 		System.out.print("���� : ");
		 		String author = sin.nextLine();
		 		
		 		System.out.print("ISBN : ");
		 		int ISBN = Integer.parseInt(sin.nextLine());
		 		
		 		p[numberOfProduct] = new Book(productID++, desc , maker , price , ISBN , title ,author  );
		 		break;
		 	case 2: // ���� cd
		 		System.out.print("�ٹ� ���� : ");
		 		String album_title = sin.nextLine();
		 		
		 		System.out.print("���� : ");
		 		String singer = sin.nextLine();
		 		
		 		p[numberOfProduct] = new CompacDisc (productID++, desc , maker , price , album_title , singer);
		 		break;
		 	case 3: // ȸȭå
		 		System.out.print("å ���� : ");
		 		String title2 = sin.nextLine();
		 		
		 		System.out.print("���� : ");
		 		String author2 = sin.nextLine();
		 		
		 		System.out.print("��� : ");
		 		String languege = sin.nextLine();
		 		
		 		System.out.print("ISBN : ");
		 		int ISBN2 = Integer.parseInt(sin.nextLine());
		 		
		 		p[numberOfProduct] = new ConversationBook (productID++, desc , maker , price , ISBN2 , title2 , author2 , languege);
		 		break;
		 }
		 numberOfProduct++;
	}
}
