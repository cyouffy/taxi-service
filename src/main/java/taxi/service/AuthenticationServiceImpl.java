package taxi.service;

import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.lib.exception.AuthenticationException;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Driver driver = driverService.findByLogin(login)
                .orElseThrow(() -> new AuthenticationException("Username or password incorrect!"));
        if (driver != null & driver.getPassword().equals(password)) {
            return driver;
        }
        throw new AuthenticationException("Username or password incorrect!");
    }
}
