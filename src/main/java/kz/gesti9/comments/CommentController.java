package kz.gesti9.comments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("comments")
public class CommentController {
    private final static List<Comment> comments = new ArrayList<>();

    @GetMapping
    public String showAll(Model model) {
        model.addAttribute("comments", comments);
        return "comments";
    }

    @GetMapping("new")
    public String addCommentPage(Model model) {
        model.addAttribute("comment", new Comment());
        return "addComment";
    }

    @PostMapping
    public String addComment(@ModelAttribute Comment comment, Model model){
        model.addAttribute("comments",comments);
        model.addAttribute("comment", new Comment());
        comments.add(comment);
        return "index";
    }
}
