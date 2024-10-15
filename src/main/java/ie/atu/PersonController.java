package ie.atu;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
List<Person> personList = new ArrayList<>();

@GetMapping
public List<Person> getProducts()
{
    return personList;
}


    @PostMapping("/person/createPerson")
    public String createPerson(@RequestBody @Valid Person createPerson){
    personList.add(createPerson);
        return "details added";
    }

}
