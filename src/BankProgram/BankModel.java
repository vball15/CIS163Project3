package BankProgram;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by flackeri on 10/23/15.
 */
public class BankModel extends AbstractTableModel {

    /** array list to hold account objects */
    private ArrayList<Account> accounts;

    /** array of strings for table column names */
    private String[] colNames;

    public BankModel() {
        accounts = new ArrayList<Account>();
        colNames = new String[] {"Number", "Date Opened", "Account Owner", "Current Balance"};
    }

    public Object getValueAt(int rowNum, int colNum) {
        Account a = accounts.get(rowNum);

        switch (colNum) {
            case 0:
                return a.getNumber();
            case 1:
                return a.getDateOpened();
            case 2:
                return a.getOwner();
            case 3:
                return a.getBalance();
            default:
                return null;
        }
    }

    public int getRowCount() {
        return accounts.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int num) {
        return colNames[num];
    }

    public ArrayList<Account> getAccts() {
        return accounts;
    }

    public void setAccts(ArrayList<Account> accts) {
        this.accounts = accts;
    }
}
