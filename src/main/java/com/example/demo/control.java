package com.example.demo;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Controller
public class control {
    @GetMapping
    public String index(Model model){
            List list = new ArrayList();
            String link = "http://www.ynet.co.il/Integration/StoryRss2.xml";
            try {
                URL url = null;

                    url = new URL(link);

                SyndFeedInput input = new SyndFeedInput();
                SyndFeed feed = null;

                    feed = input.build(new XmlReader(url));

                list = feed.getEntries();
              //  System.out.println(list);
            model.addAttribute("Data", list);

        } catch (IOException | FeedException e) {
            e.printStackTrace();
        }

        return "index";
    }
}
