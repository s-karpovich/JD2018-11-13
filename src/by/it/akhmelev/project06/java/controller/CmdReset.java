package by.it.akhmelev.project06.java.controller;

import by.it.akhmelev.project06.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

class CmdReset implements Cmd {
    @Override
    public Action execute(HttpServletRequest req)  throws SQLException {
        Dao.getDao().reset();

        return Action.INDEX;
    }
}
