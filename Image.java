package typeTeacher;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image  {

	  Icon icon;
	
	 public Image(String resource){
		 
	
		 icon= new ImageIcon(getClass().getResource(resource));
		
		
	 }
	  
   
	
}
