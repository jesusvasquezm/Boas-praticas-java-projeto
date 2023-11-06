package br.com.estudos;

import br.com.estudos.client.ClientHttpConfiguration;
import br.com.estudos.service.AbrigoService;

import java.io.IOException;

public class CadastrarNovoAbrigoCommand implements Command{
    @Override
    public void execute() {
        try{
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarNovoAbrigo();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
