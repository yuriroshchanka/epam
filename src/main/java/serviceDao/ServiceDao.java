package serviceDao;

import java.util.List;
import model.Otdely;
import model.Sotrudniki;

public interface ServiceDao {
    public void addSotrudnik(Sotrudniki sotrudnik);
    public void deleteSotrudnik(Integer id);
    public Sotrudniki getSotrudnik(Integer id);
    public List<Sotrudniki> getSotrudnik();
    public void addOtdel(Otdely otdel);
    public void deleteOtdel(Integer id);
    public Otdely getOtdel(Integer id);
    public List<Otdely> getOtdely();
}
