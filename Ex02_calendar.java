package Ex02;

public class Ex02_calendar {

	public static void main(String[] args) {
	
		System.out.println("일	월	화	수	목	금	토");
		System.out.println("			1	2	3	4");
//		-------------------------------------------------
		/*
		 * System.out.println("5	6	7	8	9	10	11");
		 * System.out.println("12	13	14	15	16	17	18");
		 * System.out.println("19	20	21	22	23	24	25");
		 * System.out.println("26	27	28	29	30	31 ");
		 */
		
		/*
		 * System.out.println("----------printf 사용---------");
		 * 
		 * System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		 * System.out.printf("\t\t\t1\t2\t3\t4\n");
		 * System.out.printf("5\t6\t7\t8\t9\t10\t11\n");
		 * System.out.printf("12\t13\t14\t15\t16\t17\t18\n");
		 * System.out.printf("19\t20\t21\t22\t23\t24\t25\n");
		 * System.out.printf("26\t27\t28\t29\t30\t31 \n");
		 */
		
		/* 
		 * System.out.println("------printf %d,%c 사용---------");
		 * 
		 * System.out.printf("%c\t%c\t%c\t%c\t%c\t%c\t%c\n",'일','월','화','수','목','금','토')
		 * ; System.out.printf("\t\t\t%d\t%d\t%d\t%d\n",1,2,3,4);
		 * System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",5,6,7,8,9,10,11);
		 * System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",12,13,14,15,16,17,18);
		 * System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",19,20,21,22,23,24,25);
		 * System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",26,27,28,29,30,31);
		 */
		for (int i=5 ; i <=31 ; i++) 
		{
			System.out.print(i+"	");
			if (i%7 == 4) {
				System.out.println();
			}
		}
	}
}
