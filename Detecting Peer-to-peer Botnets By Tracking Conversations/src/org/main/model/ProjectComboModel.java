/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.model;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;
import org.main.pojo.TblGroupAccount;
import org.main.pojo.TblProject;

/**
 *
 * @author ashish
 */
public class ProjectComboModel  implements ComboBoxModel{
    String retrunString=" ";
    ArrayList<TblProject> list;

    public ProjectComboModel(ArrayList<TblProject> list) {
        this.list = list;
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
         retrunString=(String) anItem;
    }

    @Override
    public String getSelectedItem() {
       return retrunString;
    }

    @Override
    public int getSize() {
      return list.size();
    }

    @Override
    public String getElementAt(int index) {
        return list.get(index).getTxtProjectName();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

    
    
}
