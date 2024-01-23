package com.example.get;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class ControllerUsers {
    @GetMapping(path="/ciao/{provincia}")
    public Users ciao(

            @PathVariable String provincia,
            @RequestParam(required = true)String nome



    ){
        return new Users(nome,provincia,"ciao "+ nome + " com'è il tempo in provincia di " + provincia + " ? ");

    }

}
