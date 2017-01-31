package org.main.contoller;

import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.main.view.LoginFrame;
import org.main.view.SplashScreen;

public class ApplicationManager {

    private static LoginFrame mainWindow;

    public ApplicationManager() throws Exception {
        mainWindow = new LoginFrame();
    }

    public void start() {
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Properties props = new Properties();
                    props.put("logoString", " ");
                    SplashScreen splashScreen = new SplashScreen(mainWindow, true);
                    splashScreen.setVisible(true);
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    ApplicationManager applicationManager = new ApplicationManager();
                    applicationManager.start();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("e = " + e);
                }
            }
        });
    }
    public void exitApplication() {
        System.exit(0);
    }
}
