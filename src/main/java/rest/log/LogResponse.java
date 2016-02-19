package rest.log;

import model.dao.Log;
import model.dao.User;

import javax.annotation.Generated;
import javax.annotation.security.RolesAllowed;
import javax.jnlp.UnavailableServiceException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;
import java.util.List;

/**
 * @author - Srđan Milaković
 */
@Path("/log")
@SuppressWarnings("unused")
public class LogResponse {
    private Date date;
    private String method;
    private String url;
    private Integer userId;

    public LogResponse() {
    }

    public LogResponse(Date date, String method, String url, Integer userId) {
        this.date = date;
        this.method = method;
        this.url = url;
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}