package typeTeacher;

import java.util.Random;

public class StringGenerator {

	public static int randInt(int min, int max) {

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	static String stringGenerator(String[] words) {

		int i = 0;
		int rnd = 0;
		
		short numberOfWords=50;

		StringBuilder strBuilder = new StringBuilder();

		/**
		 * Be careful with i here, change it in both places. i  assures
		 * that the program does not put a whitespace at the end.
		 */
		while (i <= numberOfWords) {

			rnd = randInt(0, words.length - 1);

			strBuilder.append(words[rnd]);
			if (i <= numberOfWords-1)
				strBuilder.append(' ');

			i++;
		}

		return strBuilder.toString();

	}

	static String stringGenerator(char[] chars) {

		int i = 0;
		int rnd = 0;

		StringBuilder strBuilder = new StringBuilder();

		/**
		 * i==99 prevents the last char to be a whitespace! Change the code
		 * according to i; the if line prevents the first character to be a
		 * whitespace as well as two whitespaces to appear next to each other.
		 */

		while (i < 100) {
			if (rnd == 0 || rnd == 1 || rnd == 2 || rnd == 3 || rnd == 4
					|| i == 99) {
				rnd = randInt(5, chars.length - 1);
			} else
				rnd = randInt(0, chars.length - 1);

			strBuilder.append(chars[rnd]);
			i++;
		}

		return strBuilder.toString();

	}

	static String Cyrillic1() { // � � � �

		char chars[] = new char[7];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = '�';
		chars[4] = '�';
		chars[5] = '�';
		chars[6] = '�';

		return stringGenerator(chars);
	}

	static String Cyrillic2() { // � � � �

		char chars[] = new char[14];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = '�';
		chars[6] = '�';
		chars[7] = '�';
		chars[8] = '�';
		chars[9] = '�';
		chars[10] = '�';
		chars[11] = '�';
		chars[12] = '�';
		chars[13] = '�';

		return stringGenerator(chars);
	}

	static String Cyrillic3() { // �,�,�

		char chars[] = new char[18];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = '�';
		chars[5] = '�';
		chars[6] = '�';
		chars[7] = '�';
		chars[8] = '�';
		chars[9] = '�';
		chars[10] = '�';
		chars[11] = '�';
		chars[12] = '�';
		chars[13] = '�';
		chars[14] = '�';
		chars[15] = '�';
		chars[16] = '�';
		chars[17] = '�';

		return stringGenerator(chars);
	}




	static String Cyrillic4() { // Cyrilic Capital letters

		char chars[] = new char[24];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = '�';
		chars[6] = '�';
		chars[7] = '�';
		chars[8] = '�';
		chars[9] = '�';
		chars[10] = '�';
		chars[11] = '�';
		chars[12] = '�';
		chars[13] = '�';
		chars[14] = '�';
		chars[15] = '�';
		chars[16] = '�';
		chars[17] = '�';
		chars[18] = '�';
		chars[19] = '�';
		chars[20] = '�';
		chars[21] = '�';
		chars[22] = '�';
		chars[23] = '�';

		return stringGenerator(chars);
	}

	static String Cyrillic5() { // , � � � �

		String words[] = new String[24];

		words[0] = "����";
		words[1] = "����";
		words[2] = "����,";
		words[3] = "��������,";
		words[4] = "�����,";
		words[5] = "���";
		words[6] = "������,";
		words[7] = "��,";
		words[8] = "����";
		words[9] = "����";
		words[10] = "�����";
		words[11] = "�������";
		words[12] = "�����,";
		words[13] = "���,";
		words[14] = "����";
		words[15] = "���";
		words[16] = "����";
		words[17] = "��������";
		words[18] = "��������,";
		words[19] = "�����";
		words[20] = "���";
		words[21] = "����";
		words[22] = "�����";
		words[23] = "�����";
		
		return stringGenerator(words);
	}

	static String Cyrillic6() { // � � � � � �

		String words[] = new String[24];
		words[0] = "������";
		words[1] = "�������";
		words[2] = "������";
		words[3] = "�����,";
		words[4] = "���";
		words[5] = "���";
		words[6] = "����";
		words[7] = ",";
		words[8] = "����";
		words[9] = "����,";
		words[10] = "�����,";
		words[11] = "�������";
		words[12] = "�����,";
		words[13] = "�����";
		words[14] = "��������";
		words[15] = "������";
		words[16] = "������,";
		words[17] = "������";
		words[18] = "�������";
		words[19] = "��������";
		words[20] = "����";
		words[21] = "�������";
		words[22] = "���������";
		words[23] = "��������";

		return stringGenerator(words);
	}

	static String Cyrillic7() { // � � � � �

		String words[] = new String[33];
		words[0] = "������";
		words[1] = "�����";
		words[2] = "������";
		words[3] = "���������";
		words[4] = "�����������������";
		words[5] = ",";
		words[6] = "������";
		words[7] = "������";
		words[8] = "����";
		words[9] = "��������������";
		words[10] = "��������";
		words[11] = "��������";
		words[12] = "����������";
		words[13] = "�������";
		words[14] = "����";
		words[15] = "������";
		words[16] = "����������";
		words[17] = "������";
		words[18] = "�����";
		words[19] = "������������";
		words[20] = "�������";
		words[21] = "������";
		words[22] = "�����";
		words[23] = "������";
		words[24] = "�������";
		words[25] = "�����������";
		words[26] = "���������";
		words[27] = "���������";
		words[28] = "������";
		words[29] = "����";
		words[30] = "���� �������";
		words[31] = "������ �������";
		words[32] = "������";

		return stringGenerator(words);
	}

	static String Cyrillic8() {

		String words[] = new String[5];

		words[0] = "������ �������� ������� ���������"
				+ " � ����� �� �������� �������. ���-����������"
				+ " ���������� �� �������, �������� � ������� �� �����"
				+ " �� �� �������� �� �������� � �������������, ������������ "
				+ "�� ��������. ���������� ������� �� ����������� �� ������� "
				+ "������� ��� ����������� ��������� � �������� ��������."
				+ "������������ ���������� ������ � ��������� �������� ��"
				+ "������������� �� ������� �� ������ 132-����������� �� ����������� ��.";

		words[1] = "���������� �� �������. ��������� ���� ������� ���� ������ ��������� ��"
				+ " ����������� ����. ������� ����� �������� ���� ���� �������, �� ����� "
				+ "��������������� � �������� ���� ������� ���� - ��� ��� �������� � � ����� ��������."
				+ " ��� ������������ ��, ���� �������� � ����� ������� �� ��������� ������� � ���������, "
				+ "����� ���� �� ������� ���� �� ��������� ������� � �������� �����.";

		words[2] = "�������� ����� ����� ����� � ��������� �������,"
				+ " �����,���������, �������, �������� � �������� ������."
				+ " �������� � � ������������ �� ���� �������� �� ����� � ��������"
				+ " �� �����������. ����� ������������ ����������� � �� ������� ���"
				+ " ���� �������� � ���������.������� ��������� �������� �� ����������� "
				+ "������������, ����������� ��������������� �� �������, �������� ���������� "
				+ "��������� ����������������.";

		words[3] = "������ ����� ������ 39-�������� �������� ����� �������� �� ������� ���� "
				+ "����� � ������� ���� ����� �� 5 �����, ����� ������ 20-�� ������� ������ �� "
				+ "��������� � �������������� ����. ������������ ����������� �� ������� � �� ���� "
				+ "���� ������ ��������� �� �������������� ���� � ����� ���������.";

		words[4] = "�������� ������� �� ��������� ����������, ������� � ������������� ������ �����."
				+ " ������ ���� ������ � � ������� �� ������-������� ���� ������� �� �������� � ����������"
				+ " \"������������ �������\". ������ �� �� ������� ������� �� \"���������\" ��� �� ��������"
				+ " �������, ��� ���� ���������� �� ��������� ���������. ���� �������������� ����� �� ��� ��"
				+ " �������� � �������� � ��� �������� ��������� ������� �� �� ������ \"���������\".";

		return words[randInt(0, words.length - 1)];
	}

	static String Latin1() {  //a s d f

		char chars[] = new char[7];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = 's';
		chars[4] = 'd';
		chars[5] = 'f';
		chars[6] = 'a';

		return stringGenerator(chars);
	}

	

	static String Latin2() {   // j k l ;

		char chars[] = new char[13];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = ';';
		chars[6] = 'a';
		chars[7] = 's';
		chars[8] = 'd';
		chars[9] = 'f';
		chars[10] = 'k';
		chars[11] = 'j';
		chars[12] = 'l';

		return stringGenerator(chars);
	}
	
	static String Latin3() {   //' g h 

		char chars[] = new char[17];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = ';';
		chars[6] = 'a';
		chars[7] = 's';
		chars[8] = 'd';
		chars[9] = 'f';
		chars[10] = 'k';
		chars[11] = 'j';
		chars[12] = 'l';
		chars[13] = 'g';
		chars[14] = 'h';
		chars[15] = 'h';
		chars[16] = 'l';

		return stringGenerator(chars);
	
	}
	static String Latin4() {   // Capital letters

		char chars[] = new char[29];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = ';';
		chars[6] = 'a';
		chars[7] = 's';
		chars[8] = 'd';
		chars[9] = 'f';
		chars[10] = 'k';
		chars[11] = 'j';
		chars[12] = 'l';
		chars[13] = 'g';
		chars[14] = 'h';
		chars[15] = 'A';
		chars[16] = 'S';
		chars[17] = 'D';
		chars[18] = 'F';
		chars[15] = 'G';
		chars[16] = 'H';
		chars[17] = 'J';
		chars[18] = 'K';
		chars[19] = 'L';
		chars[20] = 'M';
		chars[21] = 'N';
		chars[22] = 'O';
		chars[23] = ':';
		chars[24] = '"';
		chars[25] = 'K';
		chars[26] = 'G';
		chars[27] = 'k';
		chars[28] = 'l';

		return stringGenerator(chars);
	}
	/**
	 * to do : 
	 * finish the next method:
	 * 
	 */

	static String Latin5() { //q w e r t

		String words[] = new String[24];
		words[0] = "lag";
		words[1] = "saw";
		words[2] = "leg";
		words[3] = "jaw";
		words[4] = "\"gas\"";
		words[5] = "aged";
		words[6] = "elf";
		words[7] = "lake";
		words[8] = "laws;";
		words[9] = "lash";
		words[10] = "Safe";
		words[11] = "Jake";
		words[12] = "whale;";
		words[13] = "walk";
		words[14] = "flesh;";
		words[15] = "shelf";
		words[16] = "wake;";
		words[17] = "fladhed";
		words[18] = "Flash";
		words[19] = "leash";
		words[20] = "leaks";
		words[21] = "leaf";
		words[22] = "gale";
		words[23] = "glade";
		words[23] = "waste";
		
		
		return stringGenerator(words);
	}
	static String Latin6() { //y u i o p

		String words[] = new String[26];
		words[0] = "rugfish";
		words[1] = "pasta";
		words[2] = "profiles";
		words[3] = "upside";
		words[4] = "Souped;";
		words[5] = "pseudo";
		words[6] = "shoplift";
		words[7] = "ship";
		words[8] = "God";
		words[9] = "folksier";
		words[10] = "target";
		words[11] = "sofa";
		words[12] = "soul";
		words[13] = "walk";
		words[14] = "soda";
		words[15] = "holidays";
		words[16] = "polarised";
		words[17] = "played";
		words[18] = "Flash";
		words[19] = "fly";
		words[20] = "purify";
		words[21] = "purple";
		words[22] = "gorgeous";
		words[23] = "play";
		words[24] = "poker";
		words[25] = "tiger";
		
		return stringGenerator(words);
	}
}
