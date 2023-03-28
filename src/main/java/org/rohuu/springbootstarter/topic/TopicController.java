package org.rohuu.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring","Spring Framework","Spring framework description"),
                new Topic("Java","Core Java","Core Java description"),
                new Topic("JavaScript","JavaScript","JavaScript description")
        );
        // now when we call /topic,Spring MVC calls this method and calls converts the returned list to the JSON format
    }
}
