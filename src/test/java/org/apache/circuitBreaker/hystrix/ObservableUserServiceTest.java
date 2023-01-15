package org.apache.circuitBreaker.hystrix;

import org.apache.circuitBreaker.hystrix.Service.ObservableUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;

/**
 * Created by lisen on 2017/12/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HystrixApplication.class)
public class ObservableUserServiceTest {

    @Autowired
    private ObservableUserService observableUserService;

    @Test
    public void testObserve() {
        Iterator<String> iterator = observableUserService.getUserById(30L).toBlocking().getIterator();
        while(iterator.hasNext()) {
            System.out.println("===============" + iterator.next());
        }
    }

    @Test
    public void testToObservable() {
        Iterator<String> iterator = observableUserService.getUserByName("王五").toBlocking().getIterator();
        while(iterator.hasNext()) {
            System.out.println("===============" + iterator.next());
        }
    }
}

