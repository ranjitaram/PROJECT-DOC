/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.model;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.main.pojo.TblGroupQueries;
import org.main.pojo.TblGroupQueriesAnswer;
import org.main.pojo.TblInquiryTelecalling;

/**
 *
 * @author ashish
 */
public class ConversationTableMode implements TableModel {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author ashish
     */
    private String columnsName[] = {"#", "Inquiry","Caller Name","Conversation"};
    private Class columnsClass[] = {String.class, String.class, String.class, String.class};
    private ArrayList<TblInquiryTelecalling> arraylist;

    public ConversationTableMode(ArrayList<TblInquiryTelecalling> arraylist) {
        this.arraylist = arraylist;
    }

    @Override
    public int getRowCount() {
        return arraylist.size();
    }

    @Override
    public int getColumnCount() {
        return columnsName.length;

    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnsName[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnsClass[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TblInquiryTelecalling get = arraylist.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return get.getTxtInquiryId();
            case 2:
                return get.getTxtCallerName();
            case 3:
                return get.getTxtConversation();
        }
        return get;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
