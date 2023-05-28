package org.dstu.dao;

import org.dstu.domain.Bed;
import org.dstu.domain.Sofa;
import org.hibernate.query.Query;

import java.util.List;

public class SofaDao extends BaseDaoImpl<Sofa, Integer> {
    public SofaDao() {
        super(Sofa.class);
    }

    public List<Sofa> getAllByColor(String color) {
        Query q = getSession().createQuery("FROM Sofa WHERE Sofa.color = \"" + color + "\"");
        return q.list();
    }
}
