package week1.day2;

import java.awt.Desktop;
import java.net.URI;

public class OpenGoogleInChrome {
    public static void main(String[] args) {
        try {
            // Create a URI object for Google's URL
            URI googleUri = new URI("https://www.facebook.com/");

            // Get the desktop instance
            Desktop desktop = Desktop.getDesktop();

            // Open the URL in the default web browser
            desktop.browse(googleUri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
