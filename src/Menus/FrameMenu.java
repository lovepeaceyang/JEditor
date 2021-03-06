package Menus;

import javax.swing.JMenuBar;


public class FrameMenu extends JMenuBar{

	private static final long serialVersionUID = -7835759820105202925L;
	
	public FrameMenu(){
		System.out.println("Setting up the frame menu...");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				init();
				addToMenu();
			}
		}).start();

	}
	
	public void init(){
	}
	
	public void addToMenu(){
		add(new FileMenu("File", 'F'));
		add(new EditMenu("Edit", 'E'));
		add(new FormatMenu("Format", 'O'));
		add(new ToolMenu("Tools", 'T'));
		add(new SourceMenu("Source", 'S'));
		add(new HelpMenu("Help", 'H'));

	}

}
