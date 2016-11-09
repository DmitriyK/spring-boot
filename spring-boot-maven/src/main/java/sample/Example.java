package sample;

//@Controller
public class Example {

    //@RequestMapping("/")
    String home() {
        return "welcome";
    }

    /*@GetMapping("/get")
    String home2() {
        return "welcome";
    }*/
}