package org.main.util;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ReportTableModel implements TableModel {

    String[] columnName = {"#", "CATEGORY", "NUMBER", "AMOUNT"};
    Class[] className = {String.class, String.class, String.class, String.class};
    ArrayList<String> arrayList;

    public ReportTableModel(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getRowCount() {
        return arrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnName[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return className[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String string = arrayList.get(rowIndex);
        if (string.trim().length() != 0) {
            try {
                String[] slit = string.split("-");
                switch (columnIndex) {
                    case 0:
                        return rowIndex + 1;
                    case 1:
                        return slit[0];
                    case 2:
                        return slit[1];
                    case 3:
                        return slit[2];
                }
            } catch (Exception e) {
            }
        }
        return string;
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
