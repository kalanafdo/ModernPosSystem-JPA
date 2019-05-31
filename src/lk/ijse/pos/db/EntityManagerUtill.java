package lk.ijse.pos.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class EntityManagerUtill {
    public static EntityManager getEntityManager(){
        Properties properties = new Properties();
        try {File file = new File("resources/application.properties");

            FileReader fileReader = new FileReader(file);
            properties.load(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1",properties);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        return entityManager;
    }

}
