package beans.dao.interfaces;

import java.util.List;
import javax.ejb.Local;

import model.oauth.UserInfo;
import model.dao.Oauth2Account;
import model.dao.SessionToken;

/**
 *
 * @author Srđan
 */
@Local
public interface Oauth2AccountLocal {

    void create(Oauth2Account oauth2Account);

    SessionToken createWithUserInfo(UserInfo userInfo, String provider);

    void edit(Oauth2Account oauth2Account);

    void remove(Oauth2Account oauth2Account);

    Oauth2Account find(Object id);

    Oauth2Account findByUserId(String userId);

    List<Oauth2Account> findAll();

    List<Oauth2Account> findRange(int[] range);

    int count();
    
}