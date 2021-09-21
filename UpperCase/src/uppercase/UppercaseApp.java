package uppercase;

import javafx.stage.Stage;
import uppercase.core.ModelFactory;
import uppercase.core.ViewHandler;
import uppercase.core.ViewModelFactory;

public class UppercaseApp extends javafx.application.Application{

    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory modelFactory = new ModelFactory();
        ViewModelFactory vmf = new ViewModelFactory(modelFactory);
        ViewHandler viewHandler = new ViewHandler(vmf);
        viewHandler.start();

    }
}
