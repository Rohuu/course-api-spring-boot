package org.rohuu.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
     private final List<Topic> topics=Arrays.asList(
             new Topic("Spring","Spring Framework","Spring framework description"),
                new Topic("Java","Core Java","Core Java description"),
                new Topic("JavaScript","JavaScript","JavaScript description")
        );

     public List getAllTopics(){
         return topics;
     }
}
