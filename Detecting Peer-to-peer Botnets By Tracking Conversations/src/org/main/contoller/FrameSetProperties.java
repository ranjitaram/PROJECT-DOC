/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.contoller;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import org.main.view.AddProjecrtModules;

/**
 *
 * @author ashish
 */
public class FrameSetProperties {

    public void SetDate(JLabel lable) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy" + "   :   " + "hh:mm:ss");
        String format = simpleDateFormat.format(new Date());
        lable.setText(format);
    }

    public String getFileChooserPAth(JFileChooser openFileChooser) {
        String path;
        openFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        openFileChooser.showOpenDialog(openFileChooser);
        path = openFileChooser.getSelectedFile().getPath();
        openFileChooser.setBounds(100, 200, JFileChooser.HEIGHT, JFileChooser.WIDTH);
        return path;
    }

    public void ResetAll(JPanel aThis) {
        Component[] components = aThis.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField || component instanceof JTextArea) {
            JTextComponent specificObject = (JTextComponent) component;
            specificObject.setText(" ");
        }
        }
    }
}
