package BankProgram;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by flackeri on 10/23/15.
 */
public class BankModel extends AbstractListModel {

    private ArrayList<Account> accounts;

    public BankModel(ArrayList<Account> accts) {
        this.accounts = accts;
    }

    public Object getElementAt(int row) {

        return row;
    }

    public int getSize() {
        int size = 0

        return size;
    }

    public ArrayList<Account> getAccts() {
        return accounts;
    }

    public void setAccts(ArrayList<Account> accts) {
        this.accounts = accts;
    }
}
