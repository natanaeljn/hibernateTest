package projetoHibernateTest;

import java.util.List;

import org.junit.Test;

import DAO.DAOGeneric;
import model.TelefoneUser;
import model.usuarioPessoa;

public class testHibernate {
  /*
	@Test
	public void testeHibernate() {
		DAOGeneric<usuarioPessoa> daoGeneric = new DAOGeneric<usuarioPessoa>();
		usuarioPessoa pessoa = new usuarioPessoa();
		pessoa.setCpf("10404908918");
		pessoa.setEmail("natanaeljn@outlook.com.br");
		pessoa.setIdade(18);
		pessoa.setLogin("natanaelJN");
		pessoa.setNome("Natanael");
		daoGeneric.salvar(pessoa);
	}
	@Test
	public void testeBuscar() {
		DAOGeneric<usuarioPessoa>daoGeneric = new DAOGeneric<usuarioPessoa>();
		usuarioPessoa pessoa = new usuarioPessoa();
		pessoa.setId(2L);
		pessoa = daoGeneric.consultar(pessoa);
		System.out.println(pessoa);
	}
	@Test
	public void testeBuscarPorId() {
		DAOGeneric<usuarioPessoa>daoGeneric = new DAOGeneric<usuarioPessoa>();
		
		usuarioPessoa pessoa = daoGeneric.consultarPorId(2L, usuarioPessoa.class);
		System.out.println(pessoa);
	}
	@Test
	public void testeUpdate() {
		DAOGeneric<usuarioPessoa>daoGeneric = new DAOGeneric<usuarioPessoa>();
	    usuarioPessoa pessoa = daoGeneric.consultarPorId(2L, usuarioPessoa.class);
	    pessoa.setIdade(28);
	    pessoa.setCpf("2423424234");
	    pessoa = daoGeneric.updateMerge(pessoa);
	    
	    
	    
		System.out.println(pessoa);
	}
	
	@Test
	public void testeDeletar() {
		DAOGeneric<usuarioPessoa>daoGeneric = new DAOGeneric<usuarioPessoa>();
	    usuarioPessoa pessoa = daoGeneric.consultarPorId(5L, usuarioPessoa.class);
		daoGeneric.deletarPorId(pessoa);
		
		
	}
	*/
	@Test
	public void testeLista() {
		DAOGeneric<usuarioPessoa>daoGeneric = new DAOGeneric<usuarioPessoa>();
		List<usuarioPessoa> list = daoGeneric.listaTodos(usuarioPessoa.class);
		
		for (usuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("--------");
		}
	}
	@Test
	public void testeUpdate() {
		DAOGeneric<usuarioPessoa>daoGeneric = new DAOGeneric<usuarioPessoa>();
	    usuarioPessoa pessoa = daoGeneric.consultarPorId(3L, usuarioPessoa.class);
	    pessoa.setIdade(28);
	    pessoa.setCpf("2423424234");
	    pessoa = daoGeneric.updateMerge(pessoa);
	    
	    
	    
		System.out.println(pessoa);
	}
	@Test
	public void testeGravaFone() {
		DAOGeneric daoGeneric = new DAOGeneric();
		usuarioPessoa pessoa =  (usuarioPessoa) daoGeneric.consultarPorId(4L, usuarioPessoa.class);
		TelefoneUser telefoneUser = new TelefoneUser();
		telefoneUser.setTipo("celular");
		telefoneUser.setNumero("47988234373");
		telefoneUser.setUsuarioPessoa(pessoa);
		
		daoGeneric.salvar(telefoneUser);
		
		
		
		
		
		
		
	}
	
}
