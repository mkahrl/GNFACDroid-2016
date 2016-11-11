/**
 * @(#)WeatherActivity.java
 *
 *
 * @author 
 * @version 1.00 2013/6/12
 */
package gnfac.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WeatherActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.weather_title));
        setContentView(R.layout.web_view);
        WebView wv = (WebView)findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://www.mtavalanche.com/weather?theme=mobile_simple");
        wv.setWebViewClient(new AviWebViewClient(this));
    }


}