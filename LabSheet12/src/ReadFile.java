import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static String hide_password(String pasword){
        String hide_password = "";
        for (int i=0; i < pasword.length();i++){
            if (i==0){
                hide_password += pasword.charAt(i);
            }
            else if (i == pasword.length()-1){
                hide_password += pasword.charAt(i);
            }
            else{
                hide_password += "*";
            }
        }
        return  hide_password;
    }

    public static void main(String[] args) throws IOException {

        File filename = new File("src/users.txt");
        Scanner scanner = new Scanner(filename);

        while (scanner.hasNext()){
//            String data = scanner.nextLine();
//            System.out.println(data);
            String[] data = scanner.nextLine().split(",");
            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthyear = Integer.parseInt(data[3]);

            System.out.println("Username = " + username);
            System.out.println("Password = " + hide_password(password));
            System.out.println("Gender = " + gender);
            System.out.println("Birth year = " + birthyear);
            System.out.println();
        }
        scanner.close();
    }


}
