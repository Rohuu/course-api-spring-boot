package org.rohuu.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") // parenthesis is for variable part
    public Topic getTopic(@PathVariable String id){ // @PathVariable tells spring that map above variable in @RequestMapping with the arguments passed which is "id"
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(id,topic);
    }
}
