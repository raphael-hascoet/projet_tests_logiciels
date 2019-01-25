package felix.vue;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.JemmyProperties;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;

@RunWith(Parameterized.class)
public class TestConnexionImpossible {

    private static ClassReference application;

    private static String[] parametres;

    private JFrameOperator vueChat;

    private JTextFieldOperator texteIp, textePort, textMessages;

    private JButtonOperator boutonConnecter;

    @Before
    public void setUp() {

        final Integer timeout = 3000;
        JemmyProperties.setCurrentTimeout("FrameWaiter.WaitFrameTimeout", timeout);
        JemmyProperties.setCurrentTimeout("ComponentOperator.WaitStateTimeout", timeout);


    }

}
