package chattapp;
import java.util.Scanner;

public class Login {
 
private String username;
private String password;
private String phonenumber;

    Login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 

public boolean checkUserName(String username) {
    return username.contains("_")&& username.length() <= 5;
    
   }
public boolean checkPhoneNumber(String phoneNumber){
    return phoneNumber.startsWith("+27") && phoneNumber.length()== 12;
}

public String registerUser(String username, String password, String phoneNumber){

if (!checkUserName(username)){
    return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more that five characters long.";
}
if(!checkPhoneNumber (phoneNumber)){
    return "CellphoneNumber incorrectly formatted or does not contains international code.";
    
}
 this.username= username;
 this.password= password;
 this.phonenumber= phoneNumber;
    return"Username successfully captured.\nCell phone number successfully added.";
    
}
public boolean loginUser(String username,String password) {
return this.username.equals(username)&& this.password.equals(password);
}
public String returnLoginStaus (boolean status,String firstName, String lastName){
 if (status) {
  return "welcome" +firstName+"," + lastName +"it is great to see again";
 } else{
  return "Login failed. username or password incorrect." ;
 
 }
} 
 


}

 




