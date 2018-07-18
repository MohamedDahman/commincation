package Colors.Color.view;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EndPoint {

    private List<String> currColors  = new ArrayList<>();

    public EndPoint() {
        currColors.clear();
        currColors.add("Black");
        currColors.add("green");

    }


    @PostMapping("/addColor")
    @CrossOrigin(origins = "*")
    public void sendDate(@RequestBody String value){
        currColors.add(value);
    }

    @GetMapping("/allColor")
    @CrossOrigin(origins = "*")
    List<String> getCurrColors(){
        return currColors;
    }


}
