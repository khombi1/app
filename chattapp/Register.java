
package chattapp;


public class Register {
    
 private String username;
 private String password;
 private String phonenumber;
 
 public Register (String username ,String password,String phonenumber){
 
  
this .username =username;
this .password =password;
this.phonenumber =phonenumber;

// username vaildation
     if (username.contains("_")) {
         username.length();
     }
}
// password vaildation
public boolean checkpassword(){
 boolean length = password.length() >=8;
 boolean capital=password.matches(".*[A-Z].*");
 boolean number =password.matches(".*[0-9].*");
 boolean special=password.matches(".*[!@#$%^&*()].*");
 
 return length&& capital && number && special;
}

// south african phone number validation 
public boolean checkPhoneNumber() {
  return phonenumber.matches("^\\+27[0-9]{9}$");
}
public String registerUser(){
 if (!CheckUsername()) {
  return "username is not correctly formatted ,please  ensure it contains an underscore and is no mote than 5 character";
 }
 
 if (!checkpassword()){
  return "password is not correctly formatted ,please ensure it has at least 8 characters,a cptial letter,a number and a special character";
 }
if (!checkPhoneNumber()){
    return "cell phone number incorrectly formatted or does not contain international code";
}   
 return "User succesfully registerd.";
}
// Getters (used in login)
public String getUsername(){
   return username;
}

public String getpassword(){
    return password;
}

    private boolean CheckUsername() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
 
 


 



    

