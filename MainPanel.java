package typeTeacher;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*Creates a simple panel with a couple of buttons that that tell what text should be generated*/

public class MainPanel extends JFrame {

	JList languageList;
	JLabel keyboardImage;
	JButton startButton;
	JComboBox selectionBox;
	JLabel helperText;
	Icon icon;
	JTextArea helper;
	JTextArea welcomeMessage;
	
	static String languages[] = { "Кирилица", "Latin", "Фонетична кирилица" };

	static final String helpingText[]={"1 ниво","2 ниво","3 ниво","4 ниво","5 ниво","6 ниво","7 ниво" };
	static final String WELCOMEMESSAGE = "Добре дошли! Първото, което трябва да направите във всяко ниво,"+
	+"е да изградите рефлекса на пръстите си! Не бързайте! Преди да измервате времето си направете упражнението без грешка!";

	static final String levelNamesCyrillic[] = { "1 ниво - ь,я,а,о",
			"2 ниво - т,н,в,м", "3 ниво - ж,г,ч", "4 ниво - главни букви",
			"5 ниво - ',',у,e,и,ш", "6 ниво щ,к,с,д,з,ц", "7 ниво - х,п,р,л,б",
			"8 ниво - ю,й,ъ,э,ф, цял текст", };

	static final String levelNamesLatin[] = { "1 level - a,s,d,f",
			"2 level - j,k,l,;", "3 level - g,h ; ,' \" ",
			"4 level - the shift keys", "5 level - q, w, e, r, t", "6 level - y,u,i,o,p" };

	public MainPanel() {

		super("Main Panel");

		keyboardImage = new JLabel();

		keyboardImage.setIcon(new Image("Keyboard_Cyrilic.png").icon);
		welcomeMessage= new JTextArea();
		selectionBox = new JComboBox(levelNamesCyrillic);
		selectionBox.setPreferredSize(new Dimension(340, 30));
		startButton = new JButton();
		helperText = new JLabel("Добре дошли!");
		icon = new ImageIcon(getClass().getResource("School.png"));
		startButton.setIcon(icon);
		languageList = new JList(languages);
		languageList.setSelectedIndex(0);
		helper= new JTextArea();
		helper.setText("Тук ще има допълнителни инструкцииза всяко ниво.");
        helper.setAlignmentY(LEFT_ALIGNMENT);
        helper.setEditable(false);
        
		setLayout(new FlowLayout());

		setSize(1000, 750);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(keyboardImage);
		this.initWelcomeMessage();
		add(welcomeMessage);
		add(new JScrollPane(languageList));
		add(selectionBox);
				
		add(helper);
		add(startButton);
		setVisible(true);
		
		this.initStartButton();
		this.initSelectionBox();
		this.initLanguageList();
	

	}

	public void initStartButton() {

		startButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				if (languageList.getSelectedIndex() == 0)       // if Cyrillic was selected

					switch (selectionBox.getSelectedIndex()) {
					case 0: {
						dysplayProperLanguageMessage();
						new Typer().generateTyper(StringGenerator.Cyrillic1());
						break;
					}
					case 1: {

						dysplayProperLanguageMessage();
						new Typer().generateTyper(StringGenerator.Cyrillic2());
						break;

					}
					case 2: {
						dysplayProperLanguageMessage();
						new Typer().generateTyper(StringGenerator.Cyrillic3());
						break;
					}
					case 3: {
						dysplayProperLanguageMessage();

						new Typer().generateTyper(StringGenerator.Cyrillic4());
						break;
					}
					case 4: {
						dysplayProperLanguageMessage();

						new Typer().generateTyper(StringGenerator.Cyrillic5());
						break;
					}
					case 5: {
						dysplayProperLanguageMessage();

						new Typer().generateTyper(StringGenerator.Cyrillic6());
						break;
					}
					case 6: {
						dysplayProperLanguageMessage();
						new Typer().generateTyper(StringGenerator.Cyrillic7());
						break;
					}
					case 7: {
						dysplayProperLanguageMessage();

						new Typer().generateTyper(StringGenerator.Cyrillic8());
						break;
					}
					
					default: {
						dysplayProperLanguageMessage();

						new Typer().generateTyper(StringGenerator.Cyrillic1());
						break;
					}

					}
				else if (languageList.getSelectedIndex() == 1) // if Latin is
					                                           // selected
					switch (selectionBox.getSelectedIndex()) {

					case 0: {
						new Typer().generateTyper(StringGenerator.Latin1());
						break;
					}

					case 1: {
						new Typer().generateTyper(StringGenerator.Latin2());
						break;
					}

					case 2: {
						new Typer().generateTyper(StringGenerator.Latin3());
						break;

					}
					case 3: {
						new Typer().generateTyper(StringGenerator.Latin4());
						break;
					}
					case 4: {
						new Typer().generateTyper(StringGenerator.Latin5());
						break;
					}
					case 5: {
						new Typer().generateTyper(StringGenerator.Latin6());
						break;
					}
					}

			}
		});

	}

	static void dysplayProperLanguageMessage() {

		JOptionPane.showMessageDialog(null,
				"Моля, сменете езика на клавиатурата си на български.");

	}

	public void initSelectionBox() {

		this.selectionBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent event) {

				if (event.getStateChange() == ItemEvent.SELECTED)
					helperText.setText(helpingText[selectionBox.getSelectedIndex()]);
			}

		});

	}

	public void initLanguageList() {

		languageList.setVisibleRowCount(3);
		languageList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		languageList.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent event) {

				if (!event.getValueIsAdjusting()) { // thank you stackOverflow
					switch (languageList.getSelectedIndex()) {
					case 0: { // cyrillic

						keyboardImage
								.setIcon(new Image("Keyboard_Cyrilic.png").icon);

						DefaultComboBoxModel model = new DefaultComboBoxModel(
								levelNamesCyrillic);
						selectionBox.setModel(model);

						break;

					}
					case 1: { // latin

						keyboardImage
								.setIcon(new Image("Keyboard_Latin.png").icon);
						DefaultComboBoxModel model = new DefaultComboBoxModel(
								levelNamesLatin);
						selectionBox.setModel(model);

						break;

					}
					default: {
						System.out.println(languages[3]);
						break;

					}

					}

				}
			}
		});

	}
	
	public void initWelcomeMessage() {
		
		Font font = new Font("Verdana", Font.ITALIC, 14);
		
		welcomeMessage.setText(WELCOMEMESSAGE);
		welcomeMessage.setFont(font);	
		welcomeMessage.setLineWrap(true);
		welcomeMessage.setWrapStyleWord(true);
		welcomeMessage.setEditable(false);
		welcomeMessage.setSize(344,233);
		
		
	}
	
	

}
