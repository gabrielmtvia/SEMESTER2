package uppercase.view.uppercase;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import uppercase.model.TextConverter;

public class UppercaseViewModel {
    private SimpleStringProperty request;
    private SimpleStringProperty reply;
    private SimpleStringProperty error;
    private TextConverter textConverter;

    public UppercaseViewModel(TextConverter textConverter)
    {
        this.textConverter=textConverter;
        request = new SimpleStringProperty();
        reply = new SimpleStringProperty();
        error = new SimpleStringProperty();
    }

    public void convert(){
        String input=request.get();
        if(input !=null && !"".equals(input)) {
            String result = textConverter.toUpperCase(input);
            reply.set(result);
        }
        else error.set("Input cannot be empty");
    }

    public StringProperty requestProperty() {
        return request;
    }

    public StringProperty replyProperty() {
        return reply;
    }

    public StringProperty errorProperty() {
        return error;
    }
}
