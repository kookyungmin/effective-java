package net.happykoo.effective.part2.item8;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemTest {
    @Test
    public void test() throws InterruptedException {
        try(Resource resource = new Resource()) {
            //resource 기능 처리
        } catch (Exception e) {
           throw new RuntimeException(e);
        }

        Thread.sleep(1000);
    }

    @Test
    public void test2() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
        } catch (Exception e) {
            //예외 발생 처리
        } finally {
            //후 처리
        }

    }
}
