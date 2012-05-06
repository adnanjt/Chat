package br.com.fiap.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.fiap.chat.suporte.ChatException;
import br.com.fiap.chat.suporte.Conexao;

public class SimpleClient {
	public static void main(String[] args) throws InterruptedException {
		try {
			BufferedReader inLine = new BufferedReader(new InputStreamReader(System.in));
			
			Conexao conexao = new Conexao("192.168.23.103", "Marcio");
			conexao.open();
			while(conexao.isLogado()){
				conexao.sendMessage(inLine.readLine());
				//System.out.println(conexao.receive());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ChatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
