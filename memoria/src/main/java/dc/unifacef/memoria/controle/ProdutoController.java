package dc.unifacef.memoria.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controlador de requisição REST new*
@RequestMapping("/produto") // Mapeamento da requisição
public class ProdutoController {

    @GetMapping
    public String mensagem(){
        return "Boa noite a todos";
    }
}
