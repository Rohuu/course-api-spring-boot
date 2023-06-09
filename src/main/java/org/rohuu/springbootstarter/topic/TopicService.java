package org.rohuu.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
     private final List<Topic> topics=new ArrayList<>(Arrays.asList(
             new Topic("spring","Spring Framework","Spring framework description"),
                new Topic("java","Core Java","Core Java description"),
                new Topic("javaScript","JavaScript","JavaScript description")
        ));

     public List getAllTopics(){
         return topics;
     }

    public Topic getTopic(String id) {
         return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
                Topic topicToUpdate=topics.get(i);
                if(topicToUpdate.getId().equals(id)){
                    topics.set(i,topic);
                    return;
                }
        }
    }

    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic topicToBeDeleted=topics.get(i);
            if(topicToBeDeleted.getId().equals(id)){
                topics.remove(i);
            }
        }
    }
}
