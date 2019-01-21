package WebTest;

import org.openqa.selenium.By;

public class DashboardPage extends Utils {
    By _timesheetLink = By.xpath("//div[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table[@class=\"quickLaungeContainer\"]/tbody/tr/td[3]");

    public void user_clicks_timesheet_link(){
        click_on_element(_timesheetLink);
    }
}
