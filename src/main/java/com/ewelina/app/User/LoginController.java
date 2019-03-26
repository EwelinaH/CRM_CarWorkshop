package com.ewelina.app.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(HttpSession session, Model model) {
        User user = new User();
        model.addAttribute("user", user);

        Object isLogged = session.getAttribute("login");
        if (isLogged != null) {
            return "redirect:/home";
        }

//        model.addAttribute("loginFailed", false);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userName, @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes ra) {
        User user = userRepository.findUsersByName(userName);
//        if (result.hasErrors()) {
//            return "redirect:/login";
//        }
        if (user == null) {
//            model.addAttribute("loginFailed", true);
            ra.addAttribute("loginFailed", true);
            return "redirect:/login";
        }
        boolean checkPass = BCrypt.checkpw(password, user.getPassword());

        if (!checkPass) {
//            model.addAttribute("loginFailed", true);
            ra.addAttribute("loginFailed", true);
            return "redirect:/login";
        } else {
            session.setAttribute("login", true);
            session.setAttribute("loggedInUser", user);
            return "redirect:/home";
        }
    }

    @GetMapping("/register")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register")
    public String addUser(@Valid @ModelAttribute User user, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "register";
        }
        userService.save(user);
        session.setAttribute("login", true);
        session.setAttribute("loggedInUser", user);
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

}
