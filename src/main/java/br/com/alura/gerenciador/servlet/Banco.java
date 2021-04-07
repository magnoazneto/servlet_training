package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static int chaveSequencial = 1;
	
	static {
		Empresa empresa1 = new Empresa("Zup");
		empresa1.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa("Alura");
		empresa2.setId(chaveSequencial++);
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	public void add(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
			
		}
		
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for(Empresa empresa: lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}


}
