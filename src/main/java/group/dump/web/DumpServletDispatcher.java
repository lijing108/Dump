package group.dump.web;

import group.dump.web.method.model.HandlerMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DumpServletDispatcher extends HttpServlet {

    @Override
    public final void init() {
        HandleMapping.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        HandlerMethod handleMethod = HandleMapping.getHandler(uri);
        HandleMethodAdapter handleMethodAdapter = new HandleMethodAdapter();
        handleMethodAdapter.handle(req, resp, handleMethod);
    }
}
