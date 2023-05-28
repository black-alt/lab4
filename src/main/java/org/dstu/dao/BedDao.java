package org.dstu.dao;

import org.dstu.domain.Bed;
import org.dstu.domain.Sofa;

public class BedDao extends BaseDaoImpl <Bed, Integer> {
    public BedDao() {
        super(Bed.class);
    }
}
