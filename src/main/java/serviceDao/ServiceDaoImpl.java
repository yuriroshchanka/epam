package serviceDao;

import Dao.OtdelyDao;
import Dao.SotrudnikiDao;
import java.util.List;
import model.Otdely;
import model.Sotrudniki;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ServiceDaoImpl implements ServiceDao{
    @Autowired
    private SotrudnikiDao sotrudnikiDao;
    private OtdelyDao otdelyDao;
    
    @Transactional
    public void addSotrudnik(Sotrudniki sotrudnik) {
        sotrudnikiDao.addSotrudnik(sotrudnik);
    }

    @Transactional
    public void deleteSotrudnik(Integer id) {
        sotrudnikiDao.deleteSotrudnik(id);
    }

    @Transactional
    public Sotrudniki getSotrudnik(Integer id) {
        return sotrudnikiDao.getSotrudnik(id);
    }

    @Transactional
    public List<Sotrudniki> getSotrudnik() {
        return sotrudnikiDao.listSotrudniki();
    }

    @Transactional
    public void addOtdel(Otdely otdel) {
        otdelyDao.addOtdel(otdel);
    }

    @Transactional
    public void deleteOtdel(Integer id) {
        otdelyDao.deleteOtdel(id);
    }

    @Transactional
    public Otdely getOtdel(Integer id) {
        return otdelyDao.getOtdel(id);
    }

    @Transactional
    public List<Otdely> getOtdely() {
        return otdelyDao.getOtdely();
    }
    
}
