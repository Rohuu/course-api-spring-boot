package org.rohuu.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
     private final List<Topic> topics=Arrays.asList(
             new Topic("spring","Spring Framework","Spring framework description"),
                new Topic("java","Core Java","Core Java description"),
                new Topic("javaScript","JavaScript","JavaScript description")
        );

     public List getAllTopics(){
         return topics;
     }

    public Topic getTopic(String id) {
         return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
