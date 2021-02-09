package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsControllers {
    @GetMapping
    public String trackerGreeting() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                        "<ol>" +
                            "<li> JavaScript </li>" +
                            "<li> Java </li>" +
                            "<li> Python </li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("selection")
    public String selectFav(@RequestParam String name, @RequestParam String favLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return
                "<html>" +
                        "<body>" +
                        "<h1>"+ name + "</h1>" +
                        "<ol>" +
                        "<li>" + favLanguage + "</li>" +
                        "<li>" + secondLanguage + "</li>" +
                        "<li>" + thirdLanguage + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";

    }

    @GetMapping("form")
    public String rankLanguages() {
        return
                "<html>" +
                        "<body>" +
                        "<form action = '/selection' method = 'post' >" +
                        "<label>Name:</label><input type = 'text' name = 'name' />" +
                        "<label>My favorite Language:</label><select name = 'favLanguage'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<label><br>My Second favorite Language:</label><select name = 'secondLanguage'><br>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<label><br>My Third favorite Language:</label><select name = 'thirdLanguage'><br>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<button>submit</button>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
    }
}
