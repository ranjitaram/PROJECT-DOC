package org.main.contoller;

import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class TableSetting {

    public static void setTable(JTable table) {
        TableColumnModel model = table.getColumnModel();
        int columnCount = model.getColumnCount();
        for (int index = 0; index < columnCount; index++) {
            TableColumn column = model.getColumn(index);
            column.sizeWidthToFit();
            String columnHeader = getCloumnHeader(index, table);
            if (columnHeader.equals("#")) {
                column.setMaxWidth(20);
                column.setPreferredWidth(20);
                
            }
            if (columnHeader.equals("L.A.C")) {
                column.setMaxWidth(50);
                column.setPreferredWidth(50);
            }
            if (columnHeader.equals("E.PIC")) {
                column.setMaxWidth(110);
                column.setPreferredWidth(110);
            }
            if (columnHeader.equals("FIRST NAME")) {
                column.setMaxWidth(180);
                column.setPreferredWidth(180);
            }
            if (columnHeader.equals("LAST NAME")) {
                column.setMaxWidth(180);
                column.setPreferredWidth(180);
            }
            if (columnHeader.equals("AGE")) {
                column.setMaxWidth(60);
                column.setPreferredWidth(60);
            }
            if (columnHeader.equals("SEX")) {
                column.setMaxWidth(60);
                column.setPreferredWidth(60);
            }
            if (columnHeader.equals("MOBILE")) {
                column.setMaxWidth(130);
                column.setPreferredWidth(130);
            }
            if (columnHeader.equals("EMAIL")) {
                column.setMaxWidth(150);
                column.setPreferredWidth(150);
            }
        }
    }

    private static String getCloumnHeader(int index, JTable table) {
        return table.getColumnName(index);
    }
}
