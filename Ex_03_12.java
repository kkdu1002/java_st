// ������ - ����� ���޸𸮿� ���� Ȯ��: String str1 = new String("10");
// ���� ����� ����ϱ� ������ ���ϰ� �� �� �ֵ��� �Ʒ�ó�� ��ü ����� ���� �����.

package Ex_03;

public class Ex_03_12 {

	public static void main(String[] args) {
		String str1 = "IT CookBook �Դϴ�.";
		String str2 = "10";
		String str3 = "20";
		
		str1 = "Java �Դϴ�.";
		
		System.out.printf("%s \n",str1);
		System.out.printf("%s \n",str2 + str3);
/*
 * ��� : ȫ�浿
 * ��ȭ��ȣ : 02- 222 - 333
 * �ּ� : ���� ���α� ��ö��
 * 
 * */
		String name = "ȫ�浿";
		String phone = "02 - 222 - 333";
		String address = "���� ���α� ��ö��";
		
		System.out.printf("�̸�\t: %s\n��ȭ��ȣ\t: %s\n�ּ�\t: %s\n",name,phone,address);
	}

}
