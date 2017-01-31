/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.model;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.main.pojo.TblAlgorithm;

/**
 *
 * @author ashish
 */
public class ViewTableModel implements TableModel {

    private String columnsName[] = {"#", "category", "Algorithm Name", "PDF", "PPT", "DOC"};
    private Class columnsClass[] = {String.class, String.class, String.class, String.class, String.class, String.class};
    private ArrayList<TblAlgorithm> arraylist;

    public ViewTableModel(ArrayList<TblAlgorithm> arraylist) {
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
        TblAlgorithm get = arraylist.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return get.getTxtProjectCategory();
            case 2:
                return get.getTxtAlgorithmName();
            case 3:
                return get.getTxtPdf();
            case 4:
                return get.getTxtPpt();
            case 5:
                return get.getTxtPpt();
            case 6:
                return get.getTxtDoc();
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
