package transform;

import io.cucumber.cucumberexpressions.Transformer;

public class TransformData implements Transformer<String> {

    //ToDo    This not working, need to fix
    @Override
    public String transform(String s) {
        return s + "Transform Data";
    }
}
