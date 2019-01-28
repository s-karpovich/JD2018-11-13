package by.it.kovalyova.jd03_03;

import by.it.kovalyova.jd03_03.beans.Ad;
import by.it.kovalyova.jd03_03.beans.Role;
import by.it.kovalyova.jd03_03.beans.User;
import by.it.kovalyova.jd03_03.dao.Dao;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException {
        Dao dao=Dao.getDao();

        User user=new User();
        user.setLogin("LLLLLL");
        user.setPassword("PPPPPP");
        user.setEmail("EEEEEE");
        user.setRoles_Id(2);
        if (dao.user.create(user))
            System.out.println("CREATE: "+user);
        user.setLogin("LLLL2222222");
        if (dao.user.update(user))
            System.out.println("UPDATE: "+user);
        user=dao.user.read(user.getId());
        System.out.println("READ: "+user);
        if (dao.user.delete(user))
            System.out.println("DELETE"+user);

        ///role


        Role role=new Role();
        role.setRole("RRRRR");
        if (dao.role.create(role))
            System.out.println("CREATE: "+role);
        role.setRole("RRRRR222222");
        if (dao.role.update(role))
            System.out.println("UPDATE: "+role);
        role=dao.role.read(role.getId());
        System.out.println("READ: "+role);
        if (dao.role.delete(role))
            System.out.println("DELETE: "+role);

        ///ad

        Ad ad=new Ad(1,"$120000",5,5);
        if (dao.ad.create(ad))
            System.out.println("CREATE: "+ad);
        ad.setPrice("$222222");
        if (dao.ad.update(ad))
            System.out.println("UPDATE: "+ad);
        ad=dao.ad.read(ad.getId());
        System.out.println("READ: "+ad);
        if (dao.ad.delete(ad))
            System.out.println("DELETE"+ad);
    }

}
