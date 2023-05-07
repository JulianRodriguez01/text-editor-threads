package presenter;

import java.io.IOException;

import javax.swing.Timer;

import models.Manager;
import views.Windows;

public class Presenter {

	private Manager manager;
	private Windows windows;
	private Timer timer;

	public Presenter() {
		manager = new Manager();
		windows = new Windows();
		initApp();
	}

	public void initApp() {
		try {
			goThreadWritte();
			goThreadUpdate();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void goThreadWritte() {
		timer = new Timer(3000, action -> {
			try {
				manager.writeFile(windows.getTextWritteUser());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		timer.start();
	}
	
	public void goThreadUpdate() throws InterruptedException {
		int second = 0;
		timer = new Timer(2000, action -> {
			int seconds = 0;
			try {
				windows.setTextNumberLines(manager.countLines(windows.getTextWritteUser()));
				windows.setTextNumberWords(manager.countWordsText(windows.getTextWritteUser()));
				windows.fillListTopWords(manager.createListTopWords(windows.getTextWritteUser()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		timer.start();
	} 

}