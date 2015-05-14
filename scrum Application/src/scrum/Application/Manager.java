/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrum.Application;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	
	Main main = new Main();
public void 	createStory(){
		
	AigleScrumBoard aigleScrumBoard=new AigleScrumBoard();
	 String id=aigleScrumBoard.getId();
	 String description=aigleScrumBoard.getDescription();
	 
	 Map<String, String> storyList = new HashMap<String, String>();
	 storyList.put(id,description);
	 System.out.print( storyList);

	
	}
}

