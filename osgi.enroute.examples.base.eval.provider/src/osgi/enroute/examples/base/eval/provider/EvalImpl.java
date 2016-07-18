package osgi.enroute.examples.base.eval.provider;

import org.osgi.service.component.annotations.Component;

import osgi.enroute.debug.api.Debug;
import osgi.enroute.examples.base.eval.api.Eval;
import parsii.eval.Parser;

/**
 * 
 */
@Component(name = "osgi.enroute.examples.base.eval",
        property = { Debug.COMMAND_SCOPE + "=test", Debug.COMMAND_FUNCTION + "=eval" })
public class EvalImpl implements Eval {

//    Pattern EXPR = Pattern.compile("\\s*(?<left>\\d+)\\s*(?<op>\\+|-|\\*|/)\\s*(?<right>\\d+)\\s*");

    @Override
    public double eval(String expression) throws Exception {
        return Parser.parse(expression).evaluate();
    }

}
