package model;

import com.crisspian.mvpexample_class_20_08.model.Verifier;

import org.junit.Before;
import org.junit.Test;

import static com.crisspian.mvpexample_class_20_08.model.Verifier.MEDIUM;
import static com.crisspian.mvpexample_class_20_08.model.Verifier.STRONG;
import static com.crisspian.mvpexample_class_20_08.model.Verifier.WEAK;
import static com.google.common.truth.Truth.assertThat;

public class VerifierTest{
    private Verifier verifier;

    @Before
    public void setUp(){
        verifier = new Verifier();
    }
        @Test
    public void verifierWeak(){

        String password = "pass";
        int option = verifier.evaluatePass(password);
        assertThat(option).isEqualTo(WEAK);
    }
    @Test
    public void verifierMedium(){

        String password = "aaaaaaa";
        int option = verifier.evaluatePass(password);
        assertThat(option).isEqualTo(MEDIUM);
}

    @Test
    public void verifierStrong(){

        String password = "Adelasosa";
        int option = verifier.evaluatePass(password);
        assertThat(option).isEqualTo(STRONG);

    }
}