public class Password {
  
  public static void main (String args [])
  {
    new Password ();
  }
  
  public Password ()
  {
    actionPerformed (
    
    
    public void actionPerformed (ActionEvent e) {
      String cmd = e.getActionCommand();
      
      if (OK.equals(cmd)) { //Process the password.
        char[] input = passwordField.getPassword();
        if (isPasswordCorrect(input)) {
          JOptionPane.showMessageDialog(controllingFrame,
                                        "Success! You typed the right password.");
        } else {
          JOptionPane.showMessageDialog(controllingFrame,
                                        "Invalid password. Try again.",
                                        "Error Message",
                                        JOptionPane.ERROR_MESSAGE);
        }
        
        //Zero out the possible password, for security.
        Arrays.fill(input, '0');
        
        passwordField.selectAll();
        resetFocus();
      } else ...//handle the Help button...
    }
    
    private static boolean isPasswordCorrect(char[] input) {
      boolean isCorrect = true;
      char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
      
      if (input.length != correctPassword.length) {
        isCorrect = false;
      } else {
        isCorrect = Arrays.equals (input, correctPassword);
      }
      
      //Zero out the password.
      Arrays.fill(correctPassword,'0');
      
      return isCorrect;
    }
  }
}