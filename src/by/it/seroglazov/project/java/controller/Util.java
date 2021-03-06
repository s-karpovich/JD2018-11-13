package by.it.seroglazov.project.java.controller;

import by.it.seroglazov.project.java.beans.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

class Util {

    static boolean checkUserInSession(HttpServletRequest req) {
        return findUserInSession(req)!=null;
    }

    static User findUserInSession(HttpServletRequest req) {
        HttpSession session = req.getSession(false);
        if (session != null) {
            Object oUser = session.getAttribute("user");
            if (oUser != null) {
                return (User) oUser;
            }
        }
        return null;
    }
}
