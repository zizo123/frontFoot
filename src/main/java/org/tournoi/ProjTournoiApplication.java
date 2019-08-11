package org.tournoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.tournoi.dao.GameRepository;
import org.tournoi.entities.Game;


@SpringBootApplication
public class ProjTournoiApplication {

	public static void main(String[] args) {
		ApplicationContext c=SpringApplication.run(ProjTournoiApplication.class, args);
//		GameRepository gr=c.getBean(GameRepository.class);
//		Game g=gr.findOne(1L);
//		gr.delete(g);
	}
}
