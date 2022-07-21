package com.deg.mist.apps.api.v1_0.apps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AppControllerTests {

    @Autowired
    private AppController appController;

    @Test
	public void contextLoads() throws Exception {
		assertThat(appController).isNotNull();
	}

    @Test
    public void givenExistingId_whenExecuteGetAppById_thenRetrieveApp() {
        // given
        Long eldenRingAppId = 1L;

        // when
        AppDto eldenRingApp = appController.getAppById(eldenRingAppId);

        // then
        assertThat(eldenRingApp).isNotNull();
        assertThat(eldenRingApp.getAppid()).isEqualTo(eldenRingAppId);
    }

}
