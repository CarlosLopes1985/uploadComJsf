package manager;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.model.UploadedFile;

import entity.Filme;
import persistence.FilmeDao;

@ManagedBean(name="mb")
@ViewScoped
public class ManagerBean  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	  private Filme          filme;
	  private UploadedFile arquivo;
	  private List<Filme>   filmes;
	  
	  @PostConstruct
	    public void init(){
	    	 filme = new Filme();
	  }
	  
	  public  void gravar(){
		     FacesContext fc = FacesContext.getCurrentInstance();
		     try{
		            byte  arq[]= arquivo.getContents();
		            ServletContext context = (ServletContext) 
		            		    fc.getExternalContext().getContext();
		            String path= context.getRealPath("/imagem");
		            System.out.println("Caminho real  (Onde):" + path);
		            //ele grava como arquivo txt
		            
		            filme.setImagem(filme.getNomeFilme()+".jpg");
		            
		            FileOutputStream fos = 
		new FileOutputStream(path + "/" + filme.getImagem());
		            
		             fos.write(arq); //escreve byte a byte
		             fos.close();
		             new FilmeDao().create(filme);
		             filme = new Filme();
		      fc.addMessage(null, new FacesMessage("Dados Gravados ..."));
		     }catch(Exception ex){
		    fc.addMessage(null, new FacesMessage("Error:" + ex.getMessage()));		    	 
		     }
	  }
	 
  
	  
	  
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public UploadedFile getArquivo() {
		return arquivo;
	}
	public void setArquivo(UploadedFile arquivo) {
		this.arquivo = arquivo;
	}
	
	public List<Filme> getFilmes() {
		filmes = new FilmeDao().findAll();
		return filmes;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	

	
}
