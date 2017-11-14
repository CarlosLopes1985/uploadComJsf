package config;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {
	
	public static void main(String[] args) {
		 Configuration cfg = new AnnotationConfiguration().
				 configure("config/mysql_hibernate.cfg.xml");
		 
		 new SchemaExport(cfg).create(true,true);
		
		 System.out.println("Tabelas Geradas ...");
		 
		 
		/*
		 *     drop table if exists filme

    create table filme (
        idFilme integer not null auto_increment,
        autor varchar(50),
        caracteristica varchar(50),
        descricao varchar(255),
        imagem varchar(255),
        nomeFilme varchar(50),
        trailler varchar(255),
        primary key (idFilme)
    )
Tabelas Geradas ...

		 * 
		 */
	}

}
