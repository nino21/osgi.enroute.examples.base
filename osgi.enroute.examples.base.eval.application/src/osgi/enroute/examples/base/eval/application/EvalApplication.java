package osgi.enroute.examples.base.eval.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import osgi.enroute.debug.api.Debug;
import osgi.enroute.examples.base.eval.api.Eval;

@Component(service = EvalApplication.class,
        property = { Debug.COMMAND_SCOPE + "=eval", Debug.COMMAND_FUNCTION + "=eval" },
        name = "osgi.enroute.examples.base.eval")
public class EvalApplication {
    private Eval eval;

    public double eval(String m) throws Exception {
        return eval.eval(m);
    }

    @Reference
    void setEval(Eval eval) {
        this.eval = eval;
    }

}
