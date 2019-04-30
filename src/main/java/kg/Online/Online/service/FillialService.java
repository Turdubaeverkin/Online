package kg.Online.Online.service;

import kg.Online.Online.model.Department;
import kg.Online.Online.model.Fillial;

import java.math.BigDecimal;
import java.util.List;

public interface FillialService {
    Fillial addFillial(Fillial fillial);

    List<Fillial> getAllFillial();
    Fillial confirmFillial(Long fillialId);
    Fillial getFillialById(Long fillialId);
    void updateFillial(Long department);


}