import org.junit.Test;
import play.mvc.Result;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.*;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void badRoute() {
        running(fakeApplication(), new Runnable() {
            @Override
            public void run() {
                Result result = route(fakeRequest("GET", "/xx/Kiki"));
                assertThat(result).isNull();
            }
        });
    }

}
