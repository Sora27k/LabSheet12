package Banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount{
    public  AccountTransaction(String accID){
        super(accID);
    }


    public boolean hasAccountId() throws FileNotFoundException {
        File file = new File(getFilename());
        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            String ID = data[0];
            if (ID == getAccId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void despoit(){

    }




}
