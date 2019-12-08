package cat.indiketa.degiro.engine;

import java.io.File;

/**
 *
 * @author indiketa
 */
public class Main {

    /**
     * Pass in a properties file with username and password keys
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        DEngine e = new DEngine(new Credentials(new File(args[0])));

        e.startEngine();
    }
}

