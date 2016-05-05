package rdecuir.twitter.scraper;

import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;

/**
 * @author rdecuir
 */
public class UserScraper {
    
    public static String getUserTweets(String username) throws IOException {
        
        Twitter twitter = new TwitterFactory().getInstance(new Authorization());

        AccessToken accessToken = new AccessToken("Your-Access-Token", "Your-Access-Token-Secret");
        twitter.setOAuthConsumer("Consumer-Key", "Consumer-Key-Secret");
        twitter.setOAuthAccessToken(accessToken);
    
        int count = 2;
        HttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet("https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=" + username + "&count=" + count);
        System.out.println(client.execute(get));

        return null;
    }  
}
