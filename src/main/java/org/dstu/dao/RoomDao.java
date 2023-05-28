package org.dstu.dao;

import org.dstu.domain.Room;

public class RoomDao extends BaseDaoImpl<Room, Integer> {
    public RoomDao() {
        super(Room.class);
    }
}
