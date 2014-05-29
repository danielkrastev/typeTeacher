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

	static String Cyrillic1() { // ь я а о

		char chars[] = new char[7];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = 'ь';
		chars[4] = 'я';
		chars[5] = 'а';
		chars[6] = 'о';

		return stringGenerator(chars);
	}

	static String Cyrillic2() { // т н в м

		char chars[] = new char[14];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = 'о';
		chars[6] = 'т';
		chars[7] = 'н';
		chars[8] = 'в';
		chars[9] = 'м';
		chars[10] = 'ь';
		chars[11] = 'а';
		chars[12] = 'я';
		chars[13] = 'а';

		return stringGenerator(chars);
	}

	static String Cyrillic3() { // г,ж,ч

		char chars[] = new char[18];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = 'а';
		chars[5] = 'о';
		chars[6] = 'т';
		chars[7] = 'н';
		chars[8] = 'в';
		chars[9] = 'м';
		chars[10] = 'ж';
		chars[11] = 'ч';
		chars[12] = 'г';
		chars[13] = 'г';
		chars[14] = 'ж';
		chars[15] = 'ч';
		chars[16] = 'ж';
		chars[17] = 'я';

		return stringGenerator(chars);
	}




	static String Cyrillic4() { // Cyrilic Capital letters

		char chars[] = new char[24];
		chars[0] = ' ';
		chars[1] = ' ';
		chars[2] = ' ';
		chars[3] = ' ';
		chars[4] = ' ';
		chars[5] = 'о';
		chars[6] = 'т';
		chars[7] = 'н';
		chars[8] = 'в';
		chars[9] = 'м';
		chars[10] = 'ж';
		chars[11] = 'Ж';
		chars[12] = 'г';
		chars[13] = 'Г';
		chars[14] = 'Я';
		chars[15] = 'А';
		chars[16] = 'Г';
		chars[17] = 'М';
		chars[18] = 'В';
		chars[19] = 'О';
		chars[20] = 'Ж';
		chars[21] = 'Т';
		chars[22] = 'Т';
		chars[23] = 'а';

		return stringGenerator(chars);
	}

	static String Cyrillic5() { // , у е и ш

		String words[] = new String[24];

		words[0] = "нива";
		words[1] = "Жена";
		words[2] = "Мими,";
		words[3] = "внимавам,";
		words[4] = "нужен,";
		words[5] = "Яна";
		words[6] = "монета,";
		words[7] = "ум,";
		words[8] = "мога";
		words[9] = "шина";
		words[10] = "течен";
		words[11] = "гонение";
		words[12] = "шаман,";
		words[13] = "ужа,";
		words[14] = "вуги";
		words[15] = "Иеу";
		words[16] = "Етаж";
		words[17] = "внимание";
		words[18] = "уважение,";
		words[19] = "Мания";
		words[20] = "тен";
		words[21] = "Иван";
		words[22] = "мачта";
		words[23] = "мечти";
		
		return stringGenerator(words);
	}

	static String Cyrillic6() { // щ к с д з ц

		String words[] = new String[24];
		words[0] = "здание";
		words[1] = "дотягам";
		words[2] = "знание";
		words[3] = "цвете,";
		words[4] = "сок";
		words[5] = "щам";
		words[6] = "Жена";
		words[7] = ",";
		words[8] = "щука";
		words[9] = "Ваза,";
		words[10] = "Везни,";
		words[11] = "вестник";
		words[12] = "момче,";
		words[13] = "тоник";
		words[14] = "костница";
		words[15] = "зодиак";
		words[16] = "музика,";
		words[17] = "доцент";
		words[18] = "каскада";
		words[19] = "медицина";
		words[20] = "сода";
		words[21] = "система";
		words[22] = "континент";
		words[23] = "Игнажден";

		return stringGenerator(words);
	}

	static String Cyrillic7() { // х п р л б

		String words[] = new String[33];
		words[0] = "китара";
		words[1] = "круша";
		words[2] = "Череши";
		words[3] = "хипербола";
		words[4] = "хиперпространство";
		words[5] = ",";
		words[6] = "колело";
		words[7] = "Пример";
		words[8] = "рало";
		words[9] = "приспособление";
		words[10] = "характер";
		words[11] = "праскова";
		words[12] = "Цитаделата";
		words[13] = "хралупа";
		words[14] = "Орех";
		words[15] = "пробив";
		words[16] = "хранителен";
		words[17] = "Проект";
		words[18] = "борба";
		words[19] = "прахообразен";
		words[20] = "бластер";
		words[21] = "Ралица";
		words[22] = "поток";
		words[23] = "Проект";
		words[24] = "История";
		words[25] = "изпепелявам";
		words[26] = "Благодаря";
		words[27] = "пепелянка";
		words[28] = "Обичам";
		words[29] = "риба";
		words[30] = "Рила планина";
		words[31] = "Родопа планина";
		words[32] = "панаир";

		return stringGenerator(words);
	}

	static String Cyrillic8() {

		String words[] = new String[5];

		words[0] = "Редица културни събития предстоят"
				+ " в града на тепетата Пловдив. Най-запалените"
				+ " почитатели на театъра, музиката и танците ще могат"
				+ " да се насладят на концерти и представления, организирани "
				+ "от Общината. Оригинален конкурс за изработване на коледни "
				+ "играчки пък предизвиква учениците с различни интереси."
				+ "Пловдивският Драматичен театър е подготвил изненада за"
				+ "многобройната си публика по случай 132-годишнината от създаването си.";

		words[1] = "Въстанието на Спартак. Римляните вече няколко пъти търпят поражения от"
				+ " въстаналите роби. Сенатът бързо сформира шест нови легиона, за чиито "
				+ "главнокомандващ е назначен Марк Лициний Крас - мъж без скрупули и с тежък характер."
				+ " При пристигането си, Крас получава и двата легиона на консулите Клодиан и Публикола, "
				+ "които вече на няколко пъти са побягвали позорно в предните битки.";

		words[2] = "Бъртранд Артър Уилям Ръсел е британски философ,"
				+ " логик,математик, историк, пацифист и социален критик."
				+ " Известен е с формулирания от него Парадокс на Ръсел в теорията"
				+ " на множествата. Ръсел популяризира философията и си създава име"
				+ " като пацифист и социалист.Развива фамилната традиция на политическа "
				+ "ангажираност, отстоявайки противовоенните си позиции, подкрепя свободната "
				+ "търговияи антиимпериализма.";

		words[3] = "Кубрат Пулев победи 39-годишния хърватин Ивица Перкович на боксова гала "
				+ "вечер в немския град Рощок на 5 април, което донесе 20-та поредна победа за "
				+ "българина в професионалния бокс. Зашеметяващо представяне на Кобрата и на този "
				+ "етап остава непобедим на професионалния ринг в тежка категория.";

		words[4] = "Банатски българи са български преселници, живеещи в историческата област Банат."
				+ " Докато тази област е в рамките на Австро-Унгария тези българи са известни с названието"
				+ " \"южноунгарски българи\". Самите те се наричат помежду си \"павликяни\" или на местното"
				+ " наречие, тъй като произлизат от българите павликяни. След Освобождението някои от тях се"
				+ " завръщат в родината и тук околното население започва да ги нарича \"банатчани\".";

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
