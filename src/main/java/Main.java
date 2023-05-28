import org.dstu.dao.RoomDao;
import org.dstu.dao.BedDao;
import org.dstu.dao.SofaDao;
import org.dstu.domain.Room;
import org.dstu.domain.Bed;
import org.dstu.domain.Sofa;
import org.dstu.util.HibernateUtil;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.metamodel.EntityType;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Session session = HibernateUtil.getSession();
        BedDao bedDao = new BedDao();

        Bed bed = new Bed();
        bed.setColor("Красный");
        bed.setManufacturer("Wooden bed");
        bed.setPrice(30000);
        bed.setSize("180x160");
        bed.setHaveHeadboard(true);
        bed.setMattressType("Пружина");
        bedDao.save(bed);

        RoomDao roomDao = new RoomDao();

        Room ist = new Room();
        ist.setSquare(3000);
        int savedId = roomDao.save(ist);
        System.out.println(savedId);

        SofaDao sofaDao = new SofaDao();
        Sofa sofa = new Sofa();
        sofa.setColor("Зеленый");
        sofa.setManufacturer("Wooden sofa");
        sofa.setPrice(90000);
        sofa.setCountOfSeats(10);
        sofa.setHaveArmrests(true);
        sofa.setUpfoldingMechanizm("HH_TS1");
        sofaDao.save(sofa);

        Sofa sofa2 = new Sofa();
        sofa2.setColor("Красный");
        sofa2.setManufacturer("Test sofa");
        sofa2.setPrice(30000);
        sofa2.setCountOfSeats(15);
        sofa2.setHaveArmrests(true);
        sofa2.setUpfoldingMechanizm("HH_TS2");
        sofaDao.save(sofa2);


        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
    }
}