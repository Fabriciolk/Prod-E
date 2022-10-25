package com.emp.prode.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.emp.prode.controller.LoginController;
import com.emp.prode.utilities.JSONReader;
import org.json.JSONObject;

@WebServlet(value = "/Login")
public class LoginServlet extends HttpServlet
{
    private final LoginController loginController = new LoginController();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.setContentType("application/json");
//        JSONObject jsonObject = JSONReader.readJsonFromRequest(req);
//
//        String username = jsonObject.getString("username");
//        String password = jsonObject.getString("password");
//
//        PrintWriter out = resp.getWriter();
//        out.println(loginController.login(username, password));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        JSONObject jsonObject = JSONReader.readJsonFromRequest(req);

        PrintWriter out = resp.getWriter();
        out.println(loginController.login(jsonObject.getString("username"), jsonObject.getString("password")));
    }
}
