package Dao;

import java.util.List;
import model.Otdely;

public interface OtdelyDao {
    public void addOtdel(Otdely otdel);
    public List<Otdely> getOtdely();
    public Otdely getOtdel(Integer id);
    public void deleteOtdel(Integer id);
}
