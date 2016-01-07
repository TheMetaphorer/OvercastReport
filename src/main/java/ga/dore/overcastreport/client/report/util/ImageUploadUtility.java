package ga.dore.overcastreport.client.report.util;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class ImageUploadUtility {
    private WebClient client = new WebClient();

    public void upload() throws Exception {
        final HtmlPage homePage = client.getPage("http://imgur.com");

    }

}
