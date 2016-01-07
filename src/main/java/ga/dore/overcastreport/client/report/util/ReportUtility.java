package ga.dore.overcastreport.client.report.util;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import ga.dore.overcastreport.client.report.info.ReportInfo;


public class ReportUtility {

    private final WebClient client = new WebClient();

    public void report(String username, ReportInfo info) throws Exception {
        final HtmlPage login = client.getPage("http://oc.tc/login");
        final HtmlForm loginForm = login.getFirstByXPath("//form[@action='/users/sign_in']");
        final HtmlInput email = loginForm.getInputByName("user[email]");
        final HtmlInput password = loginForm.getInputByName("user[password]");
        final HtmlSubmitInput submitInput = loginForm.getInputByValue("Login");
        email.setValueAttribute("");
        password.setValueAttribute("");
        final HtmlPage homePage = submitInput.click();

    }

}
