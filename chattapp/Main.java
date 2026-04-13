

package chattapp;

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {


Scanner input = new Scanner(System.in);

// REGISTRATION

System.out.println("=== REGISTER ===");

System.out.print("khombi:");
String username = input.nextLine();

System.out.print("Nomawethu1!:");
String Password =input.nextLine();

System.out.print("+27823137115  (+21...):" );
String phone = input.nextLine();

Register reg = new Register (username, Password , phone);
String result = reg.registerUser();
System.out.println(result);

// if registration fails stop 
if (!result.equals("user successfully registerd")) {
  return;
}

// LOGIN
System.out.println("\n=== LOGIN ===");

System.out.print("Enter username:");
String loginUser = input.nextLine();

System.out.print("Enter password :");
String loginpass = input.nextLine();

Login login = new Login(reg.getUsername(), reg.getpassword());
boolean Status = login.loginUser(loginUser,loginpass);

System.out.println(login.returnLoginStaus(Status, username, username));


 }
 

}

 