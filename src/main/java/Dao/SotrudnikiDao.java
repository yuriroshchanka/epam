package Dao;

import java.util.List;
import model.Sotrudniki;

public interface SotrudnikiDao {
    public void addSotrudnik(Sotrudniki sotrudnik);
    public Sotrudniki getSotrudnik(Integer id);
    public List<Sotrudniki> listSotrudniki();
    public void deleteSotrudnik (Integer id);
}
