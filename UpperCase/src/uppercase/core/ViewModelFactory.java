package uppercase.core;

import uppercase.model.TextConverter;
import uppercase.model.TextConverterModel;
import uppercase.view.uppercase.UppercaseViewModel;

public class ViewModelFactory {

    private UppercaseViewModel uppercaseViewModel;
    private final ModelFactory modelFactory;
    private TextConverter textConverter=new TextConverterModel();

    public ViewModelFactory(ModelFactory modelFactory){
        this.modelFactory = modelFactory;

    }

    public UppercaseViewModel getUppercaseViewModel(){
        if(uppercaseViewModel == null)
            uppercaseViewModel = new UppercaseViewModel(textConverter);
        return uppercaseViewModel;
    }
}
