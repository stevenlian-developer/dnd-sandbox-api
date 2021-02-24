package com.sample;

import com.sample.model.Race;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectraceservlet",
        urlPatterns = "/SelectRace"
)
public class SelectRaceServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String race = req.getParameter("Race");

        RaceService raceService = new RaceService();
        Race r = Race.valueOf(race);

        List subraces = raceService.getAvailableSubraces(r);
        req.setAttribute("subraces", subraces);
        String location = "result.jsp";
        RequestDispatcher view = req.getRequestDispatcher(location);
        view.forward(req, resp);
    }
}
