package Banking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount{

    public  OpenNewAccount(String accID,double accBalance){
        super(accID,accBalance);
    }
    public String recordAccount() throws IOException {

        Scanner scanner = new Scanner(System.in);
        FileWriter filename = new FileWriter("src/Banking/users_account.txt",true);
        PrintWriter writer = new PrintWriter(filename);

        if (!isExistingAccount(getAccId())){
            filename.close();
            return "Created account has been created!!!";
        }
        else{
            writer.println(getFilename() + "," + getAccBalance());
            filename.close();
            return "Created account success!!!";
        }


    }
    private boolean isExistingAccount(String account_name){

        Scanner scanner = new Scanner(System.in);
        File file = new File(getFilename());

        while (scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            String accountID = data[0];
            if (accountID == getAccId()){
                return true;
            }
        }
        return false;



    }
}
