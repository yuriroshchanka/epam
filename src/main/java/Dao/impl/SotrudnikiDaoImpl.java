package Dao.impl;

import Dao.SotrudnikiDao;
import java.util.List;
import model.Sotrudniki;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SotrudnikiDaoImpl implements SotrudnikiDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSotrudnik(Sotrudniki sotrudnik) {
        sessionFactory.getCurrentSession().save(sotrudnik);
    }

    @Override
    public Sotrudniki getSotrudnik(Integer id) {
        return (Sotrudniki) sessionFactory.getCurrentSession().load(Sotrudniki.class, id);
    }

    @Override
    public List<Sotrudniki> listSotrudniki() {
        return sessionFactory.getCurrentSession().createQuery("FROM Sotrudniki").list();
    }

    @Override
    public void deleteSotrudnik(Integer id) {
        Sotrudniki sotrudnik = (Sotrudniki) sessionFactory.getCurrentSession().load(Sotrudniki.class, id);
        if (null != sotrudnik) {
            sessionFactory.getCurrentSession().delete(sotrudnik);
        }

    }
    
}
