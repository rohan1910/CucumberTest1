package WebTest;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    private By _usernameLink = By.id("txtUsername");
    private By _passwordLink = By.id("txtPassword");
    private By _loginButton = By.id("btnLogin");

    public void user_fills_out_login_details(){
        enter_text(_usernameLink,"Admin");
        enter_text(_passwordLink,"admin123");
        click_on_element(_loginButton);

    }

}
