/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.model;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.main.pojo.TblGroupAccount;

/**
 *
 * @author ashish
 */
public class GroupComboModel extends AbstractListModel implements ComboBoxModel {
    String GroupId;
    ArrayList<TblGroupAccount> list;

    public GroupComboModel(ArrayList<TblGroupAccount> list) {
        this.list = list;
    }

    @Override
    public void setSelectedItem(Object anItem) {
    }

    @Override
    public String getSelectedItem() {
        return GroupId;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public String getElementAt(int index) {
        return list.get(index).getTxtGroupId();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

}
