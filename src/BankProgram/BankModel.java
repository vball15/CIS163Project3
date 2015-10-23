package BankProgram;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by flackeri on 10/23/15.
 */
public class BankModel extends AbstractListModel {

    private ArrayList<Account> accts;

    public BankModel(ArrayList<Account> accts) {
        this.accts = accts;
    }

    public Object getElementAt(int arg0) {

        return arg0;
    }

    public int getSize() {
        int size = 0;

        return size;
    }

    public ArrayList<Account> getAccts() {
        return accts;
    }

    public void setAccts(ArrayList<Account> accts) {
        this.accts = accts;
    }
}
