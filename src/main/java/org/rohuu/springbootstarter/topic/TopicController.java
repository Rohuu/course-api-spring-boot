package org.rohuu.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
