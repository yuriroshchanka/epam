package Dao.impl;

import Dao.OtdelyDao;
import java.util.List;
import model.Otdely;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OtdelyDaoImpl implements OtdelyDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addOtdel(Otdely otdel) {
        sessionFactory.getCurrentSession().save(otdel);
    }

    @Override
    public List<Otdely> getOtdely() {
        return sessionFactory.getCurrentSession().createQuery("FROM Otdely").list(); 
    }

    @Override
    public Otdely getOtdel(Integer id) {
        return (Otdely) sessionFactory.getCurrentSession().load(Otdely.class, id); 
    }

    @Override
    public void deleteOtdel(Integer id) {
        Otdely otdel = (Otdely) sessionFactory.getCurrentSession().load(Otdely.class, id);
        if (null != otdel) {
            sessionFactory.getCurrentSession().delete(otdel);
        } 
    }
    
}
