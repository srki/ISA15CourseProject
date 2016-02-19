package rest.log;

import beans.dao.interfaces.LogLocal;
import model.dao.Log;
import model.dao.User;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.persistence.criteria.CriteriaBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author - Srđan Milaković
 */
@Path("/log")
public class LogRest {

    private static final int MAX_LOGS = 50;

    @EJB
    private LogLocal logBean;

    @GET
    @RolesAllowed(User.ADMINISTRATOR)
    public Object get() {
        List<Log> logs = logBean.findWithLimit(MAX_LOGS);
        List<LogResponse> response = new ArrayList<>();

        logs.forEach(log -> {
            Integer userId = log.getUserId() != null ? log.getUserId().getId() : 0;
            response.add(new LogResponse(log.getDate(), log.getMethod(), log.getUrl(), userId));
        });

        return response;
    }
}