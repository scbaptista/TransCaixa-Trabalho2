package main;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import mode.Crono;
import mode.TransCaixa;
import transcaixa.Trans_Caixa_Exs;

public class Main {

	
	 @SuppressWarnings("static-access")
	public static void main(String[] args) {
	        Trans_Caixa_Exs caixa = new Trans_Caixa_Exs();
		
	        String nomeFich = "src/file/transCaixa4M.txt";
	        List<TransCaixa> ltc = new ArrayList<>();
	        
	        // LE O FICHEIRO DE TRANSACÇOES PARA List<TransCaixa> sem Streams 
	        Crono.start();
	        ltc = caixa.setup1(nomeFich);
	        out.println("Setup com List<String>: " + Crono.stop()*1000 + " ms");
	        out.println("Transacções lidas Lists: " + ltc.size());
	        ltc.clear();
	       
	        // LE O FICHEIRO DE TRANSACÇOES PARA List<TransCaixa> com Streams
	        Crono.start();
	        ltc = caixa.setup(nomeFich);
	        out.println("Setup com Streams: " + Crono.stop()*1000 + " ms");
	        out.println("Transacções lidas (Streams): " + ltc.size());
	        caixa.memoryUsage();
	      
	        
	    }   

}
