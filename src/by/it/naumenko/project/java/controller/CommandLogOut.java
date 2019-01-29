package by.it.naumenko.project.java.controller;

import by.it.naumenko.project.java.beens.Users;
import by.it.naumenko.project.java.dao.MyDAO;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class CommandLogOut extends Command {
    @Override
    public Actions exequit(HttpServletRequest request) throws SiteException, SQLException {
        if (Form.isPost(request)) {
            String login = Form.getString(request, "login");
            String password = Form.getString(request, "password");
            String where = String.format(" WHERE password = '%s' and login='%s' LIMIT 0,1", "vasya", "vasya");
            MyDAO<Users> myDAO = new MyDAO<>(new Users(), "users");
            //List<Users> users = Dao.getDao().user.getAll(where);
            List<Users> users = myDAO.getAll(where);
            if (users.size() == 1) {
                Users user = users.get(0);
                request.getSession().setAttribute("user", user);
                return Actions.PROFILE;
            }
        }

        return Actions.LOGOUT;
    }
}
