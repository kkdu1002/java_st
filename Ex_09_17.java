package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_09_17 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("===== BufferedReader =====");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		/*
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   --'대'라는 문자를 BufferedReader를 통해 입력받을 경우 2바이트로 구성되어 있기 때문에 1바이트씩 쪼갠다
	     InpurStreamReader가 바이트 스트림을 문자 스트림으로 변환시켜주는 역할을 하게된다.
	   --new를 통해 heap메모리 영역을 할당받아 올라간다 이 경우 in은 reference type 변수이다. 
		  */
		
		String name_b;
		int nKor_b , nMat_b, nEng_b , nTot_b;
		
		System.out.print("이름을 입력하세요 : ");
		name_b = in.readLine();
		System.out.print("국어 점수 : ");
		nKor_b = Integer.parseInt(in.readLine());
		System.out.print("영어 점수 : ");
		nEng_b = Integer.parseInt(in.readLine());
		System.out.print("수학 점수 : ");
		nMat_b = Integer.parseInt(in.readLine());
		
		nTot_b = nKor_b + nMat_b + nEng_b;
		System.out.println("====== [결 과] ======");
		System.out.printf("이름 : %s\n",name_b);
		System.out.printf("총점 : %d\n",nTot_b);
		
		System.out.println("===== Scanner =====");
		
		Scanner br = new Scanner(System.in);
		
		 String strName;
		 int nKor , nMat, nEng , nTot;
		/* -- String은 ?
		  'A' : 문자 stack 영역에 저장
		  "A" : 문자열 Heap 영역에 저장
		  --String 만큼은 new를 사용하여 메모리 영역을 할당 받지않아도 사용 가능하다.
		  int k ,e, m ,t(국,영,수,총 점수 변수) stack메모리 영역에 5바이트씩 총16바이트 올라간다.
		*/
			
		String strData; // 문자열 데이터 임시저장
		System.out.print("이름을 입력하세요 : ");
		strName = br.next(); //readLine();
		/* --사용자가 입력한 값(외부 데이터)를 받아와서 변수에 담아내기
		 --readLine()은 ?
		 BufferedReader의 메소드로 한줄씩 입력받는다.
		 숫자 입력은 못받는다. 오직 문자열 입력받는다.
		 read() 메소드로 입력받을 경우
		 "홍길동"은 5번을 입력받아야한다. ????
		*/
		System.out.print("국어 점수 : ");
		strData = br.next();//readLine();
		nKor = Integer.parseInt(strData);
		/*	 
		 -- 이 상황에서 국어 점수 70점을 입력받았다고 가정할때 readLine()을 통해 입력받은 70은
		 숫자가 아니라 문자열이다. 숫자로 바꾸지 않으면 산술 연산이 불가능하다. 즉 문자형식의 숫자를
		 숫자타입으로 바꾸어주는것이다 Integer.parseInt()를 통해 정수로 형을 변환한다.
		 */
		System.out.print("수학 점수 : ");
		strData = br.next();//readLine();
		nMat = Integer.parseInt(strData);
		
		System.out.print("영어 점수 : ");
		strData = br.next();//readLine();
		nEng = Integer.parseInt(strData);
		
		nTot = nKor + nMat + nEng;
		System.out.println("====== [결 과] ======");
		System.out.printf("이름 : %s\n",strName);
		System.out.printf("총점 : %d\n",nTot);
	}
}