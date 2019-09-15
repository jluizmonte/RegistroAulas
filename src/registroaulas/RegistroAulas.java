package registroaulas;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import registroaulas.view.CadastroAulaView;

/**
 *
 * @author joseluiz
 */
public class RegistroAulas {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //SYNTHETICA THEME

        try {
            // Configurar se deve aplicar o look a borda do JFrame  
            //    No caso esta programado para não aplicar (Boolean.FALSE)  
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            //          Configura qual Look você quer usar no projeto  
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            //     Chama a interface do seu programa  
            (new CadastroAulaView()).setVisible(true);
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
        }
    }

}
